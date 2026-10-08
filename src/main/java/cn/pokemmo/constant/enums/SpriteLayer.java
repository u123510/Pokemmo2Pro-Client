package cn.pokemmo.constant.enums;

import f.*;

public enum SpriteLayer {
    UG("_32"),
    iG0("_64"),
    Sl("_128");

    private SpriteLayer(String ignored) {
    }

    public f.HB0 toLegacy() {
        return f.HB0.valueOf(name());
    }
}