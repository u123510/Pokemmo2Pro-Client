/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.cj0
 */
public class TaskCallbackCj01
implements Runnable  {
    public final /* synthetic */ HX RT;

    public TaskCallbackCj01(HX hX) {
        this.RT = hX;
    }

    @Override
    public final void run() {
        HX hX = this.RT;
        BU bU = hX.Qb0;
        HX hX2 = bU.Cs0;
        if (hX2 != null) {
            hX2.xe0();
            bU.Cs0 = null;
        }
        tw0_0.rl.ze0(hX.eL, (byte)(hX.Hh.length + 1));
    }
}

