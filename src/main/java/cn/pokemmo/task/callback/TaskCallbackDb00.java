package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackDb00 implements Runnable  {
    public final vd_1 N40;
    public final int Lpt9;
    public final Sz0 Rr0;
    public final String E2;

    public TaskCallbackDb00(vd_1 v1, int i2, Sz0 v3, String v4) {
        this.N40 = v1;
        this.Lpt9 = i2;
        this.Rr0 = v3;
        this.E2 = v4;
    }

    public final void run() {
        WA wa = (WA) this.N40.HD0.get(this.Lpt9);
        this.Rr0.Oa0.WK0(this.E2, wa);
    }
}
