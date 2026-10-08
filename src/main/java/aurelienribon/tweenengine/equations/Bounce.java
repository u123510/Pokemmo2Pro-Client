/*
 * Decompiled with CFR 0.152.
 */
package aurelienribon.tweenengine.equations;

import f.ah_1;

public abstract class Bounce
extends ah_1 {
    public static final Bounce IN = new Bounce(){

        @Override
        public final float compute(float f) {
            return 1.0f - OUT.compute(1.0f - f);
        }

        public String toString() {
            return "Bounce.IN";
        }
    };
    public static final Bounce OUT = new Bounce(){

        @Override
        public final float compute(float f) {
            double d;
            double d2 = f;
            if (d2 < 0.36363636363636365) {
                return f * 7.5625f * f;
            }
            if (d2 < 0.7272727272727273) {
                float f2 = f - 0.54545456f;
                return f2 * 7.5625f * f2 + 0.75f;
            }
            if (d2 < 0.9090909090909091) {
                float f3 = f - 0.8181818f;
                return f3 * 7.5625f * f3 + 0.9375f;
            }
            float f4 = f - 0.95454544f;
            return f4 * 7.5625f * f4 + 0.984375f;
        }

        public String toString() {
            return "Bounce.OUT";
        }
    };
    public static final Bounce INOUT = new Bounce(){

        @Override
        public final float compute(float f) {
            if (f < 0.5f) {
                return IN.compute(f * 2.0f) * 0.5f;
            }
            return OUT.compute(f * 2.0f - 1.0f) * 0.5f + 0.5f;
        }

        public String toString() {
            return "Bounce.INOUT";
        }
    };
}

