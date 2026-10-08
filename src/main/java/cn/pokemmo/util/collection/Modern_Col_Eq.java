package cn.pokemmo.util.collection;

import f.*;
import java.util.ConcurrentModificationException;
import java.util.Map;

/**
 * 现代化重构类 - 原始混淆类: f.EQ
 */
public class Modern_Col_Eq implements Map.Entry {

    public final Object sg;
    public Object h50;
    public final int Ij0;
    public final jb0_1 wk0;

    public Modern_Col_Eq(jb0_1 owner, Object key, Object value, int index) {
        super();
        this.wk0 = owner;
        this.sg = key;
        this.h50 = value;
        this.Ij0 = index;
    }

    @Override
    public final Object getKey() {
        return this.sg;
    }

    @Override
    public final Object getValue() {
        return this.h50;
    }

    @Override
    public final Object setValue(Object value) {
        Object[] values = this.wk0.ba;
        int index = this.Ij0;
        Object storedValue = values[index];
        Object oldValue = this.h50;
        if (storedValue != oldValue) {
            throw new ConcurrentModificationException();
        }
        values[index] = value;
        this.h50 = value;
        return oldValue;
    }

    @Override
    public final boolean equals(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) object;
        Object key = entry.getKey();
        jb0_1 owner = this.wk0;
        owner.getClass();
        if (!iw_2.k2(this.sg, key)) {
            return false;
        }
        Object value = this.h50;
        owner.getClass();
        return iw_2.k2(value, value);
    }

    @Override
    public final int hashCode() {
        int keyHash = this.sg == null ? 0 : this.sg.hashCode();
        int valueHash = this.h50 == null ? 0 : this.h50.hashCode();
        return keyHash ^ valueHash;
    }

    @Override
    public final String toString() {
        return new StringBuilder().append(this.sg).append("=").append(this.h50).toString();
    }
}

