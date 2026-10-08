package cn.pokemmo.collection.iterator;

import f.*;
import java.util.Iterator;

/**
 * 现代化集合类 - 原始类: f.YC0
 */
public class MapValueIterator extends OI implements Iterator {

    public final bm0_1 E70;

    public MapValueIterator(bm0_1 bm0_1) {
        super(bm0_1);
        this.E70 = bm0_1;
    }

    @Override
    public final Object next() {
        return ro();
    }

    public final Object ro() {
        aA();
        return this.E70.vJ[this.gH0];
    }
}
