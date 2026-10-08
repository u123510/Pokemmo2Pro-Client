package cn.pokemmo.battle;

import f.gc_2;

/**
 * 宝可梦战斗属性枚举 (Battle Stat)
 * 对应 HP、攻击、防御、特攻、特防、速度以及战斗命中率与闪避率。
 *
 * 原混淆类: f.gc_2
 */
public enum BattleStat {
    HP((byte) 0, (byte) 0, "HP", 100, 10, false),
    ATTACK((byte) 1, (byte) 1, "ATTACK", 0, 5, false),
    DEFENSE((byte) 2, (byte) 2, "DEFENSE", 0, 5, false),
    SPEED((byte) 3, (byte) 5, "SPEED", 0, 5, false),
    SPECIAL_ATTACK((byte) 4, (byte) 3, "SP. ATTACK", 0, 5, false),
    SPECIAL_DEFENSE((byte) 5, (byte) 4, "SP. DEFENSE", 0, 5, false),
    ACCURACY((byte) 6, (byte) 6, "ACCURACY", 0, 0, true),
    EVASION((byte) 7, (byte) 7, "EVASION", 0, 0, true);

    private final byte index;
    private final byte sortOrder;
    private final String shortName;
    private final int baseValue;
    private final int stepValue;
    private final boolean battleModifierOnly;

    BattleStat(byte index, byte sortOrder, String shortName, int baseValue, int stepValue, boolean battleModifierOnly) {
        this.index = index;
        this.sortOrder = sortOrder;
        this.shortName = shortName;
        this.baseValue = baseValue;
        this.stepValue = stepValue;
        this.battleModifierOnly = battleModifierOnly;
    }

    public byte getIndex() {
        return index;
    }

    public byte getSortOrder() {
        return sortOrder;
    }

    public String getShortName() {
        return shortName;
    }

    public int getBaseValue() {
        return baseValue;
    }

    public int getStepValue() {
        return stepValue;
    }

    public boolean isBattleModifierOnly() {
        return battleModifierOnly;
    }

    public gc_2 toObfuscated() {
        switch (this) {
            case HP: return gc_2.RC;
            case ATTACK: return gc_2.r4;
            case DEFENSE: return gc_2.ly;
            case SPEED: return gc_2.ie0;
            case SPECIAL_ATTACK: return gc_2.ej;
            case SPECIAL_DEFENSE: return gc_2.lL0;
            case ACCURACY: return gc_2.ACCURACY;
            case EVASION: return gc_2.EVASION;
            default: return null;
        }
    }

    public static BattleStat fromObfuscated(gc_2 obf) {
        if (obf == null) return null;
        switch (obf) {
            case RC: return HP;
            case r4: return ATTACK;
            case ly: return DEFENSE;
            case ie0: return SPEED;
            case ej: return SPECIAL_ATTACK;
            case lL0: return SPECIAL_DEFENSE;
            case ACCURACY: return ACCURACY;
            case EVASION: return EVASION;
            default: return null;
        }
    }

    public static BattleStat fromIndex(byte index) {
        for (BattleStat stat : values()) {
            if (stat.index == index) return stat;
        }
        return null;
    }
}
