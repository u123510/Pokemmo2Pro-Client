/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.f90_0;
import f.xn0_0;

/*
 * Renamed from f.vE
 */
public class TaskCallbackVe1
implements Runnable  {
    public final /* synthetic */ xn0_0 cH;
    public final /* synthetic */ f90_0 lE0;

    public TaskCallbackVe1(f90_0 f90_02, xn0_0 xn0_02) {
        this.lE0 = f90_02;
        this.cH = xn0_02;
    }

    @Override
    public final void run() {
        this.cH.u3(this.lE0);
    }
}

