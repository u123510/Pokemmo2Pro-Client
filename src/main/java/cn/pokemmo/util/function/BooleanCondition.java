package cn.pokemmo.util.function;

public interface BooleanCondition {
    boolean isSatisfied();

    default boolean JL() {
        return isSatisfied();
    }
}
