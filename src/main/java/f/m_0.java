package f;

import cn.pokemmo.pokemon.EvolutionMethod;

/**
 * 兼容垫片 (Shim) - 宝可梦进化方式枚举
 * 核心定义已迁移至 {@link EvolutionMethod}
 */
public enum m_0 {
    BREEDING_ONLY(0, 0),
    HAPPINESS(1, 1),
    HAPPINESS_DAY(2, 2),
    HAPPINESS_NIGHT(3, 3),
    LEVEL(4, 4),
    TRADE(5, 5),
    TRADE_WITH_ITEM(6, 6),
    TRADE_FOR_OPPOSITE(-1, 7),
    ITEM(7, 8),
    ATK_GREATER_THAN_DEF(8, 9),
    ATK_EQUAL_TO_DEF(9, 10),
    ATK_LESS_THAN_DEF(10, 11),
    PERSONALITY_HIGH(11, 12),
    PERSONALITY_LOW(12, 13),
    ALLOW_MONSTER_CREATION(13, 14),
    CREATE_EXTRA_MONSTER(14, 15),
    MAX_BEAUTY(15, 16),
    ITEM_MALE(-1, 17),
    ITEM_FEMALE(-1, 18),
    LEVEL_ITEM_DAY(-1, 19),
    LEVEL_ITEM_NIGHT(-1, 20),
    LEVEL_WITH_SKILL(-1, 21),
    LEVEL_WITH_MONSTER(-1, 22),
    LEVEL_MALE(-1, 23),
    LEVEL_FEMALE(-1, 24),
    LEVEL_LOCATION_1(-1, 25),
    LEVEL_LOCATION_2(-1, 26),
    LEVEL_LOCATION_3(-1, 27);

    public static final m_0 Ez0;
    public static final m_0 lPT4;
    public static final m_0 Yc0;
    public static final m_0 Q2;
    public static final m_0 F80;
    public static final m_0 xR;
    public static final m_0 V5;
    public static final m_0 D50;
    public static final bm0_1 d90;
    public static final bm0_1 d70;

    public final byte ut0;
    public final byte tK;

    m_0(int ut0, int tK) {
        this.ut0 = (byte) ut0;
        this.tK = (byte) tK;
    }

    static {
        Ez0 = HAPPINESS_DAY;
        lPT4 = TRADE_WITH_ITEM;
        Yc0 = ITEM;
        Q2 = ITEM_MALE;
        F80 = ITEM_FEMALE;
        xR = LEVEL_ITEM_DAY;
        V5 = LEVEL_ITEM_NIGHT;
        D50 = LEVEL_MALE;

        d90 = new bm0_1();
        d70 = new bm0_1();
        for (m_0 m_0Var : values()) {
            d90.gE0(m_0Var.ut0, m_0Var);
            d70.gE0(m_0Var.tK, m_0Var);
        }
    }

    public final int cv() {
        return this.tK + 2550;
    }

    public cn.pokemmo.pokemon.EvolutionMethod toDomain() {
        return cn.pokemmo.pokemon.EvolutionMethod.fromBridge(this);
    }

    public static m_0 fromDomain(cn.pokemmo.pokemon.EvolutionMethod domain) {
        return domain != null ? domain.toBridge() : null;
    }

    public EvolutionMethod asModern() {
        return toDomain();
    }

    public static m_0 asBridge(EvolutionMethod modern) {
        return fromDomain(modern);
    }
}
