/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.sift;

import ch.qos.logback.core.sift.Discriminator;
import ch.qos.logback.core.spi.ContextAwareBase;

public abstract class AbstractDiscriminator<E>
extends ContextAwareBase
implements Discriminator<E> {
    protected boolean started;

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
}
