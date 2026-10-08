package cn.pokemmo.collection.iterator;

import f.*;
import java.util.Iterator;

/**
 * 现代化集合类 - 原始类: f.us_2
 */
public class MapEntryIterator extends OI implements Iterator {

    public final SQ Vm0;

    public MapEntryIterator(SQ sq) {
        super(sq);
        this.Vm0 = sq;
    }

    public final Object ty() {
        aA();
        return this.Vm0.td[this.gH0];
    }

    @Override
    public final Object next() {
        return ty();
    }
}
