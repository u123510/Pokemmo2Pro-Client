/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.BR;
import f.Qy0;
import f.lpt3__4;
import f.o4;
import f.sm0_0;
import f.tw0_0;

/*
 * Renamed from f.v0
 */
public class TaskCallbackV00
implements Runnable  {
    public final /* synthetic */ o4 Ds0;

    public TaskCallbackV00(o4 o42) {
        this.Ds0 = o42;
    }

    @Override
    public final void run() {
        this.Ds0.xe0();
        Qy0.yI0.sr0(new lpt3__4(sm0_0.c0(1160), () -> {
            BR bR = tw0_0.rl;
            if (bR != null) {
                bR.m9();
            }
        }, null));
    }
}

