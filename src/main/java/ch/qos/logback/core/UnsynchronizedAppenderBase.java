package ch.qos.logback.core;

import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterAttachableImpl;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.status.WarnStatus;
import java.util.List;

public abstract class UnsynchronizedAppenderBase<E>
extends ContextAwareBase
implements Appender<E> {
    static final int ALLOWED_REPEATS = 3;
    protected boolean started = false;
    private ThreadLocal<Boolean> guard;
    protected String name;
    private FilterAttachableImpl fai;
    private int statusRepeatCount;
    private int exceptionCount;

    public UnsynchronizedAppenderBase() {
        this.guard = new ThreadLocal<Boolean>();
        this.fai = new FilterAttachableImpl();
        this.statusRepeatCount = 0;
        this.exceptionCount = 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void doAppend(E eventObject) {
        Boolean guardValue = Boolean.TRUE;
        if (guardValue.equals(this.guard.get())) {
            return;
        }
        this.guard.set(guardValue);
        try {
            if (!this.started) {
                if (this.statusRepeatCount++ < ALLOWED_REPEATS) {
                    this.addStatus(new WarnStatus("Attempted to append to non started appender [" + this.name + "].", this));
                }
                this.guard.set(Boolean.FALSE);
                return;
            }
            if (this.getFilterChainDecision(eventObject) == FilterReply.DENY) {
                this.guard.set(Boolean.FALSE);
                return;
            }
            this.append(eventObject);
            this.guard.set(Boolean.FALSE);
            return;
        }
        catch (Exception exception) {
            if (this.exceptionCount++ < ALLOWED_REPEATS) {
                this.addError("Appender [" + this.name + "] failed to append.", exception);
            }
            this.guard.set(Boolean.FALSE);
            return;
        }
        catch (Throwable throwable) {
            this.guard.set(Boolean.FALSE);
            throw throwable;
        }
    }

    public abstract void append(E event);

    @Override
    public void setName(String string) {
        this.name = string;
    }

    @Override
    public void start() {
        this.started = true;
    }

    @Override
    public void stop() {
        this.started = false;
    }

    @Override
    public boolean isStarted() {
        return this.started;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + this.name + "]";
    }

    @Override
    public void addFilter(Filter filter) {
        this.fai.addFilter(filter);
    }

    @Override
    public void clearAllFilters() {
        this.fai.clearAllFilters();
    }

    @Override
    public List getCopyOfAttachedFiltersList() {
        return this.fai.getCopyOfAttachedFiltersList();
    }

    @Override
    public FilterReply getFilterChainDecision(Object object) {
        return this.fai.getFilterChainDecision(object);
    }
}
