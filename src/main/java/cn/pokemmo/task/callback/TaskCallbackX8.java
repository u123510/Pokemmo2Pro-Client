/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.le0_2;
import f.qj_0;
import f.zk0_1;

public class TaskCallbackX8
implements Runnable  {
    public final /* synthetic */ le0_2 kz;
    public final /* synthetic */ zk0_1 i90;

    public TaskCallbackX8(zk0_1 zk0_12, le0_2 le0_22) {
        this.i90 = zk0_12;
        this.kz = le0_22;
    }

    @Override
    public final void run() {
        zk0_1 zk0_12 = this.i90;
        le0_2 le0_22 = this.kz;
        zk0_12.getClass();
        if (le0_22 instanceof qj_0) {
            zk0_12.TD((qj_0)le0_22);
        }
        TaskCallbackX8 x8 = this;
        zk0_12 = x8.i90;
        le0_22 = x8.kz;
        int n = zk0_12.fU() - 2;
        while (true) {
            int n2 = n;
            n = n2 + -1;
            if (n2 <= 1) break;
            qj_0 qj_02 = (qj_0)zk0_12.qA(n);
            le0_2 le0_23 = qj_02.LI0;
            while (le0_23 != null && le0_23 != le0_22) {
                le0_23 = le0_23.K20;
            }
            if (le0_23 != le0_22) continue;
            zk0_12.TD(qj_02);
        }
        this.i90.wP(this.kz);
    }
}

