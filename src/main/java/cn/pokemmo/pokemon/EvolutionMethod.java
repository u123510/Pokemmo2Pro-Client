package cn.pokemmo.pokemon;

import f.m_0;

import java.util.HashMap;
import java.util.Map;

/**
 * 宝可梦进化方式枚举 (Pokemon Evolution Method)
 * 定义了包含世代继承的各类进化触发条件（亲密度、等级、道具、通讯、数值倾向等）。
 *
 * 原混淆类: f.m_0
 */
public enum EvolutionMethod {
    BREEDING_ONLY(0, 0, "仅生蛋"),
    HAPPINESS(1, 1, "亲密度"),
    HAPPINESS_DAY(2, 2, "亲密度（白天）"),
    HAPPINESS_NIGHT(3, 3, "亲密度（夜晚）"),
    LEVEL(4, 4, "升级"),
    TRADE(5, 5, "通讯交换"),
    TRADE_WITH_ITEM(6, 6, "携带道具通讯交换"),
    TRADE_FOR_OPPOSITE(-1, 7, "特定宝可梦交换"),
    ITEM(7, 8, "使用道具"),
    ATK_GREATER_THAN_DEF(8, 9, "攻击大于防御"),
    ATK_EQUAL_TO_DEF(9, 10, "攻击等于防御"),
    ATK_LESS_THAN_DEF(10, 11, "攻击小于防御"),
    PERSONALITY_HIGH(11, 12, "性格值高"),
    PERSONALITY_LOW(12, 13, "性格值低"),
    ALLOW_MONSTER_CREATION(13, 14, "允许生成新怪"),
    CREATE_EXTRA_MONSTER(14, 15, "产生额外个体（如脱壳忍者）"),
    MAX_BEAUTY(15, 16, "美丽度满"),
    ITEM_MALE(-1, 17, "雄性使用道具"),
    ITEM_FEMALE(-1, 18, "雌性使用道具"),
    LEVEL_ITEM_DAY(-1, 19, "携带道具升级（白天）"),
    LEVEL_ITEM_NIGHT(-1, 20, "携带道具升级（夜晚）"),
    LEVEL_WITH_SKILL(-1, 21, "学会特定技能升级"),
    LEVEL_WITH_MONSTER(-1, 22, "同行有特定宝可梦升级"),
    LEVEL_MALE(-1, 23, "雄性升级"),
    LEVEL_FEMALE(-1, 24, "雌性升级"),
    LEVEL_LOCATION_1(-1, 25, "特定地点升级1（如青苔岩）"),
    LEVEL_LOCATION_2(-1, 26, "特定地点升级2（如冰原岩）"),
    LEVEL_LOCATION_3(-1, 27, "特定地点升级3（如特殊磁场）");

    private final byte gbaId;
    private final byte ndsId;
    private final String description;

    private static final Map<Byte, EvolutionMethod> BY_GBA_ID = new HashMap<>();
    private static final Map<Byte, EvolutionMethod> BY_NDS_ID = new HashMap<>();

    static {
        for (EvolutionMethod method : values()) {
            if (method.gbaId >= 0) {
                BY_GBA_ID.put(method.gbaId, method);
            }
            BY_NDS_ID.put(method.ndsId, method);
        }
    }

    EvolutionMethod(int gbaId, int ndsId, String description) {
        this.gbaId = (byte) gbaId;
        this.ndsId = (byte) ndsId;
        this.description = description;
    }

    public byte getGbaId() {
        return gbaId;
    }

    public byte getNdsId() {
        return ndsId;
    }

    public String getDescription() {
        return description;
    }

    public int getEvolutionStringId() {
        return this.ndsId + 2550;
    }

    public static EvolutionMethod fromGbaId(int gbaId) {
        return BY_GBA_ID.get((byte) gbaId);
    }

    public static EvolutionMethod fromNdsId(int ndsId) {
        return BY_NDS_ID.get((byte) ndsId);
    }

    public m_0 toBridge() {
        return m_0.values()[this.ordinal()];
    }

    public static EvolutionMethod fromBridge(m_0 legacy) {
        if (legacy == null) return null;
        return values()[legacy.ordinal()];
    }
}
