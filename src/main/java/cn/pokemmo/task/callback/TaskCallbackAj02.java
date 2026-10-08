/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.CH0;
import f.P1;
import f.dl0_0;
import f.fy_2;
import f.tw0_0;
import f.wn0_0;

/*
 * Renamed from f.aj0
 */
public class TaskCallbackAj02
implements Runnable  {
    public final /* synthetic */ fy_2 nUL;
    public final /* synthetic */ P1 l10;

    public TaskCallbackAj02(P1 p1, fy_2 fy_22) {
        this.l10 = p1;
        this.nUL = fy_22;
    }

    @Override
    public final void run() {
        TaskCallbackAj02 aj0_22 = this;
        Object object = aj0_22.l10;
        String string = ((wn0_0)((P1)object).Bv.dI0).YA.toString();
        object = ((P1)object).ee.WN;
        tw0_0.rl.fk0.uQ(new dl0_0((CH0)object, string));
        aj0_22.l10.Bv.Gv("");
        aj0_22.l10.K20.u3(this.nUL);
    }
}

