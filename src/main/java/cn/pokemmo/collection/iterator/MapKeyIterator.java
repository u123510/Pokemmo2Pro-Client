package cn.pokemmo.collection.iterator;

import f.*;
import java.util.Iterator;

/**
 * 现代化集合类 - 原始类: f.V3
 */
public class MapKeyIterator extends OI implements Iterator {

    public final w7_0 W1;

    public MapKeyIterator(w7_0 values) {
        super(values);
        this.W1 = values;
    }

    public final Object next() {
        return this.u7();
    }

    public final Object u7() {
        this.aA();
        return this.W1.BS[this.gH0];
    }
}
