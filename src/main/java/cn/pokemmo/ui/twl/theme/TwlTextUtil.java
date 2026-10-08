package cn.pokemmo.ui.twl.theme;

/**
 * 文本处理工具集 (TextUtil)
 */
public abstract class TwlTextUtil {
    public static int countLines(CharSequence charSequence) {
        int n = charSequence.length();
        int count = 0;
        if (n > 0) {
            count = 1;
            for (int j = 0; j < n; ++j) {
                if (charSequence.charAt(j) == '\n') {
                    ++count;
                }
            }
        }
        return count;
    }

    public static int indexOfNonWhitespace(CharSequence charSequence, int start, int end) {
        while (start < end && Character.isWhitespace(charSequence.charAt(start))) {
            ++start;
        }
        return start;
    }

    public static String trim(CharSequence charSequence, int start, int end) {
        start = indexOfNonWhitespace(charSequence, start, end);
        while (end > start && Character.isWhitespace(charSequence.charAt(end - 1))) {
            --end;
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).substring(start, end);
        }
        if (charSequence instanceof StringBuilder) {
            return ((StringBuilder) charSequence).substring(start, end);
        }
        return charSequence.subSequence(start, end).toString();
    }

    public static int[] parseIntArray(String string) {
        int n = 0;
        for (int j = 0; j < string.length(); ++j) {
            ++n;
            if ((j = string.indexOf(',', j)) < 0) {
                break;
            }
        }
        int[] result = new int[n];
        int start = 0;
        for (int j = 0; j < n; ++j) {
            int end = string.indexOf(',', start);
            if (end < 0) {
                end = string.length();
            }
            result[j] = Integer.parseInt(string.substring(start, end));
            start = end + 1;
        }
        return result;
    }

    public static int tw0(CharSequence cs) {
        return countLines(cs);
    }

    public static int Com2(CharSequence cs, int start, int end) {
        return indexOfNonWhitespace(cs, start, end);
    }

    public static String HF(CharSequence cs, int start, int end) {
        return trim(cs, start, end);
    }

    public static int[] t30(String str) {
        return parseIntArray(str);
    }
}
