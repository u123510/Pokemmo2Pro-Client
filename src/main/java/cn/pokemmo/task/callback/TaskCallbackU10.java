/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.a7_0;
import f.tq_0;

/*
 * Renamed from f.u1
 */
public class TaskCallbackU10
implements Runnable  {
    public final /* synthetic */ tq_0 v0;

    public TaskCallbackU10(tq_0 tq_02) {
        this.v0 = tq_02;
    }

    @Override
    public final void run() {
        tq_0 tq_02 = this.v0;
        boolean bl = tq_02.jY.getValue() ^ tq_02.Xe0;
        if (bl != tq_02.U20()) {
            tq_0 tq_03 = tq_02;
            tq_03.lv(256, bl);
            a7_0.bH(tq_03.xv0);
        }
    }
}

