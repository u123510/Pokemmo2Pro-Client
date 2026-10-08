/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackLl
implements Runnable  {
    public final /* synthetic */ BU rJ0;
    public final /* synthetic */ ur_2 kB0;

    public TaskCallbackLl(ur_2 ur_22, BU bU) {
        this.kB0 = ur_22;
        this.rJ0 = bU;
    }

    @Override
    public final void run() {
        ur_2 ur_22 = this.kB0;
        if (ur_22.os0 == 0 && ur_22.Cs == 0) {
            this.rJ0.U0(false);
            tw0_0.rl.Kv0(GI0.lN, (byte)-1);
        }
    }
}

