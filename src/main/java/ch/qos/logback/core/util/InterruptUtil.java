/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;

public class InterruptUtil
extends ContextAwareBase {
    final boolean previouslyInterrupted;

    public InterruptUtil(Context context) {
        this.setContext(context);
        this.previouslyInterrupted = Thread.currentThread().isInterrupted();
    }

    public void maskInterruptFlag() {
        if (this.previouslyInterrupted) {
            Thread.interrupted();
        }
    }

    public void unmaskInterruptFlag() {
        if (this.previouslyInterrupted) {
            try {
                Thread.currentThread().interrupt();
            }
            catch (SecurityException securityException) {
                this.addError("Failed to interrupt current thread", securityException);
            }
        }
    }
}

