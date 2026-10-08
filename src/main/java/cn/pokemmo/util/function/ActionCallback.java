package cn.pokemmo.util.function;

/**
 * 无参动作执行回调接口
 */
public interface ActionCallback {
    void execute();

    default void Tj() {
        execute();
    }
}
