/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackTm0
implements Runnable  {
    public final /* synthetic */ Bn0 pw0;

    public TaskCallbackTm0(Bn0 bn0) {
        this.pw0 = bn0;
    }

    @Override
    public final void run() {
        Bn0 bn0 = this.pw0;
        byte by = -1;
        byte by2 = 0;
        BU bU = bn0.F50;
        Bn0 bn02 = bU.cOm1;
        if (bn02 != null) {
            bn02.xe0();
            bU.cOm1 = null;
        }
        tw0_0.rl.hB(bn0.bV, by, by2);
    }
}

