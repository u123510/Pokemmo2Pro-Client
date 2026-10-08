package ch.qos.logback.classic.filter;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class ThresholdFilter extends Filter<ILoggingEvent> {
    private Level level;

    @Override
    public FilterReply decide(ILoggingEvent event) {
        if (!isStarted()) {
            return FilterReply.NEUTRAL;
        }
        return event.getLevel().isGreaterOrEqual(level) ? FilterReply.NEUTRAL : FilterReply.DENY;
    }

    public void setLevel(String level) {
        this.level = Level.toLevel(level);
    }

    @Override
    public void start() {
        if (level != null) {
            super.start();
        }
    }
}
