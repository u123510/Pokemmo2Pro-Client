/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.cb0_1;

/*
 * Renamed from f.vw
 */
public class TaskCallbackVw2
implements Runnable  {
    public final /* synthetic */ cb0_1 L70;

    public TaskCallbackVw2(cb0_1 cb0_12) {
        this.L70 = cb0_12;
    }

    @Override
    public final void run() {
        if (this.L70.Z60.Bb() == 1) {
            this.L70.U30(true);
        }
    }
}

