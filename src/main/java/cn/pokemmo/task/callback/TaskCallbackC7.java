/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.BR;
import f.EV;
import f.OU;
import f.tw0_0;
import f.wn0_0;

public class TaskCallbackC7
implements Runnable  {
    public final /* synthetic */ OU Qb0;

    public TaskCallbackC7(OU oU) {
        this.Qb0 = oU;
    }

    @Override
    public final void run() {
        OU oU = this.Qb0;
        String string = ((wn0_0)oU.Cz0.dI0).YA.toString();
        if (!oU.RP) {
            oU.RP = true;
            if (!oU.Qq0.Ms0) {
                BR bR = tw0_0.rl;
                byte by = oU.gB0;
                BR bR2 = bR;
                bR2.NF0.TY.ng0();
                bR2.fk0.uQ(new EV(by, string));
            }
            if (!oU.Qq0.qP) {
                oU.wQ();
            }
        }
    }
}

