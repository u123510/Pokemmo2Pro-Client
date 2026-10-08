package cn.pokemmo.util.math;

public abstract class BinaryToggleUtil {
    public static int toggle(int n) {
        if (n != 1) {
            return 1;
        }
        return 2;
    }

    public static int ng0(int n) {
        return toggle(n);
    }
}
