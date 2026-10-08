package cn.pokemmo.util.math;

public abstract class ModuloOffsetCalculator {
    public static int calculate(int n, int n2, int n3, int n4) {
        return n3 % (n - n2) + n4;
    }

    public static int oC0(int n, int n2, int n3, int n4) {
        return calculate(n, n2, n3, n4);
    }
}
