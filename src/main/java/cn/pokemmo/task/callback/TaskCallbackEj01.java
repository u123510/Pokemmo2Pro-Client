/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.cg_0;

/*
 * Renamed from f.eJ0
 */
public class TaskCallbackEj01
implements Runnable  {
    public final /* synthetic */ cg_0 or0;

    public TaskCallbackEj01(cg_0 cg_02) {
        this.or0 = cg_02;
    }

    @Override
    public final void run() {
        cg_0 cg_02 = this.or0;
        if (!cg_02.mK) {
            cg_02.mm("");
        }
    }
}

