package cn.pokemmo.net.packet;

import f.*;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/**
 * 现代化重构类 - 原始混淆类: f.bw_2
 */
public class Modern_Net_Bw2 implements Collection, Serializable {

    private static final long serialVersionUID = 3053995032091335093L;
    public final Collection El0;
    public final Object ly0;

    public Modern_Net_Bw2(Collection collection, F9 lock) {
        this.El0 = collection;
        this.ly0 = lock;
    }

    private void writeObject(ObjectOutputStream output) throws java.io.IOException {
        synchronized (this.ly0) {
            output.defaultWriteObject();
        }
    }

    public int size() { synchronized (this.ly0) { return this.El0.size(); } }
    public boolean isEmpty() { synchronized (this.ly0) { return this.El0.isEmpty(); } }
    public boolean contains(Object value) { synchronized (this.ly0) { return this.El0.contains(value); } }
    public Object[] toArray() { synchronized (this.ly0) { return this.El0.toArray(); } }
    public Object[] toArray(Object[] values) { synchronized (this.ly0) { return this.El0.toArray(values); } }
    public Iterator iterator() { return this.El0.iterator(); }
    public boolean add(Object value) { synchronized (this.ly0) { return this.El0.add(value); } }
    public boolean remove(Object value) { synchronized (this.ly0) { return this.El0.remove(value); } }
    public boolean containsAll(Collection values) { synchronized (this.ly0) { return this.El0.containsAll(values); } }
    public boolean addAll(Collection values) { synchronized (this.ly0) { return this.El0.addAll(values); } }
    public boolean removeAll(Collection values) { synchronized (this.ly0) { return this.El0.removeAll(values); } }
    public boolean retainAll(Collection values) { synchronized (this.ly0) { return this.El0.retainAll(values); } }
    public void clear() { synchronized (this.ly0) { this.El0.clear(); } }
    public String toString() { synchronized (this.ly0) { return this.El0.toString(); } }
}

