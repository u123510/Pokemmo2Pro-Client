/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Qy0;
import f.le0_2;
import f.re_1;

/*
 * Renamed from f.ys0
 */
public class TaskCallbackYs00
implements Runnable  {
    @Override
    public final void run() {
        Qy0 qy0 = Qy0.yI0;
        int n = 4;
        le0_2 le0_22 = qy0.G30;
        if (le0_22 != null) {
            le0_22.xe0();
        }
        if (qy0.Ur0 == null) {
            Qy0 qy02 = qy0;
            re_1 re_12 = new re_1(qy0, n);
            qy02.Ur0 = re_12;
            qy02.F9(qy02.fU(), re_12);
        }
    }
}

