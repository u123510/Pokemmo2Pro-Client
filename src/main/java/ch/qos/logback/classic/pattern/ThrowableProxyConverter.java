package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.status.ErrorStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ThrowableProxyConverter extends ThrowableHandlingConverter {
    protected static final int BUILDER_CAPACITY = 2048;
    int lengthOption;
    List<EventEvaluator> evaluatorList;
    List<String> ignoredStackTraceLines;
    int errorCount;

    public ThrowableProxyConverter() {
        evaluatorList = null;
        ignoredStackTraceLines = null;
        errorCount = 0;
    }

    private void addEvaluator(EventEvaluator evaluator) {
        if (evaluatorList == null) evaluatorList = new ArrayList<>();
        evaluatorList.add(evaluator);
    }

    private void addIgnoreStackTraceLine(String line) {
        if (ignoredStackTraceLines == null) ignoredStackTraceLines = new ArrayList<>();
        ignoredStackTraceLines.add(line);
    }

    private void recursiveAppend(StringBuilder builder, String prefix, int indent, IThrowableProxy proxy) {
        if (proxy == null) return;
        subjoinFirstLine(builder, prefix, indent, proxy);
        builder.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(builder, indent, proxy);
        IThrowableProxy[] suppressed = proxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy item : suppressed) {
                recursiveAppend(builder, "Suppressed: ", indent + 1, item);
            }
        }
        recursiveAppend(builder, "Caused by: ", indent, proxy.getCause());
    }

    private void subjoinFirstLine(StringBuilder builder, String prefix, int indent, IThrowableProxy proxy) {
        ThrowableProxyUtil.indent(builder, indent - 1);
        if (prefix != null) builder.append(prefix);
        subjoinExceptionMessage(builder, proxy);
    }

    private void subjoinExceptionMessage(StringBuilder builder, IThrowableProxy proxy) {
        if (proxy.isCyclic()) {
            builder.append("[CIRCULAR REFERENCE: ")
                    .append(proxy.getClassName()).append(": ")
                    .append(proxy.getMessage()).append(']');
        } else {
            builder.append(proxy.getClassName()).append(": ").append(proxy.getMessage());
        }
    }

    private void printStackLine(StringBuilder builder, int ignoredCount, StackTraceElementProxy step) {
        builder.append(step);
        extraData(builder, step);
        if (ignoredCount > 0) printIgnoredCount(builder, ignoredCount);
    }

    private void printIgnoredCount(StringBuilder builder, int count) {
        builder.append(" [").append(count).append(" skipped]");
    }

    private boolean isIgnoredStackTraceLine(String line) {
        if (ignoredStackTraceLines == null) return false;
        for (String ignored : ignoredStackTraceLines) {
            if (line.contains(ignored)) return true;
        }
        return false;
    }

    @Override
    public void start() {
        String option = getFirstOption();
        if (option == null || "full".equals(option.toLowerCase())) {
            lengthOption = Integer.MAX_VALUE;
        } else if ("short".equals(option.toLowerCase())) {
            lengthOption = 1;
        } else {
            try {
                lengthOption = Integer.parseInt(option);
            } catch (NumberFormatException ex) {
                addError("Could not parse [" + option + "] as an integer");
                lengthOption = Integer.MAX_VALUE;
            }
        }
        List<String> options = getOptionList();
        if (options != null && options.size() > 1 && getContext() != null) {
            Map evaluatorMap = (Map) getContext().getObject("EVALUATOR_MAP");
            for (int i = 1; i < options.size(); i++) {
                String optionValue = options.get(i);
                EventEvaluator evaluator = evaluatorMap == null ? null : (EventEvaluator) evaluatorMap.get(optionValue);
                if (evaluator != null) addEvaluator(evaluator);
                else addIgnoreStackTraceLine(optionValue);
            }
        }
        super.start();
    }

    @Override
    public void stop() {
        evaluatorList = null;
        super.stop();
    }

    public void extraData(StringBuilder builder, StackTraceElementProxy step) {
    }

    @Override
    public String convert(ILoggingEvent event) {
        IThrowableProxy proxy = event.getThrowableProxy();
        if (proxy == null) return "";
        if (evaluatorList != null) {
            for (EventEvaluator evaluator : evaluatorList) {
                try {
                    if (evaluator.evaluate(event)) return "";
                } catch (EvaluationException ex) {
                    errorCount++;
                    if (errorCount < 4) {
                        addError("Exception thrown for evaluator named [" + evaluator.getName() + "]", ex);
                    } else if (errorCount == 4) {
                        ErrorStatus status = new ErrorStatus(
                                "Exception thrown for evaluator named [" + evaluator.getName() + "].", this, ex);
                        status.add(new ErrorStatus(
                                "This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.",
                                this));
                        addStatus(status);
                    }
                }
            }
        }
        return throwableProxyToString(proxy);
    }

    public String throwableProxyToString(IThrowableProxy proxy) {
        StringBuilder builder = new StringBuilder(BUILDER_CAPACITY);
        recursiveAppend(builder, null, 1, proxy);
        return builder.toString();
    }

    public void subjoinSTEPArray(StringBuilder builder, int indent, IThrowableProxy proxy) {
        StackTraceElementProxy[] steps = proxy.getStackTraceElementProxyArray();
        int commonFrames = proxy.getCommonFrames();
        int max = lengthOption;
        boolean unlimited = max > steps.length;
        if (unlimited) max = steps.length;
        if (commonFrames > 0 && unlimited) max -= commonFrames;
        int ignored = 0;
        for (int i = 0; i < max; i++) {
            StackTraceElementProxy step = steps[i];
            if (isIgnoredStackTraceLine(step.toString())) {
                if (max < steps.length) {
                    ignored++;
                    if (i == max - 1) max++;
                }
                continue;
            }
            ThrowableProxyUtil.indent(builder, indent);
            printStackLine(builder, ignored, step);
            ignored = 0;
            builder.append(CoreConstants.LINE_SEPARATOR);
        }
        if (ignored > 0) {
            printIgnoredCount(builder, ignored);
            builder.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames > 0 && unlimited) {
            ThrowableProxyUtil.indent(builder, indent);
            builder.append("... ").append(commonFrames).append(" common frames omitted")
                    .append(CoreConstants.LINE_SEPARATOR);
        }
    }
}
