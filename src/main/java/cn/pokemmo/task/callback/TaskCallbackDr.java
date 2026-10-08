/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Qy0;
import f.o4;

public class TaskCallbackDr
implements Runnable  {
    public final /* synthetic */ Qy0 nP;
    public final /* synthetic */ o4 Xa;

    public TaskCallbackDr(o4 o42, Qy0 qy0) {
        this.Xa = o42;
        this.nP = qy0;
    }

    @Override
    public final void run() {
        TaskCallbackDr dR = this;
        dR.Xa.xe0();
        dR.nP.Bg();
    }
}

