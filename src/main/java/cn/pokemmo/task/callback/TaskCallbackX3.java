/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.ge_0;

public class TaskCallbackX3
implements Runnable  {
    public final /* synthetic */ ge_0 pa;

    public TaskCallbackX3(ge_0 ge_02) {
        this.pa = ge_02;
    }

    @Override
    public final void run() {
        this.pa.vA = true;
        this.pa.RP = null;
        this.pa.COm3();
    }
}

