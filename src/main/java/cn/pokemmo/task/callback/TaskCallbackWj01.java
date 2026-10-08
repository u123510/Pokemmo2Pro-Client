/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.BR;
import f.VU;
import f._for;
import f.tw0_0;

/*
 * Renamed from f.wJ0
 */
public class TaskCallbackWj01
implements Runnable  {
    public final /* synthetic */ VU df0;

    public TaskCallbackWj01(VU vU) {
        this.df0 = vU;
    }

    @Override
    public final void run() {
        BR bR = tw0_0.rl;
        bR.getClass();
        byte by = 1;
        long l = this.df0.pu.Sa;
        bR.fk0.uQ(new _for(by, l));
    }
}

