package cn.pokemmo.constant;

import f.bm0_1;
import f.k40_0;

public class ByteStateEnumA {
    public static final bm0_1 Ds;
    public final byte O6;

    public ByteStateEnumA(byte i1) {
        this.O6 = i1;
    }

    static {
        k40_0[] arr = new k40_0[]{
            new k40_0((byte) 0),
            new k40_0((byte) 1),
            new k40_0((byte) 2)
        };
        Ds = new bm0_1();
        for (k40_0 k : arr.clone()) {
            Ds.gE0(k.O6, k);
        }
    }
}
