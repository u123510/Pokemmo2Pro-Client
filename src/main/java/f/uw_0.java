package f;

import cn.pokemmo.util.concurrent.IndexedRunnable;

public interface uw_0 extends IndexedRunnable {
    @Override
    void Q(int var1);

    @Override
    default void runWithIndex(int index) {
        Q(index);
    }
}
