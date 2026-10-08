package ch.qos.logback.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ch.qos.logback.core.spi.LifeCycle;

public class LifeCycleManager {
    private final Set<LifeCycle> components;

    public LifeCycleManager() {
        components = new HashSet<>();
    }

    public void register(LifeCycle component) {
        components.add(component);
    }

    public void reset() {
        Iterator<LifeCycle> iterator = components.iterator();
        while (iterator.hasNext()) {
            LifeCycle component = iterator.next();
            if (component.isStarted()) {
                component.stop();
            }
        }
        components.clear();
    }
}
