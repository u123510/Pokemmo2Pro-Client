package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackMl01 implements Runnable  {
    public final /* synthetic */ kw_1 DF0;

    public TaskCallbackMl01(kw_1 v1) {
        this.DF0 = v1;
    }

    public final void run() {
        Mm mm = this.DF0.S0.Lpt3;
        byte b = mm.QA0[mm.zJ.iL];
        HV hv = this.DF0.Ew0;
        tw0_0.rl.fk0.uQ(new WE0(b, hv.Lpt3, hv.yx0));
        this.DF0.S0.xe0();
    }
}
