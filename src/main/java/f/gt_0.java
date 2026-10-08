package f;

import cn.pokemmo.util.function.IntConsumerCallback;

public interface gt_0 extends IntConsumerCallback {
    @Override
    void ks0(int var1);

    @Override
    default void accept(int value) {
        ks0(value);
    }
}
