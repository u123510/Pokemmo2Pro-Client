package cn.pokemmo.util.format;

/**
 * 字符串构造拼接工具类
 */
public abstract class StringBuilderUtils {
    public static StringBuilder append(String string, String string2) {
        return new StringBuilder().append(string).append(string2);
    }

    public static StringBuilder nK0(String string, String string2) {
        return append(string, string2);
    }
}
