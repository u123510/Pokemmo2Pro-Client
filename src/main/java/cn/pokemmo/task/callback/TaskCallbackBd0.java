/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.H50;
import f.W9;
import f.xn0_0;

public class TaskCallbackBd0
implements Runnable  {
    public final /* synthetic */ xn0_0 ri;

    public TaskCallbackBd0(xn0_0 xn0_02) {
        this.ri = xn0_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void run() {
        boolean bl;
        W9 w9;
        xn0_0 xn0_02 = this.ri;
        H50 h50 = xn0_02.kT;
        if (h50 == null) {
            TaskCallbackBd0 bD0 = this;
            xn0_02.kT = new H50(this.ri);
            xn0_0 xn0_03 = bD0.ri;
            xn0_03.SL(xn0_03.kT);
            w9 = bD0.ri.NX;
            bl = true;
        } else {
            xn0_02.u3(h50);
            w9 = this.ri.NX;
            bl = false;
        }
        w9.ER.lK0(bl);
        this.ri.f00();
    }
}

