package ch.qos.logback.core.joran.spi;

public class ActionException extends Exception {
    private static final long serialVersionUID = 2743349809995319806L;

    public ActionException() {
        super();
    }

    public ActionException(String message) {
        super(message);
    }

    public ActionException(Throwable cause) {
        super(cause);
    }
}
