/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.COm8_;

/*
 * Renamed from f.ea
 */
public class TaskCallbackEa2
implements Runnable  {
    public final /* synthetic */ COm8_ w70;

    public TaskCallbackEa2(COm8_ cOm8_) {
        this.w70 = cOm8_;
    }

    @Override
    public final void run() {
        this.w70.pG0 = (byte)Math.max(0, this.w70.pG0 - 1);
    }
}

