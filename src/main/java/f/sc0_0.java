package f;

import cn.pokemmo.util.function.DualObjectConsumer;

public interface sc0_0 extends DualObjectConsumer<Object> {
    @Override
    void eC(Object var1);

    @Override
    void kg0(Object var1);

    @Override
    default void onFirst(Object obj) {
        eC(obj);
    }

    @Override
    default void onSecond(Object obj) {
        kg0(obj);
    }
}
