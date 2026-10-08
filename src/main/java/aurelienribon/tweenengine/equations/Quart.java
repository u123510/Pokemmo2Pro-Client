/*
 * Decompiled with CFR 0.152.
 */
package aurelienribon.tweenengine.equations;

import f.ah_1;

public abstract class Quart
extends ah_1 {
    public static final Quart IN = new Quart(){

        @Override
        public final float compute(float f) {
            float f2 = f;
            return f2 * f2 * f * f;
        }

        public String toString() {
            return "Quart.IN";
        }
    };
    public static final Quart OUT = new Quart(){

        @Override
        public final float compute(float f) {
            float f2 = f - 1.0f;
            return -(f2 * f2 * f2 * f2 - 1.0f);
        }

        public String toString() {
            return "Quart.OUT";
        }
    };
    public static final Quart INOUT = new Quart(){

        @Override
        public final float compute(float f) {
            float f2;
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                return f3 * 0.5f * f3 * f3 * f3;
            }
            return ((f3 -= 2.0f) * f3 * f3 * f3 - 2.0f) * -0.5f;
        }

        public String toString() {
            return "Quart.INOUT";
        }
    };
}

