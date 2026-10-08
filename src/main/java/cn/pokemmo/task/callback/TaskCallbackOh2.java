/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.ha0_0;

/*
 * Renamed from f.oh
 */
public class TaskCallbackOh2
implements Runnable  {
    public final /* synthetic */ ha0_0 Id0;

    public TaskCallbackOh2(ha0_0 ha0_02) {
        this.Id0 = ha0_02;
    }

    @Override
    public final void run() {
        this.Id0.COn(false);
    }
}

