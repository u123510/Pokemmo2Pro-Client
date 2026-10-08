/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.pattern;

public class SpacePadder {
    static final String[] SPACES = new String[]{" ", "  ", "    ", "        ", "                ", "                                "};

    public static final void leftPad(StringBuilder stringBuilder, String string, int n) {
        int n2 = 0;
        if (string != null) {
            n2 = string.length();
        }
        if (n2 < n) {
            SpacePadder.spacePad(stringBuilder, n - n2);
        }
        if (string != null) {
            stringBuilder.append(string);
        }
    }

    public static final void rightPad(StringBuilder stringBuilder, String string, int n) {
        int n2 = 0;
        if (string != null) {
            n2 = string.length();
        }
        if (string != null) {
            stringBuilder.append(string);
        }
        if (n2 < n) {
            SpacePadder.spacePad(stringBuilder, n - n2);
        }
    }

    public static final void spacePad(StringBuilder stringBuilder, int n) {
        while (n >= 32) {
            stringBuilder.append(SPACES[5]);
            n -= 32;
        }
        for (int j = 4; j >= 0; --j) {
            if ((n & 1 << j) == 0) continue;
            stringBuilder.append(SPACES[j]);
        }
    }
}

