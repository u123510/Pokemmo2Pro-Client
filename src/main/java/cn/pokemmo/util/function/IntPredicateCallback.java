package cn.pokemmo.util.function;

public interface IntPredicateCallback {
    boolean test(int value);

    default boolean g5(int var1) {
        return test(var1);
    }
}
