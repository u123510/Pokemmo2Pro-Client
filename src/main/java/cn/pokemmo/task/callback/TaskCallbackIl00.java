/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.ii0_2;
import f.jk_0;
import f.lpt5__5;

/*
 * Renamed from f.Il0
 */
public class TaskCallbackIl00
implements Runnable  {
    public final /* synthetic */ int b9;
    public final /* synthetic */ int Ph;
    public final /* synthetic */ ii0_2 t60;

    public TaskCallbackIl00(ii0_2 ii0_22, int n, int n2) {
        this.t60 = ii0_22;
        this.b9 = n;
        this.Ph = n2;
    }

    @Override
    public final void run() {
        ii0_2 ii0_22 = this.t60;
        jk_0 jk_02 = ii0_22.tU;
        int n = jk_02.yJ;
        int n2 = this.b9;
        if (n >= n2) {
            ii0_22.nE0 = false;
            return;
        }
        int n3 = this.Ph;
        if ((n += n3) >= n2) {
            jk_02.yJ = n2;
            ii0_22.nE0 = false;
            return;
        }
        jk_02.yJ = n;
        ii0_22.nE0 = true;
        lpt5__5.hL.ZD(new il0_0(ii0_22, n2, n3), 20);
    }
}

