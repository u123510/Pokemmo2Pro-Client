package cn.pokemmo.util.math;

public abstract class FloatMathHelper {
    public static float calculate(float f, float f2, float f3, float f4) {
        return f4 - f * f2 * f3;
    }

    public static float SJ0(float f, float f2, float f3, float f4) {
        return calculate(f, f2, f3, f4);
    }
}
