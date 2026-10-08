/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.classic;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AsyncAppenderBase;

public class AsyncAppender
extends AsyncAppenderBase {
    boolean includeCallerData = false;

    public boolean isDiscardable(ILoggingEvent iLoggingEvent) {
        return iLoggingEvent.getLevel().toInt() <= 20000;
    }

    public void preprocess(ILoggingEvent iLoggingEvent) {
        iLoggingEvent.prepareForDeferredProcessing();
        if (this.includeCallerData) {
            iLoggingEvent.getCallerData();
        }
    }

    public boolean isIncludeCallerData() {
        return this.includeCallerData;
    }

    public void setIncludeCallerData(boolean bl) {
        this.includeCallerData = bl;
    }
}

