/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.ez
 */
public class TaskCallbackEz2
implements Runnable  {
    public final /* synthetic */ BU fU;

    public TaskCallbackEz2(BU bU) {
        this.fU = bU;
    }

    @Override
    public final void run() {
        BU bU = this.fU;
        zs_2 zs_22 = bU.Mr;
        if (zs_22 != null) {
            zs_22.xe0();
            bU.Mr = null;
        } else {
            zs_22 = new zs_2(bU);
            bU.Mr = zs_22;
            bU.SL(zs_22);
            bU.Mr.lt0();
            bU.Mr.vf(pa0_0.Ol);
        }
    }
}

