/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.jK
 */
public class TaskCallbackJk1
implements Runnable  {
    public final /* synthetic */ HV gN;

    public TaskCallbackJk1(HV hV) {
        this.gN = hV;
    }

    @Override
    public final void run() {
        LF0 lF0 = BU.T50.kx;
        zg0_2 zg0_23 = new zg0_2(this.gN);
        if (lF0.Eq == null) {
            LF0 lF02 = lF0;
            lF02.Eq = zg0_23;
            lF02.F9(lF02.fU(), zg0_23);
        }
    }
}

