package ch.qos.logback.core.model.util;

import ch.qos.logback.core.model.Model;

public class TagUtil {
    public TagUtil() {
        super();
    }

    public static String unifiedTag(Model model) {
        String tag = model.getTag();
        char first = tag.charAt(0);
        if (Character.isUpperCase(first)) {
            return Character.toLowerCase(first) + tag.substring(1);
        }
        return tag;
    }
}
