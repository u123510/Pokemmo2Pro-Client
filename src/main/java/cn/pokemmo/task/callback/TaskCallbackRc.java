/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackRc
implements Runnable  {
    public final /* synthetic */ lc_2 x6;

    public TaskCallbackRc(lc_2 lc_22) {
        this.x6 = lc_22;
    }

    @Override
    public final void run() {
        BU bU = BU.T50;
        boolean bl = bU.de0 == null;
        bU.RG0(null, bl, false);
        this.x6.f00();
    }
}

