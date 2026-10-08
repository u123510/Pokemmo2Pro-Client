package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackZg implements Runnable  {
    public final /* synthetic */ Dm0 hR;
    public final /* synthetic */ gc_0 aJ0;

    public TaskCallbackZg(gc_0 v1, Dm0 v2) {
        this.aJ0 = v1;
        this.hR = v2;
    }

    public final void run() {
        this.aJ0.wb.pw0(false);
        this.aJ0.wb.SU(sm0_0.c0(1955));
        tw0_0.rl.fk0.uQ(new ed0_1((byte) 1));
        this.hR.RU[this.hR.c80] = true;
        this.aJ0.Hr0();
    }
}
