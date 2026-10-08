package cn.pokemmo.constant.enums;

import f.*;

public enum DisplayMode {
    INLINE,
    BLOCK;

    public static final DisplayMode zH = INLINE;
    public static final DisplayMode ou0 = BLOCK;

    public static final DisplayMode[] iv0 = values();

    public f.YA0 toLegacy() {
        return f.YA0.valueOf(name());
    }
}