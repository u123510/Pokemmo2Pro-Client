package cn.pokemmo.util.format;

import f.sm0_0;

public abstract class StringBuilderFormatHelper {
    public static String formatToString(int n, StringBuilder stringBuilder, String string) {
        return stringBuilder.append(sm0_0.c0(n)).append(string).toString();
    }

    public static String Zx(int n, StringBuilder stringBuilder, String string) {
        return formatToString(n, stringBuilder, string);
    }
}
