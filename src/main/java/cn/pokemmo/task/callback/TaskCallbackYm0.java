/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.cb0_1;

/*
 * Renamed from f.Ym
 */
public class TaskCallbackYm0
implements Runnable  {
    public final /* synthetic */ cb0_1 dw0;

    public TaskCallbackYm0(cb0_1 cb0_12) {
        this.dw0 = cb0_12;
    }

    @Override
    public final void run() {
        if (this.dw0.Z60.Bb() == 0) {
            this.dw0.U30(false);
        }
    }
}

