package cn.pokemmo.constant;

import f.bm0_1;
import f.ro_0;

public class TriByteStateEnum {
    public static final ro_0 LPt9 = new ro_0((byte) 0);
    public static final ro_0 qc0 = new ro_0((byte) 1);
    public static final ro_0 E4 = new ro_0((byte) 2);
    public static final bm0_1 cP;
    public final byte wJ;

    public TriByteStateEnum(byte i1) {
        this.wJ = i1;
    }

    static {
        ro_0[] arr = new ro_0[]{LPt9, qc0, E4};
        cP = new bm0_1();
        for (ro_0 r : arr.clone()) {
            cP.gE0(r.wJ, r);
        }
    }
}
