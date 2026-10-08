package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackRm0 implements Runnable  {
    public final xn0_0 jq;

    public TaskCallbackRm0(xn0_0 v1) {
        this.jq = v1;
    }

    public final void run() {
        this.jq.f00();
        if (dw_2.ku0 == 0) {
            dw_2.ku0 = 55;
            this.jq.continue$.ER.lK0(true);
        } else {
            dw_2.ku0 = 0;
            this.jq.continue$.ER.lK0(false);
        }

        bu_0 re0 = tw0_0.RE0;
        OE0 v1 = re0.e00;
        byte i1 = (v1 != null) ? v1.Fv() : 0;
        OE0 v2 = tw0_0.RE0.e00;
        short i2 = (v2 != null) ? v2.Ib0() : 0;
        re0.Eh(i1, i2, false, true);
    }
}
