package cn.pokemmo.battle.tier;

import f.av_1;

/**
 * 对战分级/分档枚举 (Battle Tier)
 * 对应游戏中排位与对战分级 (如 Uber, OU, UU, NU, Random 及双打模式)。
 *
 * 原混淆类: f.av_1
 */
public enum BattleTier {
    UBER((byte) 0, 5751, false, 0, "Uber"),
    DOUBLES_UBER((byte) 2, 5761, true, 0, "Doubles Uber"),
    OU((byte) 1, 5756, false, 3, "OverUsed"),
    DOUBLES_OU((byte) 3, 5764, true, 3, "Doubles OverUsed"),
    UU((byte) 4, 5752, false, 1, "UnderUsed"),
    DOUBLES_UU((byte) 5, 5762, true, 1, "Doubles UnderUsed"),
    NU((byte) 6, 5753, false, 2, "NeverUsed"),
    DOUBLES_NU((byte) 7, 5763, true, 2, "Doubles NeverUsed"),
    RANDOM((byte) 8, 5757, false, 4, "Random Battles"),
    DOUBLES_RANDOM((byte) 9, 5765, true, 4, "Doubles Random");

    private final byte code;
    private final int textId;
    private final boolean doubles;
    private final int sortPriority;
    private final String displayName;

    BattleTier(byte code, int textId, boolean doubles, int sortPriority, String displayName) {
        this.code = code;
        this.textId = textId;
        this.doubles = doubles;
        this.sortPriority = sortPriority;
        this.displayName = displayName;
    }

    public byte getCode() {
        return code;
    }

    public int getTextId() {
        return textId;
    }

    public boolean isDoubles() {
        return doubles;
    }

    public int getSortPriority() {
        return sortPriority;
    }

    public String getDisplayName() {
        return displayName;
    }

    public av_1 toObfuscated() {
        switch (this) {
            case UBER: return av_1.TC;
            case DOUBLES_UBER: return av_1.i40;
            case OU: return av_1.op;
            case DOUBLES_OU: return av_1.oq0;
            case UU: return av_1.UU_Level;
            case DOUBLES_UU: return av_1.CJ0;
            case NU: return av_1.NU_Level;
            case DOUBLES_NU: return av_1.G3;
            case RANDOM: return av_1.Random_Level;
            case DOUBLES_RANDOM: return av_1.pRn;
            default: return null;
        }
    }

    public static BattleTier fromObfuscated(av_1 obf) {
        if (obf == null) return null;
        switch (obf) {
            case TC: return UBER;
            case i40: return DOUBLES_UBER;
            case op: return OU;
            case oq0: return DOUBLES_OU;
            case UU_Level: return UU;
            case CJ0: return DOUBLES_UU;
            case NU_Level: return NU;
            case G3: return DOUBLES_NU;
            case Random_Level: return RANDOM;
            case pRn: return DOUBLES_RANDOM;
            default: return null;
        }
    }

    public static BattleTier fromCode(byte code) {
        for (BattleTier tier : values()) {
            if (tier.code == code) return tier;
        }
        return null;
    }
}
