package cn.pokemmo.lifecycle;

import f.bi_1;
import f.hu_1;
import java.lang.ref.PhantomReference;

public class NativeResourcePhantomReference extends PhantomReference {
    public final long FU;

    public NativeResourcePhantomReference(bi_1 bi_12) {
        super(bi_12, hu_1.PS);
        this.FU = bi_12.ET();
    }
}
