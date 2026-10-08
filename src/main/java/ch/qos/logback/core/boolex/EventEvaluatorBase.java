package ch.qos.logback.core.boolex;

import ch.qos.logback.core.spi.ContextAwareBase;

public abstract class EventEvaluatorBase<E> extends ContextAwareBase implements EventEvaluator<E> {
    String name;
    boolean started;

    public EventEvaluatorBase() {
    }

    @Override
    public String getName() { return name; }

    @Override
    public void setName(String name) {
        if (this.name != null) throw new IllegalStateException("name has been already set");
        this.name = name;
    }

    @Override
    public boolean isStarted() { return started; }

    @Override
    public void start() { started = true; }

    @Override
    public void stop() { started = false; }
}
