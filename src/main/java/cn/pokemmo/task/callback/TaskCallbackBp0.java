package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackBp0 implements Runnable  {
    public final byte mI0;
    public final String ND0;
    public final BU Mt0;

    public TaskCallbackBp0(BU Mt0, byte mI0, String ND0) {
        this.Mt0 = Mt0;
        this.mI0 = mI0;
        this.ND0 = ND0;
    }

    @Override
    public final void run() {
        BU bU = this.Mt0;
        if (bU.ma0 != null) {
            tw0_0.rl.ze0(this.mI0, FD.eq0.Zz0);
            return;
        }
        bU.ma0 = new p20_0(this.Mt0, this.mI0, this.ND0);
        bU.SL(bU.ma0);
    }
}
