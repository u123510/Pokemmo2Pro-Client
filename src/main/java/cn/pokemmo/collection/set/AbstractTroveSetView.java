package cn.pokemmo.collection.set;

import f.jb0_1;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class AbstractTroveSetView extends AbstractSet implements Set, Iterable {
    public final jb0_1 u6;

    public AbstractTroveSetView(jb0_1 var1) {
        this.u6 = var1;
    }

    public AbstractTroveSetView(jb0_1 var1, int var2) {
        this(var1);
    }

    public abstract boolean QT(Object var1);

    public abstract boolean z4(Object var1);

    @Override
    public final boolean contains(Object var1) {
        return this.z4(var1);
    }

    @Override
    public final boolean remove(Object var1) {
        try {
            return this.QT(var1);
        } catch (ClassCastException var2) {
            return false;
        }
    }

    @Override
    public final void clear() {
        this.u6.clear();
    }

    @Override
    public final boolean add(Object var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.u6.Rv;
    }

    @Override
    public final Object[] toArray() {
        Object[] var3 = new Object[this.u6.Rv];
        Iterator var1 = this.iterator();

        for (int var2 = 0; var1.hasNext(); var2++) {
            var3[var2] = var1.next();
        }

        return var3;
    }

    @Override
    public final Object[] toArray(Object[] var1) {
        int var2 = this.u6.Rv;
        if (var1.length < var2) {
            var1 = (Object[]) Array.newInstance(var1.getClass().getComponentType(), var2);
        }

        Iterator var4 = this.iterator();

        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = var4.next();
        }

        if (var1.length > var2) {
            var1[var2] = null;
        }

        return var1;
    }

    @Override
    public final boolean isEmpty() {
        return this.u6.isEmpty();
    }

    @Override
    public final boolean addAll(Collection var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean retainAll(Collection var1) {
        boolean var3 = false;
        Iterator var2 = this.iterator();

        while (var2.hasNext()) {
            if (!var1.contains(var2.next())) {
                var2.remove();
                var3 = true;
            }
        }

        return var3;
    }

    @Override
    public final String toString() {
        Iterator var1;
        if (!(var1 = this.iterator()).hasNext()) {
            return "{}";
        }

        StringBuilder var2 = new StringBuilder("{");

        while (true) {
            Object var3;
            if ((var3 = var1.next()) == this) {
                var3 = "(this Collection)";
            }

            var2.append(var3);
            if (!var1.hasNext()) {
                return var2.append('}').toString();
            }

            var2.append(", ");
        }
    }
}
