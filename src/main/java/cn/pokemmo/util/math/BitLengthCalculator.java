package cn.pokemmo.util.math;

public abstract class BitLengthCalculator {
    public static int bitLength(int n) {
        int n2 = 0;
        while (n != 0) {
            ++n2;
            n >>>= 1;
        }
        return n2;
    }

    public static int iY(int n) {
        return bitLength(n);
    }
}
