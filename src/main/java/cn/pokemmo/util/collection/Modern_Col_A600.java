package cn.pokemmo.util.collection;

import f.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 现代化重构类 - 原始混淆类: f.a60_0
 */
public class Modern_Col_A600 extends ej0_0 {

    public final xn_1 mi0;

    public Modern_Col_A600(cn.pokemmo.collection.map.FastObjectMap var1) {
        super(var1);
        this.mi0 = new xn_1();
    }

    public Modern_Col_A600(nb_2 var1) {
        super(var1);
        this.mi0 = new xn_1();
    }

    public xn_1 K3() {
        if (this.Fs) {
            if (this.X10) {
                cn.pokemmo.collection.map.FastObjectMap var1 = this.Xw0;
                this.mi0.I20 = var1.z40[this.PL0];
                this.mi0.kM = var1.Pr[this.PL0];
                this.QX = this.PL0;
                this.iC0();
                return this.mi0;
            } else {
                throw new nf_1("#iterator() cannot be used nested.");
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public final boolean hasNext() {
        if (this.X10) {
            return this.Fs;
        } else {
            throw new nf_1("#iterator() cannot be used nested.");
        }
    }

    public final Iterator iterator() {
        return this;
    }

    public xn_1 next() {
        return this.K3();
    }
}

