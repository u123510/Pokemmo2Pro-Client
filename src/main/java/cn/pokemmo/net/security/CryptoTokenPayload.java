package cn.pokemmo.net.security;

public class CryptoTokenPayload {
    public final byte[] W7;
    public final String Cv;
    public final boolean Pr0;

    public CryptoTokenPayload(byte[] byArray, String string, boolean bl) {
        this.W7 = byArray;
        this.Cv = string;
        this.Pr0 = bl;
    }
}
