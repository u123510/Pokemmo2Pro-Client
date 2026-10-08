package cn.pokemmo.util.concurrent;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NetworkThreadFactory implements ThreadFactory {
    public final AtomicInteger E3;

    public NetworkThreadFactory() {
        super();
        this.E3 = new AtomicInteger();
    }

    @Override
    public Thread newThread(Runnable v1) {
        Thread th = new Thread(v1, "NetThread" + this.E3.getAndIncrement());
        th.setDaemon(true);
        return th;
    }
}
