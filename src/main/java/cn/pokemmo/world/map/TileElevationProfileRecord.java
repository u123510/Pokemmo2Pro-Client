package cn.pokemmo.world.map;

import f.*;

import java.util.stream.Stream;

public class TileElevationProfileRecord {
    public static final con__6 Qs;
    public static final con__6 pn0;
    public static final con__6 tZ;
    public static final con__6 Wt0;
    public static final con__6 Ei;
    public static final bm0_1 ZG;
    public static final /* synthetic */ con__6[] pc0;
    public final byte gU;
    public final boolean M8;
    public final short[] VP;
    public final short[] Ub;
    public final int v00;

    public TileElevationProfileRecord(int i, byte b, boolean z, short[] sArr, short[] sArr2) {
        this.v00 = i;
        this.gU = b;
        this.M8 = z;
        this.VP = sArr;
        this.Ub = sArr2;
    }

    public static con__6 i80(byte b) {
        return (con__6) t_0.BI0(ZG.BM(b), con__6.class, b);
    }

    public static /* synthetic */ void JK(con__6 con__6Var) {
        ZG.gE0(con__6Var.gU, con__6Var);
    }

    static {
        con__6 con__6_1 = new con__6(0, (byte) 0, true, new short[]{297, 476, 1168, 1115, 1117}, new short[]{310, 412, 1149, 1128, 1128});
        Qs = con__6_1;
        con__6 con__6_2 = new con__6(1, (byte) 1, false, new short[]{298, 474, 1128, 1116, 1116}, new short[]{311, 353, 1148, 1127, 1129});
        pn0 = con__6_2;
        con__6 con__6_3 = new con__6(2, (byte) 2, false, new short[]{297, 476, 1130, 1115, 1117}, new short[]{310, 412, 1149, 1128, 1128});
        tZ = con__6_3;
        con__6 con__6_4 = new con__6(3, (byte) 3, false, new short[]{297, 476, 1130, 1115, 1117}, new short[]{310, 412, 1149, 1128, 1128});
        con__6 con__6_5 = new con__6(4, (byte) 4, true, new short[]{297, 476, 1130, 1115, 1117}, new short[]{310, 412, 1149, 1128, 1128});
        Wt0 = con__6_5;
        con__6 con__6_6 = new con__6(5, (byte) 5, false, new short[]{297, 476, 1130, 1115, 1117}, new short[]{310, 412, 1149, 1128, 1128});
        con__6 con__6_7 = new con__6(6, (byte) 100, false, new short[]{341, 474, 1128, 1116, 1116}, new short[]{311, 353, 1148, 1127, 1129});
        Ei = con__6_7;
        pc0 = new con__6[]{con__6_1, con__6_2, con__6_3, con__6_4, con__6_5, con__6_6, con__6_7};
        ZG = new bm0_1();
        Stream.of((con__6[]) pc0.clone()).forEach(con__6::JK);
    }

    public final byte d90() {
        return this.gU;
    }

    public final boolean Ut() {
        return this.M8;
    }
}
