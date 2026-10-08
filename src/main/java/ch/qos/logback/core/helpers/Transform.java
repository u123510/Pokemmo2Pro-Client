package ch.qos.logback.core.helpers;

import java.util.regex.Pattern;

public class Transform {
    private static final String CDATA_START = "<![CDATA[";
    private static final String CDATA_END = "]]>";
    private static final String CDATA_PSEUDO_END = "]]&gt;";
    private static final String CDATA_EMBEDED_END = "]]>]]&gt;<![CDATA[";
    private static final int CDATA_END_LEN = 3;
    private static final Pattern UNSAFE_XML_CHARS = Pattern.compile("[\\u0000-\\u0008\\u000B\\u000C\\u000E-\\u001F<>&\\'\\\"]");

    public Transform() {
    }

    public static String escapeTags(String input) {
        if (input == null || input.length() == 0) return input;
        if (!UNSAFE_XML_CHARS.matcher(input).find()) return input;
        return escapeTags(new StringBuffer(input));
    }

    public static String escapeTags(StringBuffer buffer) {
        for (int i = 0; i < buffer.length(); i++) {
            char ch = buffer.charAt(i);
            if (ch == '\t' || ch == '\n' || ch == '\r' || ch >= 32) {
                if (ch == '"') { buffer.replace(i, i + 1, "&quot;"); }
                else if (ch == '<') { buffer.replace(i, i + 1, "&lt;"); }
                else if (ch == '>') { buffer.replace(i, i + 1, "&gt;"); }
                else if (ch == '&') { buffer.replace(i, i + 1, "&amp;"); }
                else if (ch == '\'') { buffer.replace(i, i + 1, "&#39;"); }
            } else {
                buffer.replace(i, i + 1, "\uFFFD");
            }
        }
        return buffer.toString();
    }

    public static void appendEscapingCDATA(StringBuilder builder, String value) {
        if (value == null) return;
        int index = value.indexOf(CDATA_END);
        if (index < 0) {
            builder.append(value);
            return;
        }
        int start = 0;
        while (index >= 0) {
            builder.append(value, start, index);
            builder.append(CDATA_EMBEDED_END);
            start = index + CDATA_END_LEN;
            if (start >= value.length()) return;
            index = value.indexOf(CDATA_END, start);
        }
        builder.append(value.substring(start));
    }
}
