package cn.pokemmo.collection.iterator;

import f.hs_1;
import f.lf_1;
import f.nf_1;
import f.nl_1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntMapEntryIterator extends lf_1 implements Iterable<hs_1>, Iterator<hs_1> {
    public final hs_1 jl0;

    public IntMapEntryIterator(cn.pokemmo.collection.map.IntObjectMap owner) {
        super(owner);
        this.jl0 = new hs_1();
    }

    @Override
    public final boolean hasNext() {
        if (!this.nw0) {
            throw new nf_1("#iterator() cannot be used nested.");
        }
        return this.hf0;
    }

    @Override
    public Iterator<hs_1> iterator() {
        return this;
    }

    @Override
    public hs_1 next() {
        if (!this.hf0) {
            throw new NoSuchElementException();
        }
        if (!this.nw0) {
            throw new nf_1("#iterator() cannot be used nested.");
        }
        if (this.L40 == -1) {
            this.jl0.ZR = 0;
            this.jl0.yJ0 = this.iu0.Nc0;
        } else {
            this.jl0.ZR = this.iu0.Qu0[this.L40];
            this.jl0.yJ0 = this.iu0.Com9[this.L40];
        }
        this.Pp0 = this.L40;
        this.XS();
        return this.jl0;
    }
}
