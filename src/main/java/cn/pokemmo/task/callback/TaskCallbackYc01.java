package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackYc01 implements Runnable  {
    public final /* synthetic */ re_1 ch;

    public TaskCallbackYc01(re_1 v1) {
        this.ch = v1;
    }

    public final void run() {
        re_1 re = this.ch;
        re.UB.u3(re);
        Qy0 ub = this.ch.UB;
        if (ub.G30 == null) {
            LPt2_ lpt = new LPt2_(ub);
            ub.G30 = lpt;
            ub.F9(ub.fU(), lpt);
            if (tw0_0.Ll0.zd) {
                ub.qi();
            } else if (!dw_2.S6) {
                ub.tM();
            }
        }
    }
}
