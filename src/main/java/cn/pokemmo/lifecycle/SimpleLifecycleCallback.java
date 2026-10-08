package cn.pokemmo.lifecycle;

public interface SimpleLifecycleCallback {
    void onLifecycleEvent();

    default void bL() {
        onLifecycleEvent();
    }
}
