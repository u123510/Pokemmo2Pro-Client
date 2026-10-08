package cn.pokemmo.constant.enums;

import f.*;

public enum PixelFormat {
    Alpha,
    Intensity,
    LuminanceAlpha,
    RGB565,
    RGBA4444,
    RGB888,
    RGBA8888;

    public static final PixelFormat Vp0 = Alpha;
    public static final PixelFormat nB0 = Intensity;
    public static final PixelFormat tt0 = LuminanceAlpha;
    public static final PixelFormat Tr = RGB565;
    public static final PixelFormat CON = RGBA4444;
    public static final PixelFormat n2 = RGB888;
    public static final PixelFormat Vw = RGBA8888;
    public static final PixelFormat[] qn0 = values();

    public static int p9(PixelFormat value) {
        if (value == Vp0 || value == nB0) return 1;
        if (value == tt0) return 2;
        if (value == Tr) return 5;
        if (value == CON) return 6;
        if (value == n2) return 3;
        if (value == Vw) return 4;
        throw new nf_1("Unknown Format: " + value);
    }

    public static PixelFormat Xt(int value) {
        if (value == 1) return Vp0;
        if (value == 2) return tt0;
        if (value == 5) return Tr;
        if (value == 6) return CON;
        if (value == 3) return n2;
        if (value == 4) return Vw;
        throw new nf_1(yr_1.pG("Unknown Gdx2DPixmap Format: ", value));
    }

    public f.ix0_0 toLegacy() {
        return f.ix0_0.valueOf(name());
    }
}