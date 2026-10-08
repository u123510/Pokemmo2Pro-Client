package cn.pokemmo.util.function;

public interface EnumConsumerCallback<E extends Enum<E>> {
    void accept(E enumVal);

    @SuppressWarnings({"unchecked", "rawtypes"})
    default void Xi0(Enum var1) {
        accept((E) var1);
    }
}
