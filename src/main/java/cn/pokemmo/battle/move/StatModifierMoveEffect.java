package cn.pokemmo.battle.move;

import f.*;
import java.util.NoSuchElementException;

public class StatModifierMoveEffect extends be_2 {
    public final es_1 Nu;

    public StatModifierMoveEffect(EI source) {
        super(source);
        this.Nu = source.Ub;
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
        Object value = this.Xw0.Wk0(this.Nu.get(this.PL0));
        int index = this.PL0;
        this.QX = index;
        index++;
        this.PL0 = index;
        this.Fs = index < this.Xw0.Va0;
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
    public final es_1 LC(es_1 result) {
        int end = this.Nu.KB;
        result.Bv(end - this.PL0);
        Object[] keys = this.Nu.rZ;
        int index = this.PL0;
        while (index < end) {
            result.Ue0(this.Xw0.Wk0(keys[index]));
            index++;
        }
        this.QX = end - 1;
        this.PL0 = end;
        this.Fs = false;
        return result;
    }

    @Override
    public final es_1 hT() {
        return this.LC(new es_1(true, this.Nu.KB - this.PL0));
    }
}
