package f;

import cn.pokemmo.util.function.ObjectConsumerCallback;

public interface k_0 extends ObjectConsumerCallback<Object> {
    @Override
    void PP(Object var1);

    @Override
    default void accept(Object value) {
        PP(value);
    }
}
