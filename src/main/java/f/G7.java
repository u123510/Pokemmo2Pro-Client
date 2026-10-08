package f;

import cn.pokemmo.math.geometry.ShortBytePredicate;

/**
 * 短整型字节谓词门面
 * @see cn.pokemmo.math.geometry.ShortBytePredicate
 */
public interface G7 extends ShortBytePredicate {
    @Override
    boolean yl0(short var1, byte var2);

    @Override
    default boolean test(short s, byte b) {
        return yl0(s, b);
    }
}
