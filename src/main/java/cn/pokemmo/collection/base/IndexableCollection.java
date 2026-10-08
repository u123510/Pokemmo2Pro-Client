package cn.pokemmo.collection.base;

import f.*;
import java.io.Serializable;
import java.util.Iterator;

/**
 * 现代化集合接口 - 原始接口: f.uo0_0
 */
public interface IndexableCollection extends Iterable,
Serializable {

    default public Iterator iterator() {
        return this.VF0();
    }

    public Iterator VF0();
}

