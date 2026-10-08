package f;

import cn.pokemmo.util.function.StringConsumer;

public interface op_0 extends StringConsumer {
    @Override
    void Sy0(String var1);

    @Override
    default void accept(String str) {
        Sy0(str);
    }
}
