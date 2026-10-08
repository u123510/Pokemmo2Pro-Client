/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Dn0;

/*
 * Renamed from f.mU
 */
public class TaskCallbackMu1
implements Runnable  {
    public final /* synthetic */ Dn0 at;

    public TaskCallbackMu1(Dn0 dn0) {
        this.at = dn0;
    }

    @Override
    public final void run() {
        this.at.sf();
    }
}

