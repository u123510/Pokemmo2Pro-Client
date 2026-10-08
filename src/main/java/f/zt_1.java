package f;

import cn.pokemmo.util.function.IntPredicateCallback;

public interface zt_1 extends IntPredicateCallback {
    @Override
    boolean g5(int var1);

    @Override
    default boolean test(int value) {
        return g5(value);
    }
}
