package f;

import cn.pokemmo.util.function.IntObjectPredicate;

/**
 * 整型对象谓词门面
 * @see cn.pokemmo.util.function.IntObjectPredicate
 */
public interface Fz0 extends IntObjectPredicate<Object> {
    @Override
    boolean j80(int var1, Object var2);

    @Override
    default boolean test(int id, Object value) {
        return j80(id, value);
    }
}
