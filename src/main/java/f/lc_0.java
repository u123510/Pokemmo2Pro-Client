package f;

import cn.pokemmo.graphics.gdx.shader.GdxShaderUniformRegistry;

/**
 * Shim: lc_0 -> GdxShaderUniformRegistry
 * @see cn.pokemmo.graphics.gdx.shader.GdxShaderUniformRegistry
 */
public class lc_0 extends GdxShaderUniformRegistry {
    public lc_0() { super(); }

    public static lc_0 ju0(p_0 p_0Var) {
        lc_0 lc_0Var = new lc_0();
        lc_0Var.BJ0 = new float[28];
        lc_0Var.Bj0 = p_0Var;
        p_0Var.kK0 = OI0.MW;
        lc_0Var.i80.sI0 = (LPT6_) p_0Var.hE0(0.0f);
        lc_0Var.et0();
        lc_0Var.i80.c0 = 770;
        lc_0Var.i80.Uw0 = 771;
        lc_0Var.jd.x = (float) lc_0Var.i80.sI0.bz;
        lc_0Var.jd.y = (float) lc_0Var.i80.sI0.xZ;
        lc_0Var.oA(0.01f);
        lc_0Var.Ej0(1.0f, 1.0f, 1.0f, 1.0f);
        return lc_0Var;
    }

    public static lc_0 fC0(LPT6_ lpt6_) {
        lc_0 lc_0Var = new lc_0();
        lc_0Var.BJ0 = new float[28];
        lc_0Var.i80.sI0 = lpt6_;
        lc_0Var.et0();
        lc_0Var.i80.c0 = 770;
        lc_0Var.i80.Uw0 = 771;
        lc_0Var.jd.x = (float) lpt6_.bz;
        lc_0Var.jd.y = (float) lpt6_.xZ;
        lc_0Var.oA(0.01f);
        lc_0Var.Ej0(1.0f, 1.0f, 1.0f, 1.0f);
        return lc_0Var;
    }
}
