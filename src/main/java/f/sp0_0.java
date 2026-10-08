package f;

import cn.pokemmo.util.function.BooleanCondition;

public interface sp0_0 extends BooleanCondition {
    @Override
    boolean JL();

    @Override
    default boolean isSatisfied() {
        return JL();
    }
}
