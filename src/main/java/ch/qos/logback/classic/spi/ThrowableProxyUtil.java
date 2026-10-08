package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;

public class ThrowableProxyUtil {
    public static final int REGULAR_EXCEPTION_INDENT = 1;
    public static final int SUPPRESSED_EXCEPTION_INDENT = 1;
    private static final int BUILDER_CAPACITY = 2048;

    public ThrowableProxyUtil() {
    }

    public static void build(ThrowableProxy proxy, Throwable throwable, ThrowableProxy parent) {
        StackTraceElement[] steArray = throwable == null ? null : throwable.getStackTrace();
        int commonFrames = -1;
        if (steArray != null) {
            commonFrames = findNumberOfCommonFrames(steArray, parent.getStackTraceElementProxyArray());
        }
        proxy.commonFrames = commonFrames;
        proxy.stackTraceElementProxyArray = steArrayToStepArray(steArray);
    }

    public static StackTraceElementProxy[] steArrayToStepArray(StackTraceElement[] steArray) {
        if (steArray == null) return new StackTraceElementProxy[0];
        StackTraceElementProxy[] result = new StackTraceElementProxy[steArray.length];
        for (int i = 0; i < steArray.length; i++) {
            result[i] = new StackTraceElementProxy(steArray[i]);
        }
        return result;
    }

    public static int findNumberOfCommonFrames(StackTraceElement[] steArray, StackTraceElementProxy[] parentSTEArray) {
        if (parentSTEArray == null || steArray == null) return 0;
        int i = steArray.length - 1;
        int j = parentSTEArray.length - 1;
        int commonFrames = 0;
        while (i >= 0 && j >= 0 && steArray[i].equals(parentSTEArray[j].ste)) {
            commonFrames++;
            i--;
            j--;
        }
        return commonFrames;
    }

    public static String asString(IThrowableProxy proxy) {
        StringBuilder builder = new StringBuilder(BUILDER_CAPACITY);
        recursiveAppend(builder, null, REGULAR_EXCEPTION_INDENT, proxy);
        return builder.toString();
    }

    private static void recursiveAppend(StringBuilder builder, String prefix, int indent, IThrowableProxy proxy) {
        if (proxy == null) return;
        subjoinFirstLine(builder, prefix, indent, proxy);
        builder.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(builder, indent, proxy);
        IThrowableProxy[] suppressed = proxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy suppressedProxy : suppressed) {
                recursiveAppend(builder, "Suppressed: ", indent + SUPPRESSED_EXCEPTION_INDENT, suppressedProxy);
            }
        }
        recursiveAppend(builder, "Caused by: ", indent, proxy.getCause());
    }

    public static void indent(StringBuilder builder, int indent) {
        for (int i = 0; i < indent; i++) builder.append('\t');
    }

    private static void subjoinFirstLine(StringBuilder builder, String prefix, int indent, IThrowableProxy proxy) {
        indent(builder, indent - 1);
        if (prefix != null) builder.append(prefix);
        subjoinExceptionMessage(builder, proxy);
    }

    public static void subjoinPackagingData(StringBuilder builder, StackTraceElementProxy step) {
        if (step == null) return;
        ClassPackagingData packagingData = step.getClassPackagingData();
        if (packagingData == null) return;
        if (packagingData.isExact()) builder.append(" [");
        else builder.append(" ~[");
        builder.append(packagingData.getCodeLocation()).append(':').append(packagingData.getVersion()).append(']');
    }

    public static void subjoinSTEP(StringBuilder builder, StackTraceElementProxy step) {
        builder.append(step.toString());
        subjoinPackagingData(builder, step);
    }

    @Deprecated
    public static void subjoinSTEPArray(StringBuilder builder, IThrowableProxy proxy) {
        subjoinSTEPArray(builder, REGULAR_EXCEPTION_INDENT, proxy);
    }

    public static void subjoinSTEPArray(StringBuilder builder, int indent, IThrowableProxy proxy) {
        StackTraceElementProxy[] steps = proxy.getStackTraceElementProxyArray();
        int commonFrames = proxy.getCommonFrames();
        for (int i = 0; i < steps.length - commonFrames; i++) {
            indent(builder, indent);
            subjoinSTEP(builder, steps[i]);
            builder.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames > 0) {
            indent(builder, indent);
            builder.append("... ").append(commonFrames).append(" common frames omitted").append(CoreConstants.LINE_SEPARATOR);
        }
    }

    public static void subjoinFirstLine(StringBuilder builder, IThrowableProxy proxy) {
        if (proxy.getCommonFrames() > 0) builder.append("Caused by: ");
        subjoinExceptionMessage(builder, proxy);
    }

    public static void subjoinFirstLineRootCauseFirst(StringBuilder builder, IThrowableProxy proxy) {
        if (proxy.getCause() != null) builder.append("Wrapped by: ");
        subjoinExceptionMessage(builder, proxy);
    }

    private static void subjoinExceptionMessage(StringBuilder builder, IThrowableProxy proxy) {
        if (proxy.isCyclic()) {
            builder.append("[CIRCULAR REFERENCE: ").append(proxy.getClassName()).append(": ").append(proxy.getMessage()).append(']');
        } else {
            builder.append(proxy.getClassName()).append(": ").append(proxy.getMessage());
        }
    }
}
