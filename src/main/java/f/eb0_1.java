package f;

import cn.pokemmo.constant.enums.TextureFilter;

public enum eb0_1 {
    Nearest(9728),
    Linear(9729),
    MipMap(9987),
    MipMapNearestNearest(9984),
    MipMapLinearNearest(9985),
    MipMapNearestLinear(9986),
    MipMapLinearLinear(9987);

    public static final eb0_1 Y30 = Nearest;
    public static final eb0_1 jc0 = Linear;

    public final int vv0;

    private eb0_1(int i3) {
        this.vv0 = i3;
    }

    public TextureFilter asModern() {
        return TextureFilter.valueOf(name());
    }
}