package cn.pokemmo.util.function;

import f.D2;

/**
 * 带索引条目消费函数接口
 */
public interface IndexedEntryConsumer {
    void accept(int index, D2 entry);

    default void LPT3(int var1, D2 var2) {
        accept(var1, var2);
    }
}
