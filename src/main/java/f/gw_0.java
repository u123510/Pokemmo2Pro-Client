package f;

import cn.pokemmo.lifecycle.PausableLifecycle;

public interface gw_0 extends PausableLifecycle {
    @Override
    void lS();

    @Override
    void em();

    @Override
    default void pause() {
        lS();
    }

    @Override
    default void resume() {
        em();
    }
}
