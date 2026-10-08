/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.jA
 */
public class TaskCallbackJa1
implements Runnable  {
    public final /* synthetic */ lc_2 wM;

    public TaskCallbackJa1(lc_2 lc_22) {
        this.wM = lc_22;
    }

    @Override
    public final void run() {
        a10_0 a10_02;
        if (BU.T50.lB0 == null && (a10_02 = tw0_0.PK0) != null && !a10_02.a40) {
            Qy0.yI0.dk(-1, sm0_0.c0(6002));
            return;
        }
        BU.T50.Zl0();
        this.wM.f00();
    }
}

