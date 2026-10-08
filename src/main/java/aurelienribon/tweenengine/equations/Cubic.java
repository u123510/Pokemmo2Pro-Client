/*
 * Decompiled with CFR 0.152.
 */
package aurelienribon.tweenengine.equations;

import f.ah_1;

public abstract class Cubic
extends ah_1 {
    public static final Cubic IN = new Cubic(){

        @Override
        public final float compute(float f) {
            float f2 = f;
            return f2 * f2 * f;
        }

        public String toString() {
            return "Cubic.IN";
        }
    };
    public static final Cubic OUT = new Cubic(){

        @Override
        public final float compute(float f) {
            float f2 = f - 1.0f;
            return f2 * f2 * f2 + 1.0f;
        }

        public String toString() {
            return "Cubic.OUT";
        }
    };
    public static final Cubic INOUT = new Cubic(){

        @Override
        public final float compute(float f) {
            float f2;
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                return f3 * 0.5f * f3 * f3;
            }
            return ((f3 -= 2.0f) * f3 * f3 + 2.0f) * 0.5f;
        }

        public String toString() {
            return "Cubic.INOUT";
        }
    };
}

