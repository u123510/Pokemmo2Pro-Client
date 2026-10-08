package f;

import cn.pokemmo.constant.enums.TextureWrapModeLegacy;

public enum a00_0 {
    MirroredRepeat(33648),
    x3(33071),
    xm0(10497);

    public final int kj;

    a00_0(int i3) {
        this.kj = i3;
    }

    public TextureWrapModeLegacy asModern() {
        return TextureWrapModeLegacy.valueOf(name());
    }
}