package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Im
 */
public class Modern_Util_Im {

    public final CH0 c60;
    public final av_1 SJ0;
    public final byte u20;
    public final float UI0;
    public final short ML;
    public final byte we;
    public final int Hr0;
    public final int Mg0;

    public Modern_Util_Im(av_1 av_12, byte by) {
        this.ML = (short) -1;
        this.c60 = CH0.j1;
        this.SJ0 = av_12;
        this.u20 = by;
        this.UI0 = 500.0f;
        this.we = 0;
        this.Hr0 = 0;
        this.Mg0 = 0;
    }

    public Modern_Util_Im(CH0 cH0, av_1 av_12, byte by, float f, short s, byte by2, int n, int n2) {
        this.c60 = cH0;
        this.SJ0 = av_12;
        this.u20 = by;
        this.UI0 = f;
        this.ML = s;
        this.we = by2;
        this.Hr0 = n;
        this.Mg0 = n2;
    }

    public final gt0_0 xl0() {
        if (this.Hr0 <= 0 && this.Mg0 <= 0 && this.UI0 == 500.0f) {
            return gt0_0.TU;
        }
        int n = this.ML;
        if (n == 1) {
            return gt0_0.It;
        }
        if (n > 0) {
            return gt0_0.jI;
        }
        float f = this.UI0;
        gt0_0 result;
        for (n = gt0_0.RL0.length - 1; n >= 0; --n) {
            result = gt0_0.RL0[n];
            if (f >= result.q90) {
                return result;
            }
        }
        return gt0_0.TU;
    }
}

