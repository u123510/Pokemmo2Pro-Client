/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.nq_1;

/*
 * Renamed from f.Rb0
 */
public class TaskCallbackRb00
implements Runnable  {
    public final /* synthetic */ nq_1 Zx;

    public TaskCallbackRb00(nq_1 nq_12) {
        this.Zx = nq_12;
    }

    @Override
    public final void run() {
        nq_1.jz(this.Zx);
    }
}

