package cn.pokemmo.util.collection;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.df0_2
 */
public class Modern_Col_Df02
extends ei_0 {

    public final float pr;
    public final float vB;
    public float Ay0;

    public Modern_Col_Df02() {
        float f = 0.1f;
        float f2 = 5.0f;
        float f3 = 1.0f;
        if (!Float.isNaN(f)) {
            if (!Float.isNaN(f2)) {
                this.pr = f;
                this.vB = f2;
                this.Ay0 = this.Lm0(f3);
                return;
            }
            throw new IllegalArgumentException("maxValue is NaN");
        }
        throw new IllegalArgumentException("minValue is NaN");
    }

    @Override
    public final float vB() {
        return this.vB;
    }

    @Override
    public final float Uu() {
        return this.pr;
    }

    @Override
    public final float ff() {
        return this.Ay0;
    }

    @Override
    public final void MK0(float f) {
        Modern_Col_Df02 df0_22 = this;
        if (df0_22.Ay0 != (f = df0_22.Lm0(f))) {
            this.Ay0 = f;
            a7_0.bH(this.RD0);
        }
    }

    public final float Lm0(float f) {
        if (Float.isNaN(f)) {
            return this.pr;
        }
        return Math.max(this.pr, Math.min(this.vB, f));
    }
}


