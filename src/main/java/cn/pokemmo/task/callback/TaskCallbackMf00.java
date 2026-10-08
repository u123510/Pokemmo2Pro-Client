/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.fn_0;
import f.wi0_0;

/*
 * Renamed from f.mF0
 */
public class TaskCallbackMf00
implements Runnable  {
    public final /* synthetic */ String tx;

    public TaskCallbackMf00(String string) {
        this.tx = string;
    }

    @Override
    public final void run() {
        try {
            fn_0.qz0().G40(this.tx);
        }
        catch (Exception exception) {
            wi0_0.ME0.error("Error loading language images", exception);
        }
    }
}

