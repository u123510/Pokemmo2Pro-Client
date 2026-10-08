package cn.pokemmo.util.concurrent;

import java.util.concurrent.ThreadFactory;

public class NamedDaemonThreadFactory implements ThreadFactory {
    public final String G00;

    public NamedDaemonThreadFactory(String string) {
        this.G00 = string;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.G00);
        thread.setDaemon(true);
        return thread;
    }
}
