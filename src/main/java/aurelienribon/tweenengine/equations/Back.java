package aurelienribon.tweenengine.equations;

import f.ah_1;

public abstract class Back extends ah_1 {
    protected float param_s = 1.70158f;

    public static final Back IN = new Back() {
        @Override
        public final float compute(float t) {
            float s = this.param_s;
            return t * t * ((s + 1.0f) * t - s);
        }

        @Override
        public String toString() {
            return "Back.IN";
        }
    };

    public static final Back OUT = new Back() {
        @Override
        public final float compute(float t) {
            float s = this.param_s;
            float t2 = t - 1.0f;
            return t2 * t2 * ((s + 1.0f) * t2 + s) + 1.0f;
        }

        @Override
        public String toString() {
            return "Back.OUT";
        }
    };

    public static final Back INOUT = new Back() {
        @Override
        public final float compute(float t) {
            float s = this.param_s * 1.525f;
            float t2 = t * 2.0f;
            if (t2 < 1.0f) {
                return 0.5f * (t2 * t2 * ((s + 1.0f) * t2 - s));
            }
            float t3 = t2 - 2.0f;
            return 0.5f * (t3 * t3 * ((s + 1.0f) * t3 + s) + 2.0f);
        }

        @Override
        public String toString() {
            return "Back.INOUT";
        }
    };

    public Back s(float s) {
        this.param_s = s;
        return this;
    }
}
