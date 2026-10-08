package f;

import cn.pokemmo.util.function.IndexedEntryConsumer;
import f.D2;

/**
 * 索引条目消费门面
 * @see cn.pokemmo.util.function.IndexedEntryConsumer
 */
public interface LB0 extends IndexedEntryConsumer {
    @Override
    void LPT3(int var1, D2 var2);

    @Override
    default void accept(int index, D2 entry) {
        LPT3(index, entry);
    }
}
