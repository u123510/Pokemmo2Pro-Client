package cn.pokemmo.exception;

public class ResourceRuntimeException extends RuntimeException {
    private static final long serialVersionUID = -2796646409674292605L;

    public ResourceRuntimeException(String string) {
        super(string);
    }
}
