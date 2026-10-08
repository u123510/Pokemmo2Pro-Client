package ch.qos.logback.core.pattern.util;

public class RegularEscapeUtil implements IEscapeUtil {

    public static String basicEscape(String string) {
        int n = string.length();
        StringBuilder stringBuilder = new StringBuilder(n);
        int n2 = 0;
        while (n2 < n) {
            int n3 = n2 + 1;
            int n4 = string.charAt(n2);
            if (n4 == 92 && n3 < n) {
                n2 += 2;
                n4 = string.charAt(n3);
                if (n4 == 110) {
                    n4 = 10;
                } else if (n4 == 114) {
                    n4 = 13;
                } else if (n4 == 116) {
                    n4 = 9;
                } else if (n4 == 102) {
                    n4 = 12;
                } else if (n4 == 8) {
                    n4 = 8;
                } else if (n4 == 34) {
                    n4 = 34;
                } else if (n4 == 39) {
                    n4 = 39;
                } else if (n4 == 92) {
                    n4 = 92;
                }
            } else {
                n2 = n3;
            }
            stringBuilder.append((char) n4);
        }
        return stringBuilder.toString();
    }

    @Override
    public void escape(String string, StringBuffer stringBuffer, char c, int n) {
        if (string.indexOf(c) >= 0 || c == '\\') {
            stringBuffer.append(c);
        } else if (c == '_') {
            // no-op
        } else if (c == 'n') {
            stringBuffer.append('\n');
        } else if (c == 'r') {
            stringBuffer.append('\r');
        } else if (c == 't') {
            stringBuffer.append('\t');
        } else {
            String string2 = this.formatEscapeCharsForListing(string);
            throw new IllegalArgumentException("Illegal char '" + c + " at column " + n + ". Only \\\\, \\_" + string2 + ", \\t, \\n, \\r combinations are allowed as escape characters.");
        }
    }

    public String formatEscapeCharsForListing(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < string.length(); ++j) {
            stringBuilder.append(", \\").append(string.charAt(j));
        }
        return stringBuilder.toString();
    }
}