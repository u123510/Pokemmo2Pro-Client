package cn.pokemmo.text;

import f.Oq;
import f.rb_1;

public class CompositeFilterPredicate extends Oq {
    public final Oq[] jz;
    public final boolean switch$;
    public final boolean jc0;

    public CompositeFilterPredicate(char i1, Oq... v2) {
        if (i1 != 124 && i1 != 43 && i1 != 94) {
            throw new IllegalArgumentException("kind");
        }
        this.jz = v2;
        this.switch$ = (i1 == 43);
        this.jc0 = (i1 == 94);
    }

    public boolean mk0(rb_1 v1) {
        boolean z = this.switch$ ^ this.Wi0;
        Oq[] arr = this.jz;
        for (Oq oq : arr) {
            boolean res = oq.mk0(v1);
            if (this.jc0) {
                z ^= res;
            } else if (this.switch$ != res) {
                return !z;
            }
        }
        return z;
    }
}
