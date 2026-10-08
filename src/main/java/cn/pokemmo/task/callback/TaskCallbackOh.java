/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.L5;
import f.PF;
import f.b30_0;
import f.lpt6__0;

public class TaskCallbackOh
implements Runnable  {
    public final /* synthetic */ L5 Jh;

    public TaskCallbackOh(L5 l5) {
        this.Jh = l5;
    }

    @Override
    public final void run() {
        int n;
        L5 l5 = this.Jh;
        b30_0 b30_02 = l5.xT;
        if (b30_02 == null) {
            return;
        }
        b30_0 b30_03 = b30_02;
        byte by = b30_03.Pp0;
        PF pF = l5.MC.Ce(by, b30_03.B6);
        if (pF == null) {
            return;
        }
        TaskCallbackOh oH = this;
        oH.Jh.Zo();
        oH.Jh.r60(pF);
        oH.Jh.Be.Ll(true);
        L5 l52 = oH.Jh;
        l52.Bl0(l52.iQ, 2, false, true);
        L5 l53 = oH.Jh;
        l53.tG0 = n = l53.J[b30_02.B6];
        lpt6__0.v90(l53.iQ[n]);
    }
}

