/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackK80
implements Runnable  {
    public final /* synthetic */ lc_2 KN;

    public TaskCallbackK80(lc_2 lc_22) {
        this.KN = lc_22;
    }

    @Override
    public final void run() {
        if (!h50_0.Bj0) {
            Qy0.yI0.dk(-1, sm0_0.c0(3017));
            return;
        }
        BU.T50.cx(true);
        this.KN.f00();
    }
}

