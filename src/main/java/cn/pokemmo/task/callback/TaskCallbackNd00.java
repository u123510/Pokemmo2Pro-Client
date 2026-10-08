/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Qy0;
import f.XI;
import f.lg_0;
import f.lpt3__1;
import f.lpt3__4;
import f.o4;
import f.sm0_0;

/*
 * Renamed from f.Nd0
 */
public class TaskCallbackNd00
implements Runnable  {
    public final /* synthetic */ o4 ry0;

    public TaskCallbackNd00(o4 o42) {
        this.ry0 = o42;
    }

    @Override
    public final void run() {
        if (lpt3__1.zC) {
            lg_0.k.T0 = false;
            return;
        }
        this.ry0.xe0();
        Qy0.yI0.sr0(new lpt3__4(sm0_0.c0(1115), new XI(), null));
    }
}

