package cn.pokemmo.util.math;

public abstract class GridDivOffsetCalculator {
    public static int calculate(int n, int n2, int n3, int n4) {
        return (n - n2) / n3 + n4;
    }

    public static int lpT2(int n, int n2, int n3, int n4) {
        return calculate(n, n2, n3, n4);
    }
}
