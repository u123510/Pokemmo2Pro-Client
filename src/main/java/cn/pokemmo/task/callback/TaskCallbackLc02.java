/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.YP;
import f.le0_2;

/*
 * Renamed from f.lc0
 */
public class TaskCallbackLc02
implements Runnable  {
    public final /* synthetic */ YP QU;

    public TaskCallbackLc02(YP yP) {
        this.QU = yP;
    }

    @Override
    public final void run() {
        YP yP = this.QU;
        le0_2 le0_22 = yP.K20;
        if (le0_22 != null) {
            le0_22.u3(yP);
        }
    }
}

