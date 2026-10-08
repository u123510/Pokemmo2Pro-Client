/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.net;

import java.util.concurrent.LinkedBlockingDeque;

public class QueueFactory {
    public LinkedBlockingDeque newLinkedBlockingDeque(int n) {
        if (n < 1) {
            n = 1;
        }
        return new LinkedBlockingDeque(n);
    }
}

