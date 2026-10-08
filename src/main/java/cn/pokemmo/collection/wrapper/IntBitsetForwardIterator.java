package cn.pokemmo.collection.wrapper;

import f.z5;

public class IntBitsetForwardIterator {
    public boolean p8;
    public final z5 u9;
    public int E7;
    public boolean jF0;

    public IntBitsetForwardIterator(z5 z5) {
        this.jF0 = true;
        this.u9 = z5;
        YP();
    }

    public void YP() {
        this.E7 = -1;
        z5 z5 = this.u9;
        if (z5.wv) {
            this.p8 = true;
            return;
        }
        int[] ms = z5.Ms;
        int len = ms.length;
        while (true) {
            int next = this.E7 + 1;
            this.E7 = next;
            if (next >= len) {
                this.p8 = false;
                return;
            }
            if (ms[next] != 0) {
                this.p8 = true;
                return;
            }
        }
    }
}
