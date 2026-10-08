/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.BR;
import f.Dm0;
import f.gc_0;
import f.kb0_0;
import f.tw0_0;

public class TaskCallbackYq
implements Runnable  {
    public final /* synthetic */ Dm0 qg0;
    public final /* synthetic */ gc_0 uN;

    public TaskCallbackYq(gc_0 gc_02, Dm0 dm0) {
        this.uN = gc_02;
        this.qg0 = dm0;
    }

    @Override
    public final void run() {
        Dm0 dm0 = this.qg0;
        byte by = dm0.c80;
        if (dm0.RU[by]) {
            return;
        }
        BR bR = tw0_0.rl;
        int n = this.uN.fz0.cx0;
        Dm0 dm02 = bR.bh;
        if (dm02 != null) {
            Dm0 dm03 = dm02;
            byte by2 = dm03.c80;
            if (dm03.hq0) {
                dm02.xp0[by2] = n;
                dm02.aUX = true;
            }
            bR.fk0.uQ(new kb0_0(n));
        }
    }
}

