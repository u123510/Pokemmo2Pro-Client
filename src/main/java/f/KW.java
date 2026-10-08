package f;

import cn.pokemmo.exception.ClientOperationException;

public final class KW extends ClientOperationException {
    private static final long serialVersionUID = 8263101105331379889L;

    public KW(String string) {
        super(string);
    }

    public KW(Throwable throwable) {
        super(throwable);
    }

    public KW(String string, Throwable throwable) {
        super(string, throwable);
    }
}
