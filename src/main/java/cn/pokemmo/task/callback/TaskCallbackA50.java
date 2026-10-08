/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.KG0;
import f.MD0;
import f.X6;
import f.dz_2;

/*
 * Renamed from f.a5
 */
public class TaskCallbackA50
implements Runnable  {
    public final /* synthetic */ X6 jo0;

    public TaskCallbackA50(X6 x6) {
        this.jo0 = x6;
    }

    @Override
    public final void run() {
        X6 x6 = this.jo0;
        KG0 kG0 = x6.M;
        MD0 mD0 = dz_2.H7;
        boolean bl = x6.Il.L1 || (x6.Wt.ER.mu0 & 1) != 0;
        kG0.j70(mD0, bl);
    }
}

