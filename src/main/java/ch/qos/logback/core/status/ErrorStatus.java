package ch.qos.logback.core.status;
public class ErrorStatus extends StatusBase {
    public ErrorStatus(String message, Object origin) { super(ERROR, message, origin); }
    public ErrorStatus(String message, Object origin, Throwable throwable) { super(ERROR, message, origin, throwable); }
}
