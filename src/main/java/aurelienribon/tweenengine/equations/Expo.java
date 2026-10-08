/*
 * Decompiled with CFR 0.152.
 */
package aurelienribon.tweenengine.equations;

import f.ah_1;

public abstract class Expo
extends ah_1 {
    public static final Expo IN = new Expo(){

        @Override
        public final float compute(float f) {
            float f2;
            if (f == 0.0f) {
                f2 = 0.0f;
            } else {
                double d = (f - 1.0f) * 10.0f;
                f2 = (float)Math.pow(2.0, d);
            }
            return f2;
        }

        public String toString() {
            return "Expo.IN";
        }
    };
    public static final Expo OUT = new Expo(){

        @Override
        public final float compute(float f) {
            float f2;
            if (f == 1.0f) {
                f2 = 1.0f;
            } else {
                double d = f * -10.0f;
                f2 = -((float)Math.pow(2.0, d)) + 1.0f;
            }
            return f2;
        }

        public String toString() {
            return "Expo.OUT";
        }
    };
    public static final Expo INOUT = new Expo(){

        @Override
        public final float compute(float f) {
            float f2;
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                double d = (f3 - 1.0f) * 10.0f;
                return (float)Math.pow(2.0, d) * 0.5f;
            }
            double d = (f3 - 1.0f) * -10.0f;
            return (-((float)Math.pow(2.0, d)) + 2.0f) * 0.5f;
        }

        public String toString() {
            return "Expo.INOUT";
        }
    };
}

