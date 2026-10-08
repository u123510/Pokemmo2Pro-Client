/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Ju0;
import f.xn0_0;

public class TaskCallbackCe0
implements Runnable  {
    public final /* synthetic */ xn0_0 oG0;
    public final /* synthetic */ Ju0 ZB0;

    public TaskCallbackCe0(Ju0 ju0, xn0_0 xn0_02) {
        this.ZB0 = ju0;
        this.oG0 = xn0_02;
    }

    @Override
    public final void run() {
        this.oG0.u3(this.ZB0);
    }
}

