package ch.qos.logback.classic.net;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;

public abstract class ReceiverBase extends ContextAwareBase implements LifeCycle {
    private boolean started;

    @Override
    public final void start() {
        if (isStarted()) {
            return;
        }
        if (getContext() == null) {
            throw new IllegalStateException("context not set");
        }
        if (shouldStart()) {
            getContext().getExecutorService().execute(getRunnableTask());
            started = true;
        }
    }

    @Override
    public final void stop() {
        if (!isStarted()) {
            return;
        }
        try {
            onStop();
        } catch (RuntimeException ex) {
            addError("on stop: " + ex, ex);
        }
        started = false;
    }

    @Override
    public final boolean isStarted() {
        return started;
    }

    public abstract boolean shouldStart();
    public abstract void onStop();
    public abstract Runnable getRunnableTask();
}
