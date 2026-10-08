package cn.pokemmo.constant;

import f.bm0_1;

public class NineByteOffsetRegistry {
    public static final bm0_1 En;
    public final byte fx0;
    public final int U6;

    public NineByteOffsetRegistry(int i1, int i2) {
        this.fx0 = (byte) i1;
        this.U6 = i2;
    }

    static {
        NineByteOffsetRegistry[] arr = new NineByteOffsetRegistry[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = new NineByteOffsetRegistry(i, 2733 + i);
        }
        En = new bm0_1();
        NineByteOffsetRegistry[] clone = (NineByteOffsetRegistry[]) arr.clone();
        for (NineByteOffsetRegistry elem : clone) {
            En.gE0(elem.fx0, elem);
        }
    }
}
