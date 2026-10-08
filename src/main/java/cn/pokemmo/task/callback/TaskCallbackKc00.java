package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackKc00 implements Runnable  {
    public final Or0 cW;
    public final K5 MR;

    public TaskCallbackKc00(Or0 or0, K5 k5) {
        this.cW = or0;
        this.MR = k5;
    }

    @Override
    public final void run() {
        this.cW.dY.UR(this.MR);
    }
}
