package f;

import cn.pokemmo.util.function.Short2Predicate;

public interface d5_0 extends Short2Predicate {
    @Override
    boolean a3(short var1, short var2);

    @Override
    default boolean test(short a, short b) {
        return a3(a, b);
    }
}
