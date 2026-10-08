package f;

import cn.pokemmo.util.function.IntIndexPredicate;

public interface dp_1 extends IntIndexPredicate {
    @Override
    boolean Vn(int var1);

    @Override
    default boolean testIndex(int index) {
        return Vn(index);
    }
}
