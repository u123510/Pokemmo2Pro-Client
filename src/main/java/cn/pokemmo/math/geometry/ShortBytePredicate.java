package cn.pokemmo.math.geometry;

/**
 * 短整型与单字节条件谓词接口
 */
public interface ShortBytePredicate {
    boolean test(short s, byte b);

    default boolean yl0(short var1, byte var2) {
        return test(var1, var2);
    }
}
