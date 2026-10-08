package cn.pokemmo.constant;

import f.gl_2;

public class ItemQuantityConstants {
    public static final gl_2 SR;
    public static final gl_2[] Wk0;
    public final byte qH0;
    public final short Vp;

    public ItemQuantityConstants(int i, short s) {
        this.qH0 = (byte) i;
        this.Vp = s;
    }

    static {
        gl_2 v0 = new gl_2(0, (short) 1);
        SR = v0;
        gl_2 v1 = new gl_2(1, (short) 1);
        gl_2 v2 = new gl_2(2, (short) 99);
        gl_2 v3 = new gl_2(3, (short) 1);
        Wk0 = (gl_2[]) new gl_2[]{v0, v1, v2, v3}.clone();
    }
}
