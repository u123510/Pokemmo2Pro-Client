/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackDk
implements Runnable  {
    public final /* synthetic */ short lD;
    public final /* synthetic */ es_2 jG0;

    public TaskCallbackDk(es_2 es_22, short s) {
        this.jG0 = es_22;
        this.lD = s;
    }

    @Override
    public final void run() {
        TaskCallbackDk dk = this;
        BR bR = tw0_0.rl;
        boolean bl = true;
        short s = dk.lD;
        bR.fk0.uQ(new Y8(s, bl));
        dk.jG0.getClass();
        BU.T50.lo(false);
    }
}
