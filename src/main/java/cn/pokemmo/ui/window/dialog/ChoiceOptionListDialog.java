package cn.pokemmo.ui.window.dialog;

import f.*;
import java.util.NoSuchElementException;

public class ChoiceOptionListDialog extends us0_0 {
    public final es_1 u7;

    public ChoiceOptionListDialog(EI source) {
        super(source);
        this.u7 = source.Ub;
    }

    @Override
    public final void NF0() {
        this.QX = -1;
        this.PL0 = 0;
        this.Fs = this.Xw0.Va0 > 0;
    }

    @Override
    public final Object next() {
        if (!this.Fs) {
            throw new NoSuchElementException();
        }
        if (!this.X10) {
            throw new nf_1("#iterator() cannot be used nested.");
        }
        Object value = this.u7.get(this.PL0);
        this.QX = this.PL0;
        int nextIndex = this.PL0 + 1;
        this.PL0 = nextIndex;
        this.Fs = nextIndex < this.Xw0.Va0;
        return value;
    }

    @Override
    public final void remove() {
        int index = this.QX;
        if (index < 0) {
            throw new IllegalStateException("next must be called before remove.");
        }
        ((EI) this.Xw0).gl0(index);
        this.PL0 = this.QX;
        this.QX = -1;
    }

    @Override
    public final es_1 uy0(es_1 target) {
        es_1 source = this.u7;
        int index = this.PL0;
        source.uL(target, source.KB - index, index);
        this.PL0 = source.KB;
        this.Fs = false;
        return target;
    }

    @Override
    public final es_1 Com2() {
        return this.uy0(new es_1(true, this.u7.KB - this.PL0));
    }
}
