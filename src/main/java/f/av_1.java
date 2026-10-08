package f;

import cn.pokemmo.battle.tier.BattleTier;
import java.util.stream.Stream;

/**
 * 兼容垫片 (Shim) - 对战分级分档枚举
 * 核心定义已迁移至 {@link BattleTier}
 */
public enum av_1 {
    // 现代语义常量别名
    // Matchmaking tier categories

    TC((byte)0, 5751, false, 0, N2.yH0, GV.gj0, true, (byte)9),
    i40((byte)2, 5761, true, 0, N2.yH0, GV.gj0, true, (byte)9),
    op((byte)1, 5756, false, 3, N2.BF, GV.gj0, true, (byte)9),
    oq0((byte)3, 5764, true, 3, N2.BF, GV.gj0, true, (byte)9),
    UU_Level((byte)4, 5752, false, 1, N2.ax0, GV.gj0, true, (byte)9),
    CJ0((byte)5, 5762, true, 1, N2.ax0, GV.gj0, true, (byte)9),
    NU_Level((byte)6, 5753, false, 2, N2.va, GV.gj0, true, (byte)9),
    G3((byte)7, 5763, true, 2, N2.va, GV.gj0, true, (byte)9),
    Random_Level((byte)8, 5757, false, 4, N2.b6, GV.gj0, false, (byte)4),
    pRn((byte)9, 5765, true, 4, N2.b6, GV.gj0, false, (byte)4);

    public static final av_1[] Vk0;
    public static final bm0_1 rh;
    public static final int Bs;
    public static final av_1[] pY;
    public final byte NR;
    public final byte I20;
    public final int Um;
    public final boolean k10;
    public final boolean com2;
    public final int Lq;
    public final N2[] A10;
    public final N2 Lpt2;
    public final GV[] oE;
    public boolean BB;
    public long vn;

    av_1(byte code, int textId, boolean special, int max, N2 type, GV[] variants,
         boolean enabled, byte category) {
        this.vn = 0L;
        this.NR = code;
        this.Um = textId;
        this.k10 = special;
        this.Lq = max;
        this.A10 = N2.L10(type);
        this.Lpt2 = N2.d6(this.A10);
        this.oE = variants;
        this.BB = true;
        this.com2 = enabled;
        this.I20 = category;
    }

    public final byte SG() {
        return this.NR;
    }

    public final int xB0() {
        return this.Lq;
    }

    public final boolean s90() {
        return this.BB;
    }

    public final boolean Sz() {
        return this.k10;
    }

    public final boolean kf() {
        return this.com2;
    }

    public final byte aE0() {
        return this.I20;
    }

    @Override
    public final String toString() {
        return sm0_0.cU.l90(this.Um) ? sm0_0.c0(this.Um) : super.toString();
    }

    public static av_1 ai(Cq mode, N2 type) {
        if (mode == Cq.ez) {
            return oq0;
        }
        if (type == null) {
            return null;
        }
        switch (type.ordinal()) {
            case 1:
                return i40;
            case 2:
                return CJ0;
            case 3:
                return G3;
            case 6:
                return pRn;
            default:
                return null;
        }
    }

    public static av_1[] XB(int length) {
        return new av_1[length];
    }

    public static boolean xp0(av_1 value) {
        return !value.k10;
    }

    public static av_1[] vJ(int length) {
        return new av_1[length];
    }

    public final cn.pokemmo.battle.tier.BattleTier toDomain() {
        return cn.pokemmo.battle.tier.BattleTier.fromObfuscated(this);
    }

    public static av_1 fromDomain(cn.pokemmo.battle.tier.BattleTier domain) {
        return domain != null ? domain.toObfuscated() : null;
    }

    public BattleTier asModern() {
        return toDomain();
    }

    public static av_1 asBridge(BattleTier modern) {
        return fromDomain(modern);
    }

    static {
        pY = values();
        Vk0 = values();
        rh = new bm0_1();
        for (av_1 value : values()) {
            rh.gE0(value.NR, value);
        }
        Stream.of(Vk0).filter(av_1::Sz).toArray(av_1[]::new);
        Stream.of(Vk0).filter(av_1::xp0).toArray(av_1[]::new);
        Bs = Stream.of(Vk0).filter(av_1::s90).mapToInt(av_1::xB0).max().getAsInt();
    }
}
