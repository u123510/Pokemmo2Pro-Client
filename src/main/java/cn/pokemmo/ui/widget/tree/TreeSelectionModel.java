/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.tree;

import f.*;

import f.CG;
import f.li_2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TreeSelectionModel
extends CG {
    public final List wF;
    public boolean MH = false;

    public TreeSelectionModel(ArrayList object) {
        this.wF = object;
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            ((CG)iterator.next()).O50(this);
        }
        UZ uZ = (UZ) this;
        uZ.YX();
        li_2.HA0(uZ);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean Mt0() {
        Iterator iterator = this.wF.iterator();
        block2: while (iterator.hasNext()) {
            Object object = (CG)iterator.next();
            HashSet hashSet = ((CG)object).Qw;
            if (hashSet == null || hashSet.isEmpty()) continue;
            try {
                Iterator iterator2 = ((CG)object).Qw.iterator();
                do {
                    if (!iterator2.hasNext()) continue block2;
                } while (iterator2.next() == this);
                return true;
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                continue;
            }
        }
        return super.Mt0();
    }

    @Override
    public final long cOm2() {
        UZ uZ = (UZ) this;
        long l = uZ.Ik;
        for (Object object : uZ.wF) {
            CG cG = (CG)object;
            if (cG.cOm2() <= l) continue;
            l = cG.cOm2();
        }
        return l;
    }

    @Override
    public final void ji0() {
        if (this.MH) {
            return;
        }
        UZ uZ = (UZ) this;
        li_2.cx(uZ);
        uZ.MH = true;
        for (Object object : uZ.wF) {
            CG cG = (CG)object;
            cG.sI0(this);
            cG.ji0();
        }
    }
}
