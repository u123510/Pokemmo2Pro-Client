package cn.pokemmo.constant;

import f.bm0_1;
import f.he0_1;

public class QuadByteStateEnum {
    public static final he0_1 FK0 = new he0_1((byte) 0);
    public static final he0_1 ks0 = new he0_1((byte) 1);
    public static final he0_1 Rn = new he0_1((byte) 2);
    public static final he0_1 FM = new he0_1((byte) 3);
    public static final bm0_1 oN;
    public final byte ff0;

    public QuadByteStateEnum(byte i1) {
        this.ff0 = i1;
    }

    static {
        he0_1[] arr = new he0_1[]{FK0, ks0, Rn, FM}.clone();
        oN = new bm0_1();
        for (he0_1 h : arr) {
            oN.gE0(h.ff0, h);
        }
    }
}
