package cn.pokemmo.collection.set;

import f.V3;
import f.w7_0;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class TroveMapKeySet extends AbstractSet implements Set, Iterable {
    public final w7_0 zz;
    public final w7_0 EF;

    public TroveMapKeySet(w7_0 map) {
        this.EF = map;
        this.zz = map;
    }

    @Override
    public Iterator iterator() {
        return new V3(this.EF);
    }

    @Override
    public Object[] toArray() {
        return this.Ao0();
    }

    @Override
    public boolean addAll(Collection values) {
        throw new UnsupportedOperationException();
    }

    public Object[] s20(Object[] values) {
        int size = this.size();
        if (values.length < size) {
            values = (Object[]) Array.newInstance(values.getClass().getComponentType(), size);
        }

        w7_0 map = this.EF;
        int expectedSize = map.size();
        int position = map.uT();
        for (int index = 0; index < size; index++) {
            if (expectedSize != map.Rv) {
                throw new ConcurrentModificationException();
            }

            byte[] states = map.Ut;
            do {
                position--;
            } while (position >= 0 && states[position] != 1);
            if (position < 0) {
                throw new NoSuchElementException();
            }
            values[index] = map.BS[position];
        }

        if (values.length > size) {
            values[size] = null;
        }
        return values;
    }

    public boolean Bu0(Collection values) {
        boolean changed = false;
        V3 iterator = new V3(this.EF);
        while (iterator.hasNext()) {
            if (!values.contains(iterator.u7())) {
                iterator.remove();
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public void clear() {
        this.zz.clear();
    }

    @Override
    public boolean contains(Object value) {
        return this.S8(value);
    }

    public boolean CH(Object value) {
        w7_0 map = this.EF;
        Object[] keys = map.BS;
        byte[] states = map.Ut;
        for (int index = keys.length - 1; index >= 0; index--) {
            Object key = keys[index];
            if (states[index] == 1 && (value == key || (key != null && key.equals(value)))) {
                map.dx0(index);
                return true;
            }
        }
        return false;
    }

    public boolean S8(Object value) {
        byte[] states = this.EF.Ut;
        Object[] keys = this.EF.BS;
        if (value == null) {
            for (int index = keys.length - 1; index >= 0; index--) {
                if (states[index] == 1 && keys[index] == null) {
                    return true;
                }
            }
        } else {
            for (int index = keys.length - 1; index >= 0; index--) {
                Object key = keys[index];
                if (states[index] == 1 && (value == key || value.equals(key))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object value) {
        return this.CH(value);
    }

    public Object[] Ao0() {
        Object[] values = new Object[this.size()];
        V3 iterator = new V3(this.EF);
        for (int index = 0; iterator.hasNext(); index++) {
            values[index] = iterator.u7();
        }
        return values;
    }

    @Override
    public boolean add(Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] values) {
        return this.s20(values);
    }

    @Override
    public int size() {
        return this.zz.Rv;
    }

    @Override
    public boolean isEmpty() {
        return this.zz.isEmpty();
    }

    @Override
    public boolean retainAll(Collection values) {
        return this.Bu0(values);
    }
}
