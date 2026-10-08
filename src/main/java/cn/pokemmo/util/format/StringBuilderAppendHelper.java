package cn.pokemmo.util.format;

import f.sm0_0;

public abstract class StringBuilderAppendHelper {
    public static StringBuilder appendFormatted(int n, StringBuilder stringBuilder, String string) {
        return stringBuilder.append(sm0_0.c0(n)).append(string);
    }

    public static StringBuilder u9(int n, StringBuilder stringBuilder, String string) {
        return appendFormatted(n, stringBuilder, string);
    }
}
