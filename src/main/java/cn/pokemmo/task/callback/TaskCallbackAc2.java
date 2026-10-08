/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.ac
 */
public class TaskCallbackAc2
implements Runnable  {
    public final /* synthetic */ HV X8;

    public TaskCallbackAc2(HV hV) {
        this.X8 = hV;
    }

    @Override
    public final void run() {
        LF0 lF0 = BU.T50.kx;
        l80_0 l80_02 = new l80_0(this.X8);
        if (lF0.Eq == null) {
            lF0.Eq = l80_02;
            lF0.F9(lF0.fU(), l80_02);
        }
    }
}

