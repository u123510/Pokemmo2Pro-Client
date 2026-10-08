package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackDi0 extends Yx0 implements Runnable  {
    public final TJ0 gW;
    public final int xd;
    public final ps_1 I70;

    public TaskCallbackDi0(ps_1 v1, TJ0 v2, int i3, E90 v4) {
        super(v1, v1.dH0(), tw0_0.kz0() ? 2 : 1, v4);
        this.I70 = v1;
        this.gW = v2;
        this.xd = i3;
        RR(this);
    }

    public final void run() {
        this.gW.M10(this.xd, this.I70, this, true);
    }
}
