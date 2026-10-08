package cn.pokemmo.util.function;

public interface ShortObjectPredicate<T> {
    boolean test(short s, T obj);

    @SuppressWarnings("unchecked")
    default boolean xH0(short var1, Object var2) {
        return test(var1, (T) var2);
    }
}
