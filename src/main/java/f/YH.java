package f;

import cn.pokemmo.collection.iterator.PrimitiveBucketIterator;

public final class YH extends PrimitiveBucketIterator {
    public YH(cn.pokemmo.collection.set.FastObjectSet owner) {
        super(owner);
    }

    public YH(af_1 owner) {
        super(owner);
    }

    @Override
    public final YH iterator() {
        return this;
    }
}
