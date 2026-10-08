package cn.pokemmo.constant;

import f.bm0_1;

public class FourteenByteRegistry {
    public static final bm0_1 X30;
    public final byte eC0;

    public FourteenByteRegistry(byte i1) {
        this.eC0 = i1;
    }

    static {
        FourteenByteRegistry[] arr = new FourteenByteRegistry[14];
        for (int i = 0; i < 14; i++) {
            arr[i] = new FourteenByteRegistry((byte) i);
        }
        X30 = new bm0_1();
        FourteenByteRegistry[] clone = (FourteenByteRegistry[]) arr.clone();
        for (FourteenByteRegistry elem : clone) {
            X30.gE0(elem.eC0, elem);
        }
    }
}
