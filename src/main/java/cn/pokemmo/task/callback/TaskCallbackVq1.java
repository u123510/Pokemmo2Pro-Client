/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.W9;
import f.my0;
import f.xn0_0;

/*
 * Renamed from f.vQ
 */
public class TaskCallbackVq1
implements Runnable  {
    public final /* synthetic */ xn0_0 fs0;

    public TaskCallbackVq1(xn0_0 xn0_02) {
        this.fs0 = xn0_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void run() {
        boolean bl;
        W9 w9;
        xn0_0 xn0_02 = this.fs0;
        my0 my02 = xn0_02.Pg;
        if (my02 == null) {
            TaskCallbackVq1 vq_12 = this;
            xn0_02.Pg = new my0(this.fs0);
            xn0_0 xn0_03 = vq_12.fs0;
            xn0_03.SL(xn0_03.Pg);
            w9 = vq_12.fs0.cu;
            bl = true;
        } else {
            xn0_02.u3(my02);
            w9 = this.fs0.cu;
            bl = false;
        }
        w9.ER.lK0(bl);
        this.fs0.f00();
    }
}

