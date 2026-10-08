package cn.pokemmo.battle;

import f.Cq;

/**
 * 对战赛制/模式枚举 (Battle Format)
 * 包括单打、双打、三打、轮盘对战、群体战、野生战等。
 *
 * 原混淆类: f.Cq
 */
public enum BattleFormat {
    SINGLE((byte) 0, (byte) 1, (byte) 1, 100, "Single Battle"),
    DOUBLE((byte) 1, (byte) 2, (byte) 2, 101, "Double Battle"),
    MULTI((byte) 2, (byte) 2, (byte) 2, 102, "Multi Battle"),
    LINK_MULTI((byte) 3, (byte) 2, (byte) 2, 103, "Link Multi Battle"),
    WILD((byte) 4, (byte) 1, (byte) 1, -1, "Wild Battle"),
    TRIPLE((byte) 5, (byte) 3, (byte) 3, 104, "Triple Battle"),
    HORDE((byte) 6, (byte) 1, (byte) 5, -1, "Horde Battle"),
    ROTATION((byte) 7, (byte) 3, (byte) 3, 107, "Rotation Battle"),
    SAFARI((byte) 8, (byte) 1, (byte) 1, -1, "Safari Battle"),
    ROTATION_RAID((byte) 9, (byte) 4, (byte) 3, -1, "Raid / Battle Frontier");

    private final byte code;
    private final byte activePokemonPerSide;
    private final byte maxActivePokemonPerSide;
    private final int textId;
    private final String description;

    BattleFormat(byte code, byte activePokemonPerSide, byte maxActivePokemonPerSide, int textId, String description) {
        this.code = code;
        this.activePokemonPerSide = activePokemonPerSide;
        this.maxActivePokemonPerSide = maxActivePokemonPerSide;
        this.textId = textId;
        this.description = description;
    }

    public byte getCode() {
        return code;
    }

    public byte getActivePokemonPerSide() {
        return activePokemonPerSide;
    }

    public byte getMaxActivePokemonPerSide() {
        return maxActivePokemonPerSide;
    }

    public int getTextId() {
        return textId;
    }

    public String getDescription() {
        return description;
    }

    public Cq toObfuscated() {
        switch (this) {
            case SINGLE: return Cq.Wn0;
            case DOUBLE: return Cq.ez;
            case MULTI: return Cq.UNMAPPED_2;
            case LINK_MULTI: return Cq.UNMAPPED_3;
            case WILD: return Cq.Jd;
            case TRIPLE: return Cq.Hs0;
            case HORDE: return Cq.Jz0;
            case ROTATION: return Cq.yH;
            case SAFARI: return Cq.yL;
            case ROTATION_RAID: return Cq.Sa0;
            default: return null;
        }
    }

    public static BattleFormat fromObfuscated(Cq obf) {
        if (obf == null) return null;
        switch (obf) {
            case Wn0: return SINGLE;
            case ez: return DOUBLE;
            case UNMAPPED_2: return MULTI;
            case UNMAPPED_3: return LINK_MULTI;
            case Jd: return WILD;
            case Hs0: return TRIPLE;
            case Jz0: return HORDE;
            case yH: return ROTATION;
            case yL: return SAFARI;
            case Sa0: return ROTATION_RAID;
            default: return null;
        }
    }

    public static BattleFormat fromCode(byte code) {
        for (BattleFormat format : values()) {
            if (format.code == code) return format;
        }
        return null;
    }
}
