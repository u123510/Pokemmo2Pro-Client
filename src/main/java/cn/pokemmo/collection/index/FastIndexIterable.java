package cn.pokemmo.collection.index;

import f.*;
import java.util.Iterator;

/**
 * 现代化集合类 - 原始类: f.yg0_1
 */
public class FastIndexIterable implements Iterable {

    public final es_1 Zy;

    public FastIndexIterable() {
        this.Zy = new es_1();
    }

    public final wx_1 lPT2(int i1) {
        for (int i2 = this.Zy.KB - 1; i2 >= 0; i2--) {
            wx_1 w = (wx_1) ((rr_1) this.Zy.get(i2)).zX.get(i1);
            if (w != null) {
                return w;
            }
        }
        return null;
    }

    public final Iterator iterator() {
        return this.Zy.ZD();
    }
}
