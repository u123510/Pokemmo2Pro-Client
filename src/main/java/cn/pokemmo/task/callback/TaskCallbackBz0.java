/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackBz0
implements Runnable  {
    public final /* synthetic */ hj0_2 nm;
    public final /* synthetic */ ig0_2 Z8;

    public TaskCallbackBz0(ig0_2 ig0_22, hj0_2 hj0_22) {
        this.Z8 = ig0_22;
        this.nm = hj0_22;
    }

    @Override
    public final void run() {
        ig0_2 ig0_22 = this.Z8;
        byte by = this.nm.uH0;
        BU.T50.se(false, ig0_22.UR, false, null, null);
        tw0_0.rl.ze0(ig0_22.UR, by);
    }
}

