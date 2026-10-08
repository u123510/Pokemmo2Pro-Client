/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

/*
 * Renamed from f.hN
 */
public class TaskCallbackHn1
implements Runnable  {
    public final /* synthetic */ vk0_1 e30;
    public final /* synthetic */ qj_2[] gj0;
    public final /* synthetic */ int mY;
    public final /* synthetic */ VU On0;
    public final /* synthetic */ ng_2 Yw;

    public TaskCallbackHn1(ng_2 ng_22, vk0_1 vk0_12, qj_2[] qj_2Array, int n, VU vU) {
        this.Yw = ng_22;
        this.e30 = vk0_12;
        this.gj0 = qj_2Array;
        this.mY = n;
        this.On0 = vU;
    }

    @Override
    public final void run() {
        Vt0 vt02 = new Vt0(sm0_0.c0(1412));
        int n = 0;
        while (n < 9) {
            int n2 = n + 1;
            at_0 at_02 = new at_0((String)sm0_0.wa0((int)1413, (String)new StringBuilder().append((int)n2).append((String)"").toString()));
            at_02.eu0 = new MH((hn_1) this, n);
            vt02.hx.add(at_02);
            n = n2;
        }
        qj_2 qj_22 = this.gj0[this.mY];
        int n3 = qj_22.A20;
        UA.rL(vt02, this.Yw, n3, qj_22.SB0);
    }
}

