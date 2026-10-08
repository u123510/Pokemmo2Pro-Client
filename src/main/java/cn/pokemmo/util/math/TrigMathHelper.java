package cn.pokemmo.util.math;

public abstract class TrigMathHelper {
    public static double calculate(double d, double d2, double d4) {
        return d4 / (Math.cos(d) * d2);
    }

    public static double ki0(double d, double d2, double d4) {
        return calculate(d, d2, d4);
    }
}
