/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.ug
 */
public class TaskCallbackUg2
implements Runnable  {
    public final /* synthetic */ le0_2 ry0;
    public final /* synthetic */ wl0_2 Tk;
    public final /* synthetic */ N1 Cv;

    public TaskCallbackUg2(le0_2 le0_22, wl0_2 wl0_22, N1 n1) {
        this.ry0 = le0_22;
        this.Tk = wl0_22;
        this.Cv = n1;
    }

    @Override
    public final void run() {
        TaskCallbackUg2 ug_22 = this;
        ug_22.ry0.Jj0 = this.Tk;
        ug_22.Cv.bT(gn_0.WHITE, 100);
        ug_22.Cv.so0 = (Runnable[])a7_0.tp0(this, ug_22.Cv.so0);
    }
}

