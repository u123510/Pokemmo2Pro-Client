package f;

import cn.pokemmo.util.function.ShortObjectPredicate;

public interface mm0_0 extends ShortObjectPredicate<Object> {
    @Override
    boolean xH0(short var1, Object var2);

    @Override
    default boolean test(short s, Object obj) {
        return xH0(s, obj);
    }
}
