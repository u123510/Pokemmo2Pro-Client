package ch.qos.logback.core.helpers;

import java.util.LinkedList;
import java.util.List;

public class ThrowableToStringArray {
    public ThrowableToStringArray() {
    }

    public static String[] convert(Throwable throwable) {
        LinkedList<String> result = new LinkedList<>();
        extract(result, throwable, null);
        return result.toArray(new String[0]);
    }

    private static void extract(List<String> result, Throwable throwable, StackTraceElement[] parentTrace) {
        StackTraceElement[] trace = throwable.getStackTrace();
        int commonFrames = findNumberOfCommonFrames(trace, parentTrace);
        result.add(formatFirstLine(throwable, parentTrace));
        for (int i = 0; i < trace.length - commonFrames; i++) result.add("\tat " + trace[i]);
        if (commonFrames != 0) result.add("\t... " + commonFrames + " common frames omitted");
        Throwable cause = throwable.getCause();
        if (cause != null) extract(result, cause, trace);
    }

    private static String formatFirstLine(Throwable throwable, StackTraceElement[] parentTrace) {
        String prefix = parentTrace == null ? "" : "Caused by: ";
        String result = prefix + throwable.getClass().getName();
        if (throwable.getMessage() != null) result += ": " + throwable.getMessage();
        return result;
    }

    private static int findNumberOfCommonFrames(StackTraceElement[] current, StackTraceElement[] parent) {
        if (parent == null) return 0;
        int i = current.length - 1;
        int j = parent.length - 1;
        int common = 0;
        while (i >= 0 && j >= 0 && current[i].equals(parent[j])) {
            common++;
            i--;
            j--;
        }
        return common;
    }
}
