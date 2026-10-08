/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  f.AE0
 *  f.B7
 *  f.Tn
 *  f.c50_0
 *  f.dy_2
 *  f.id0_1
 *  f.kk_1
 */
package cn.pokemmo.audio.adpcm;

import f.*;

import f.AE0;
import f.B7;
import f.Tn;
import f.c50_0;
import f.dy_2;
import f.id0_1;
import f.kk_1;

public class AdpcmBlockDecoder
extends Tn {
    public static final float[] km0 = new float[]{0.0f, 0.6666667f, 0.2857143f, 0.13333334f, 0.06451613f, 0.031746034f, 0.015748031f, 0.007843138f, 0.0039138943f, 0.0019550342f, 9.770396E-4f, 4.884005E-4f, 2.4417043E-4f, 1.2207776E-4f, 6.103702E-5f};
    public static final float[] UO = new float[]{0.0f, -0.6666667f, -0.85714287f, -0.93333334f, -0.9677419f, -0.984127f, -0.992126f, -0.99607843f, -0.99804306f, -0.9990225f, -0.9995115f, -0.9997558f, -0.9998779f, -0.99993896f, -0.9999695f};
    public final int pB0;
    public int s00;
    public int Zc;
    public float Jo0;
    public int dS;
    public float Y6;
    public float YI;
    public float uK;

    public AdpcmBlockDecoder(int n) {
        this.pB0 = n;
        this.s00 = 0;
    }

    public void uf0(kk_1 kk_12, c50_0 c50_02, AE0 aE0) {
        int n;
        this.Zc = n = kk_12.DA(4);
        if (n != 15) {
            if (aE0 != null) {
                aE0.pI(n, 4);
            }
            if ((n = this.Zc) != 0) {
                V4 v4 = (V4) this;
                v4.dS = n + 1;
                v4.YI = km0[n];
                v4.uK = UO[n];
            }
            return;
        }
        AdpcmBlockDecoder.<RuntimeException>throwUnchecked(new dy_2(dy_2.vx0(514)));
    }

    public void zC0(kk_1 kk_12, c50_0 c50_02) {
        if (this.Zc != 0) {
            this.Jo0 = id0_1.YL0[kk_12.DA(6)];
        }
    }

    public boolean Rb(kk_1 kk_12) {
        if (this.Zc != 0) {
            this.Y6 = kk_12.DA(this.dS);
        }
        if (++this.s00 == 12) {
            this.s00 = 0;
            return true;
        }
        return false;
    }

    public boolean po0(int n, B7 b7, B7 b72) {
        if (this.Zc != 0 && n != 2) {
            V4 v4 = (V4) this;
            float f = (v4.Y6 * this.YI + this.uK) * this.Jo0;
            n = v4.pB0;
            b7.RE[n] = f;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
