package cn.pokemmo.util.function;

public interface StringMessageConsumer {
    void acceptMessage(String message);

    default void xj(String var1) {
        acceptMessage(var1);
    }
}
