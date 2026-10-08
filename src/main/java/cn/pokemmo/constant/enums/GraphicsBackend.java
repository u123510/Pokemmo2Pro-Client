package cn.pokemmo.constant.enums;

import f.*;

public enum GraphicsBackend {
    OpenGL,
    ANGLE;

    // Obfuscated field aliases used by existing project call sites.
    public static final GraphicsBackend r10 = OpenGL;
    public static final GraphicsBackend Or0 = ANGLE;

    public static GraphicsBackend[] YG() {
        if (ea0_1.T9 && !ea0_1.oR) {
            return values();
        }
        if (ea0_1.NL) {
            return values();
        }
        return new GraphicsBackend[]{r10};
    }

    public f.WN toLegacy() {
        return f.WN.valueOf(name());
    }
}