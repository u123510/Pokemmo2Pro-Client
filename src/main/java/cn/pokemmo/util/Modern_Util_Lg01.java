package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.lg0_1
 */
public class Modern_Util_Lg01
extends V4 {

    public int y9;
    public float ai;
    public int i4;
    public float Mp;
    public float sH;
    public float Bk;

    public Modern_Util_Lg01(int n) {
        super(n);
    }

    @Override
    public final void uf0(kk_1 kk_12, c50_0 c50_02, AE0 aE0) {
        int n;
        this.Zc = kk_12.DA(4);
        this.y9 = kk_12.DA(4);
        if (aE0 != null) {
            aE0.pI(this.Zc, 4);
            aE0.pI(this.y9, 4);
        }
        if ((n = this.Zc) != 0) {
            Modern_Util_Lg01 lg0_12 = this;
            lg0_12.dS = n + 1;
            lg0_12.YI = V4.km0[n];
            lg0_12.uK = V4.UO[n];
        }
        if ((n = this.y9) != 0) {
            Modern_Util_Lg01 lg0_13 = this;
            lg0_13.i4 = n + 1;
            lg0_13.sH = V4.km0[n];
            lg0_13.Bk = V4.UO[n];
        }
    }

    @Override
    public final void zC0(kk_1 kk_12, c50_0 c50_02) {
        if (this.Zc != 0) {
            this.Jo0 = id0_1.YL0[kk_12.DA(6)];
        }
        if (this.y9 != 0) {
            this.ai = id0_1.YL0[kk_12.DA(6)];
        }
    }

    @Override
    public final boolean Rb(kk_1 kk_12) {
        Modern_Util_Lg01 lg0_12 = this;
        boolean bl = super.Rb(kk_12);
        if (lg0_12.y9 != 0) {
            this.Mp = kk_12.DA(this.i4);
        }
        return bl;
    }

    @Override
    public final boolean po0(int n, B7 b7, B7 b72) {
        Modern_Util_Lg01 lg0_12 = this;
        super.po0(n, b7, b72);
        if (lg0_12.y9 != 0 && n != 1) {
            float f = (this.Mp * this.sH + this.Bk) * this.ai;
            if (n == 0) {
                int n2 = this.pB0;
                b72.RE[n2] = f;
            } else {
                int n3 = this.pB0;
                b7.RE[n3] = f;
            }
        }
        return true;
    }
}


