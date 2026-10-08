/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.util;

public class StringUtil {
    public static String nullStringToEmpty(String string) {
        if (string != null) {
            return string;
        }
        return "";
    }

    public static boolean isNullOrEmpty(String string) {
        return string == null || string.isEmpty();
    }

    public static boolean notNullNorEmpty(String string) {
        return StringUtil.isNullOrEmpty(string) ^ true;
    }

    public static String capitalizeFirstLetter(String string) {
        if (StringUtil.isNullOrEmpty(string)) {
            return string;
        }
        if (string.length() == 1) {
            return string.toUpperCase();
        }
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    public static String lowercaseFirstLetter(String string) {
        if (StringUtil.isNullOrEmpty(string)) {
            return string;
        }
        if (string.length() == 1) {
            return string.toLowerCase();
        }
        return string.substring(0, 1).toLowerCase() + string.substring(1);
    }
}

