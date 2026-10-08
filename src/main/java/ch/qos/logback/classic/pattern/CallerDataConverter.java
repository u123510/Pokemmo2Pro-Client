package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.status.ErrorStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CallerDataConverter extends ClassicConverter {
    public static final String DEFAULT_CALLER_LINE_PREFIX = "Caller+";
    public static final String DEFAULT_RANGE_DELIMITER = "..";
    private int depthStart = 0;
    private int depthEnd = 5;
    List<EventEvaluator> evaluatorList;
    final int MAX_ERROR_COUNT = 4;
    int errorCount = 0;

    private boolean isRange(String option) {
        return option.contains(getDefaultRangeDelimiter());
    }

    private String[] splitRange(String option) {
        return option.split(Pattern.quote(getDefaultRangeDelimiter()), 2);
    }

    private void checkRange() {
        int start = depthStart;
        int end = depthEnd;
        if (start < 0 || end < 0) {
            addError("Invalid depthStart/depthEnd range [" + start + ", " + end + "] (negative values are not allowed)");
        } else if (start >= end) {
            addError("Invalid depthEnd range [" + start + ", " + end + "] (start greater or equal to end)");
        }
    }

    private void addEvaluator(EventEvaluator evaluator) {
        if (evaluatorList == null) evaluatorList = new ArrayList<>();
        evaluatorList.add(evaluator);
    }

    @Override
    public void start() {
        String option = getFirstOption();
        if (option == null) return;
        try {
            if (isRange(option)) {
                String[] range = splitRange(option);
                if (range.length == 2) {
                    depthStart = Integer.parseInt(range[0]);
                    depthEnd = Integer.parseInt(range[1]);
                    checkRange();
                } else {
                    addError("Failed to parse depth option as range [" + option + "]");
                }
            } else {
                depthEnd = Integer.parseInt(option);
            }
        } catch (NumberFormatException ex) {
            addError("Failed to parse depth option [" + option + "]", ex);
        }
        List<String> options = getOptionList();
        if (options != null && options.size() > 1) {
            int size = options.size();
            for (int i = 1; i < size; i++) {
                String evaluatorName = options.get(i);
                if (getContext() != null) {
                    Map evaluatorMap = (Map) getContext().getObject("EVALUATOR_MAP");
                    if (evaluatorMap != null) {
                        EventEvaluator evaluator = (EventEvaluator) evaluatorMap.get(evaluatorName);
                        if (evaluator != null) addEvaluator(evaluator);
                    }
                }
            }
        }
    }

    @Override
    public String convert(ILoggingEvent event) {
        StringBuilder result = new StringBuilder();
        if (evaluatorList != null) {
            for (EventEvaluator evaluator : evaluatorList) {
                try {
                    if (evaluator.evaluate(event)) return "";
                } catch (EvaluationException ex) {
                    errorCount++;
                    if (errorCount < MAX_ERROR_COUNT) {
                        addError("Exception thrown for evaluator named [" + evaluator.getName() + "]", ex);
                    } else if (errorCount == MAX_ERROR_COUNT) {
                        ErrorStatus status = new ErrorStatus(
                                "Exception thrown for evaluator named [" + evaluator.getName() + "].",
                                this, ex);
                        status.add(new ErrorStatus(
                                "This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.",
                                this));
                        addStatus(status);
                    }
                }
            }
        } else {
            return "";
        }
        StackTraceElement[] callerData = event.getCallerData();
        if (callerData == null) return CallerData.CALLER_DATA_NA;
        int start = depthStart;
        if (callerData.length <= start) return CallerData.CALLER_DATA_NA;
        int end = depthEnd;
        if (end >= callerData.length) end = callerData.length;
        for (int i = start; i < end; i++) {
            result.append(getCallerLinePrefix()).append(i).append("	 at ")
                    .append(callerData[i]).append(CoreConstants.LINE_SEPARATOR);
        }
        return result.toString();
    }

    public String getCallerLinePrefix() {
        return DEFAULT_CALLER_LINE_PREFIX;
    }

    public String getDefaultRangeDelimiter() {
        return DEFAULT_RANGE_DELIMITER;
    }
}
