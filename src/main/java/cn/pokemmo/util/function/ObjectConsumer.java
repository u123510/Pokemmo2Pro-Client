package cn.pokemmo.util.function;

public interface ObjectConsumer<T> {
    void accept(T obj);

    @SuppressWarnings("unchecked")
    default void s2(Object var1) {
        accept((T) var1);
    }
}
