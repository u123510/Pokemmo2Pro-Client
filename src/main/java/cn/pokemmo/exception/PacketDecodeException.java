package cn.pokemmo.exception;

public class PacketDecodeException extends RuntimeException {
    private static final long serialVersionUID = -1L;

    public PacketDecodeException(String string) {
        super(string);
    }
}
