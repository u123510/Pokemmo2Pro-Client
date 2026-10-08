/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackU3
implements Runnable  {
    public final /* synthetic */ BU J5;

    public TaskCallbackU3(BU bU) {
        this.J5 = bU;
    }

    @Override
    public final void run() {
        this.J5.We(true);
    }
}

