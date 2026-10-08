package f;

import cn.pokemmo.util.function.ByteObjectPredicate;

public interface wq0_0 extends ByteObjectPredicate<Object> {
    @Override
    boolean P7(byte var1, Object var2);

    @Override
    default boolean test(byte b, Object obj) {
        return P7(b, obj);
    }
}
