package cn.pokemmo.net.security;

import f.CE;
import f.gc_2;

public class CryptoTokenRecord {
    public final CE MJ;
    public final byte[] yl0;

    public CryptoTokenRecord(CE value, byte[] data) {
        if (data.length != gc_2.Wp.length) {
            throw new IllegalArgumentException();
        }
        this.MJ = value;
        this.yl0 = data;
    }
}
