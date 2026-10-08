package cn.pokemmo.exception;

public class InternalClientException extends RuntimeException {
    private static final long serialVersionUID = 8263101105331379889L;

    public InternalClientException(String string) {
        super(string);
    }

    public InternalClientException(Throwable throwable) {
        super(throwable);
    }

    public InternalClientException(String string, Throwable throwable) {
        super(string, throwable);
    }
}
