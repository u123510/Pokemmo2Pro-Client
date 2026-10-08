package cn.pokemmo.constant;

import f.*;

public class NineByteStateRegistry {
    public static NineByteStateRegistry hd0;
    public static NineByteStateRegistry gE0;
    public static NineByteStateRegistry Rq0;
    public static NineByteStateRegistry lf0;
    public static NineByteStateRegistry[] uG0;
    public final byte uj0;
    public final int AI0;

    public NineByteStateRegistry(int i1, byte i2) {
        this.AI0 = i1;
        this.uj0 = i2;
    }

    static {
        if (f.hb_2.hd0 == null) {
            try {
                Class.forName(f.hb_2.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
