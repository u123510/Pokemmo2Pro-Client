package f;

import cn.pokemmo.battle.tier.TierCategory;
import java.util.ArrayList;
import java.util.EnumMap;

/**
 * 兼容垫片 (Shim) - 对战分级大类/层级枚举
 * 核心定义已迁移至 {@link TierCategory}
 */
public enum N2 {
    BF(0, 5750),
    yH0(1, 5751),
    ax0(2, 5752),
    va(3, 5753),
    gA0(4, 5754, true, 5, false, (byte)0, (byte)0),
    J8(5, 5755),
    b6(6, 5757, true, -1, true, (byte)5, (byte)4);

    public static final N2[] CG;
    public static final N2[] ar0;
    public static final N2[] k6;
    public static final N2[] HP;
    public static final N2[] N60;
    public static final N2[] ov0;
    public static final N2[] Ev0;
    public static final bm0_1 ft;
    public static final EnumMap Gx;
    public static final N2[] Ap0;
    // 现代语义常量别名
    public static final N2 UBER = BF;
    public static final N2 OU = yH0;
    public static final N2 UU = ax0;
    public static final N2 NU = va;
    public static final N2 DOUBLES = gA0;
    public static final N2 UNRESTRICTED = J8;
    public static final N2 UNRANKED = b6;
    public final byte yz;
    public final byte Zz0;
    public final byte Au0;
    public final byte z3;
    public final int R5;
    public final int Hv0;
    public final boolean LM;
    public final boolean d60;

    N2(int bit, int textId) {
        this(bit, textId, false, 0, true, (byte)0, (byte)0);
    }

    N2(int bit, int textId, boolean lm, int zz0, boolean d60, byte au0, byte z3) {
        this.yz = (byte)bit;
        this.R5 = textId;
        this.Hv0 = textId + 20;
        this.LM = lm;
        this.Zz0 = (byte)zz0;
        this.d60 = d60;
        this.Au0 = au0;
        this.z3 = z3;
    }

    public final int z90() { return this.R5; }
    public final boolean Bw0() { return this.LM; }
    public final boolean H8() { return this != b6; }
    public final byte ma0() { return this.z3; }
    public final boolean qY() { return this.d60; }
    public final String wI() { return sm0_0.c0(this.R5); }

    @Override
    public final String toString() {
        return sm0_0.cU.l90(this.R5) ? sm0_0.c0(this.R5) : super.toString();
    }

    public static N2 FW(byte value) { return (N2)t_0.BI0(ft.BM(value), N2.class, value); }

    public static N2[] qk0(byte value) {
        if (value == 0) return N60;
        ArrayList result = new ArrayList();
        for (N2 item : k6) if ((value & (1 << item.yz)) != 0) result.add(item);
        return (N2[])result.toArray(new N2[0]);
    }

    public static N2 d6(N2[] values) {
        N2 result = null;
        for (N2 value : values) if (result == null || value.yz < result.yz) result = value;
        return result;
    }

    public static N2[] L10(N2 value) {
        N2[] result = (N2[])Gx.get(value);
        return result == null ? N60 : result;
    }

    public static boolean Z00(N2 value) { return !value.LM; }
    public static N2[] Z60(int length) { return new N2[length]; }
    public static N2[] ip(int length) { return new N2[length]; }
    public static N2[] q0(int length) { return new N2[length]; }
    public static N2[] Vf0(int length) { return new N2[length]; }

    public final cn.pokemmo.battle.tier.TierCategory toDomain() {
        return cn.pokemmo.battle.tier.TierCategory.fromObfuscated(this);
    }

    public static N2 fromDomain(cn.pokemmo.battle.tier.TierCategory domain) {
        return domain != null ? domain.toObfuscated() : null;
    }

    public TierCategory asModern() {
        return toDomain();
    }

    public static N2 asBridge(TierCategory modern) {
        return fromDomain(modern);
    }

    static {
        N60 = new N2[0];
        Ap0 = new N2[]{BF, yH0, ax0, va, gA0, J8, b6};
        ov0 = new N2[]{yH0, ax0, va, b6};
        Ev0 = new N2[]{BF};
        ft = new bm0_1();
        Gx = new EnumMap(N2.class);
        k6 = java.util.Arrays.stream(Ap0).filter(N2::qY).toArray(N2[]::new);
        CG = java.util.Arrays.stream(k6).filter(N2::Z00).toArray(N2[]::new);
        ar0 = java.util.Arrays.stream(k6).filter(N2::Bw0).toArray(N2[]::new);
        HP = java.util.Arrays.stream(k6).filter(N2::H8).toArray(N2[]::new);
        for (N2 value : k6) {
            ft.gE0(value.yz, value);
            switch (value.ordinal()) {
                case 0: Gx.put(value, new N2[]{BF, yH0, ax0, va, J8}); break;
                case 1: Gx.put(value, new N2[]{yH0, ax0, va, J8}); break;
                case 2: Gx.put(value, new N2[]{ax0, va, J8}); break;
                case 3: Gx.put(value, new N2[]{va, J8}); break;
                case 4: Gx.put(value, new N2[]{gA0}); break;
                case 5: Gx.put(value, new N2[]{J8}); break;
                case 6: Gx.put(value, new N2[]{b6}); break;
                default: throw new RuntimeException();
            }
        }
    }
}
