package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackQc2 implements Runnable  {
    public final k10_0 cOm2;

    public TaskCallbackQc2(k10_0 v1) {
        this.cOm2 = v1;
    }

    public final void run() {
        k10_0 k = this.cOm2;
        k.getClass();
        vo_2 vo = tw0_0.LD0.Sc;
        if (vo == null) {
            lg_0.k.lPT5(new qc_2(k));
        } else {
            vo.yd(k.yP);
        }
    }
}
