package cn.pokemmo.constant;

import f.bm0_1;
import f.t9_0;

public class IndexedByteRegistry {
    public static final bm0_1 BE;
    public final byte ko0;

    public IndexedByteRegistry(int i1) {
        this.ko0 = (byte) i1;
    }

    static {
        t9_0[] arr = new t9_0[11];
        for (int i = 0; i < 11; i++) {
            arr[i] = new t9_0(i);
        }
        BE = new bm0_1();
        for (t9_0 t : arr.clone()) {
            BE.gE0(t.ko0, t);
        }
    }
}
