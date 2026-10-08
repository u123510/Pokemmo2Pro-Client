package f;

import cn.pokemmo.graphics.gdx.render.GdxLayeredTexture;

/**
 * Shim: com3__3 -> GdxLayeredTexture
 * @see cn.pokemmo.graphics.gdx.render.GdxLayeredTexture
 */
public class com3__3 extends GdxLayeredTexture {
    public com3__3(GdxLayeredTexture v1) { super(v1); }
    public com3__3(int i1, int i2, LPT6_ v3, boolean i4) { super(i1, i2, v3, i4); }

    public static com3__3 xD(xt_0 v0) {
        LPT6_ v1 = v0.yq();
        float f2 = v0.cOm4;
        int i3 = (int) (v1.bz / f2);
        int i2 = (int) (v1.xZ / f2);
        com3__3 result = new com3__3(i3, i2, v1, true);
        result.Kj = v0;
        return result;
    }

    public static com3__3 Pd(LPT6_ v0) {
        return new com3__3(v0.bz, v0.xZ, v0, false);
    }

    public static com3__3 DE(LPT6_[] v0, float f1) {
        LPT6_ v4 = v0[0];
        com3__3 v3 = new com3__3((int) (v4.bz * f1), (int) (v4.xZ * f1), v4, true);
        p_0 p0 = new p_0(0.1f, v0);
        v3.r2 = p0;
        p0.kK0 = OI0.MW;
        v3.bq0.R4(v0[0]);
        v3.OF0(0.01f);
        v3.nu(1.0f, 1.0f, 1.0f, 1.0f);
        return v3;
    }
}
