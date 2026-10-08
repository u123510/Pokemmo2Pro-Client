package cn.pokemmo.exception;

public class ProtocolParseException extends Exception {
    private static final long serialVersionUID = 6766008185954178842L;

    public ProtocolParseException(String string) {
        super(string);
    }
}
