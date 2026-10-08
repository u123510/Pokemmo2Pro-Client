/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.P1;
import f.fy_2;

/*
 * Renamed from f.oY
 */
public class TaskCallbackOy0
implements Runnable  {
    public final /* synthetic */ fy_2 Ok0;
    public final /* synthetic */ P1 kl0;

    public TaskCallbackOy0(P1 p1, fy_2 fy_22) {
        this.kl0 = p1;
        this.Ok0 = fy_22;
    }

    @Override
    public final void run() {
        if (this.kl0.K20.Dp(this.Ok0) < 0) {
            this.kl0.K20.SL(this.Ok0);
        }
    }
}

