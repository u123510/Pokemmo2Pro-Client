package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.util.OptionHelper;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class NamedConverter extends ClassicConverter {
    private static final String DISABLE_CACHE_SYSTEM_PROPERTY = "logback.namedConverter.disableCache";
    private static final int INITIAL_CACHE_SIZE = 512;
    private static final double LOAD_FACTOR = 0.75D;
    private static final int MAX_ALLOWED_REMOVAL_THRESHOLD = 1536;
    private static final double CACHE_MISSRATE_TRIGGER = 0.3D;
    private static final int MIN_SAMPLE_SIZE = 1024;
    private static final double NEGATIVE = -1D;

    private volatile boolean cacheEnabled = true;
    private final NameCache cache;
    private Abbreviator abbreviator;
    private volatile int cacheMisses;
    private volatile int totalCalls;

    protected NamedConverter() {
        cache = new NameCache(this, INITIAL_CACHE_SIZE);
        abbreviator = null;
        cacheMisses = 0;
        totalCalls = 0;
    }

    private synchronized String viaCache(String name) {
        totalCalls++;
        String value = cache.get(name);
        if (value == null) {
            cacheMisses++;
            value = abbreviator.abbreviate(name);
            cache.put(name, value);
        }
        return value;
    }

    private void disableCache() {
        if (!cacheEnabled) return;
        cacheEnabled = false;
        cache.clear();
        addInfo("Disabling cache at totalCalls=" + totalCalls);
    }

    public abstract String getFullyQualifiedName(ILoggingEvent event);

    @Override
    public void start() {
        String option = getFirstOption();
        String disable = OptionHelper.getSystemProperty(DISABLE_CACHE_SYSTEM_PROPERTY);
        if (OptionHelper.toBoolean(disable, false)) {
            addInfo("Disabling name cache via System.properties");
            cacheEnabled = false;
        }
        if (option != null) {
            try {
                int target = Integer.parseInt(option);
                if (target == 0) {
                    abbreviator = new ClassNameOnlyAbbreviator();
                } else if (target > 0) {
                    abbreviator = new TargetLengthBasedClassNameAbbreviator(target);
                }
            } catch (NumberFormatException ex) {
                addError("failed to parse integer string [" + option + "]", ex);
            }
        }
        super.start();
    }

    @Override
    public String convert(ILoggingEvent event) {
        String name = getFullyQualifiedName(event);
        if (abbreviator == null) return name;
        if (cacheEnabled) return viaCache(name);
        return abbreviator.abbreviate(name);
    }

    public double getCacheMissRate() {
        return cache.cacheMissCalculator.getCacheMissRate();
    }

    public int getCacheMisses() {
        return cacheMisses;
    }

    private static final class CacheMissCalculator {
        private int totalsMilestone;
        private int cacheMissesMilestone;
        private final NamedConverter owner;

        CacheMissCalculator(NamedConverter owner) {
            this.owner = owner;
            totalsMilestone = 0;
            cacheMissesMilestone = 0;
        }

        void updateMilestones() {
            totalsMilestone = owner.totalCalls;
            cacheMissesMilestone = owner.cacheMisses;
        }

        double getCacheMissRate() {
            int sample = owner.totalCalls - totalsMilestone;
            if (sample < MIN_SAMPLE_SIZE) return NEGATIVE;
            return (owner.cacheMisses - cacheMissesMilestone) * 1.0D / sample;
        }
    }

    private static final class NameCache extends LinkedHashMap<String, String> {
        private static final long serialVersionUID = 1050866539278406045L;
        private int removalThreshold;
        private final CacheMissCalculator cacheMissCalculator;
        private final NamedConverter owner;

        NameCache(NamedConverter owner, int initialCapacity) {
            super(initialCapacity);
            this.owner = owner;
            cacheMissCalculator = new CacheMissCalculator(owner);
            removalThreshold = (int) (initialCapacity * LOAD_FACTOR);
        }

        private boolean shouldDoubleRemovalThreshold() {
            double rate = cacheMissCalculator.getCacheMissRate();
            if (rate < 0D || rate < CACHE_MISSRATE_TRIGGER) return false;
            if (removalThreshold >= MAX_ALLOWED_REMOVAL_THRESHOLD) {
                owner.disableCache();
                return false;
            }
            return true;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
            if (shouldDoubleRemovalThreshold()) {
                removalThreshold *= 2;
                int rate = (int) (cacheMissCalculator.getCacheMissRate() * 100D);
                owner.addInfo("Doubling nameCache removalThreshold to " + removalThreshold
                        + " previous cacheMissRate=" + rate + "%");
                cacheMissCalculator.updateMilestones();
            }
            return size() >= removalThreshold;
        }
    }
}
