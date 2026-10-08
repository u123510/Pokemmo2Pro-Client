/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Qy0;
import f.o4;

public class TaskCallbackUk0
implements Runnable  {
    public final /* synthetic */ Qy0 Kz;
    public final /* synthetic */ o4 nL;

    public TaskCallbackUk0(o4 o42, Qy0 qy0) {
        this.nL = o42;
        this.Kz = qy0;
    }

    @Override
    public final void run() {
        TaskCallbackUk0 uK0 = this;
        uK0.nL.xe0();
        uK0.Kz.zK0.We(true);
    }
}

