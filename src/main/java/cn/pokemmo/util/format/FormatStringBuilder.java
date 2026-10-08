package cn.pokemmo.util.format;

public abstract class FormatStringBuilder {
    public static StringBuilder go(String string, int n, String string2) {
        return new StringBuilder(string).append(n).append(string2);
    }
}
