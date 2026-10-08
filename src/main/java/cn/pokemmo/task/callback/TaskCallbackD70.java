/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.My;
import f.tw0_0;
import f.wn0_0;
import f.y0_0;

public class TaskCallbackD70
implements Runnable  {
    public final /* synthetic */ y0_0 gF;

    public TaskCallbackD70(y0_0 y0_02) {
        this.gF = y0_02;
    }

    @Override
    public final void run() {
        String string = ((wn0_0)this.gF.Ti.dI0).YA.toString();
        tw0_0.rl.fk0.uQ(new My(string));
    }
}

