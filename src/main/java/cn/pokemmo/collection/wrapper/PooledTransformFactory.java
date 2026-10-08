package cn.pokemmo.collection.wrapper;

import f.T60;
import f.df0_1;
import f.pw_1;

public class PooledTransformFactory extends T60 {
    public PooledTransformFactory(df0_1 df0_12) {
        super(10, df0_12);
    }

    @Override
    public Object L80() {
        return new pw_1();
    }
}
