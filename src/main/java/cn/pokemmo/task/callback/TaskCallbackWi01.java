/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.K5;
import f.qf0_1;

/*
 * Renamed from f.wi0
 */
public class TaskCallbackWi01
implements Runnable  {
    public final /* synthetic */ K5 coM5;
    public final /* synthetic */ qf0_1 Da0;

    public TaskCallbackWi01(qf0_1 qf0_12, K5 k5) {
        this.Da0 = qf0_12;
        this.coM5 = k5;
    }

    @Override
    public final void run() {
        this.Da0.qa0.UR(this.coM5);
    }
}

