package cn.pokemmo.constant.enums;

import f.*;

public enum TextureResolution {
    _32,
    _64,
    _128;

    public static final TextureResolution OE0 = _32;
    public static final TextureResolution BB = _64;
    public static final TextureResolution LPT9 = _128;
    public static final TextureResolution[] MB0 = values();

    public f.Uh0 toLegacy() {
        return f.Uh0.valueOf(name());
    }
}