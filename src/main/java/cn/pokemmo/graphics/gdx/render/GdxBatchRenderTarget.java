/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.render;

import f.*;


import com.badlogic.gdx.graphics.Texture;
import f.LPT6_;
import f.lt_1;
import f.ui_1;

/*
 * Renamed from f.hl0
 */
public class GdxBatchRenderTarget
extends ui_1 {
    public GdxBatchRenderTarget() {
    }

    public GdxBatchRenderTarget(int n) {
        super(200);
    }

    public GdxBatchRenderTarget(int n, lt_1 lt_12) {
        super(n, lt_12);
    }

    @Override
    public final void J2(Texture texture, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, int n3, int n4, boolean bl) {
        float f10 = f2 + 0.0f;
        super.J2(texture, f, f10, f3, f4, f5, f6, f7, f8, f9, n, n2, n3, n4, true);
    }

    @Override
    public final void QB0(Texture texture, float f, float f2, float f3, float f4, int n, int n2, boolean bl, boolean bl2) {
        super.QB0(texture, f, f2 + 0.0f, f3, f4, n, n2, bl, true);
    }

    @Override
    public final void Ya0(Texture texture, float f, float f2, int n, int n2, int n3, int n4) {
        float f3 = f2 + (float)n4;
        int n5 = n4 * -1;
        super.Ya0(texture, f, f3, n, n2, n3, n5);
    }

    @Override
    public final void gP(Texture texture, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f2 + f4;
        super.gP(texture, f, f9, f3, f4, f5, f8, f7, f6);
    }

    @Override
    public final void CH0(Texture texture, float f, float f2) {
        Texture texture2 = texture;
        float f3 = texture2.getWidth();
        float f4 = texture2.getHeight();
        float f5 = f2 + f4;
        f2 = -f4;
        super.vv0(texture2, f, f5, f3, f2);
    }

    @Override
    public final void vv0(Texture texture, float f, float f2, float f3, float f4) {
        float f5 = f2 + f4;
        f2 = -f4;
        super.vv0(texture, f, f5, f3, f2);
    }

    @Override
    public final void Il0(Texture texture, float[] fArray, int n) {
        float[] fArray2 = fArray;
        float[] fArray3 = fArray;
        float[] fArray4 = fArray;
        float[] fArray5 = fArray;
        float f = fArray4[4];
        fArray4[4] = fArray5[14];
        fArray5[14] = f;
        f = fArray4[9];
        fArray4[9] = fArray5[19];
        fArray5[19] = f;
        super.Il0(texture, fArray, n);
        f = fArray2[4];
        fArray2[4] = fArray3[14];
        fArray3[14] = f;
        f = fArray2[9];
        fArray2[9] = fArray3[19];
        fArray3[19] = f;
    }

    @Override
    public final void Lz(LPT6_ lPT6_, float f, float f2) {
        LPT6_ lPT6_2 = lPT6_;
        float f3 = lPT6_2.bz;
        float f4 = lPT6_2.xZ;
        float f5 = f2 + f4;
        f2 = -f4;
        super.S50(lPT6_2, f, f5, f3, f2);
    }

    @Override
    public final void S50(LPT6_ lPT6_, float f, float f2, float f3, float f4) {
        float f5 = f2 + f4;
        f2 = -f4;
        super.S50(lPT6_, f, f5, f3, f2);
    }

    @Override
    public final void u2(LPT6_ lPT6_, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = f6;
        float f11 = f10 * f8 + f2;
        float f12 = -f10;
        super.u2(lPT6_, f, f11, f3, f4, f5, f12, f7, f8, f9);
    }
}

