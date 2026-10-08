package f;

import cn.pokemmo.util.function.FloatConsumerCallback;

public interface dc_1 extends FloatConsumerCallback {
    @Override
    void y90(float var1);

    @Override
    default void accept(float value) {
        y90(value);
    }
}
