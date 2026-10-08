package cn.pokemmo.lifecycle;

/**
 * 生命周期重置与清理回调接口
 */
public interface ResetCallback {
    void reset();

    default void a7() {
        reset();
    }
}
