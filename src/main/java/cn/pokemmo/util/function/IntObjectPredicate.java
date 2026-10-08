package cn.pokemmo.util.function;

/**
 * 整型与对象双元条件谓词接口
 */
public interface IntObjectPredicate<T> {
    boolean test(int id, T value);

    @SuppressWarnings("unchecked")
    default boolean j80(int var1, Object var2) {
        return test(var1, (T) var2);
    }
}
