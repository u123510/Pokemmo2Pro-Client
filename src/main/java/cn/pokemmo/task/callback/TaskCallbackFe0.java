/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Sy0;
import f.W9;
import f.vl_0;
import f.we0_0;
import f.wn0_0;

/*
 * Renamed from f.Fe
 */
public class TaskCallbackFe0
implements Runnable  {
    public final /* synthetic */ W9 iP;
    public final /* synthetic */ vl_0 fl;

    public TaskCallbackFe0(vl_0 vl_02, W9 w9) {
        this.fl = vl_02;
        this.iP = w9;
    }

    @Override
    public final void run() {
        we0_0 we0_02 = this.fl.jP;
        TaskCallbackFe0 fe_02 = this;
        boolean bl = fe_02.iP.ER.U20();
        String string = ((wn0_0)fe_02.fl.tI0.dI0).YA.toString();
        Sy0 sy0 = we0_02.U0;
        sy0.Tk = bl;
        sy0.Ae = string;
        we0_02.hk0();
        this.fl.rE0 = this.iP.ER.U20();
    }
}

