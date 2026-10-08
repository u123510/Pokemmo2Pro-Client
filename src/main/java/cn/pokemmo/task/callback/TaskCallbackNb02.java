/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.xn0_0;

/*
 * Renamed from f.nb0
 */
public class TaskCallbackNb02
implements Runnable  {
    public final /* synthetic */ xn0_0 RA;

    public TaskCallbackNb02(xn0_0 xn0_02) {
        this.RA = xn0_02;
    }

    @Override
    public final void run() {
        xn0_0 xn0_02 = this.RA;
        if (xn0_02.of0 == null) {
            xn0_02.qo();
        } else {
            xn0_02.Sn0();
        }
    }
}

