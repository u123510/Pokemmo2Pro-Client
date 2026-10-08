package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackOa2 implements Runnable  {
    public final bi0_1 gQ;
    public final short[] UV;
    public final zv_2 Ws0;
    public final DD nf;


    public TaskCallbackOa2(DD v1, bi0_1 v2, short[] v3, zv_2 v4) {
        this.nf = v1;
        this.gQ = v2;
        this.UV = v3;
        this.Ws0 = v4;
    }


    public final void run() {
        this.nf.Ql.lK[this.nf.lp].sC0(2, false, (gw_0) null);
        _finally.HG().dH0(new ZN((oa_2) this), 0.15f);
        float f0 = (float) (200 + nk_0.cC.h3 + nk_0.bO.h3) / 1000.0f;
        _finally.HG().dH0(new O0((oa_2) this), f0);
    }
}
