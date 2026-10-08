package ch.qos.logback.core.status;
public class WarnStatus extends StatusBase {
    public WarnStatus(String message, Object origin) { super(WARN, message, origin); }
    public WarnStatus(String message, Object origin, Throwable throwable) { super(WARN, message, origin, throwable); }
}
