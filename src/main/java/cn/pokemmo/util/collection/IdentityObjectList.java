/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.util.collection;

import f.*;

import f.es_1;
import java.util.Comparator;

public class IdentityObjectList
extends es_1 {
    public Object[] PE0;
    public Object[] Dt;
    public int w10;

    public IdentityObjectList() {
    }

    public IdentityObjectList(es_1 es_12) {
        super(es_12);
    }

    public IdentityObjectList(boolean bl, int n, Class clazz) {
        super(bl, n, clazz);
    }

    public IdentityObjectList(boolean bl, int n) {
        super(bl, n);
    }

    public IdentityObjectList(boolean bl, Object[] objectArray, int n, int n2) {
        super(bl, objectArray, n, n2);
    }

    public IdentityObjectList(Class clazz) {
        super(clazz);
    }

    public IdentityObjectList(int n) {
        super(n);
    }

    public IdentityObjectList(Object[] objectArray) {
        super(objectArray);
    }

    public final Object[] pa() {
        KU kU = (KU) this;
        kU.tn0();
        Object[] objectArray = kU.rZ;
        this.PE0 = objectArray;
        ++this.w10;
        return kU.rZ;
    }

    public final void Gj0() {
        int n;
        KU kU = (KU) this;
        kU.w10 = n = Math.max(0, kU.w10 - 1);
        Object[] objectArray = kU.PE0;
        if (kU.PE0 == null) {
            return;
        }
        if (objectArray != this.rZ && n == 0) {
            this.Dt = objectArray;
            int n2 = objectArray.length;
            for (n = 0; n < n2; ++n) {
                this.Dt[n] = null;
            }
        }
        this.PE0 = null;
    }

    @Override
    public final void c0(int n, Object object) {
        KU kU = (KU) this;
        kU.tn0();
        super.c0(n, object);
    }

    @Override
    public final void P6(int n, Object object) {
        KU kU = (KU) this;
        kU.tn0();
        super.P6(n, object);
    }

    @Override
    public final boolean sj0(Object object, boolean bl) {
        this.tn0();
        return super.sj0(object, bl);
    }

    @Override
    public final Object Tx0(int n) {
        this.tn0();
        return super.Tx0(n);
    }

    @Override
    public final void cB(int n) {
        KU kU = (KU) this;
        kU.tn0();
        super.cB(n);
    }

    @Override
    public final boolean fp0(es_1 es_12, boolean bl) {
        this.tn0();
        return super.fp0(es_12, bl);
    }

    @Override
    public final Object rq0() {
        KU kU = (KU) this;
        kU.tn0();
        return super.rq0();
    }

    @Override
    public final void clear() {
        KU kU = (KU) this;
        kU.tn0();
        super.clear();
    }

    @Override
    public final void sort(Comparator comparator) {
        KU kU = (KU) this;
        kU.tn0();
        super.sort(comparator);
    }

    @Override
    public final void Qe0() {
        KU kU = (KU) this;
        kU.tn0();
        super.Qe0();
    }

    @Override
    public final void fu0(int n) {
        KU kU = (KU) this;
        kU.tn0();
        super.fu0(n);
    }

    public final void tn0() {
        Object[] objectArray = this.PE0;
        if (this.PE0 != null) {
            Object[] objectArray2 = objectArray;
            objectArray = this.rZ;
            if (objectArray2 == this.rZ) {
                int n;
                Object[] objectArray3 = this.Dt;
                if (this.Dt != null && objectArray3.length >= (n = this.KB)) {
                    System.arraycopy(objectArray, 0, objectArray3, 0, n);
                    this.rZ = this.Dt;
                    this.Dt = null;
                } else {
                    this.lPt8(objectArray.length);
                }
                return;
            }
        }
    }
}

