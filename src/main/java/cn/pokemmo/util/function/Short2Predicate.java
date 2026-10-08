package cn.pokemmo.util.function;

public interface Short2Predicate {
    boolean test(short a, short b);

    default boolean a3(short var1, short var2) {
        return test(var1, var2);
    }
}
