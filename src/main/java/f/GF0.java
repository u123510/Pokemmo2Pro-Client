package f;

import cn.pokemmo.util.function.ActionCallback;

/**
 * 动作回调门面
 * @see cn.pokemmo.util.function.ActionCallback
 */
public interface GF0 extends ActionCallback {
    @Override
    void Tj();

    @Override
    default void execute() {
        Tj();
    }
}
