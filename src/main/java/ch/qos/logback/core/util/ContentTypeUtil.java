/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.util;

public class ContentTypeUtil {
    public static boolean isTextual(String string) {
        if (string == null) {
            return false;
        }
        return string.startsWith("text");
    }

    public static String getSubType(String string) {
        if (string == null) {
            return null;
        }
        int n = string.indexOf(47);
        if (n == -1) {
            return null;
        }
        if (++n < string.length()) {
            return string.substring(n);
        }
        return null;
    }
}

