package f;

import cn.pokemmo.util.function.ObjectFilterPredicate;

public interface yo_0 extends ObjectFilterPredicate<Object> {
    @Override
    boolean mF0(Object var1);

    @Override
    default boolean filter(Object obj) {
        return mF0(obj);
    }
}
