package cn.pokemmo.util.function;

public interface ObjectConsumerCallback<T> {
    void accept(T value);

    @SuppressWarnings("unchecked")
    default void PP(Object var1) {
        accept((T) var1);
    }
}
