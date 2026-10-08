/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.LT;
import f.Q1;

public class TaskCallbackZ
implements Runnable  {
    public final /* synthetic */ LT d2;
    public final /* synthetic */ Q1 jG0;

    public TaskCallbackZ(Q1 q1, LT lT) {
        this.jG0 = q1;
        this.d2 = lT;
    }

    @Override
    public final void run() {
        Q1.Wt(this.jG0, this.d2);
    }
}

