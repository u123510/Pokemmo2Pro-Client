package cn.pokemmo.pokemon;

import f.*;

/**
 * 宝可梦性格定义 (Pokemon Nature)
 * 定义 25 种标准宝可梦性格，以及各性格对应的能力值 10% 增减益和树果口味偏好。
 * 原混淆类: f.rz_0
 */
public class PokemonNature {
    public static final rz_0 HARDY;
    public static final rz_0 YB;
    public static final rz_0[] ALL_NATURES;
    public static final rz_0[] lpT5;
    public static final bm0_1 NATURE_MAP;
    public static final bm0_1 RM;

    public final byte id;
    public final gc_2 increasedStat;
    public final gc_2 decreasedStat;
    public final NL favoriteFlavor;
    public final NL dislikedFlavor;

    // 兼容混淆字段别名
    public final byte f10;
    public final gc_2 j10;
    public final gc_2 Hv;
    public final NL vX;
    public final NL Eq;

    public PokemonNature(int id, gc_2 increasedStat, gc_2 decreasedStat, NL favoriteFlavor, NL dislikedFlavor) {
        this.id = (byte) id;
        this.increasedStat = increasedStat;
        this.decreasedStat = decreasedStat;
        this.favoriteFlavor = favoriteFlavor;
        this.dislikedFlavor = dislikedFlavor;

        this.f10 = (byte) id;
        this.j10 = increasedStat;
        this.Hv = decreasedStat;
        this.vX = favoriteFlavor;
        this.Eq = dislikedFlavor;
    }

    public static rz_0 getNatureById(byte id) {
        return (rz_0) RM.BM(id);
    }

    public static void x2(byte i0) {
        rz_0 ignored = (rz_0) RM.BM(i0);
    }

    public final byte getId() {
        return this.id;
    }

    public final byte EC() {
        return this.f10;
    }

    public final String getName() {
        return sm0_0.c0(this.f10 + 180000);
    }

    public final String e8() {
        return getName();
    }

    public final gc_2 getIncreasedStat() {
        return this.increasedStat;
    }

    public final gc_2 getDecreasedStat() {
        return this.decreasedStat;
    }

    public final gc_2 Ue0() {
        return this.Hv;
    }

    public final NL getFavoriteFlavor() {
        return this.favoriteFlavor;
    }

    public final NL hF0() {
        return this.vX;
    }

    public final NL getDislikedFlavor() {
        return this.dislikedFlavor;
    }

    public final NL Eh0() {
        return this.Eq;
    }

    public final rz_0 asBridge() {
        return ((Object) this) instanceof rz_0 ? (rz_0) (Object) this : null;
    }

    static {
        rz_0 v0 = new rz_0(0, null, null, null, null);
        HARDY = v0;
        YB = v0;
        gc_2 v2 = gc_2.r4;
        gc_2 v3 = gc_2.ly;
        NL v4 = NL.bU;
        NL v5 = NL.Ws;
        rz_0 v1 = new rz_0(1, v2, v3, v4, v5);
        gc_2 v7 = gc_2.ie0;
        NL v8 = NL.Mt;
        rz_0 v6 = new rz_0(2, v2, v7, v4, v8);
        gc_2 v10 = gc_2.ej;
        NL v11 = NL.n70;
        rz_0 v9 = new rz_0(3, v2, v10, v4, v11);
        gc_2 v13 = gc_2.lL0;
        NL v14 = NL.cOM1;
        rz_0 v12 = new rz_0(4, v2, v13, v4, v14);
        rz_0 v15 = new rz_0(5, v3, v2, v5, v4);
        rz_0 v16 = new rz_0(6, null, null, null, null);
        rz_0 v17 = new rz_0(7, v3, v7, v5, v8);
        rz_0 v18 = new rz_0(8, v3, v10, v5, v11);
        rz_0 v19 = new rz_0(9, v3, v13, v5, v14);
        rz_0 v20 = new rz_0(10, v7, v2, v8, v4);
        rz_0 v21 = new rz_0(11, v7, v3, v8, v5);
        rz_0 v22 = new rz_0(12, null, null, null, null);
        rz_0 v23 = new rz_0(13, v7, v10, v8, v11);
        rz_0 v24 = new rz_0(14, v7, v13, v8, v14);
        rz_0 v25 = new rz_0(15, v10, v2, v11, v4);
        rz_0 v26 = new rz_0(16, v10, v3, v11, v5);
        rz_0 v27 = new rz_0(17, v10, v7, v11, v8);
        rz_0 v28 = new rz_0(18, null, null, null, null);
        rz_0 v29 = new rz_0(19, v10, v13, v11, v14);
        rz_0 v30 = new rz_0(20, v13, v2, v14, v4);
        rz_0 v31 = new rz_0(21, v13, v3, v14, v5);
        rz_0 v32 = new rz_0(22, v13, v7, v14, v8);
        rz_0 v33 = new rz_0(23, v13, v10, v14, v11);
        rz_0 v34 = new rz_0(24, null, null, null, null);

        rz_0[] arr = new rz_0[] {
            v0, v1, v6, v9, v12,
            v15, v16, v17, v18, v19,
            v20, v21, v22, v23, v24,
            v25, v26, v27, v28, v29,
            v30, v31, v32, v33, v34
        };
        ALL_NATURES = (rz_0[]) arr.clone();
        lpT5 = ALL_NATURES;
        NATURE_MAP = new bm0_1();
        RM = NATURE_MAP;
        for (rz_0 rz : lpT5) {
            RM.gE0(rz.f10, rz);
        }
    }

    @Override
    public final String toString() {
        int id = this.f10 + 180000;
        if (sm0_0.cU.l90(id)) {
            return sm0_0.c0(id);
        }
        return super.toString();
    }
}
