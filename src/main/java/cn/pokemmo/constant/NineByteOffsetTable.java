package cn.pokemmo.constant;

import f.bm0_1;

public class NineByteOffsetTable {
    public static final bm0_1 Bp0;
    public final byte Ad0;

    public NineByteOffsetTable(int i1) {
        this.Ad0 = (byte) i1;
    }

    public static void wv0(byte i0) {
        Object unused = Bp0.BM(i0);
    }

    static {
        NineByteOffsetTable[] arr = new NineByteOffsetTable[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = new NineByteOffsetTable(i);
        }
        Bp0 = new bm0_1();
        NineByteOffsetTable[] clone = (NineByteOffsetTable[]) arr.clone();
        for (NineByteOffsetTable elem : clone) {
            Bp0.gE0(elem.Ad0, elem);
        }
    }
}
