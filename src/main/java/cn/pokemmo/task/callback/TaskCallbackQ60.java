/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackQ60
implements Runnable  {
    public final /* synthetic */ BU Zh0;

    public TaskCallbackQ60(BU bU) {
        this.Zh0 = bU;
    }

    @Override
    public final void run() {
        cx_0 cx_02 = this.Zh0.lB0;
        if (cx_02 != null) {
            ((jc_2)cx_02).update();
        }
        if ((cx_02 = this.Zh0.W10) != null) {
            ((Uo)cx_02).XH0();
            this.Zh0.W10.b5();
        }
    }
}

