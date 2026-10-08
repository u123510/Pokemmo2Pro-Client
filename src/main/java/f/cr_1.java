package f;

import cn.pokemmo.collection.iterator.OrderedMapEntryIterator;

public final class cr_1 extends OrderedMapEntryIterator {
    public cr_1(cn.pokemmo.collection.map.IntIntMap map) {
        super(map);
    }

    public cr_1(PS map) {
        super(map);
    }

    @Override
    public final cr_1 iterator() {
        return this;
    }
}
