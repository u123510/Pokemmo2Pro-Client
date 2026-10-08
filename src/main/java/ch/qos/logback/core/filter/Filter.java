package ch.qos.logback.core.filter;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.spi.LifeCycle;

public abstract class Filter<E> extends ContextAwareBase implements LifeCycle {
    private String name;
    boolean start;

    public Filter() {
        start = false;
    }

    @Override
    public void start() { start = true; }

    @Override
    public boolean isStarted() { return start; }

    @Override
    public void stop() { start = false; }

    public abstract FilterReply decide(E event);

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
