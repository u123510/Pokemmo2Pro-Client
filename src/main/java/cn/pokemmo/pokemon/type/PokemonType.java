package cn.pokemmo.pokemon.type;

import f.i40_0;

/**
 * 宝可梦属性体系与属性相克矩阵 (Pokemon Type & Effectiveness Matrix)
 * 对应宝可梦 18 种标准属性 + 1 种无属性 (NONE)，并内置 18x18 的伤害相克倍率表 (0x, 0.5x, 1x, 2x)
 * 
 * 注意：在 PokeMMO 客户端（基于第五世代引擎架构）中，第 9 号属性原为黑白 ROM 的 "???" (未知/神秘) 槽位，
 * PokeMMO 官方在此槽位上完整实现了第六世代引入的【妖精 (Fairy)】属性，包括：
 * 1. 对应文本 ID 230009 为 "Fairy" / "妖精"
 * 2. 注入了完整的第六世代妖精属性攻防克制倍率表（克制格斗/龙/恶，被毒/钢克制，龙系对其无效）
 * 
 * 原混淆类: f.i40_0
 */
public enum PokemonType {
    NORMAL(0, 0, "一般"),
    FIGHTING(1, 1, "格斗"),
    FLYING(2, 2, "飞行"),
    POISON(3, 3, "毒"),
    GROUND(4, 4, "地面"),
    ROCK(5, 5, "岩石"),
    BUG(6, 6, "虫"),
    GHOST(7, 7, "幽灵"),
    STEEL(8, 8, "钢"),
    FAIRY(9, -1, "妖精"),
    FIRE(10, 9, "火"),
    WATER(11, 10, "水"),
    GRASS(12, 11, "草"),
    ELECTRIC(13, 12, "电"),
    PSYCHIC(14, 13, "超能力"),
    ICE(15, 14, "冰"),
    DRAGON(16, 15, "龙"),
    DARK(17, 16, "恶"),
    NONE(18, 17, "无");

    /** 历史兼容别名：在第五世代原版 ROM 槽位中曾标记为神秘/未知属性 (???) */
    public static final PokemonType UNKNOWN = FAIRY;

    public final byte typeId;
    public final byte internalId;
    public final String typeName;

    PokemonType(int typeId, int internalId, String typeName) {
        this.typeId = (byte) typeId;
        this.internalId = (byte) internalId;
        this.typeName = typeName;
    }

    public static PokemonType fromId(byte id) {
        for (PokemonType type : values()) {
            if (type.typeId == id) {
                return type;
            }
        }
        return NONE;
    }

    public static PokemonType fromBridge(i40_0 legacy) {
        if (legacy == null) return NONE;
        return values()[legacy.ordinal()];
    }

    public i40_0 toBridge() {
        return i40_0.values()[this.ordinal()];
    }

    /**
     * 获取攻击属性对防御属性的基础伤害倍率 (0.0, 0.5, 1.0, 2.0)
     */
    public double getDamageMultiplierAgainst(PokemonType defenseType) {
        i40_0 atk = toBridge();
        i40_0 def = defenseType.toBridge();
        if (atk.j40 >= 0 && atk.j40 < atk.eI0.length && def.j40 >= 0 && def.j40 < atk.eI0.length) {
            return atk.eI0[def.j40];
        }
        return 1.0;
    }

    public byte getTypeId() {
        return this.typeId;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public boolean isFairy() {
        return this == FAIRY;
    }

    public boolean isSpecial() {
        // 第四世代以前特殊属性分类 (供历史战斗系统参考)
        switch (this) {
            case FIRE:
            case WATER:
            case GRASS:
            case ELECTRIC:
            case PSYCHIC:
            case ICE:
            case DRAGON:
            case DARK:
                return true;
            default:
                return false;
        }
    }
}
