/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.KB;
import f.bb0_2;

/*
 * Renamed from f.ya
 */
public class TaskCallbackYa2
implements bb0_2,
Runnable  {
    public int Y0;
    public final /* synthetic */ KB d30;

    public TaskCallbackYa2(KB kB) {
        this.d30 = kB;
    }

    @Override
    public final void oj() {
        this.Y0 = this.d30.VP;
    }

    @Override
    public final void Rw(int n, int n2) {
        KB kB = this.d30;
        if (kB.IW != 1) {
            n = n2;
        }
        TaskCallbackYa2 ya_22 = this;
        n = (kB.hm - kB.Uw) * n / kB.nb();
        int n3 = ya_22.d30.cOm7(this.Y0 + n);
        ya_22.d30.jd0(n3, true);
        ya_22.d30.QP = System.currentTimeMillis();
    }

    @Override
    public final void zR() {
    }

    @Override
    public final void run() {
        this.d30.Lo0(75);
    }
}

