package f;

import cn.pokemmo.constant.enums.SpriteLayer;

public enum HB0 {
    UG("_32"),
    iG0("_64"),
    Sl("_128");

    private HB0(String ignored) {
    }

    public SpriteLayer asModern() {
        return SpriteLayer.valueOf(name());
    }
}