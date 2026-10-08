/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.LT;
import f.Q1;

/*
 * Renamed from f.ad0
 */
public class TaskCallbackAd01
implements Runnable  {
    public final /* synthetic */ LT Pc;
    public final /* synthetic */ Q1 wF0;

    public TaskCallbackAd01(Q1 q1, LT lT) {
        this.wF0 = q1;
        this.Pc = lT;
    }

    @Override
    public final void run() {
        Q1.Wt(this.wF0, this.Pc);
    }
}

