/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.cl0_1;

public class TaskCallbackS90
implements Runnable  {
    public final /* synthetic */ short[] YJ0;
    public final /* synthetic */ cl0_1 VP;

    public TaskCallbackS90(cl0_1 cl0_12, short[] sArray) {
        this.VP = cl0_12;
        this.YJ0 = sArray;
    }

    @Override
    public final void run() {
        this.VP.sn0(this.YJ0);
    }
}

