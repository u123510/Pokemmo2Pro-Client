package cn.pokemmo.util.collection;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.M30
 */
public abstract class Modern_Col_M30 {

    public Modern_Col_M30() {
        super();
    }

    public ne_2[] Nw;

    public final void su(int width, int height) {
        ne_2[] listeners = this.Nw;
        if (listeners != null) {
            for (ne_2 listener : listeners) {
                listener.zi(width, height);
            }
        }
    }

    public final void aD() {
        ne_2[] listeners = this.Nw;
        if (listeners != null) {
            for (ne_2 listener : listeners) {
                listener.wn0();
            }
        }
    }

    public abstract int ul0();

    public abstract Object YS(int index);
}

