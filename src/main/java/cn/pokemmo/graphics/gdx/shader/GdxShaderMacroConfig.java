/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.shader;

import f.*;


import com.badlogic.gdx.graphics.Color;

public class GdxShaderMacroConfig {
    public static final C8 BJ = new C8();
    public static final C8 hn0 = new C8();
    public static final C8 Wd = new C8();
    public float[] BJ0 = new float[24];
    public final C8 ei0 = new C8();
    public final me0_2 uj = new me0_2();
    public final Bp0 Fp0 = new Bp0(1.0f, 1.0f);
    public final Color lPT5 = new Color();
    public final Bp0 jd = new Bp0();
    public final wd0_2 i80;
    public boolean vP = false;

    public GdxShaderMacroConfig() {
        this.i80 = new wd0_2();
    }

    public GdxShaderMacroConfig(wd0_2 wd0_22) {
        this.i80 = wd0_22;
    }

    static {
        new me0_2(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void aa(float f, float f2, float f3) {
        C8 c8 = this.ei0;
        c8.x = f;
        c8.y = f2;
        c8.z = f3;
        this.vP = false;
    }

    public final void yj(C8 c8) {
        this.ei0.x = c8.x;
        this.ei0.y = c8.y;
        this.ei0.z = c8.z;
        this.vP = false;
    }

    public final C8 MH0() {
        return this.ei0;
    }

    public final void oA(float f) {
        Bp0 bp0 = this.Fp0;
        bp0.x = f;
        bp0.y = f;
        this.vP = false;
    }

    public void nY() {
        float[] fArray = this.BJ0;
        Bp0 bp0 = this.Fp0;
        float f = (this.BJ0[0] + 0.0f) * bp0.x;
        float f2 = (fArray[1] + 0.0f) * bp0.y;
        float f3 = this.BJ0[2];
        me0_2 me0_22 = this.uj;
        float f4 = me0_22.Au0;
        float f5 = f4 * f;
        float f6 = me0_22.ao0;
        f5 = f6 * f3 + f5;
        float f7 = me0_22.th;
        fArray[0] = f5 - f7 * f2;
        f5 = f4 * f2;
        f5 = f7 * f + f5;
        float f8 = me0_22.m1;
        fArray[1] = f5 - f8 * f3;
        float f9 = f4 * f3;
        fArray[2] = f8 * f2 + f9 - f6 * f;
        f9 = -f8 * f - f6 * f2 - f7 * f3;
        me0_22.Jg();
        float[] fArray2 = this.BJ0;
        f = this.BJ0[0];
        f3 = fArray2[1];
        f4 = this.BJ0[2];
        me0_2 me0_23 = this.uj;
        float f10 = f;
        float f11 = f4;
        float f12 = f9;
        float f13 = f4;
        float f14 = f9;
        float f15 = f9;
        f9 = me0_23.m1;
        float f16 = f15 * f9;
        f6 = me0_23.Au0;
        f16 = f * f6 + f16;
        f7 = me0_23.th;
        float f17 = f3 * f7 + f16;
        f16 = me0_23.ao0;
        fArray2[0] = f17 - f4 * f16;
        f4 = f14 * f16;
        f4 = f3 * f6 + f4;
        fArray2[1] = f13 * f9 + f4 - f * f7;
        f = f12 * f7;
        f = f11 * f6 + f;
        fArray2[2] = f10 * f16 + f - f3 * f9;
        me0_23.Jg();
        float[] fArray3 = this.BJ0;
        float[] fArray4 = fArray3;
        C8 translation0 = this.ei0;
        fArray3[0] = translation0.x - 0.0f + this.BJ0[0];
        fArray3[1] = translation0.y - 0.0f + this.BJ0[1];
        fArray3[2] = this.BJ0[2] + translation0.z;
        Bp0 scale0 = this.Fp0;
        f = (this.BJ0[6] + 0.0f) * scale0.x;
        float f18 = (fArray3[7] + 0.0f) * scale0.y;
        f3 = this.BJ0[8];
        me0_2 me0_24 = this.uj;
        f4 = me0_24.Au0;
        float f19 = f4 * f;
        f6 = me0_24.ao0;
        f19 = f6 * f3 + f19;
        f7 = me0_24.th;
        fArray4[6] = f19 - f7 * f18;
        f19 = f4 * f18;
        f19 = f7 * f + f19;
        f8 = me0_24.m1;
        fArray4[7] = f19 - f8 * f3;
        float f20 = f4 * f3;
        fArray4[8] = f8 * f18 + f20 - f6 * f;
        f20 = -f8 * f - f6 * f18 - f7 * f3;
        me0_24.Jg();
        float[] fArray5 = this.BJ0;
        f = this.BJ0[6];
        f3 = fArray5[7];
        f4 = this.BJ0[8];
        me0_2 me0_25 = this.uj;
        float f21 = f;
        float f22 = f4;
        float f23 = f20;
        float f24 = f4;
        float f25 = f20;
        float f26 = f20;
        f20 = me0_25.m1;
        float f27 = f26 * f20;
        f6 = me0_25.Au0;
        f27 = f * f6 + f27;
        f7 = me0_25.th;
        float f28 = f3 * f7 + f27;
        f27 = me0_25.ao0;
        fArray5[6] = f28 - f4 * f27;
        f4 = f25 * f27;
        f4 = f3 * f6 + f4;
        fArray5[7] = f24 * f20 + f4 - f * f7;
        f = f23 * f7;
        f = f22 * f6 + f;
        fArray5[8] = f21 * f27 + f - f3 * f20;
        me0_25.Jg();
        float[] fArray6 = this.BJ0;
        float[] fArray7 = fArray6;
        C8 translation1 = this.ei0;
        fArray6[6] = translation1.x - 0.0f + this.BJ0[6];
        fArray6[7] = translation1.y - 0.0f + this.BJ0[7];
        fArray6[8] = this.BJ0[8] + translation1.z;
        Bp0 scale1 = this.Fp0;
        f = (this.BJ0[12] + 0.0f) * scale1.x;
        float f29 = (fArray6[13] + 0.0f) * scale1.y;
        f3 = this.BJ0[14];
        me0_2 me0_26 = this.uj;
        f4 = me0_26.Au0;
        float f30 = f4 * f;
        f6 = me0_26.ao0;
        f30 = f6 * f3 + f30;
        f7 = me0_26.th;
        fArray7[12] = f30 - f7 * f29;
        f30 = f4 * f29;
        f30 = f7 * f + f30;
        f8 = me0_26.m1;
        fArray7[13] = f30 - f8 * f3;
        float f31 = f4 * f3;
        fArray7[14] = f8 * f29 + f31 - f6 * f;
        f31 = -f8 * f - f6 * f29 - f7 * f3;
        me0_26.Jg();
        float[] fArray8 = this.BJ0;
        f = this.BJ0[12];
        f3 = fArray8[13];
        f4 = this.BJ0[14];
        me0_2 me0_27 = this.uj;
        float f32 = f;
        float f33 = f4;
        float f34 = f31;
        float f35 = f4;
        float f36 = f31;
        float f37 = f31;
        f31 = me0_27.m1;
        float f38 = f37 * f31;
        f6 = me0_27.Au0;
        f38 = f * f6 + f38;
        f7 = me0_27.th;
        float f39 = f3 * f7 + f38;
        f38 = me0_27.ao0;
        fArray8[12] = f39 - f4 * f38;
        f4 = f36 * f38;
        f4 = f3 * f6 + f4;
        fArray8[13] = f35 * f31 + f4 - f * f7;
        f = f34 * f7;
        f = f33 * f6 + f;
        fArray8[14] = f32 * f38 + f - f3 * f31;
        me0_27.Jg();
        float[] fArray9 = this.BJ0;
        float[] fArray10 = fArray9;
        C8 translation2 = this.ei0;
        fArray9[12] = translation2.x - 0.0f + this.BJ0[12];
        fArray9[13] = translation2.y - 0.0f + this.BJ0[13];
        fArray9[14] = this.BJ0[14] + translation2.z;
        Bp0 scale2 = this.Fp0;
        f = (this.BJ0[18] + 0.0f) * scale2.x;
        float f40 = (fArray9[19] + 0.0f) * scale2.y;
        f3 = this.BJ0[20];
        me0_2 me0_28 = this.uj;
        f4 = me0_28.Au0;
        float f41 = f4 * f;
        f6 = me0_28.ao0;
        f41 = f6 * f3 + f41;
        f7 = me0_28.th;
        fArray10[18] = f41 - f7 * f40;
        f41 = f4 * f40;
        f41 = f7 * f + f41;
        f8 = me0_28.m1;
        fArray10[19] = f41 - f8 * f3;
        float f42 = f4 * f3;
        fArray10[20] = f8 * f40 + f42 - f6 * f;
        f42 = -f8 * f - f6 * f40 - f7 * f3;
        me0_28.Jg();
        float[] fArray11 = this.BJ0;
        f = this.BJ0[18];
        f3 = fArray11[19];
        f4 = this.BJ0[20];
        me0_2 me0_29 = this.uj;
        float f43 = f;
        float f44 = f4;
        float f45 = f42;
        float f46 = f4;
        float f47 = f42;
        float f48 = f42;
        f42 = me0_29.m1;
        float f49 = f48 * f42;
        f6 = me0_29.Au0;
        f49 = f * f6 + f49;
        f7 = me0_29.th;
        float f50 = f3 * f7 + f49;
        f49 = me0_29.ao0;
        fArray11[18] = f50 - f4 * f49;
        f4 = f47 * f49;
        f4 = f3 * f6 + f4;
        fArray11[19] = f46 * f42 + f4 - f * f7;
        f = f45 * f7;
        f = f44 * f6 + f;
        fArray11[20] = f43 * f49 + f - f3 * f42;
        me0_29.Jg();
        float[] fArray12 = this.BJ0;
        C8 c8 = this.ei0;
        fArray12[18] = c8.x - 0.0f + this.BJ0[18];
        fArray12[19] = c8.y - 0.0f + this.BJ0[19];
        fArray12[20] = this.BJ0[20] + c8.z;
        this.vP = true;
    }

    public void Oh0() {
        GdxShaderMacroConfig hG = this;
        Bp0 bp0 = hG.jd;
        float f = bp0.x;
        float f2 = -f / 2.0f;
        f = f2 + f;
        float f3 = bp0.y;
        float f4 = f3 / 2.0f;
        f3 = f4 - f3;
        float[] fArray = hG.BJ0;
        float[] fArray2 = hG.BJ0;
        fArray[0] = f2;
        fArray2[1] = f4;
        fArray[2] = 0.0f;
        fArray2[6] = f;
        fArray[7] = f4;
        fArray2[8] = 0.0f;
        fArray[12] = f2;
        fArray2[13] = f3;
        fArray[14] = 0.0f;
        fArray2[18] = f;
        fArray[19] = f3;
        fArray2[20] = 0.0f;
        hG.vP = false;
    }
}
