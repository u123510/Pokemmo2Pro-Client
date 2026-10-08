/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.P1;
import f.fy_2;

/*
 * Renamed from f.cy
 */
public class TaskCallbackCy1
implements Runnable  {
    public final /* synthetic */ fy_2 fx;
    public final /* synthetic */ P1 xm0;

    public TaskCallbackCy1(P1 p1, fy_2 fy_22) {
        this.xm0 = p1;
        this.fx = fy_22;
    }

    @Override
    public final void run() {
        this.xm0.K20.u3(this.fx);
    }
}

