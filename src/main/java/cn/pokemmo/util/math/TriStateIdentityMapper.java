package cn.pokemmo.util.math;

public abstract class TriStateIdentityMapper {
    public static int ih0(int n) {
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    return 3;
                }
                throw null;
            }
            return 2;
        }
        return 1;
    }
}
