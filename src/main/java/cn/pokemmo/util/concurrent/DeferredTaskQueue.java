package cn.pokemmo.util.concurrent;

import f.Cq0;
import f.Yk;
import java.util.LinkedList;

public abstract class DeferredTaskQueue {
    public static final LinkedList w9;

    static {
        Cq0.E1(DeferredTaskQueue.class);
        w9 = new LinkedList();
    }

    public static void bJ(Runnable v0) {
        w9.add((Yk) () -> {
            v0.run();
            return true;
        });
    }

    public static boolean iv0(Runnable v0) {
        v0.run();
        return true;
    }
}
