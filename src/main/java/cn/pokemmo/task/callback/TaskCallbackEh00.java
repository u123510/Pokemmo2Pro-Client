/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.W9;
import f.lpt3__1;
import f.xn0_0;

/*
 * Renamed from f.eH0
 */
public class TaskCallbackEh00
implements Runnable  {
    public final /* synthetic */ xn0_0 Xv;

    public TaskCallbackEh00(xn0_0 xn0_02) {
        this.Xv = xn0_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void run() {
        boolean bl;
        W9 w9;
        this.Xv.f00();
        if (lpt3__1.rm0 == 0) {
            lpt3__1.rm0 = 450;
            w9 = this.Xv.bI0;
            bl = true;
        } else {
            lpt3__1.rm0 = 0;
            w9 = this.Xv.bI0;
            bl = false;
        }
        w9.ER.lK0(bl);
    }
}

