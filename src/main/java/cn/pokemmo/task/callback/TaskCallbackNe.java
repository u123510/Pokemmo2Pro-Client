/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.pe0_2;

public class TaskCallbackNe
implements Runnable  {
    public final /* synthetic */ int gh0;
    public final /* synthetic */ pe0_2 Gv;

    public TaskCallbackNe(pe0_2 pe0_22, int n) {
        this.Gv = pe0_22;
        this.gh0 = n;
    }

    @Override
    public final void run() {
        this.Gv.Ub = this.gh0;
        this.Gv.rr0();
    }
}

