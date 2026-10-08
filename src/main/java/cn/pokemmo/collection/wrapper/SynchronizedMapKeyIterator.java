package cn.pokemmo.collection.wrapper;

import f.OI;
import f.YI;
import java.util.ConcurrentModificationException;

public class SynchronizedMapKeyIterator extends OI {
    public final YI He;

    public SynchronizedMapKeyIterator(YI v1, YI v2) {
        super(v2);
        this.He = v1;
    }

    public void remove() {
        if (this.sH != this.AA.Rv) {
            throw new ConcurrentModificationException();
        }
        try {
            this.AA.o00 = true;
            this.He.dx0(this.gH0);
        } finally {
            this.AA.o00 = false;
        }
        this.sH--;
    }
}
