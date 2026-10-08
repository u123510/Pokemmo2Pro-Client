package cn.pokemmo.util.collection;

import f.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 现代化重构类 - 原始混淆类: f.us0_0
 */
public class Modern_Col_us0_0
extends ej0_0 {

    public Modern_Col_us0_0(cn.pokemmo.collection.map.FastObjectMap nb_22) {
        super(nb_22);
    }

    public Modern_Col_us0_0(nb_2 nb_22) {
        super(nb_22);
    }

    @Override
    public final boolean hasNext() {
        if (this.X10) {
            return this.Fs;
        }
        throw new nf_1("#iterator() cannot be used nested.");
    }

    public Object next() {
        if (this.Fs) {
            if (this.X10) {
                int n = this.PL0;
                Object object = this.Xw0.z40[n];
                this.QX = n;
                this.iC0();
                return object;
            }
            throw new nf_1("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException();
    }

    public final us0_0 x10() {
        return (us0_0)this;
    }

    public es_1 Com2() {
        return this.uy0(new es_1(true, this.Xw0.Va0));
    }

    public es_1 uy0(es_1 es_12) {
        while (this.Fs) {
            es_12.Ue0(this.next());
        }
        return es_12;
    }

    public final Iterator iterator() {
        return (us0_0)this;
    }
}


