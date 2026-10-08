package cn.pokemmo.util.function;

public interface FloatConsumerCallback {
    void accept(float value);

    default void y90(float var1) {
        accept(var1);
    }
}
