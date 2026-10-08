package f;

import cn.pokemmo.pokemon.move.MoveDamageCategory;

/**
 * 招式伤害分类兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.pokemon.move.MoveDamageCategory
 */
public final class yw_0 extends MoveDamageCategory {
    public static final yw_0 c0;
    public static final yw_0 pi0;
    public static final yw_0 Jy;
    public static final bm0_1 vP;
    public static final yw_0[] TJ;

    public yw_0(byte type, int value) {
        super(type, value);
    }

    static {
        c0 = new yw_0((byte) 0, 0);
        pi0 = new yw_0((byte) 1, 1);
        Jy = new yw_0((byte) 2, 2);
        TJ = new yw_0[]{c0, pi0, Jy};
        vP = new bm0_1();
        for (yw_0 value : TJ) {
            vP.gE0(value.RA0, value);
        }
    }
}
