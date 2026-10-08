package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackSo1 implements Runnable  {
    public final BU kw0;
    public final byte VK;
    public final String VQ;

    public TaskCallbackSo1(BU v1, byte i2, String v3) {
        this.kw0 = v1;
        this.VK = i2;
        this.VQ = v3;
    }

    public final void run() {
        BU v1 = this.kw0;
        if (v1.ma0 != null) {
            tw0_0.rl.ze0(this.VK, FD.eq0.Zz0);
        } else {
            v1.ma0 = new le0_0(this.kw0, this.VK, this.VQ);
            this.kw0.SL(this.kw0.ma0);
        }
    }
}
