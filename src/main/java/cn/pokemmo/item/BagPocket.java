package cn.pokemmo.item;

import f.l5_0;

/**
 * 背包口袋分类枚举 (Bag Pocket Category)
 * 对应游戏背包界面中的 8 大口袋分类
 * 原混淆类: f.l5_0
 */
public enum BagPocket {
    ITEMS(1, 1, 0, 0, 1401, (short) 129, "常规道具"),
    KEY_ITEMS(2, 5, 7, 4, 1402, (short) 210, "重要道具"),
    TMS_HMS(3, 2, 2, 0, 2, (short) 300, "技能机"),
    MAIL(4, 3, 3, 2, 3, (short) 400, "信件"),
    BATTLE(5, 4, 4, 3, 1406, (short) 500, "战斗道具"),
    BERRIES(6, 6, 0, 0, 1403, (short) 600, "树果"),
    POKE_BALLS(7, 7, 1, 1, 1404, (short) 700, "精灵球"),
    MEDICINE(8, 8, 6, 0, 1405, (short) 800, "药品");

    public final byte pocketId;
    public final byte displayIndex;
    public final byte subCategory1;
    public final byte subCategory2;
    public final int titleTextId;
    public final short sortOrder;
    public final String description;

    BagPocket(int pocketId, int displayIndex, int subCategory1, int subCategory2, int titleTextId, short sortOrder, String description) {
        this.pocketId = (byte) pocketId;
        this.displayIndex = (byte) displayIndex;
        this.subCategory1 = (byte) subCategory1;
        this.subCategory2 = (byte) subCategory2;
        this.titleTextId = titleTextId;
        this.sortOrder = sortOrder;
        this.description = description;
    }

    public static BagPocket fromId(int id) {
        for (BagPocket pocket : values()) {
            if (pocket.pocketId == id) {
                return pocket;
            }
        }
        return null;
    }

    public static BagPocket fromBridge(l5_0 legacy) {
        if (legacy == null) return null;
        return values()[legacy.ordinal()];
    }

    public l5_0 toBridge() {
        return l5_0.values()[this.ordinal()];
    }

    public int getTitleTextId() {
        return this.titleTextId;
    }

    public short getSortOrder() {
        return this.sortOrder;
    }
}
