/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.y80
 */
public class TaskCallbackY800
implements Runnable  {
    public final /* synthetic */ BU xI;

    public TaskCallbackY800(BU bU) {
        this.xI = bU;
    }

    @Override
    public final void run() {
        BU bU = this.xI;
        XH xH = bU.BK;
        boolean bl = xH.eE;
        xH.Ll(bl ^ true);
        bU.W3.Ll(bl);
        bU.Qw0(bU.BK);
    }
}

