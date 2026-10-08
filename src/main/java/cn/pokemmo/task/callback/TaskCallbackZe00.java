package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackZe00 implements Runnable  {
    public final TH KQ;
    public final byte Nh0;
    public final BU dX;

    public TaskCallbackZe00(TH v1, byte i2, BU v3) {
        this.KQ = v1;
        this.Nh0 = i2;
        this.dX = v3;
    }

    public final void run() {
        tw0_0.rl.hB(this.Nh0, this.KQ.x40);
        BU bu = this.dX;
        TH th = bu.jg0;
        if (th != null) {
            th.xe0();
            bu.jg0 = null;
        }
    }
}
