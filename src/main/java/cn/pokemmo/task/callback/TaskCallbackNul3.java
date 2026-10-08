package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackNul3 implements Runnable  {
    public final /* synthetic */ HV zo;

    public TaskCallbackNul3(HV v1) {
        this.zo = v1;
    }

    public final void run() {
        a10_0 a10 = bc_1.km(gu0.l2.lPT6(this.zo.WA).g0);
        if (a10 == null) {
            return;
        }
        BU.T50.cx(false);
        a10.Tk0.add(new pf0_2());
        tw0_0.PK0 = a10;
    }
}
