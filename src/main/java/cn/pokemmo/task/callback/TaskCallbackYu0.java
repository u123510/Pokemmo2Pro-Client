/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.COm8_;

public class TaskCallbackYu0
implements Runnable  {
    public final /* synthetic */ COm8_ Fa;

    public TaskCallbackYu0(COm8_ cOm8_) {
        this.Fa = cOm8_;
    }

    @Override
    public final void run() {
        this.Fa.ip.Gr0 ^= true;
    }
}

