package cn.pokemmo.util.function;

public interface ByteObjectPredicate<T> {
    boolean test(byte b, T obj);

    @SuppressWarnings("unchecked")
    default boolean P7(byte var1, Object var2) {
        return test(var1, (T) var2);
    }
}
