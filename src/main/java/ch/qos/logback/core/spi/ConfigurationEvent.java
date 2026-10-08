/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.spi;

public class ConfigurationEvent {
    final EventType eventType;
    final Object data;

    private ConfigurationEvent(EventType eventType, Object object) {
        this.eventType = eventType;
        this.data = object;
    }

    public static ConfigurationEvent newConfigurationChangeDetectorRunningEvent(Object object) {
        return new ConfigurationEvent(EventType.CHANGE_DETECTOR_RUNNING, object);
    }

    public static ConfigurationEvent newConfigurationChangeDetectorRegisteredEvent(Object object) {
        return new ConfigurationEvent(EventType.CHANGE_DETECTOR_REGISTERED, object);
    }

    public static ConfigurationEvent newConfigurationChangeDetectedEvent(Object object) {
        return new ConfigurationEvent(EventType.CHANGE_DETECTED, object);
    }

    public static ConfigurationEvent newConfigurationStartedEvent(Object object) {
        return new ConfigurationEvent(EventType.CONFIGURATION_STARTED, object);
    }

    public static ConfigurationEvent newConfigurationEndedEvent(Object object) {
        return new ConfigurationEvent(EventType.CONFIGURATION_ENDED, object);
    }

    public EventType getEventType() {
        return this.eventType;
    }

    public Object getData() {
        return this.data;
    }

    public String toString() {
        return "ConfigurationEvent{eventType=" + String.valueOf((Object)this.eventType) + ", data=" + String.valueOf(this.data) + "}";
    }

    public static enum EventType {
        CHANGE_DETECTOR_REGISTERED,
        CHANGE_DETECTOR_RUNNING,
        CHANGE_DETECTED,
        CONFIGURATION_STARTED,
        CONFIGURATION_ENDED;

    }
}

