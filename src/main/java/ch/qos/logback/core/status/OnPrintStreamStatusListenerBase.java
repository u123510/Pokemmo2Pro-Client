package ch.qos.logback.core.status;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.StatusPrinter;
import java.io.PrintStream;
import java.util.Iterator;

public abstract class OnPrintStreamStatusListenerBase extends ContextAwareBase implements StatusListener, LifeCycle {
    static final long DEFAULT_RETROSPECTIVE = 300L;
    boolean isStarted;
    long retrospectiveThresold;
    boolean resetResistant;
    String prefix;

    public OnPrintStreamStatusListenerBase() {
        isStarted = false;
        retrospectiveThresold = DEFAULT_RETROSPECTIVE;
        resetResistant = false;
    }

    private void print(Status status) {
        StringBuilder builder = new StringBuilder();
        if (prefix != null) builder.append(prefix);
        StatusPrinter.buildStr(builder, "", status);
        getPrintStream().print(builder);
    }

    private void retrospectivePrint() {
        Context context = getContext();
        if (context == null) return;
        long now = System.currentTimeMillis();
        Iterator<Status> iterator = context.getStatusManager().getCopyOfStatusList().iterator();
        while (iterator.hasNext()) {
            Status status = iterator.next();
            if (isElapsedTimeLongerThanThreshold(now, status.getTimestamp())) print(status);
        }
    }

    private boolean isElapsedTimeLongerThanThreshold(long now, long timestamp) {
        return now - timestamp < retrospectiveThresold;
    }

    public abstract PrintStream getPrintStream();

    @Override
    public void addStatusEvent(Status status) {
        if (isStarted) print(status);
    }

    @Override
    public void start() {
        isStarted = true;
        if (retrospectiveThresold > 0L) retrospectivePrint();
    }

    public String getPrefix() { return prefix; }
    public void setPrefix(String prefix) { this.prefix = prefix; }
    public void setRetrospective(long retrospective) { retrospectiveThresold = retrospective; }
    public long getRetrospective() { return retrospectiveThresold; }
    @Override public void stop() { isStarted = false; }
    @Override public boolean isStarted() { return isStarted; }
    @Override public boolean isResetResistant() { return resetResistant; }
    public void setResetResistant(boolean resetResistant) { this.resetResistant = resetResistant; }
}
