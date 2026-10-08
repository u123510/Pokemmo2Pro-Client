package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.PA0
 */
public class Modern_Util_PA0 extends V4 {

    public float YC0;

    public Modern_Util_PA0(int value) {
        super(value);
    }

    public final void uf0(kk_1 source, c50_0 value, AE0 target) {
        super.uf0(source, value, target);
    }

    public final void zC0(kk_1 source, c50_0 value) {
        if (this.Zc != 0) {
            float[] constants = id0_1.YL0;
            this.Jo0 = constants[source.DA(6)];
            this.YC0 = constants[source.DA(6)];
        }
    }

    public final boolean Rb(kk_1 source) {
        return super.Rb(source);
    }

    public final boolean po0(int direction, B7 first, B7 second) {
        if (this.Zc != 0) {
            float value = this.Y6 * this.YI + this.uK;
            this.Y6 = value;
            if (direction != 0) {
                if (direction == 1) {
                    first.RE[this.pB0] = value * this.Jo0;
                } else {
                    first.RE[this.pB0] = value * this.YC0;
                }
            } else {
                first.RE[this.pB0] = value * this.Jo0;
                second.RE[this.pB0] = value * this.YC0;
            }
        }
        return true;
    }
}

