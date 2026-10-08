package cn.pokemmo.pokemon;

public abstract class PokemonFormConstants {
    public static final byte[] AE0 = new byte[]{3, 0, 6};

    public static boolean isSupportedForm(int n) {
        return n == 5 || n == 2 || n == 8;
    }

    public static boolean Con(int n) {
        return isSupportedForm(n);
    }
}
