package cn.pokemmo.collection.set;

import f.SQ;
import f.us_2;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class TroveMapEntrySet extends AbstractSet implements Set, Iterable {
    public final SQ vs;
    public final SQ ff0;

    public TroveMapEntrySet(SQ map) {
        this.ff0 = map;
        this.vs = map;
    }

    @Override
    public Iterator iterator() {
        return new us_2(this.ff0);
    }

    @Override
    public Object[] toArray() {
        return this.tc0();
    }

    public Object[] yB(Object[] values) {
        int size = this.size();
        if (values.length < size) {
            values = (Object[]) Array.newInstance(values.getClass().getComponentType(), size);
        }

        SQ map = this.ff0;
        int expectedSize = map.size();
        int position = map.uT();
        for (int index = 0; index < size; index++) {
            if (expectedSize != map.Rv) {
                throw new ConcurrentModificationException();
            }

            byte[] states = map.Ut;
            do {
                position--;
            } while (position > 0 && states[position] != 1);
            if (position < 0) {
                throw new NoSuchElementException();
            }
            values[index] = map.td[position];
        }

        if (values.length > size) {
            values[size] = null;
        }
        return values;
    }

    @Override
    public boolean addAll(Collection values) {
        throw new UnsupportedOperationException();
    }

    public boolean PL(Collection values) {
        boolean changed = false;
        us_2 iterator = new us_2(this.ff0);
        while (iterator.hasNext()) {
            if (values.contains(iterator.ty())) {
                continue;
            }
            iterator.remove();
            changed = true;
        }
        return changed;
    }

    @Override
    public void clear() {
        this.vs.clear();
    }

    @Override
    public boolean contains(Object value) {
        return this.NA(value);
    }

    @Override
    public boolean remove(Object value) {
        return this.R00(value);
    }

    public Object[] tc0() {
        Object[] values = new Object[this.size()];
        us_2 iterator = new us_2(this.ff0);
        int index = 0;
        while (iterator.hasNext()) {
            values[index++] = iterator.ty();
        }
        return values;
    }

    public boolean R00(Object value) {
        SQ map = this.ff0;
        Object[] entries = map.td;
        byte[] states = map.Ut;
        for (int position = states.length - 1; position > 0; position--) {
            if (states[position] == 1) {
                Object entry = entries[position];
                if (entry == value || entry != null && entry.equals(value)) {
                    map.dx0(position);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean add(Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] values) {
        return this.yB(values);
    }

    @Override
    public int size() {
        return this.vs.Rv;
    }

    @Override
    public boolean isEmpty() {
        return this.vs.isEmpty();
    }

    public boolean NA(Object value) {
        byte[] states = this.ff0.Ut;
        Object[] entries = this.ff0.td;
        if (value == null) {
            for (int position = entries.length - 1; position > 0; position--) {
                if (states[position] == 1 && entries[position] == null) {
                    return true;
                }
            }
        } else {
            for (int position = entries.length - 1; position > 0; position--) {
                if (states[position] == 1) {
                    Object entry = entries[position];
                    if (value == entry || value.equals(entry)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection values) {
        return this.PL(values);
    }
}
