package cn.pokemmo.collection.node;

import f.*;
import java.util.Iterator;

/**
 * 现代化集合类 - 原始类: f.vu_1
 */
public class SequentialNodeIterable implements Iterable {

    public final cn.pokemmo.collection.list.FastArray l20;
    public final boolean Zk0;
    public I2 Wr;
    public I2 WY;

    public SequentialNodeIterable(cn.pokemmo.collection.list.FastArray v1) {
        this(v1, true);
    }

    public SequentialNodeIterable(cn.pokemmo.collection.list.FastArray v1, boolean i2) {
        super();
        this.l20 = v1;
        this.Zk0 = i2;
    }

    public final I2 Mm0() {
        if (this.Wr == null) {
            this.Wr = new I2(this.l20, this.Zk0);
            this.WY = new I2(this.l20, this.Zk0);
        }
        I2 wr = this.Wr;
        if (!wr.Y20) {
            wr.g40 = 0;
            wr.Y20 = true;
            this.WY.Y20 = false;
            return wr;
        } else {
            this.WY.g40 = 0;
            this.WY.Y20 = true;
            wr.Y20 = false;
            return this.WY;
        }
    }

    public final Iterator iterator() {
        return this.Mm0();
    }
}
