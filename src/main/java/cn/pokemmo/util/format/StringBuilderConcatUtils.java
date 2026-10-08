package cn.pokemmo.util.format;

public abstract class StringBuilderConcatUtils {
    public static String Mq(StringBuilder stringBuilder, String string, String string2) {
        return stringBuilder.append(string).append(string2).toString();
    }
}
