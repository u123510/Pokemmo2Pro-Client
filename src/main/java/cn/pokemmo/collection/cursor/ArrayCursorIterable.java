package cn.pokemmo.collection.cursor;

import f.*;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 现代化集合类 - 原始类: f.fa0_0
 */
public class ArrayCursorIterable implements Iterable {

    public final HashMap lx;
    public boolean LF0;

    public ArrayCursorIterable() {
        this.lx = new HashMap();
        this.LF0 = false;
    }

    public final GR GC0(CH0 v1) {
        return (GR) this.lx.get(v1);
    }

    public final boolean rY(CH0 v1) {
        return this.lx.containsKey(v1);
    }

    public final Iterator iterator() {
        return this.lx.values().iterator();
    }
}
