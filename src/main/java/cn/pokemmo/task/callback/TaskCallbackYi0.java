/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.mt_1;

public class TaskCallbackYi0
implements Runnable  {
    public final /* synthetic */ mt_1 PO;

    public TaskCallbackYi0(mt_1 mt_12) {
        this.PO = mt_12;
    }

    @Override
    public final void run() {
        this.PO.gO(false);
    }
}

