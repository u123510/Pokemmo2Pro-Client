package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackY80 implements Runnable  {
    public final Yl fi0;
    public final zp0_0 Zn0;

    public TaskCallbackY80(Yl v1, zp0_0 v2) {
        this.fi0 = v1;
        this.Zn0 = v2;
    }

    public final void run() {
        Yl yl = this.fi0;
        zp0_0 zp = this.Zn0;
        byte b = ((WJ0) yl.jq0.Vh0()).DZ;
        yl.RO(new wf0_1(zp, b));
    }
}
