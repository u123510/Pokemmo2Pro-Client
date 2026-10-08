/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.mf0
 */
public class TaskCallbackMf01
implements Runnable  {
    public final /* synthetic */ boolean X80;
    public final /* synthetic */ BU zm0;

    public TaskCallbackMf01(BU bU, boolean bl) {
        this.zm0 = bU;
        this.X80 = bl;
    }

    @Override
    public final void run() {
        ba0_2 ba0_22 = this.zm0.F7;
        if (ba0_22 != null) {
            ba0_22.xe0();
        }
        if (!this.X80) {
            return;
        }
        this.zm0.F7 = new ba0_2();
        BU bU = this.zm0;
        bU.SL(bU.F7);
    }
}

