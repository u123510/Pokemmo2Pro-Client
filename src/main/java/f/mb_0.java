package f;

import cn.pokemmo.util.function.StringConsumerCallback;

public interface mb_0 extends StringConsumerCallback {
    @Override
    void Sy0(String var1);

    @Override
    default void accept(String str) {
        Sy0(str);
    }
}
