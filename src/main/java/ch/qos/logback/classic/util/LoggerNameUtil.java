package ch.qos.logback.classic.util;

import java.util.ArrayList;
import java.util.List;

public class LoggerNameUtil {
    public static int getFirstSeparatorIndexOf(String name) {
        return getSeparatorIndexOf(name, 0);
    }

    public static int getSeparatorIndexOf(String name, int fromIndex) {
        int dotIndex = name.indexOf('.', fromIndex);
        int dollarIndex = name.indexOf('$', fromIndex);
        if (dotIndex == -1 && dollarIndex == -1) return -1;
        if (dotIndex == -1) return dollarIndex;
        if (dollarIndex == -1) return dotIndex;
        return Math.min(dotIndex, dollarIndex);
    }

    public static List<String> computeNameParts(String name) {
        ArrayList<String> result = new ArrayList<>();
        int start = 0;
        while (true) {
            int separator = getSeparatorIndexOf(name, start);
            if (separator == -1) {
                result.add(name.substring(start));
                return result;
            }
            result.add(name.substring(start, separator));
            start = separator + 1;
        }
    }
}
