/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.aJ0
 */
public class TaskCallbackAj01
implements Runnable  {
    public final /* synthetic */ lc_2 F9;

    public TaskCallbackAj01(lc_2 lc_22) {
        this.F9 = lc_22;
    }

    @Override
    public final void run() {
        BU bU = BU.T50;
        boolean bl = bU.Xf0 == null;
        bU.U1(null, bl, false);
        this.F9.f00();
    }
}

