/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.ue0
 */
public class TaskCallbackUe02
implements Runnable  {
    public final /* synthetic */ BU mB0;

    public TaskCallbackUe02(BU bU) {
        this.mB0 = bU;
    }

    @Override
    public final void run() {
        this.mB0.cx(false);
    }
}

