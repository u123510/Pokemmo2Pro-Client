/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.LF0;

public class TaskCallbackO1
implements Runnable  {
    public final /* synthetic */ LF0 zT;

    public TaskCallbackO1(LF0 lF0) {
        this.zT = lF0;
    }

    @Override
    public final void run() {
        this.zT.update();
    }
}

