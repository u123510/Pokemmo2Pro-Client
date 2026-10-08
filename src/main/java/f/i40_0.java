package f;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 兼容垫片 (Shim) - 宝可梦属性体系与属性相克矩阵
 * 核心定义已迁移至 {@link cn.pokemmo.pokemon.type.PokemonType}
 */
public enum i40_0 {
    c90(0, 0),
    tJ(1, 1),
    cJ0(2, 2),
    F0(3, 3),
    yC(4, 4),
    VD0(5, 5),
    VR(6, 6),
    z2(7, 7),
    GW(8, 8),
    g50(9, -1),
    DL(10, 9),
    lpt8(11, 10),
    Mg0(12, 11),
    Wt(13, 12),
    Kt(14, 13),
    uP(15, 14),
    tC0(16, 15),
    Us0(17, 16),
    Gc(18, 17);

    public static final i40_0[] for$;
    public static final i40_0[] qz0;
    public static final i40_0[] g80;
    public static final Comparator xG;
    public static final bm0_1 K7;
    public static final bm0_1 gg;

    // 现代语义常量别名 (Modern Semantic Aliases)
    public static final i40_0 NORMAL = c90;
    public static final i40_0 FIGHTING = tJ;
    public static final i40_0 FLYING = cJ0;
    public static final i40_0 POISON = F0;
    public static final i40_0 GROUND = yC;
    public static final i40_0 ROCK = VD0;
    public static final i40_0 BUG = VR;
    public static final i40_0 GHOST = z2;
    public static final i40_0 STEEL = GW;
    public static final i40_0 FAIRY = g50;
    public static final i40_0 UNKNOWN = g50;
    public static final i40_0 FIRE = DL;
    public static final i40_0 WATER = lpt8;
    public static final i40_0 GRASS = Mg0;
    public static final i40_0 ELECTRIC = Wt;
    public static final i40_0 PSYCHIC = Kt;
    public static final i40_0 ICE = uP;
    public static final i40_0 DRAGON = tC0;
    public static final i40_0 DARK = Us0;
    public static final i40_0 NONE = Gc;

    public final byte j40;
    public final byte mu;
    public final double[] eI0;

    i40_0(int j40, int mu) {
        this.j40 = (byte) j40;
        this.mu = (byte) mu;
        this.eI0 = new double[18];
        Arrays.fill(this.eI0, 1.0);
    }

    static {
        for$ = values();
        qz0 = new i40_0[] {
            tJ, cJ0, F0, yC, VD0, VR, z2, GW,
            DL, lpt8, Mg0, Wt, Kt, uP, tC0, Us0
        };
        g80 = new i40_0[] {
            c90, DL, lpt8, Wt, Mg0, uP, tJ, F0,
            yC, cJ0, Kt, VR, VD0, z2, tC0, Us0, GW
        };
        xG = Comparator.comparingInt(i40_0::o6);
        K7 = new bm0_1();
        gg = new bm0_1();
        for (i40_0 type : values()) {
            K7.gE0(type.j40, type);
            gg.gE0(type.mu, type);
        }

        c90.i20(VD0, 0.5D);
        c90.i20(z2, 0.0);
        c90.i20(GW, 0.5D);
        DL.i20(DL, 0.5D);
        DL.i20(lpt8, 0.5D);
        DL.i20(Mg0, 2D);
        DL.i20(uP, 2D);
        DL.i20(VR, 2D);
        DL.i20(VD0, 0.5D);
        DL.i20(tC0, 0.5D);
        DL.i20(GW, 2D);
        lpt8.i20(DL, 2D);
        lpt8.i20(lpt8, 0.5D);
        lpt8.i20(Mg0, 0.5D);
        lpt8.i20(yC, 2D);
        lpt8.i20(VD0, 2D);
        lpt8.i20(tC0, 0.5D);
        Wt.i20(lpt8, 2D);
        Wt.i20(Wt, 0.5D);
        Wt.i20(Mg0, 0.5D);
        Wt.i20(yC, 0.0);
        Wt.i20(cJ0, 2D);
        Wt.i20(tC0, 0.5D);
        Mg0.i20(DL, 0.5D);
        Mg0.i20(lpt8, 2D);
        Mg0.i20(Mg0, 0.5D);
        Mg0.i20(F0, 0.5D);
        Mg0.i20(yC, 2D);
        Mg0.i20(cJ0, 0.5D);
        Mg0.i20(VR, 0.5D);
        Mg0.i20(VD0, 2D);
        Mg0.i20(tC0, 0.5D);
        Mg0.i20(GW, 0.5D);
        uP.i20(DL, 0.5D);
        uP.i20(lpt8, 0.5D);
        uP.i20(Mg0, 2D);
        uP.i20(uP, 0.5D);
        uP.i20(yC, 2D);
        uP.i20(cJ0, 2D);
        uP.i20(tC0, 2D);
        uP.i20(GW, 0.5D);
        tJ.i20(c90, 2D);
        tJ.i20(uP, 2D);
        tJ.i20(F0, 0.5D);
        tJ.i20(cJ0, 0.5D);
        tJ.i20(Kt, 0.5D);
        tJ.i20(VR, 0.5D);
        tJ.i20(VD0, 2D);
        tJ.i20(z2, 0.0);
        tJ.i20(Us0, 2D);
        tJ.i20(GW, 2D);
        F0.i20(Mg0, 2D);
        F0.i20(F0, 0.5D);
        F0.i20(yC, 0.5D);
        F0.i20(VD0, 0.5D);
        F0.i20(z2, 0.5D);
        F0.i20(GW, 0.0);
        yC.i20(DL, 2D);
        yC.i20(Wt, 2D);
        yC.i20(Mg0, 0.5D);
        yC.i20(F0, 2D);
        yC.i20(cJ0, 0.0);
        yC.i20(VR, 0.5D);
        yC.i20(VD0, 2D);
        yC.i20(GW, 2D);
        cJ0.i20(Wt, 0.5D);
        cJ0.i20(Mg0, 2D);
        cJ0.i20(tJ, 2D);
        cJ0.i20(VR, 2D);
        cJ0.i20(VD0, 0.5D);
        cJ0.i20(GW, 0.5D);
        Kt.i20(tJ, 2D);
        Kt.i20(F0, 2D);
        Kt.i20(Kt, 0.5D);
        Kt.i20(Us0, 0.0);
        Kt.i20(GW, 0.5D);
        VR.i20(DL, 0.5D);
        VR.i20(Mg0, 2D);
        VR.i20(tJ, 0.5D);
        VR.i20(F0, 0.5D);
        VR.i20(cJ0, 0.5D);
        VR.i20(Kt, 2D);
        VR.i20(z2, 0.5D);
        VR.i20(Us0, 2D);
        VR.i20(GW, 0.5D);
        VD0.i20(DL, 2D);
        VD0.i20(uP, 2D);
        VD0.i20(tJ, 0.5D);
        VD0.i20(yC, 0.5D);
        VD0.i20(cJ0, 2D);
        VD0.i20(VR, 2D);
        VD0.i20(GW, 0.5D);
        z2.i20(c90, 0.0);
        z2.i20(Kt, 2D);
        z2.i20(z2, 2D);
        z2.i20(Us0, 0.5D);
        z2.i20(GW, 0.5D);
        tC0.i20(tC0, 2D);
        tC0.i20(GW, 0.5D);
        Us0.i20(tJ, 0.5D);
        Us0.i20(Kt, 2D);
        Us0.i20(z2, 2D);
        Us0.i20(Us0, 0.5D);
        Us0.i20(GW, 0.5D);
        GW.i20(DL, 0.5D);
        GW.i20(lpt8, 0.5D);
        GW.i20(Wt, 0.5D);
        GW.i20(uP, 2D);
        GW.i20(VD0, 2D);
        GW.i20(GW, 0.5D);
        //妖精(9号 g50): 第六世代克制表, 攻击方
        g50.i20(tJ, 2D);
        g50.i20(tC0, 2D);
        g50.i20(Us0, 2D);
        g50.i20(F0, 0.5D);
        g50.i20(GW, 0.5D);
        g50.i20(DL, 0.5D);
        //防御方为妖精
        tJ.i20(g50, 0.5D);
        F0.i20(g50, 2D);
        VR.i20(g50, 0.5D);
        Us0.i20(g50, 0.5D);
        GW.i20(g50, 2D);
        tC0.i20(g50, 0.0);
    }

    public static i40_0 MG0(byte i0) {
        if (K7.dg(i0)) {
            return (i40_0) K7.BM(i0);
        }
        return Gc;
    }

    public static i40_0 COm3(byte i0) {
        if (gg.dg(i0)) {
            return (i40_0) gg.BM(i0);
        }
        return Gc;
    }

    public static i40_0 b8(short i0) {
        switch (i0) {
            case 5548:
                return DL;
            case 5549:
                return lpt8;
            case 5550:
                return Wt;
            case 5551:
                return Mg0;
            case 5552:
                return uP;
            case 5553:
                return tJ;
            case 5554:
                return F0;
            case 5555:
                return yC;
            case 5556:
                return cJ0;
            case 5557:
                return Kt;
            case 5558:
                return VR;
            case 5559:
                return VD0;
            case 5560:
                return z2;
            case 5561:
                return tC0;
            case 5562:
                return Us0;
            case 5563:
                return GW;
            case 5564:
                return c90;
            default:
                return null;
        }
    }

    public final byte o6() {
        return this.j40;
    }

    public final short mt() {
        switch (ordinal()) {
            case 0:
                return 5332;
            case 1:
                return 5335;
            case 2:
                return 5367;
            case 3:
                return 5411;
            case 4:
                return 5353;
            case 5:
                return 5350;
            case 6:
                return 5403;
            case 7:
                return 5392;
            case 8:
                return 5401;
            case 9:
                return 0;
            case 10:
                return 5362;
            case 11:
                return 5345;
            case 12:
                return 5349;
            case 13:
                return 5351;
            case 14:
                return 5330;
            case 15:
                return 5340;
            case 16:
                return 5329;
            case 17:
                return 5328;
            default:
                return 0;
        }
    }

    public final String BT() {
        int id = this.j40 + 230000;
        if (sm0_0.cU.l90(id)) {
            return sm0_0.c0(id);
        }
        return toString();
    }

    public final void i20(i40_0 v1, double d2) {
        this.eI0[v1.j40] = d2;
    }

    public boolean isFairy() {
        return this == g50;
    }

    public double getDamageMultiplierAgainst(i40_0 target) {
        if (target != null && target.j40 >= 0 && target.j40 < this.eI0.length) {
            return this.eI0[target.j40];
        }
        return 1.0;
    }

    public cn.pokemmo.pokemon.type.PokemonType toDomain() {
        return cn.pokemmo.pokemon.type.PokemonType.values()[this.ordinal()];
    }

    public static i40_0 fromDomain(cn.pokemmo.pokemon.type.PokemonType type) {
        if (type == null) return Gc;
        return values()[type.ordinal()];
    }

    public cn.pokemmo.pokemon.type.PokemonType asModern() {
        return toDomain();
    }

    public static i40_0 asBridge(cn.pokemmo.pokemon.type.PokemonType type) {
        return fromDomain(type);
    }
}
