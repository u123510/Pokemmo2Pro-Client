package cn.pokemmo.util.function;

public interface StringConsumer {
    void accept(String str);

    default void Sy0(String var1) {
        accept(var1);
    }
}
