package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

public class CallerData {
    private static final String LOG4J_CATEGORY = "org.apache.log4j.Category";
    private static final String SLF4J_BOUNDARY = "org.slf4j.Logger";
    public static final int LINE_NA = -1;
    public static final String CALLER_DATA_NA = "?#?:?" + CoreConstants.LINE_SEPARATOR;
    public static final StackTraceElement[] EMPTY_CALLER_DATA_ARRAY = new StackTraceElement[0];

    public static StackTraceElement[] extract(Throwable t, String fqnOfInvokingClass,
            int maxDepth, List<String> frameworkPackageList) {
        if (t == null) return null;
        StackTraceElement[] stack = t.getStackTrace();
        int found = -1;
        for (int i = 0; i < stack.length; i++) {
            if (isInFrameworkSpace(stack[i].getClassName(), fqnOfInvokingClass, frameworkPackageList)) {
                found = i + 1;
            } else if (found != -1) {
                break;
            }
        }
        if (found == -1) return EMPTY_CALLER_DATA_ARRAY;
        int length = stack.length - found;
        if (maxDepth < length) length = maxDepth;
        StackTraceElement[] result = new StackTraceElement[length];
        System.arraycopy(stack, found, result, 0, length);
        return result;
    }

    public static boolean isInFrameworkSpace(String className, String invokingClass, List<String> frameworkPackages) {
        return className.equals(invokingClass)
                || className.equals(LOG4J_CATEGORY)
                || className.startsWith(SLF4J_BOUNDARY)
                || isInFrameworkSpaceList(className, frameworkPackages);
    }

    private static boolean isInFrameworkSpaceList(String className, List<String> packages) {
        if (packages == null) return false;
        for (String prefix : packages) if (className.startsWith(prefix)) return true;
        return false;
    }

    public static StackTraceElement naInstance() {
        return new StackTraceElement("?", "?", "?", -1);
    }
}
