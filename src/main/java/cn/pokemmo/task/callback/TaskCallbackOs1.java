/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.LT;
import f.Q1;

/*
 * Renamed from f.oS
 */
public class TaskCallbackOs1
implements Runnable  {
    public final /* synthetic */ LT eK0;
    public final /* synthetic */ Q1 uN;

    public TaskCallbackOs1(Q1 q1, LT lT) {
        this.uN = q1;
        this.eK0 = lT;
    }

    @Override
    public final void run() {
        Q1.Wt(this.uN, this.eK0);
    }
}

