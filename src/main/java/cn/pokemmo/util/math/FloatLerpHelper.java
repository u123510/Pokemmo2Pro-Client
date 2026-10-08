package cn.pokemmo.util.math;

public abstract class FloatLerpHelper {
    public static float lerp(float f, float f2, float f3, float f4) {
        return (f - f2) * f3 + f4;
    }

    public static float Ga0(float f, float f2, float f3, float f4) {
        return lerp(f, f2, f3, f4);
    }
}
