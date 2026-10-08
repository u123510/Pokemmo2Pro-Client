package cn.pokemmo.collection.set;

import f.YC0;
import f.bm0_1;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class TroveMapValuesView extends AbstractSet<Object> implements Set<Object>, Iterable<Object> {
    public final bm0_1 LE;
    public final bm0_1 u40;

    public TroveMapValuesView(bm0_1 bm0_1) {
        this.u40 = bm0_1;
        this.LE = bm0_1;
    }

    @Override
    public Iterator<Object> iterator() {
        return new YC0(this.u40);
    }

    @Override
    public Object[] toArray() {
        return this.ex();
    }

    public Object[] ex() {
        Object[] arr = new Object[this.size()];
        YC0 yc0 = new YC0(this.u40);
        int i = 0;
        while (yc0.hasNext()) {
            arr[i++] = yc0.ro();
        }
        return arr;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] arr) {
        return (T[]) this.HZ(arr);
    }

    public Object[] HZ(Object[] arr) {
        int size = this.size();
        if (arr.length < size) {
            arr = (Object[]) Array.newInstance(arr.getClass().getComponentType(), size);
        }
        bm0_1 map = this.u40;
        int expectedSize = map.size();
        int capacity = map.uT();
        int index = 0;
        while (index < size) {
            if (expectedSize != map.Rv) {
                throw new ConcurrentModificationException();
            }
            byte[] states = map.Ut;
            while (--capacity > 0 && states[capacity] != 1) {
            }
            if (capacity < 0) {
                throw new NoSuchElementException();
            }
            arr[index++] = map.vJ[capacity];
        }
        if (arr.length > size) {
            arr[size] = null;
        }
        return arr;
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.LE.clear();
    }

    @Override
    public boolean contains(Object o) {
        return this.qg0(o);
    }

    public boolean qg0(Object o) {
        byte[] states = this.u40.Ut;
        Object[] values = this.u40.vJ;
        if (o == null) {
            int i = values.length;
            while (i-- > 0) {
                if (states[i] == 1 && values[i] == null) {
                    return true;
                }
            }
        } else {
            int i = values.length;
            while (i-- > 0) {
                if (states[i] == 1 && (o == values[i] || o.equals(values[i]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return this.rp0(o);
    }

    public boolean rp0(Object o) {
        Object[] values = this.u40.vJ;
        byte[] states = this.u40.Ut;
        int i = states.length;
        while (i-- > 0) {
            if (states[i] == 1) {
                Object val = values[i];
                if (o == val || (val != null && val.equals(o))) {
                    this.u40.dx0(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean add(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return this.LE.Rv;
    }

    @Override
    public boolean isEmpty() {
        return this.LE.isEmpty();
    }

    @Override
    public boolean retainAll(Collection c) {
        return this.Lt0(c);
    }

    public boolean Lt0(Collection c) {
        boolean modified = false;
        YC0 yc0 = new YC0(this.u40);
        while (yc0.hasNext()) {
            if (!c.contains(yc0.ro())) {
                yc0.remove();
                modified = true;
            }
        }
        return modified;
    }
}
