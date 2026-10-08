/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.le0_2;
import f.my0;
import f.xn0_0;

/*
 * Renamed from f.jU
 */
public class TaskCallbackJu1
implements Runnable  {
    public final /* synthetic */ le0_2 yb;
    public final /* synthetic */ my0 ZD0;

    public TaskCallbackJu1(my0 my02, xn0_0 xn0_02) {
        this.ZD0 = my02;
        this.yb = xn0_02;
    }

    @Override
    public final void run() {
        this.yb.u3(this.ZD0);
    }
}

