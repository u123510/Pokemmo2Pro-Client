package aurelienribon.tweenengine.equations;

import f.ah_1;

public abstract class Sine extends ah_1 {
    private static final float PI = 3.1415927f;

    public static final Sine IN = new Sine() {
        @Override
        public final float compute(float t) {
            return (float) -Math.cos((double) t * 1.5707963267948966) + 1.0f;
        }

        @Override
        public String toString() {
            return "Sine.IN";
        }
    };

    public static final Sine OUT = new Sine() {
        @Override
        public final float compute(float t) {
            return (float) Math.sin((double) t * 1.5707963267948966);
        }

        @Override
        public String toString() {
            return "Sine.OUT";
        }
    };

    public static final Sine INOUT = new Sine() {
        @Override
        public final float compute(float t) {
            return -0.5f * ((float) Math.cos((double) t * Math.PI) - 1.0f);
        }

        @Override
        public String toString() {
            return "Sine.INOUT";
        }
    };
}
