package ch.qos.logback.core.spi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public abstract class AbstractComponentTracker<C>
implements ComponentTracker {
    private static final boolean ACCESS_ORDERED = true;
    public static final long LINGERING_TIMEOUT = 10000L;
    public static final long WAIT_BETWEEN_SUCCESSIVE_REMOVAL_ITERATIONS = 1000L;
    protected int maxComponents = Integer.MAX_VALUE;
    protected long timeout = 1800000L;
    LinkedHashMap<String, Entry<C>> liveMap;
    LinkedHashMap<String, Entry<C>> lingerersMap;
    long lastCheck;
    private RemovalPredicator<C> byExcedent;
    private RemovalPredicator<C> byTimeout;
    private RemovalPredicator<C> byLingering;

    public AbstractComponentTracker() {
        this.liveMap = new LinkedHashMap<String, Entry<C>>(32, 0.75f, true);
        this.lingerersMap = new LinkedHashMap<String, Entry<C>>(16, 0.75f, true);
        this.lastCheck = 0L;
        this.byExcedent = new RemovalPredicator<C>() {
            @Override
            public boolean isSlatedForRemoval(Entry<C> entry, long timestamp) {
                return AbstractComponentTracker.this.liveMap.size() > AbstractComponentTracker.this.maxComponents;
            }
        };
        this.byTimeout = new RemovalPredicator<C>() {
            @Override
            public boolean isSlatedForRemoval(Entry<C> entry, long timestamp) {
                return AbstractComponentTracker.this.isEntryStale(entry, timestamp);
            }
        };
        this.byLingering = new RemovalPredicator<C>() {
            @Override
            public boolean isSlatedForRemoval(Entry<C> entry, long timestamp) {
                return AbstractComponentTracker.this.isEntryDoneLingering(entry, timestamp);
            }
        };
    }

    private Entry<C> getFromEitherMap(String key) {
        Entry<C> entry = this.liveMap.get(key);
        if (entry != null) {
            return entry;
        }
        return this.lingerersMap.get(key);
    }

    private void removeExcedentComponents() {
        this.genericStaleComponentRemover(this.liveMap, 0L, this.byExcedent);
    }

    private void removeStaleComponentsFromMainMap(long now) {
        this.genericStaleComponentRemover(this.liveMap, now, this.byTimeout);
    }

    private void removeStaleComponentsFromLingerersMap(long now) {
        this.genericStaleComponentRemover(this.lingerersMap, now, this.byLingering);
    }

    private void genericStaleComponentRemover(LinkedHashMap<String, Entry<C>> map, long now, RemovalPredicator<C> removalPredicator) {
        Iterator<Map.Entry<String, Entry<C>>> iter = map.entrySet().iterator();
        Entry<C> entry;
        while (iter.hasNext() && removalPredicator.isSlatedForRemoval(entry = iter.next().getValue(), now)) {
            iter.remove();
            this.processPriorToRemoval(entry.component);
        }
    }

    private boolean isTooSoonForRemovalIteration(long now) {
        if (this.lastCheck + WAIT_BETWEEN_SUCCESSIVE_REMOVAL_ITERATIONS > now) {
            return true;
        }
        this.lastCheck = now;
        return false;
    }

    private boolean isEntryStale(Entry<C> entry, long now) {
        if (this.isComponentStale(entry.component)) {
            return true;
        }
        return entry.timestamp + this.timeout < now;
    }

    private boolean isEntryDoneLingering(Entry<C> entry, long now) {
        return entry.timestamp + LINGERING_TIMEOUT < now;
    }

    public abstract void processPriorToRemoval(C component);

    public abstract C buildComponent(String key);

    public abstract boolean isComponentStale(C component);

    @Override
    public int getComponentCount() {
        return this.liveMap.size() + this.lingerersMap.size();
    }

    @Override
    public synchronized C find(String key) {
        Entry<C> entry = this.getFromEitherMap(key);
        if (entry == null) {
            return null;
        }
        return entry.component;
    }

    @Override
    public synchronized C getOrCreate(String key, long timestamp) {
        Entry<C> entry = this.getFromEitherMap(key);
        if (entry == null) {
            C c = this.buildComponent(key);
            entry = new Entry<C>(key, c, timestamp);
            this.liveMap.put(key, entry);
        } else {
            entry.setTimestamp(timestamp);
        }
        return entry.component;
    }

    @Override
    public void endOfLife(String key) {
        Entry<C> entry = this.liveMap.remove(key);
        if (entry == null) {
            return;
        }
        this.lingerersMap.put(key, entry);
    }

    @Override
    public synchronized void removeStaleComponents(long now) {
        if (this.isTooSoonForRemovalIteration(now)) {
            return;
        }
        this.removeExcedentComponents();
        this.removeStaleComponentsFromMainMap(now);
        this.removeStaleComponentsFromLingerersMap(now);
    }

    @Override
    public Set allKeys() {
        HashSet<String> hashSet = new HashSet<String>(this.liveMap.keySet());
        hashSet.addAll(this.lingerersMap.keySet());
        return hashSet;
    }

    @Override
    public Collection allComponents() {
        ArrayList<C> arrayList = new ArrayList<C>();
        Iterator<Entry<C>> iterator = this.liveMap.values().iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().component);
        }
        Iterator<Entry<C>> iterator2 = this.lingerersMap.values().iterator();
        while (iterator2.hasNext()) {
            arrayList.add(iterator2.next().component);
        }
        return arrayList;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public int getMaxComponents() {
        return this.maxComponents;
    }

    public void setMaxComponents(int maxComponents) {
        this.maxComponents = maxComponents;
    }

    public static interface RemovalPredicator<C> {
        public boolean isSlatedForRemoval(Entry<C> entry, long timestamp);
    }

    public static class Entry<C> {
        String key;
        C component;
        long timestamp;

        public Entry(String key, C component, long timestamp) {
            this.key = key;
            this.component = component;
            this.timestamp = timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        @Override
        public int hashCode() {
            return this.key.hashCode();
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null) {
                return false;
            }
            if (this.getClass() != object.getClass()) {
                return false;
            }
            Entry<C> other = (Entry<C>) object;
            String thisKey = this.key;
            String otherKey = other.key;
            if (thisKey == null ? otherKey != null : !thisKey.equals(otherKey)) {
                return false;
            }
            C thisComponent = this.component;
            C otherComponent = other.component;
            if (thisComponent == null ? otherComponent != null : !thisComponent.equals(otherComponent)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + this.key + ", " + String.valueOf(this.component) + ")";
        }
    }
}
