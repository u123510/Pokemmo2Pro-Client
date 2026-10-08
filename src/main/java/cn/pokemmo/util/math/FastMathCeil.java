package cn.pokemmo.util.math;

public abstract class FastMathCeil {
    public static final boolean t40;

    public static int ceil(float f) {
        int n2 = (int) f;
        if (f - (float) n2 > 0.0f) {
            ++n2;
        }
        return n2;
    }

    public static int Hf(float f) {
        return ceil(f);
    }

    static {
        t40 = !FastMathCeil.class.desiredAssertionStatus();
    }
}
