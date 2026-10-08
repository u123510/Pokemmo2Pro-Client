package ch.qos.logback.core.encoder;

import ch.qos.logback.core.spi.ContextAwareBase;

public abstract class EncoderBase<E> extends ContextAwareBase implements Encoder<E> {
    protected boolean started;

    public EncoderBase() {
    }

    @Override
    public boolean isStarted() { return started; }

    @Override
    public void start() { started = true; }

    @Override
    public void stop() { started = false; }
}
