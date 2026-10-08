package cn.pokemmo.collection.wrapper;

import f.i8_0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class KeyedWeakReference extends WeakReference {
    public final Object Su;

    public KeyedWeakReference(Integer n, i8_0 i8_02, ReferenceQueue referenceQueue) {
        super(i8_02, referenceQueue);
        this.Su = n;
    }
}
