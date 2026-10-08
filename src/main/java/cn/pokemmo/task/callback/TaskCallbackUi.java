/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.GR;
import f.Qy0;
import f.UA;
import f.xe_1;

public class TaskCallbackUi
implements Runnable  {
    public final /* synthetic */ GR nv;
    public final /* synthetic */ xe_1 gl0;

    public TaskCallbackUi(GR gR, xe_1 xe_12) {
        this.nv = gR;
        this.gl0 = xe_12;
    }

    @Override
    public final void run() {
        TaskCallbackUi uI = this;
        String string = uI.nv.QB0.DR;
        xe_1 xe_12 = uI.gl0;
        int n = xe_12.A20;
        xe_1 xe_13 = this.gl0;
        int n2 = xe_13.A20;
        UA.rL(Qy0.yI0.KC(n, xe_12.SB0, string), xe_13, n2, xe_13.SB0);
    }
}

