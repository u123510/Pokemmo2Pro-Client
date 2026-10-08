/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.H6;
import f.tw0_0;
import f.y0_0;

public class TaskCallbackEs
implements Runnable  {
    public final /* synthetic */ int dH;
    public final /* synthetic */ y0_0 E80;

    public TaskCallbackEs(y0_0 y0_02, int n) {
        this.E80 = y0_02;
        this.dH = n;
    }

    @Override
    public final void run() {
        String string = this.E80.Cu0[this.dH].So;
        tw0_0.rl.fk0.uQ(new H6(string));
    }
}

