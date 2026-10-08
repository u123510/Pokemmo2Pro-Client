/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.COm8_;

public class TaskCallbackFl
implements Runnable  {
    public final /* synthetic */ COm8_ t80;

    public TaskCallbackFl(COm8_ cOm8_) {
        this.t80 = cOm8_;
    }

    @Override
    public final void run() {
        this.t80.pG0 = (byte)Math.min(11, this.t80.pG0 + 1);
    }
}

