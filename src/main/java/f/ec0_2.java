package f;

import cn.pokemmo.pokemon.move.MoveDatabase;

/**
 * 技能数据库兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.pokemon.move.MoveDatabase
 */
public final class ec0_2 extends MoveDatabase {
    public static ec0_2 dv;

    public ec0_2() {
        super();
    }

    public static ec0_2 Sx() {
        if (dv == null) {
            dv = new ec0_2();
            instance = dv;
        }
        return dv;
    }

    static {
        Cq0.E1(ec0_2.class);
        dv = new ec0_2();
        instance = dv;
    }
}
