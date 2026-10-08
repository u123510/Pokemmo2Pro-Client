/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.dr_1;

public class TaskCallbackFm
implements Runnable  {
    public final /* synthetic */ dr_1 KC;

    public TaskCallbackFm(dr_1 dr_12) {
        this.KC = dr_12;
    }

    @Override
    public final void run() {
        this.KC.gW();
    }
}

