package cn.pokemmo.battle.tier;

import f.N2;

/**
 * 对战分级大类/层级 (Tier Category)
 * 表示单打/双打中的大段位等级 (如 OU, UBER, UU, NU, LC 等)。
 *
 * 原混淆类: f.N2
 */
public enum TierCategory {
    OU((byte) 0, 5750, "OverUsed"),
    UBER((byte) 1, 5751, "Uber"),
    UU((byte) 2, 5752, "UnderUsed"),
    NU((byte) 3, 5753, "NeverUsed"),
    LC((byte) 4, 5754, "Little Cup"),
    DOUBLES((byte) 5, 5755, "Doubles"),
    UNTIERED((byte) 6, 5757, "Untiered");

    private final byte bit;
    private final int textId;
    private final String name;

    TierCategory(byte bit, int textId, String name) {
        this.bit = bit;
        this.textId = textId;
        this.name = name;
    }

    public byte getBit() {
        return bit;
    }

    public int getTextId() {
        return textId;
    }

    public String getName() {
        return name;
    }

    public N2 toObfuscated() {
        switch (this) {
            case OU: return N2.BF;
            case UBER: return N2.yH0;
            case UU: return N2.ax0;
            case NU: return N2.va;
            case LC: return N2.gA0;
            case DOUBLES: return N2.J8;
            case UNTIERED: return N2.b6;
            default: return null;
        }
    }

    public static TierCategory fromObfuscated(N2 obf) {
        if (obf == null) return null;
        switch (obf) {
            case BF: return OU;
            case yH0: return UBER;
            case ax0: return UU;
            case va: return NU;
            case gA0: return LC;
            case J8: return DOUBLES;
            case b6: return UNTIERED;
            default: return null;
        }
    }
}
