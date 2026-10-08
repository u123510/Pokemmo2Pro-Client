package cn.pokemmo.graphics.gdx.shader;

import f.*;


import com.badlogic.gdx.graphics.Color;
import java.util.HashMap;

public class GdxShaderUniformRegistry extends f.HG {
    public p_0 Bj0;
    public HashMap c30;
    public float xv0;
    public float Mj;
    public final Color ts;

    public GdxShaderUniformRegistry() {
        this.Mj = 1.0f;
        this.ts = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public static GdxShaderUniformRegistry ju0(p_0 p_0Var) {
        GdxShaderUniformRegistry lc_0Var = new GdxShaderUniformRegistry();
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

    public static GdxShaderUniformRegistry fC0(LPT6_ lpt6_) {
        GdxShaderUniformRegistry lc_0Var = new GdxShaderUniformRegistry();
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

    public final void iZ(String str, p_0 p_0Var) {
        if (this.c30 == null) {
            this.c30 = new HashMap();
        }
        this.c30.put(str, p_0Var);
    }

    public final void Fs(String str) {
        if (this.c30 != null && this.c30.containsKey(str)) {
            this.Bj0 = (p_0) this.c30.get(str);
            this.xv0 = 0.0f;
        }
    }

    public final void Ej0(float f, float f2, float f3, float f4) {
        this.ts.set(f, f2, f3, f4);
        float intBitsToFloat = Float.intBitsToFloat((((int) (f4 * 255.0f)) << 24) | (((int) (f3 * 255.0f)) << 16) | (((int) (f2 * 255.0f)) << 8) | ((int) (f * 255.0f)) & -16777217);
        this.BJ0[4] = intBitsToFloat;
        this.BJ0[11] = intBitsToFloat;
        this.BJ0[18] = intBitsToFloat;
        this.BJ0[25] = intBitsToFloat;
    }

    public final void gH0(float f, float f2, float f3, float f4) {
        this.lPT5.set(f, f2, f3, f4);
        float intBitsToFloat = Float.intBitsToFloat((((int) (f4 * 255.0f)) << 24) | (((int) (f3 * 255.0f)) << 16) | (((int) (f2 * 255.0f)) << 8) | ((int) (f * 255.0f)) & -16777217);
        this.BJ0[3] = intBitsToFloat;
        this.BJ0[10] = intBitsToFloat;
        this.BJ0[17] = intBitsToFloat;
        this.BJ0[24] = intBitsToFloat;
    }

    @Override
    public final void nY() {
        float f_0 = (this.BJ0[0] + 0.0f) * this.Fp0.x;
        float f2_0 = (this.BJ0[1] + 0.0f) * this.Fp0.y;
        float f4_0 = this.BJ0[2];
        float f5_0 = this.uj.Au0;
        float f6_0 = f5_0 * f_0 + this.uj.ao0 * f4_0;
        float f8_0 = this.uj.th;
        this.BJ0[0] = f6_0 - f8_0 * f2_0;
        float f6_2_0 = f8_0 * f_0 + f5_0 * f2_0;
        float f9_0 = this.uj.m1;
        this.BJ0[1] = f6_2_0 - f9_0 * f4_0;
        float f1_0 = f9_0 * f2_0 + f5_0 * f4_0 - this.uj.ao0 * f_0;
        this.BJ0[2] = f1_0;
        float f1_2_0 = (-f9_0) * f_0 - this.uj.ao0 * f2_0 - f8_0 * f4_0;
        this.uj.Jg();
        float f3_0 = this.BJ0[0];
        float f4_2_0 = this.BJ0[1];
        float f5_2_0 = this.BJ0[2];
        this.BJ0[0] = f1_2_0 * this.uj.m1 + f3_0 * this.uj.Au0 + f4_2_0 * this.uj.th - f5_2_0 * this.uj.ao0;
        this.BJ0[1] = f5_2_0 * this.uj.m1 + f1_2_0 * this.uj.ao0 + f4_2_0 * this.uj.Au0 - f3_0 * this.uj.th;
        this.BJ0[2] = f3_0 * this.uj.ao0 + f1_2_0 * this.uj.th + f5_2_0 * this.uj.Au0 - f4_2_0 * this.uj.m1;
        this.uj.Jg();
        this.BJ0[0] = this.ei0.x - 0.0f + this.BJ0[0];
        this.BJ0[1] = this.ei0.y - 0.0f + this.BJ0[1];
        this.BJ0[2] = this.BJ0[2] + this.ei0.z;
        float f_7 = (this.BJ0[7] + 0.0f) * this.Fp0.x;
        float f2_7 = (this.BJ0[8] + 0.0f) * this.Fp0.y;
        float f4_7 = this.BJ0[9];
        float f5_7 = this.uj.Au0;
        float f6_7 = f5_7 * f_7 + this.uj.ao0 * f4_7;
        float f8_7 = this.uj.th;
        this.BJ0[7] = f6_7 - f8_7 * f2_7;
        float f6_2_7 = f8_7 * f_7 + f5_7 * f2_7;
        float f9_7 = this.uj.m1;
        this.BJ0[8] = f6_2_7 - f9_7 * f4_7;
        float f1_7 = f9_7 * f2_7 + f5_7 * f4_7 - this.uj.ao0 * f_7;
        this.BJ0[9] = f1_7;
        float f1_2_7 = (-f9_7) * f_7 - this.uj.ao0 * f2_7 - f8_7 * f4_7;
        this.uj.Jg();
        float f3_7 = this.BJ0[7];
        float f4_2_7 = this.BJ0[8];
        float f5_2_7 = this.BJ0[9];
        this.BJ0[7] = f1_2_7 * this.uj.m1 + f3_7 * this.uj.Au0 + f4_2_7 * this.uj.th - f5_2_7 * this.uj.ao0;
        this.BJ0[8] = f5_2_7 * this.uj.m1 + f1_2_7 * this.uj.ao0 + f4_2_7 * this.uj.Au0 - f3_7 * this.uj.th;
        this.BJ0[9] = f3_7 * this.uj.ao0 + f1_2_7 * this.uj.th + f5_2_7 * this.uj.Au0 - f4_2_7 * this.uj.m1;
        this.uj.Jg();
        this.BJ0[7] = this.ei0.x - 0.0f + this.BJ0[7];
        this.BJ0[8] = this.ei0.y - 0.0f + this.BJ0[8];
        this.BJ0[9] = this.BJ0[9] + this.ei0.z;
        float f_14 = (this.BJ0[14] + 0.0f) * this.Fp0.x;
        float f2_14 = (this.BJ0[15] + 0.0f) * this.Fp0.y;
        float f4_14 = this.BJ0[16];
        float f5_14 = this.uj.Au0;
        float f6_14 = f5_14 * f_14 + this.uj.ao0 * f4_14;
        float f8_14 = this.uj.th;
        this.BJ0[14] = f6_14 - f8_14 * f2_14;
        float f6_2_14 = f8_14 * f_14 + f5_14 * f2_14;
        float f9_14 = this.uj.m1;
        this.BJ0[15] = f6_2_14 - f9_14 * f4_14;
        float f1_14 = f9_14 * f2_14 + f5_14 * f4_14 - this.uj.ao0 * f_14;
        this.BJ0[16] = f1_14;
        float f1_2_14 = (-f9_14) * f_14 - this.uj.ao0 * f2_14 - f8_14 * f4_14;
        this.uj.Jg();
        float f3_14 = this.BJ0[14];
        float f4_2_14 = this.BJ0[15];
        float f5_2_14 = this.BJ0[16];
        this.BJ0[14] = f1_2_14 * this.uj.m1 + f3_14 * this.uj.Au0 + f4_2_14 * this.uj.th - f5_2_14 * this.uj.ao0;
        this.BJ0[15] = f5_2_14 * this.uj.m1 + f1_2_14 * this.uj.ao0 + f4_2_14 * this.uj.Au0 - f3_14 * this.uj.th;
        this.BJ0[16] = f3_14 * this.uj.ao0 + f1_2_14 * this.uj.th + f5_2_14 * this.uj.Au0 - f4_2_14 * this.uj.m1;
        this.uj.Jg();
        this.BJ0[14] = this.ei0.x - 0.0f + this.BJ0[14];
        this.BJ0[15] = this.ei0.y - 0.0f + this.BJ0[15];
        this.BJ0[16] = this.BJ0[16] + this.ei0.z;
        float f_21 = (this.BJ0[21] + 0.0f) * this.Fp0.x;
        float f2_21 = (this.BJ0[22] + 0.0f) * this.Fp0.y;
        float f4_21 = this.BJ0[23];
        float f5_21 = this.uj.Au0;
        float f6_21 = f5_21 * f_21 + this.uj.ao0 * f4_21;
        float f8_21 = this.uj.th;
        this.BJ0[21] = f6_21 - f8_21 * f2_21;
        float f6_2_21 = f8_21 * f_21 + f5_21 * f2_21;
        float f9_21 = this.uj.m1;
        this.BJ0[22] = f6_2_21 - f9_21 * f4_21;
        float f1_21 = f9_21 * f2_21 + f5_21 * f4_21 - this.uj.ao0 * f_21;
        this.BJ0[23] = f1_21;
        float f1_2_21 = (-f9_21) * f_21 - this.uj.ao0 * f2_21 - f8_21 * f4_21;
        this.uj.Jg();
        float f3_21 = this.BJ0[21];
        float f4_2_21 = this.BJ0[22];
        float f5_2_21 = this.BJ0[23];
        this.BJ0[21] = f1_2_21 * this.uj.m1 + f3_21 * this.uj.Au0 + f4_2_21 * this.uj.th - f5_2_21 * this.uj.ao0;
        this.BJ0[22] = f5_2_21 * this.uj.m1 + f1_2_21 * this.uj.ao0 + f4_2_21 * this.uj.Au0 - f3_21 * this.uj.th;
        this.BJ0[23] = f3_21 * this.uj.ao0 + f1_2_21 * this.uj.th + f5_2_21 * this.uj.Au0 - f4_2_21 * this.uj.m1;
        this.uj.Jg();
        this.BJ0[21] = this.ei0.x - 0.0f + this.BJ0[21];
        this.BJ0[22] = this.ei0.y - 0.0f + this.BJ0[22];
        this.BJ0[23] = this.BJ0[23] + this.ei0.z;
        this.vP = true;
    }

    @Override
    public final void Oh0() {
        float f = this.jd.x;
        float f2 = (-f) / 2.0f;
        float f3 = f2 + f;
        float f4 = this.jd.y;
        float f5 = f4 / 2.0f;
        float f6 = f5 - f4;
        this.BJ0[0] = f2;
        this.BJ0[1] = f5;
        this.BJ0[2] = 0.0f;
        this.BJ0[7] = f3;
        this.BJ0[8] = f5;
        this.BJ0[9] = 0.0f;
        this.BJ0[14] = f2;
        this.BJ0[15] = f6;
        this.BJ0[16] = 0.0f;
        this.BJ0[21] = f3;
        this.BJ0[22] = f6;
        this.BJ0[23] = 0.0f;
        this.vP = false;
    }

    public final void et0() {
        LPT6_ lpt6_ = this.i80.sI0;
        this.BJ0[5] = lpt6_.yQ;
        this.BJ0[6] = lpt6_.Y60;
        this.BJ0[12] = lpt6_.Yo;
        this.BJ0[13] = lpt6_.Y60;
        this.BJ0[19] = lpt6_.yQ;
        this.BJ0[20] = lpt6_.Ll0;
        this.BJ0[26] = lpt6_.Yo;
        this.BJ0[27] = lpt6_.Ll0;
    }

    public final void GF() {
        if (this.Bj0 == null) {
            return;
        }
        float f = this.xv0 + lg_0.S4.uL * this.Mj;
        this.xv0 = f;
        this.i80.sI0 = (LPT6_) this.Bj0.hE0(f);
        et0();
    }

    @Override
    public final Object clone() {
        GdxShaderUniformRegistry lc_0Var = new GdxShaderUniformRegistry();
        lc_0Var.BJ0 = new float[28];
        HG.Wd.np(HG.Wd);
        lc_0Var.ei0.np(this.ei0);
        lc_0Var.Bj0 = this.Bj0;
        lc_0Var.i80.sI0 = this.i80.sI0;
        lc_0Var.et0();
        lc_0Var.i80.c0 = 770;
        lc_0Var.i80.Uw0 = 771;
        lc_0Var.jd.x = (float) this.i80.sI0.bz;
        lc_0Var.jd.y = (float) this.i80.sI0.xZ;
        lc_0Var.oA(0.01f);
        lc_0Var.Ej0(1.0f, 1.0f, 1.0f, 1.0f);
        return lc_0Var;
    }
}
