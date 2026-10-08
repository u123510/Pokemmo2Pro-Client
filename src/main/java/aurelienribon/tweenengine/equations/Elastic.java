package aurelienribon.tweenengine.equations;

import f.ah_1;

public abstract class Elastic extends ah_1 {
    private static final float PI = (float)Math.PI;

    public static final Elastic IN = new Elastic() {
        @Override
        public final float compute(float t) {
            float a = this.param_a;
            float p = this.param_p;
            if (t == 0.0f) return 0.0f;
            if (t == 1.0f) return 1.0f;
            if (!this.setP) p = 0.3f;
            final float s;
            if (this.setA && !(a < 1.0f)) {
                s = p / (PI * 2.0f) * (float)Math.asin(1.0f / a);
            } else {
                a = 1.0f;
                s = p / 4.0f;
            }
            t -= 1.0f;
            return -(a * (float)Math.pow(2.0, t * 10.0f) * (float)Math.sin((t - s) * (PI * 2.0f) / p));
        }

        @Override
        public String toString() {
            return "Elastic.IN";
        }
    };

    public static final Elastic OUT = new Elastic() {
        @Override
        public final float compute(float t) {
            float a = this.param_a;
            float p = this.param_p;
            if (t == 0.0f) return 0.0f;
            if (t == 1.0f) return 1.0f;
            if (!this.setP) p = 0.3f;
            final float s;
            if (this.setA && !(a < 1.0f)) {
                s = p / (PI * 2.0f) * (float)Math.asin(1.0f / a);
            } else {
                a = 1.0f;
                s = p / 4.0f;
            }
            return a * (float)Math.pow(2.0, t * -10.0f) * (float)Math.sin((t - s) * (PI * 2.0f) / p) + 1.0f;
        }

        @Override
        public String toString() {
            return "Elastic.OUT";
        }
    };

    public static final Elastic INOUT = new Elastic() {
        @Override
        public final float compute(float t) {
            float a = this.param_a;
            float p = this.param_p;
            if (t == 0.0f) return 0.0f;
            t *= 2.0f;
            if (t == 2.0f) return 1.0f;
            if (!this.setP) p = 0.45000002f;
            final float s;
            if (this.setA && !(a < 1.0f)) {
                s = p / (PI * 2.0f) * (float)Math.asin(1.0f / a);
            } else {
                a = 1.0f;
                s = p / 4.0f;
            }
            t -= 1.0f;
            if (t < 0.0f) {
                return a * (float)Math.pow(2.0, t * 10.0f) * (float)Math.sin((t - s) * (PI * 2.0f) / p) * -0.5f;
            }
            return a * (float)Math.pow(2.0, t * -10.0f) * (float)Math.sin((t - s) * (PI * 2.0f) / p) * 0.5f + 1.0f;
        }

        @Override
        public String toString() {
            return "Elastic.INOUT";
        }
    };

    protected float param_a;
    protected float param_p;
    protected boolean setA = false;
    protected boolean setP = false;

    public Elastic a(float a) {
        this.param_a = a;
        this.setA = true;
        return this;
    }

    public Elastic p(float p) {
        this.param_p = p;
        this.setP = true;
        return this;
    }
}
