package aurelienribon.tweenengine.equations;

import f.ah_1;

public abstract class Linear extends ah_1 {
    public static final Linear INOUT = new Linear() {
        @Override
        public final float compute(float t) {
            return t;
        }

        @Override
        public String toString() {
            return "Linear.INOUT";
        }
    };
}
