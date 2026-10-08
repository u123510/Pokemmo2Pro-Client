package cn.pokemmo.util.collection;

import f.*;

import java.util.Iterator;

public class PrimitiveIdentityObjectMap extends nb_2 {
    public final es_1 Ub;

    public PrimitiveIdentityObjectMap() {
        super();
        this.Ub = new es_1();
    }

    public PrimitiveIdentityObjectMap(int capacity) {
        super(capacity);
        this.Ub = new es_1(capacity);
    }

    public PrimitiveIdentityObjectMap(int capacity, float loadFactor) {
        super(capacity, loadFactor);
        this.Ub = new es_1(capacity);
    }

    public PrimitiveIdentityObjectMap(PrimitiveIdentityObjectMap source) {
        super(source);
        this.Ub = new es_1(source.Ub);
    }

    @Override
    public final Object WK0(Object key, Object value) {
        int index = this.Va(key);
        if (index >= 0) {
            Object previous = this.Pr[index];
            this.Pr[index] = value;
            return previous;
        }

        index = -(index + 1);
        this.z40[index] = key;
        this.Pr[index] = value;
        this.Ub.Ue0(key);
        int size = this.Va0 + 1;
        this.Va0 = size;
        if (size >= this.g6) {
            this.p70(this.z40.length << 1);
        }
        return null;
    }

    @Override
    public final Object ns0(Object key) {
        this.Ub.sj0(key, false);
        return super.ns0(key);
    }

    public final void gl0(int index) {
        super.ns0(this.Ub.Tx0(index));
    }

    @Override
    public final void b20() {
        this.Ub.clear();
        super.b20();
    }

    public final es_1 ch0() {
        return this.Ub;
    }

    @Override
    public final a60_0 u9() {
        return this.lb0();
    }

    @Override
    public final a60_0 lb0() {
        if (this.Mz == null) {
            this.Mz = new TZ((EI) this);
            this.NP = new TZ((EI) this);
        }

        if (!this.Mz.X10) {
            this.Mz.NF0();
            this.Mz.X10 = true;
            this.NP.X10 = false;
            return this.Mz;
        }

        this.NP.NF0();
        this.NP.X10 = true;
        this.Mz.X10 = false;
        return this.NP;
    }

    @Override
    public final be_2 Ww0() {
        if (this.EO == null) {
            this.EO = new qe_2((EI) this);
            this.Ne = new qe_2((EI) this);
        }

        if (!this.EO.X10) {
            this.EO.NF0();
            this.EO.X10 = true;
            this.Ne.X10 = false;
            return this.EO;
        }

        this.Ne.NF0();
        this.Ne.X10 = true;
        this.EO.X10 = false;
        return this.Ne;
    }

    @Override
    public final us0_0 mC0() {
        if (this.FK == null) {
            this.FK = new ma_0((EI) this);
            this.xw = new ma_0((EI) this);
        }

        if (!this.FK.X10) {
            this.FK.NF0();
            this.FK.X10 = true;
            this.xw.X10 = false;
            return this.FK;
        }

        this.xw.NF0();
        this.xw.X10 = true;
        this.FK.X10 = false;
        return this.xw;
    }

    @Override
    public final String dg0() {
        if (this.Va0 == 0) {
            return "{}";
        }

        StringBuilder builder = new StringBuilder(32);
        builder.append('{');
        for (int index = 0; index < this.Ub.KB; ++index) {
            Object key = this.Ub.get(index);
            if (index > 0) {
                builder.append(", ");
            }
            builder.append(key == this ? "(this)" : key);
            builder.append('=');
            Object value = this.Wk0(key);
            builder.append(value == this ? "(this)" : value);
        }
        builder.append('}');
        return builder.toString();
    }

    @Override
    public final Iterator iterator() {
        return this.lb0();
    }
}
