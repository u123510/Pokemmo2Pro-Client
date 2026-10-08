package cn.pokemmo.battle;

import f.*;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 现代化重构类 - 原始混淆类: f.ue0_1
 */
public class Modern_Battle_ue0_1
implements ThreadFactory {

    public Modern_Battle_ue0_1() {
        super();
    }

    public static final AtomicInteger H70 = new AtomicInteger(1);
    public final AtomicInteger dh = new AtomicInteger(1);
    public final String for$ = "GUI-" + H70.getAndIncrement() + "-invokeAsync-";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.for$ + this.dh.getAndIncrement());
        thread.setDaemon(true);
        thread.setPriority(5);
        return thread;
    }
}


