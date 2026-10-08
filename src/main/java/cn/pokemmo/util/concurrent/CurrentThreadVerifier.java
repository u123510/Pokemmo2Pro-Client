package cn.pokemmo.util.concurrent;

import f.Cq0;
import f.Cr0;

public abstract class CurrentThreadVerifier {
    public static Thread qq;

    public static boolean isCurrentThread() {
        return qq == Thread.currentThread();
    }

    public static boolean ED0() {
        return isCurrentThread();
    }

    static {
        Cq0.E1(Cr0.class);
    }
}
