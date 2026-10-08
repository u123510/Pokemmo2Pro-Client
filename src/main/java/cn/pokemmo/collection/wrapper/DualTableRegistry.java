package cn.pokemmo.collection.wrapper;

import f.TE;
import f.w7_0;

public class DualTableRegistry {
    public TE s80;
    public final w7_0 d90;

    public DualTableRegistry() {
        this.s80 = new TE();
        this.d90 = new w7_0();
    }

    public void eT(short s1, short s2) {
        this.s80.Dc0(s1, (short) (s2 - 1));
    }
}
