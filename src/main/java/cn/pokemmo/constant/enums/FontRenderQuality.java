package cn.pokemmo.constant.enums;

import f.*;

public enum FontRenderQuality {
    w8,
    pN,
    xQ;

    public static final FontRenderQuality[] KP = values();

    public f.ri_0 toLegacy() {
        return f.ri_0.valueOf(name());
    }
}