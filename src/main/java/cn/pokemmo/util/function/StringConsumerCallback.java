package cn.pokemmo.util.function;

public interface StringConsumerCallback {
    void accept(String str);

    default void Sy0(String var1) {
        accept(var1);
    }
}
