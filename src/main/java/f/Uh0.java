package f;

import cn.pokemmo.constant.enums.TextureResolution;

public enum Uh0 {
    _32,
    _64,
    _128;

    public static final Uh0 OE0 = _32;
    public static final Uh0 BB = _64;
    public static final Uh0 LPT9 = _128;
    public static final Uh0[] MB0 = values();

    public TextureResolution asModern() {
        return TextureResolution.valueOf(name());
    }
}