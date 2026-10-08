/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.ck
 */
public class TaskCallbackCk2
implements Runnable  {
    public final /* synthetic */ VU Zx;
    public final /* synthetic */ BU VI0;

    public TaskCallbackCk2(BU bU, VU vU) {
        this.VI0 = bU;
        this.Zx = vU;
    }

    @Override
    public final void run() {
        Object object = this.Zx.pu;
        if ((object = (ng_2)this.VI0.n4.get(object)) == null) {
            return;
        }
        Object object2 = object;
        boolean bl = ((le0_2)object).Of();
        BU bU = this.VI0;
        bU.xK = ((le0_2)object).A20;
        bU.S30 = ((le0_2)object).SB0;
        object = ((ng_2)object2).Z5;
        ((le0_2)object2).xe0();
        ng_2 ng_23 = new ng_2(this.VI0, this.Zx, (qo_1)object, bl, true);
        if (!tw0_0.kz0()) {
            BU bU3 = this.VI0;
            int n = bU3.xK;
            ng_23.E40(n, bU3.S30);
        }
        TaskCallbackCk2 ck_23 = this;
        ck_23.VI0.n4.put(this.Zx.pu, ng_23);
        ck_23.VI0.SL(ng_23);
    }
}

