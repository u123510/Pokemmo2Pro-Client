package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackIy2 implements Runnable  {
    public final L80 yq;
    public final boolean zm;

    public TaskCallbackIy2(L80 v1, boolean i2) {
        this.yq = v1;
        this.zm = i2;
    }

    public final void run() {
        wl0_0 wl = this.yq.rk0.ge;
        if (wl != null) {
            wl.getClass();
        }
        Su0 su = this.yq.rk0;
        boolean b = this.zm;
        su.nJ = b;
        if (b) {
            su.Ez.wy0();
        } else {
            su.Ez.resume();
        }
    }
}
