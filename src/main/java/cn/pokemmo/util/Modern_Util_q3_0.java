package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.q3_0
 */
public class Modern_Util_q3_0 {

    public final B5 r6;
    public int e2;
    public int xP;
    public int kl0;
    public long bq0 = hk0_1.lQ();
    public int ss = 500;

    public Modern_Util_q3_0(B5 b5) {
        this.r6 = b5;
        b5.Ha0(0.0f);
        this.xP = 0;
    }

    public void r0() {
        int n = this.xP;
        if (n != this.kl0) {
            int n2;
            float f;
            float f2 = (float)(hk0_1.KG - this.bq0) / (float)this.ss;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            float f3 = this.e2;
            this.kl0 = n2 = (int)fe_2.Ga0(n, f3, f2, f3);
            this.r6.Ha0((float)n2 / 255.0f);
        }
    }

    public final void m(int n, int n2, int n3) {
        if (n2 > 255) {
            n2 = 255;
        } else if (n2 < 0) {
            n2 = 0;
        }
        Modern_Util_q3_0 q3_02 = this;
        q3_02.ss = n3;
        q3_02.bq0 = hk0_1.KG;
        this.xP = n2;
        if (n == -1) {
            this.e2 = this.kl0;
        } else {
            this.kl0 = n;
            this.e2 = n;
            this.r6.Ha0((float)n / 255.0f);
        }
    }
}


