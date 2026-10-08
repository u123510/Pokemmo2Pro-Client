/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.P8;

/*
 * Renamed from f.yF0
 */
public class TaskCallbackYf01
implements Runnable  {
    public final int xU;
    public final /* synthetic */ P8 re;

    public TaskCallbackYf01(P8 p8, int n) {
        this.re = p8;
        this.xU = n;
    }

    @Override
    public final void run() {
        P8 p8 = this.re;
        int n = Math.max(1, p8.e4.Mx / 10) * this.xU;
        p8.ad0(p8.DK0 + n);
    }
}

