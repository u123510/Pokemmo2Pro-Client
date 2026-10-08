package cn.pokemmo.util.concurrent;

import f.rg0_2;
import f.xl_2;

public class RandomGeneratorThreadLocal extends ThreadLocal {
    @Override
    public Object initialValue() {
        long l;
        rg0_2.CD0 = l = rg0_2.CD0 + 1L;
        return new xl_2(System.nanoTime() + l);
    }
}
