package cn.pokemmo.collection.wrapper;

import f.i8_0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;

public abstract class WeakReferenceMapBase {
    public final HashMap op;
    public final ReferenceQueue Oy;

    public WeakReferenceMapBase() {
        this.op = new HashMap();
        this.Oy = new ReferenceQueue();
    }

    public abstract void lI0();

    public abstract Reference EV(Integer key, i8_0 value, ReferenceQueue queue);

    public final void aT(Integer key, i8_0 value) {
        this.lI0();
        if (!this.op.containsKey(key)) {
            this.op.put(key, this.EV(key, value, this.Oy));
            return;
        }
        throw new IllegalArgumentException("Key: " + key + " already exists in map");
    }
}
