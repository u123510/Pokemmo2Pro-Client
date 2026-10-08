package cn.pokemmo.constant;

import f.br_0;

public class HexStateSentinelArray {
    public static br_0[] EA0;
    public static final br_0[] Dv0;
    public final byte hA;

    public HexStateSentinelArray(int n) {
        this.hA = (byte) n;
    }

    static {
        Dv0 = new br_0[]{new br_0(0), new br_0(1), new br_0(2), new br_0(3), new br_0(4), new br_0(5)};
    }
}
