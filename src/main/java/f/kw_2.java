package f;

import cn.pokemmo.constant.enums.ItemRarity;

public enum kw_2 {
    PX,
    Fc,
    fg0,
    D60;

    public ItemRarity asModern() {
        return ItemRarity.valueOf(name());
    }
}