package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.spi.LifeCycle;
import f.HA0;

public abstract class TurboFilter extends ContextAwareBase implements LifeCycle {
    private String name;
    protected boolean start;
    public abstract FilterReply decide(HA0 marker, Logger logger, Level level, String format, Object[] params, Throwable t);
    @Override public void start() { start = true; }
    @Override public boolean isStarted() { return start; }
    @Override public void stop() { start = false; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
