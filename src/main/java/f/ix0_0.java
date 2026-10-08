package f;

import cn.pokemmo.constant.enums.PixelFormat;

public enum ix0_0 {
    Alpha,
    Intensity,
    LuminanceAlpha,
    RGB565,
    RGBA4444,
    RGB888,
    RGBA8888;

    public static final ix0_0 Vp0 = Alpha;
    public static final ix0_0 nB0 = Intensity;
    public static final ix0_0 tt0 = LuminanceAlpha;
    public static final ix0_0 Tr = RGB565;
    public static final ix0_0 CON = RGBA4444;
    public static final ix0_0 n2 = RGB888;
    public static final ix0_0 Vw = RGBA8888;
    public static final ix0_0[] qn0 = values();

    public static int p9(ix0_0 value) {
        if (value == Vp0 || value == nB0) return 1;
        if (value == tt0) return 2;
        if (value == Tr) return 5;
        if (value == CON) return 6;
        if (value == n2) return 3;
        if (value == Vw) return 4;
        throw new nf_1("Unknown Format: " + value);
    }

    public static ix0_0 Xt(int value) {
        if (value == 1) return Vp0;
        if (value == 2) return tt0;
        if (value == 5) return Tr;
        if (value == 6) return CON;
        if (value == 3) return n2;
        if (value == 4) return Vw;
        throw new nf_1(yr_1.pG("Unknown Gdx2DPixmap Format: ", value));
    }

    public PixelFormat asModern() {
        return PixelFormat.valueOf(name());
    }
}