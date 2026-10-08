package cn.pokemmo.collection.set;

public interface ShortSet {
    int size();

    boolean contains(short val);

    default boolean bL0(short var1) {
        return contains(var1);
    }
}
