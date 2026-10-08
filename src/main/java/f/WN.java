package f;

import cn.pokemmo.constant.enums.GraphicsBackend;

public enum WN {
    OpenGL,
    ANGLE;

    // Obfuscated field aliases used by existing project call sites.
    public static final WN r10 = OpenGL;
    public static final WN Or0 = ANGLE;

    public static WN[] YG() {
        if (ea0_1.T9 && !ea0_1.oR) {
            return values();
        }
        if (ea0_1.NL) {
            return values();
        }
        return new WN[]{r10};
    }

    public GraphicsBackend asModern() {
        return GraphicsBackend.valueOf(name());
    }
}