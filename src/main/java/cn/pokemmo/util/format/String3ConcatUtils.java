package cn.pokemmo.util.format;

public abstract class String3ConcatUtils {
    public static String concat(String string, String string2, String string3) {
        return string + string2 + string3;
    }

    public static String pz0(String string, String string2, String string3) {
        return concat(string, string2, string3);
    }
}
