package ch.qos.logback.core.status;
public class InfoStatus extends StatusBase {
    public InfoStatus(String message, Object origin) { super(INFO, message, origin); }
    public InfoStatus(String message, Object origin, Throwable throwable) { super(INFO, message, origin, throwable); }
}
