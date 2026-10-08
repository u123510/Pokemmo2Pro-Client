package f;

import cn.pokemmo.collection.set.ShortSet;

public interface dn_0 extends ShortSet {
    @Override
    int size();

    @Override
    boolean bL0(short var1);

    @Override
    default boolean contains(short val) {
        return bL0(val);
    }
}
