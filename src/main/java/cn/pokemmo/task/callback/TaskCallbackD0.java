/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.BR;
import f.Mm;
import f.Qx0;
import f.ez_1;
import f.le0_2;
import f.px0_0;
import f.tw0_0;

public class TaskCallbackD0
implements Runnable  {
    public final /* synthetic */ Qx0 xY;

    public TaskCallbackD0(Qx0 qx0) {
        this.xY = qx0;
    }

    @Override
    public final void run() {
        ez_1 ez_12 = this.xY.lo0;
        Object object = ez_12.K20;
        if (object == null) {
            return;
        }
        ((le0_2)object).u3(ez_12);
        BR bR = tw0_0.rl;
        Qx0 qx0 = this.xY;
        short s = qx0.GK0.XH0.Z8;
        short s2 = 1;
        object = qx0.lo0.Lpt3;
        byte by = ((Mm)object).QA0[((Mm)object).zJ.iL];
        bR.fk0.uQ(new px0_0(by, s, s2));
    }
}
