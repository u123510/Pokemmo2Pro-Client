package cn.pokemmo.exception;

public class ClientOperationException extends RuntimeException {
    private static final long serialVersionUID = 8263101105331379889L;

    public ClientOperationException(String string) {
        super(string);
    }

    public ClientOperationException(Throwable throwable) {
        super(throwable);
    }

    public ClientOperationException(String string, Throwable throwable) {
        super(string, throwable);
    }
}
