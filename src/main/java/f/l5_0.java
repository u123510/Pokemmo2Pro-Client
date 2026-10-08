package f;

import cn.pokemmo.item.BagPocket;

/**
 * 兼容垫片 (Shim) - 游戏背包口袋分类枚举
 * 核心定义已迁移至 {@link BagPocket}
 */
public enum l5_0 {
    B9(1, 1, 0, 0, 1401, 129),
    Jy(2, 5, 7, 4, 1402, 210),
    hB(3, 2, 2, 0, 2, 300),
    YW(4, 3, 3, 2, 3, 400),
    oj0(5, 4, 4, 3, 1406, 500),
    Hj(6, 6, 0, 0, 1403, 600),
    xC(7, 7, 1, 1, 1404, 700),
    Ih(8, 8, 6, 0, 1405, 800);

    public static final l5_0[] tC0;
    public static final l5_0[] Oy;
    public static final l5_0[] qk0;
    public final byte xS;
    public final byte Yf;
    public final byte LP;
    public final byte cOm2;
    public final int ni;
    public int Ra;
    public final short EF;

    l5_0(int xS, int Yf, int cOm2, int LP, int ni, int EF) {
        this.Ra = -1;
        this.xS = (byte)xS;
        this.Yf = (byte)Yf;
        this.cOm2 = (byte)cOm2;
        this.LP = (byte)LP;
        this.ni = ni;
        this.EF = (short)EF;
    }

    public static l5_0 Hv0(int value) {
        for (l5_0 entry : tC0) if (entry.xS == value) return entry;
        return null;
    }

    public final int WA0() { return this.ni; }
    public final short Vq() { return this.EF; }

    public cn.pokemmo.item.BagPocket toDomain() {
        return cn.pokemmo.item.BagPocket.values()[this.ordinal()];
    }

    public static l5_0 fromDomain(cn.pokemmo.item.BagPocket pocket) {
        if (pocket == null) return null;
        return values()[pocket.ordinal()];
    }

    public BagPocket asModern() {
        return toDomain();
    }

    public static l5_0 asBridge(BagPocket modern) {
        return fromDomain(modern);
    }

    static {
        tC0 = values();
        Oy = new l5_0[]{B9, xC, Ih, Jy, hB, YW, oj0, Hj};
        qk0 = new l5_0[]{xC, oj0, hB, Ih};
        for (int i = 0; i < Oy.length; ++i) Oy[i].Ra = i;
        for (l5_0 ignored : qk0) ignored.getClass();
    }
}
