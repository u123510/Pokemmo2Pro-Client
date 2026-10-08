package cn.pokemmo.collection.grid;

import f.*;
import f.Es0;
import java.util.Iterator;

/**
 * 现代化集合类 - 原始类: f.I3
 */
public class GridCellIterable implements Iterable {

    public final Object[] lv0;
    public Es0 jJ;
    public Es0 y00;

    public GridCellIterable(Object[] objectArray) {
        this.lv0 = objectArray;
    }

    public final Iterator iterator() {
        Es0 es0;
        if (this.jJ == null) {
            Object[] objectArray = this.lv0;
            this.jJ = new Es0(this.lv0);
            this.y00 = new Es0(objectArray);
        }
        es0 = this.jJ;
        if (!es0.f80) {
            Es0 es04 = es0;
            es04.COm1 = 0;
            es04.f80 = true;
            this.y00.f80 = false;
            return es0;
        }
        this.y00.COm1 = 0;
        this.y00.f80 = true;
        es0.f80 = false;
        return this.y00;
    }
}

