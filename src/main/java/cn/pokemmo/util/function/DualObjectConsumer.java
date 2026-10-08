package cn.pokemmo.util.function;

public interface DualObjectConsumer<T> {
    void onFirst(T obj);

    void onSecond(T obj);

    @SuppressWarnings("unchecked")
    default void eC(Object var1) {
        onFirst((T) var1);
    }

    @SuppressWarnings("unchecked")
    default void kg0(Object var1) {
        onSecond((T) var1);
    }
}
