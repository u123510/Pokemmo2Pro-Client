/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Ay0;

public class TaskCallbackZx
implements Runnable  {
    public final /* synthetic */ Ay0 vD0;

    public TaskCallbackZx(Ay0 ay0) {
        this.vD0 = ay0;
    }

    @Override
    public final void run() {
        this.vD0.aux();
    }
}

