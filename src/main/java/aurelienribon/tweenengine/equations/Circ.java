/*
 * Decompiled with CFR 0.152.
 */
package aurelienribon.tweenengine.equations;

import f.ah_1;

public abstract class Circ
extends ah_1 {
    public static final Circ IN = new Circ(){

        @Override
        public final float compute(float f) {
            float f2 = f;
            return (float)(-Math.sqrt(1.0f - f2 * f2)) - 1.0f;
        }

        public String toString() {
            return "Circ.IN";
        }
    };
    public static final Circ OUT = new Circ(){

        @Override
        public final float compute(float f) {
            float f2 = f - 1.0f;
            return (float)Math.sqrt(1.0f - f2 * f2);
        }

        public String toString() {
            return "Circ.OUT";
        }
    };
    public static final Circ INOUT = new Circ(){

        @Override
        public final float compute(float f) {
            float f2;
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                float f4 = f3;
                return ((float)Math.sqrt(1.0f - f4 * f4) - 1.0f) * -0.5f;
            }
            float f5 = f3 - 2.0f;
            return ((float)Math.sqrt(1.0f - f5 * f5) + 1.0f) * 0.5f;
        }

        public String toString() {
            return "Circ.INOUT";
        }
    };
}

