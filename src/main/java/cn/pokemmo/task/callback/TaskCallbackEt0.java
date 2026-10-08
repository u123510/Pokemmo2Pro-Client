/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.LT;
import f.Q1;

public class TaskCallbackEt0
implements Runnable  {
    public final /* synthetic */ LT te;
    public final /* synthetic */ Q1 tu;

    public TaskCallbackEt0(Q1 q1, LT lT) {
        this.tu = q1;
        this.te = lT;
    }

    @Override
    public final void run() {
        Q1.Wt(this.tu, this.te);
    }
}

