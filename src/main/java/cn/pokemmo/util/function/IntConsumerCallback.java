package cn.pokemmo.util.function;

public interface IntConsumerCallback {
    void accept(int value);

    default void ks0(int var1) {
        accept(var1);
    }
}
