package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import f.HA0;

public class DuplicateMessageFilter extends TurboFilter {
    public static final int DEFAULT_CACHE_SIZE = 100;
    public static final int DEFAULT_ALLOWED_REPETITIONS = 5;
    public int allowedRepetitions = DEFAULT_ALLOWED_REPETITIONS;
    public int cacheSize = DEFAULT_CACHE_SIZE;
    private LRUMessageCache msgCache;
    @Override public void start() { msgCache = new LRUMessageCache(cacheSize); super.start(); }
    @Override public void stop() { msgCache.clear(); msgCache = null; super.stop(); }
    @Override public FilterReply decide(HA0 marker, Logger logger, Level level, String format, Object[] params, Throwable t) {
        return msgCache.getMessageCountAndThenIncrement(format) <= allowedRepetitions ? FilterReply.NEUTRAL : FilterReply.DENY;
    }
    public int getAllowedRepetitions() { return allowedRepetitions; }
    public void setAllowedRepetitions(int value) { allowedRepetitions = value; }
    public int getCacheSize() { return cacheSize; }
    public void setCacheSize(int value) { cacheSize = value; }
}
