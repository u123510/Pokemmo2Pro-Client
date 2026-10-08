/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.Wc
 */
public class TaskCallbackWc0
implements Runnable  {
    public final /* synthetic */ BU oe0;

    public TaskCallbackWc0(BU bU) {
        this.oe0 = bU;
    }

    @Override
    public final void run() {
        this.oe0.zj.sr0(new lpt3__4(sm0_0.c0(1160), () -> {
            BR bR = tw0_0.rl;
            if (bR != null) {
                bR.m9();
            }
        }, null));
    }
}

