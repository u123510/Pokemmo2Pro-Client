package f;

import cn.pokemmo.battle.BattleEndReason;

/**
 * 战斗结束原因兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.battle.BattleEndReason
 */
public final class Vz0 extends BattleEndReason {
    public static final Vz0 MM;
    public static final Vz0 GH;
    public static final Vz0 lx0;
    public static final Vz0 bK;
    public static final bm0_1 fg;
    public static final Vz0[] K1;

    public Vz0(int value, int id) {
        super(value, id);
    }

    static {
        Vz0 zero = new Vz0(0, 0);
        MM = new Vz0(1, 1);
        GH = new Vz0(2, 2);
        lx0 = new Vz0(3, 3);
        bK = new Vz0(4, 4);
        K1 = new Vz0[]{zero, MM, GH, lx0, bK};
        fg = new bm0_1();
        for (Vz0 value : K1) {
            fg.gE0(value.ht0, value);
        }
    }
}
