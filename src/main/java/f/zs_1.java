package f;

import cn.pokemmo.util.function.EnumConsumerCallback;

public interface zs_1 extends EnumConsumerCallback {
    @Override
    void Xi0(Enum var1);

    @Override
    default void accept(Enum enumVal) {
        Xi0(enumVal);
    }
}
