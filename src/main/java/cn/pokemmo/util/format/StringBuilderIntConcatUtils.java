package cn.pokemmo.util.format;

public abstract class StringBuilderIntConcatUtils {
    public static String appendIntAndString(StringBuilder stringBuilder, int n, String string) {
        return stringBuilder.append(n).append(string).toString();
    }

    public static String uD(StringBuilder stringBuilder, int n, String string) {
        return appendIntAndString(stringBuilder, n, string);
    }
}
