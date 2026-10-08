package cn.pokemmo.collection.wrapper;

import f.dp_1;
import f.ej_0;
import f.km_1;
import java.util.RandomAccess;

public class CustomForwardingList extends km_1 implements dp_1 {
    static final long serialVersionUID = -283967356065247728L;
    public final dp_1 t3;

    public CustomForwardingList(dp_1 v1) {
        super(v1);
        this.t3 = v1;
    }

    private Object readResolve() {
        if (this.t3 instanceof RandomAccess) {
            return new ej_0(this.t3);
        }
        return this;
    }

    @Override
    public boolean equals(Object v1) {
        if (v1 == this) {
            return true;
        }
        return this.t3.equals(v1);
    }

    @Override
    public int hashCode() {
        return this.t3.hashCode();
    }
}
