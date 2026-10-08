package ch.qos.logback.core.encoder;

public class JsonEscapeUtil {
    protected static final char[] HEXADECIMALS_TABLE;
    static final int ESCAPE_CODES_COUNT = 32;
    static final String[] ESCAPE_CODES;

    public JsonEscapeUtil() {
    }

    private static String _computeEscapeCodeBelowASCII32(char value) {
        if (value > 32) throw new IllegalArgumentException("input must be less than 32");
        StringBuilder builder = new StringBuilder(6);
        builder.append("\\u00");
        builder.append(HEXADECIMALS_TABLE[value >> 4]);
        builder.append(HEXADECIMALS_TABLE[value & 15]);
        return builder.toString();
    }

    public static String getObligatoryEscapeCode(char value) {
        if (value < 32) return ESCAPE_CODES[value];
        if (value == '"') return "\\\"";
        if (value == '\\') return "\\/";
        return null;
    }

    public static String jsonEscapeString(String value) {
        int length = value.length();
        StringBuilder builder = new StringBuilder((int) (length * 1.1));
        for (int i = 0; i < length; i++) {
            char ch = value.charAt(i);
            String escape = getObligatoryEscapeCode(ch);
            if (escape == null) builder.append(ch);
            else builder.append(escape);
        }
        return builder.toString();
    }

    static {
        HEXADECIMALS_TABLE = "0123456789ABCDEF".toCharArray();
        ESCAPE_CODES = new String[ESCAPE_CODES_COUNT];
        for (char i = 0; i < ESCAPE_CODES_COUNT; i++) {
            switch (i) {
                case '\b': ESCAPE_CODES[i] = "\\b"; break;
                case '\t': ESCAPE_CODES[i] = "\\t"; break;
                case '\n': ESCAPE_CODES[i] = "\\n"; break;
                case '\f': ESCAPE_CODES[i] = "\\f"; break;
                case '\r': ESCAPE_CODES[i] = "\\r"; break;
                default: ESCAPE_CODES[i] = _computeEscapeCodeBelowASCII32(i);
            }
        }
    }
}
