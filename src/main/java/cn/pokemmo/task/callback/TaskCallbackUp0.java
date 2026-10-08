/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Dn0;

public class TaskCallbackUp0
implements Runnable  {
    public final /* synthetic */ Dn0 Ih0;

    public TaskCallbackUp0(Dn0 dn0) {
        this.Ih0 = dn0;
    }

    @Override
    public final void run() {
        this.Ih0.sf();
    }
}

