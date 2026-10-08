package f;

import cn.pokemmo.util.function.ObjectConsumer;

public interface wk0_1 extends ObjectConsumer<Object> {
    @Override
    void s2(Object var1);

    @Override
    default void accept(Object obj) {
        s2(obj);
    }
}
