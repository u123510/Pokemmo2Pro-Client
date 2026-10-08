/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.k10_0;

public class TaskCallbackVa
implements Runnable  {
    public final /* synthetic */ k10_0 O40;

    public TaskCallbackVa(k10_0 k10_02) {
        this.O40 = k10_02;
    }

    @Override
    public final void run() {
        this.O40.sr0().ze0(this.O40.ER, (byte)0);
    }
}

