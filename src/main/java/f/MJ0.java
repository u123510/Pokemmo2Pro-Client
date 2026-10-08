package f;

import cn.pokemmo.lifecycle.ResetCallback;

/**
 * 重置回调门面
 * @see cn.pokemmo.lifecycle.ResetCallback
 */
public interface MJ0 extends ResetCallback {
    @Override
    void a7();

    @Override
    default void reset() {
        a7();
    }
}
