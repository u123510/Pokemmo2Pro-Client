package ch.qos.logback.core;

public class LogbackException extends RuntimeException {
    private static final long serialVersionUID = -799956346239073266L;

    protected LogbackException() {
        super();
    }

    public LogbackException(String message) {
        super(message);
    }

    public LogbackException(String message, Throwable cause) {
        super(message, cause);
    }
}
