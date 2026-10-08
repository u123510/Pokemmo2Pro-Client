/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackR9
implements Runnable  {
    public final /* synthetic */ BU Ga;

    public TaskCallbackR9(BU bU) {
        this.Ga = bU;
    }

    @Override
    public final void run() {
        this.Ga.We(false);
    }
}

