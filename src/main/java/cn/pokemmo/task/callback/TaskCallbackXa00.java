/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Qy0;
import f.a7_0;

/*
 * Renamed from f.Xa0
 */
public class TaskCallbackXa00
implements Runnable  {
    public final /* synthetic */ Qy0 iK0;

    public TaskCallbackXa00(Qy0 qy0) {
        this.iK0 = qy0;
    }

    @Override
    public final void run() {
        TaskCallbackXa00 xa0_02 = this;
        xa0_02.iK0.Tx.Ll(false);
        xa0_02.iK0.Tx.z70.so0 = (Runnable[])a7_0.tp0(this, xa0_02.iK0.Tx.z70.so0);
    }
}

