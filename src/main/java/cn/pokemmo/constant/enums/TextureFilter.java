package cn.pokemmo.constant.enums;

import f.*;

public enum TextureFilter {
    Nearest(9728),
    Linear(9729),
    MipMap(9987),
    MipMapNearestNearest(9984),
    MipMapLinearNearest(9985),
    MipMapNearestLinear(9986),
    MipMapLinearLinear(9987);

    public static final TextureFilter Y30 = Nearest;
    public static final TextureFilter jc0 = Linear;

    public final int vv0;

    private TextureFilter(int i3) {
        this.vv0 = i3;
    }

    public f.eb0_1 toLegacy() {
        return f.eb0_1.valueOf(name());
    }
}