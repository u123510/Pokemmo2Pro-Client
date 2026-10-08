/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.lg_0;

/*
 * Renamed from f.iv0
 */
public class TaskCallbackIv00
implements Runnable  {
    public final /* synthetic */ String xJ0;

    public TaskCallbackIv00(String string) {
        this.xJ0 = string;
    }

    @Override
    public final void run() {
        lg_0.lv0.Lf(this.xJ0);
    }
}

