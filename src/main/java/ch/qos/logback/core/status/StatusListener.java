package ch.qos.logback.core.status;
public interface StatusListener {
    void addStatusEvent(Status status);
    default boolean isResetResistant() { return false; }
}
