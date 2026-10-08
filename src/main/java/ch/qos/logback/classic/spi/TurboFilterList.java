package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.core.spi.FilterReply;
import f.HA0;
import java.util.concurrent.CopyOnWriteArrayList;

public final class TurboFilterList extends CopyOnWriteArrayList<TurboFilter> {
    private static final long serialVersionUID = 1L;

    public FilterReply getTurboFilterChainDecision(HA0 marker, Logger logger, Level level,
            String format, Object[] params, Throwable t) {
        if (size() == 1) {
            try {
                return get(0).decide(marker, logger, level, format, params, t);
            } catch (IndexOutOfBoundsException ex) {
                return FilterReply.NEUTRAL;
            }
        }
        Object[] filters = toArray();
        for (Object item : filters) {
            FilterReply reply = ((TurboFilter) item).decide(marker, logger, level, format, params, t);
            if (reply == FilterReply.DENY || reply == FilterReply.ACCEPT) return reply;
        }
        return FilterReply.NEUTRAL;
    }
}
