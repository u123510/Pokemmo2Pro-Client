/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.d50_0;

public class TaskCallbackBl
implements Runnable  {
    public final d50_0 vi;

    public TaskCallbackBl(d50_0 d50_02) {
        this.vi = d50_02;
    }

    @Override
    public final void run() {
        this.vi.dg0();
    }
}

