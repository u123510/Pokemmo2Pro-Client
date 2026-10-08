/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.lg_0;

public class TaskCallbackBx0
implements Runnable  {
    public final /* synthetic */ String k30;

    public TaskCallbackBx0(String string) {
        this.k30 = string;
    }

    @Override
    public final void run() {
        lg_0.lv0.Lf(this.k30);
    }
}

