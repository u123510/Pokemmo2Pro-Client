/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Qy0;
import f.a7_0;
import f.lpt6__0;

public class TaskCallbackJt0
implements Runnable  {
    public final /* synthetic */ Qy0 kt;

    public TaskCallbackJt0(Qy0 qy0) {
        this.kt = qy0;
    }

    @Override
    public final void run() {
        TaskCallbackJt0 jt0 = this;
        Qy0 qy0 = jt0.kt;
        qy0.Qw0(qy0.Tx);
        lpt6__0.v90(jt0.kt.Tx.Ke0);
        jt0.kt.Tx.z70.so0 = (Runnable[])a7_0.tp0(this, jt0.kt.Tx.z70.so0);
    }
}

