package f;

import cn.pokemmo.util.function.StringMessageConsumer;

public interface lpt5__1 extends StringMessageConsumer {
    @Override
    void xj(String var1);

    @Override
    default void acceptMessage(String message) {
        xj(message);
    }
}
