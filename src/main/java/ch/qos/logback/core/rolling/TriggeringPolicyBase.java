/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.TriggeringPolicy;
import ch.qos.logback.core.spi.ContextAwareBase;

public abstract class TriggeringPolicyBase
extends ContextAwareBase
implements TriggeringPolicy {
    private boolean start;

    @Override
    public void start() {
        this.start = true;
    }

    @Override
    public void stop() {
        this.start = false;
    }

    @Override
    public boolean isStarted() {
        return this.start;
    }
}

