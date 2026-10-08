package cn.pokemmo.battle;

import f.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;

/**
 * 现代化重构类 - 原始混淆类: f.Nm
 */
public class Modern_Battle_Nm
implements IG0,
Serializable {

    private static final long serialVersionUID = -1034234728574286014L;
    public final IG0 z90;
    public transient Collection Q00 = null;

    public Modern_Battle_Nm(bm0_1 bm0_12) {
        this.z90 = bm0_12;
    }

    public final int size() {
        return this.z90.size();
    }

    public final boolean I0(byte by) {
        return this.z90.I0(by);
    }

    public final Object BM(byte by) {
        return this.z90.BM(by);
    }

    public final Object gE0(byte by, Object object) {
        throw new UnsupportedOperationException();
    }

    public final Object lz0(byte by) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final Collection To() {
        if (this.Q00 == null) {
            this.Q00 = Collections.unmodifiableCollection(this.z90.To());
        }
        return this.Q00;
    }

    public final boolean equals(Object object) {
        return object == this || this.z90.equals(object);
    }

    public final int hashCode() {
        return this.z90.hashCode();
    }

    public final String toString() {
        return this.z90.toString();
    }

    public final byte SK() {
        return this.z90.SK();
    }

    public final boolean ml0(wq0_0 wq0_02) {
        return this.z90.ml0(wq0_02);
    }
}


