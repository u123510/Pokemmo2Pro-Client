package cn.pokemmo.constant.enums;

import f.*;

public enum TextureWrapModeLegacy {
    MirroredRepeat(33648),
    x3(33071),
    xm0(10497);

    public final int kj;

    TextureWrapModeLegacy(int i3) {
        this.kj = i3;
    }

    public f.a00_0 toLegacy() {
        return f.a00_0.valueOf(name());
    }
}