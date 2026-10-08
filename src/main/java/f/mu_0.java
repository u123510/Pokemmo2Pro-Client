package f;

import cn.pokemmo.lifecycle.SimpleLifecycleCallback;

public interface mu_0 extends SimpleLifecycleCallback {
    @Override
    void bL();

    @Override
    default void onLifecycleEvent() {
        bL();
    }
}
