/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.spi;

public class ScanException
extends Exception {
    private static final long serialVersionUID = -3132040414328475658L;
    Throwable cause;

    public ScanException(String string) {
        super(string);
    }

    public ScanException(String string, Throwable throwable) {
        super(string);
        this.cause = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.cause;
    }
}

