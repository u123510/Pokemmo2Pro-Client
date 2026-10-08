package cn.pokemmo.collection.wrapper;

import f.T60;
import f.ao_1;
import f.yl0_0;

public class PooledBufferFactory extends T60 {
    public PooledBufferFactory(yl0_0 yl0_02) {
        super(20, yl0_02);
    }

    @Override
    public Object L80() {
        return new ao_1();
    }
}
