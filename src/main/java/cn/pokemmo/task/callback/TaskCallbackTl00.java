package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackTl00 implements Runnable  {
    public final k10_0 bm0;

    public TaskCallbackTl00(k10_0 k10_0) {
        this.bm0 = k10_0;
    }

    @Override
    public final void run() {
        k10_0 target = this.bm0;
        int delay = 0;
        if (target.ER == -1) {
            return;
        }
        lpt5__5.hL.ZD(new vA(target), delay);
    }
}
