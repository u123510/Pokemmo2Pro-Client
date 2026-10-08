/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackTg
implements Runnable  {
    public final /* synthetic */ int lb;
    public final /* synthetic */ boolean a20;
    public final /* synthetic */ MV Hs;
    public final /* synthetic */ pe0_2 Ci;

    public TaskCallbackTg(pe0_2 pe0_22, int n, boolean bl, MV mV) {
        this.Ci = pe0_22;
        this.lb = n;
        this.a20 = bl;
        this.Hs = mV;
    }

    @Override
    public final void run() {
        int n = this.lb;
        if (n == 100) {
            if (this.a20) {
                Qy0.yI0.dk(-1, sm0_0.c0(270303));
                return;
            }
            Ge0.Vv0 = 1;
            Ge0.Fu0 = this.Hs.KZ.coM3;
        }
        if (n == 102) {
            if (this.a20) {
                Qy0.yI0.dk(-1, sm0_0.c0(270308).replace("|br|", "\n"));
                return;
            }
            pe0_2 pe0_22 = this.Ci;
            pe0_22.zh0 = pe0_22.Ub;
            pe0_22.PY = this.Hs;
            pe0_22.Ub = 3;
            pe0_22.rr0();
        }
    }
}

