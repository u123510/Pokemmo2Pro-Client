package cn.pokemmo.util.collection;

import f.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 现代化重构类 - 原始混淆类: f.be_2
 */
public class Modern_Col_Be2
extends ej0_0 {

    public Modern_Col_Be2(cn.pokemmo.collection.map.FastObjectMap nb_22) {
        super(nb_22);
    }

    public Modern_Col_Be2(nb_2 nb_22) {
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
                Object object = this.Xw0.Pr[n];
                this.QX = n;
                this.iC0();
                return object;
            }
            throw new nf_1("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException();
    }

    public es_1 hT() {
        return this.LC(new es_1(true, this.Xw0.Va0));
    }

    public es_1 LC(es_1 es_12) {
        while (this.Fs) {
            es_12.Ue0(this.next());
        }
        return es_12;
    }

    public final Iterator iterator() {
        return this;
    }
}


