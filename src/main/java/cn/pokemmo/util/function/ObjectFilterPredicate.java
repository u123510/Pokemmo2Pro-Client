package cn.pokemmo.util.function;

public interface ObjectFilterPredicate<T> {
    boolean filter(T obj);

    @SuppressWarnings("unchecked")
    default boolean mF0(Object var1) {
        return filter((T) var1);
    }
}
