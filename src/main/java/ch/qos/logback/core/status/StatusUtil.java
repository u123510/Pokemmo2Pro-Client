package ch.qos.logback.core.status;

import ch.qos.logback.core.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class StatusUtil {
    StatusManager sm;

    public StatusUtil(StatusManager sm) { this.sm = sm; }
    public StatusUtil(Context context) { this.sm = context.getStatusManager(); }

    public static boolean contextHasStatusListener(Context context) {
        StatusManager manager = context.getStatusManager();
        if (manager == null) return false;
        List listeners = manager.getCopyOfStatusListenerList();
        return listeners != null && !listeners.isEmpty();
    }

    public static List<Status> filterStatusListByTimeThreshold(List<Status> input, long threshold) {
        ArrayList<Status> result = new ArrayList<>();
        for (Status status : input) if (status.getTimestamp() >= threshold) result.add(status);
        return result;
    }

    private boolean checkRegexMatch(String value, String regex) { return Pattern.compile(regex).matcher(value).lookingAt(); }

    public static String diff(Status left, Status right) {
        StringBuilder b = new StringBuilder();
        if (left.getLevel() != right.getLevel()) b.append(" left.level ").append(left.getLevel()).append(" != right.level ").append(right.getLevel());
        if (left.getTimestamp() != right.getTimestamp()) b.append(" left.timestamp ").append(left.getTimestamp()).append(" != right.timestamp ").append(right.getTimestamp());
        if (!Objects.equals(left.getMessage(), right.getMessage())) b.append(" left.message ").append(left.getMessage()).append(" != right.message ").append(right.getMessage());
        return b.toString();
    }

    public void addStatus(Status status) { if (sm != null) sm.add(status); }
    public void addInfo(Object origin, String message) { addStatus(new InfoStatus(message, origin)); }
    public void addWarn(Object origin, String message) { addStatus(new WarnStatus(message, origin)); }
    public void addError(Object origin, String message, Throwable throwable) { addStatus(new ErrorStatus(message, origin, throwable)); }
    public boolean hasXMLParsingErrors(long threshold) { return containsMatch(threshold, Status.ERROR, "XML_PARSING"); }
    public boolean noXMLParsingErrorsOccurred(long threshold) { return !hasXMLParsingErrors(threshold); }

    public int getHighestLevel(long threshold) {
        int result = 0;
        for (Status status : filterStatusListByTimeThreshold(sm.getCopyOfStatusList(), threshold)) result = Math.max(result, status.getLevel());
        return result;
    }
    public boolean isErrorFree(long threshold) { return getHighestLevel(threshold) < Status.ERROR; }
    public boolean isWarningOrErrorFree(long threshold) { return getHighestLevel(threshold) <= Status.INFO; }

    public boolean containsMatch(long threshold, int level, String regex) {
        Pattern pattern = Pattern.compile(regex);
        for (Status status : filterStatusListByTimeThreshold(sm.getCopyOfStatusList(), threshold)) {
            if (status.getLevel() == level && pattern.matcher(status.getMessage()).lookingAt()) return true;
        }
        return false;
    }
    public boolean containsMatch(int level, String regex) { return containsMatch(0L, level, regex); }
    public boolean containsMatch(String regex) {
        Pattern pattern = Pattern.compile(regex);
        for (Status status : sm.getCopyOfStatusList()) if (pattern.matcher(status.getMessage()).lookingAt()) return true;
        return false;
    }
    public int levelCount(int level, long threshold) {
        int count = 0;
        for (Status status : filterStatusListByTimeThreshold(sm.getCopyOfStatusList(), threshold)) if (status.getLevel() == level) count++;
        return count;
    }
    public int matchCount(String regex) {
        int count = 0;
        Pattern pattern = Pattern.compile(regex);
        for (Status status : sm.getCopyOfStatusList()) if (pattern.matcher(status.getMessage()).lookingAt()) count++;
        return count;
    }
    public boolean containsException(Class exceptionClass) { return containsException(exceptionClass, null); }
    public boolean containsException(Class exceptionClass, String regex) {
        for (Status status : sm.getCopyOfStatusList()) {
            Throwable throwable = status.getThrowable();
            while (throwable != null) {
                if (throwable.getClass().getName().equals(exceptionClass.getName()) && (regex == null || checkRegexMatch(throwable.getMessage(), regex))) return true;
                throwable = throwable.getCause();
            }
        }
        return false;
    }
    public long timeOfLastReset() {
        List<Status> list = sm.getCopyOfStatusList();
        if (list == null) return -1L;
        for (int i = list.size() - 1; i >= 0; i--) {
            Status status = list.get(i);
            if ("Will reset and reconfigure context ".equals(status.getMessage())) return status.getTimestamp();
        }
        return -1L;
    }
}
