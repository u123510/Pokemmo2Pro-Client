/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Fy0;
import f.f90_0;

/*
 * Renamed from f.Ab0
 */
public class TaskCallbackAb00
implements Runnable  {
    public final /* synthetic */ int Bj;
    public final /* synthetic */ f90_0 vp0;

    public TaskCallbackAb00(f90_0 f90_02, int n) {
        this.vp0 = f90_02;
        this.Bj = n;
    }

    @Override
    public final void run() {
        int n = this.Bj;
        byte by = (byte)(Fy0.fG0 & ~(1 << n));
        if (this.vp0.qX[n].ER.U20()) {
            by = (byte)(by | 1 << this.Bj);
        }
        Fy0.fG0 = by;
    }
}

