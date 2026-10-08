package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackPf1 implements Runnable  {
    public final /* synthetic */ byte q40;
    public final /* synthetic */ String Wa;
    public final /* synthetic */ String jL0;
    public final /* synthetic */ BU bF0;

    public TaskCallbackPf1(BU v1, byte i2, String v3, String v4) {
        this.bF0 = v1;
        this.q40 = i2;
        this.Wa = v3;
        this.jL0 = v4;
    }

    public final void run() {
        BU bu = this.bF0;
        if (bu.ma0 != null) {
            tw0_0.rl.ze0(this.q40, FD.eq0.Zz0);
            return;
        }
        bu.ma0 = new cz_1(this.bF0, this.q40, this.Wa, this.jL0);
        this.bF0.SL(this.bF0.ma0);
    }
}
