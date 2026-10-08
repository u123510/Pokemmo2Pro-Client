package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;

public class PrimitiveLongCollectionDelegate implements IG0, Serializable {
    private static final long serialVersionUID = 1978198479659022715L;

    public final IG0 Cq;
    public final F9 RV;
    public transient bw_2 JC;

    public PrimitiveLongCollectionDelegate(bm0_1 delegate) {
        this.JC = null;
        this.Cq = delegate;
        this.RV = (F9) this;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        synchronized (this.RV) {
            out.defaultWriteObject();
        }
    }

    @Override
    public final int size() {
        synchronized (this.RV) {
            return this.Cq.size();
        }
    }

    @Override
    public final boolean I0(byte index) {
        synchronized (this.RV) {
            return this.Cq.I0(index);
        }
    }

    @Override
    public final Object BM(byte index) {
        synchronized (this.RV) {
            return this.Cq.BM(index);
        }
    }

    @Override
    public final Object gE0(byte index, Object value) {
        synchronized (this.RV) {
            return this.Cq.gE0(index, value);
        }
    }

    @Override
    public final Object lz0(byte index) {
        synchronized (this.RV) {
            return this.Cq.lz0(index);
        }
    }

    @Override
    public final void clear() {
        synchronized (this.RV) {
            this.Cq.clear();
        }
    }

    @Override
    public final Collection To() {
        synchronized (this.RV) {
            if (this.JC == null) {
                this.JC = new bw_2(this.Cq.To(), this.RV);
            }
            return this.JC;
        }
    }

    @Override
    public final byte SK() {
        return this.Cq.SK();
    }

    @Override
    public final boolean ml0(wq0_0 predicate) {
        synchronized (this.RV) {
            return this.Cq.ml0(predicate);
        }
    }

    @Override
    public final boolean equals(Object other) {
        synchronized (this.RV) {
            return this.Cq.equals(other);
        }
    }

    @Override
    public final int hashCode() {
        synchronized (this.RV) {
            return this.Cq.hashCode();
        }
    }

    @Override
    public final String toString() {
        synchronized (this.RV) {
            return this.Cq.toString();
        }
    }
}
