/*
 * Decompiled with CFR 0.152.
 */
package aurelienribon.tweenengine.equations;

import f.ah_1;

public abstract class Quad
extends ah_1 {
    public static final Quad IN = new Quad(){

        @Override
        public final float compute(float f) {
            float f2 = f;
            return f2 * f2;
        }

        public String toString() {
            return "Quad.IN";
        }
    };
    public static final Quad OUT = new Quad(){

        @Override
        public final float compute(float f) {
            float f2 = f;
            float f3 = -f2;
            return (f2 - 2.0f) * f3;
        }

        public String toString() {
            return "Quad.OUT";
        }
    };
    public static final Quad INOUT = new Quad(){

        @Override
        public final float compute(float f) {
            float f2;
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                return f3 * 0.5f * f3;
            }
            return (((f3 -= 1.0f) - 2.0f) * f3 - 1.0f) * -0.5f;
        }

        public String toString() {
            return "Quad.INOUT";
        }
    };
}

