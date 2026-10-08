package cn.pokemmo.util.concurrent;

public interface IndexedRunnable extends Runnable {
    void runWithIndex(int index);

    default void Q(int var1) {
        runWithIndex(var1);
    }
}
