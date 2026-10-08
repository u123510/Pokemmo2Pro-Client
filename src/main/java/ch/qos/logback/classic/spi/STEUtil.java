package ch.qos.logback.classic.spi;

public class STEUtil {
    public static int UNUSED_findNumberOfCommonFrames(StackTraceElement[] current, StackTraceElement[] previous) {
        if (previous == null) return 0;
        int i = current.length - 1, j = previous.length - 1, count = 0;
        while (i >= 0 && j >= 0 && current[i].equals(previous[j])) { count++; i--; j--; }
        return count;
    }
    public static int findNumberOfCommonFrames(StackTraceElement[] current, StackTraceElementProxy[] previous) {
        if (previous == null) return 0;
        int i = current.length - 1, j = previous.length - 1, count = 0;
        while (i >= 0 && j >= 0 && current[i].equals(previous[j].ste)) { count++; i--; j--; }
        return count;
    }
}
