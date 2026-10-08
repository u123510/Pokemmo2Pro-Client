package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackVj0 implements Runnable  {
    public final byte TC;
    public final String S20;
    public final BU m50;

    public TaskCallbackVj0(BU owner, byte value, String text) {
        this.m50 = owner;
        this.TC = value;
        this.S20 = text;
    }

    @Override
    public final void run() {
        if (this.m50.ma0 != null) {
            tw0_0.rl.ze0(this.TC, FD.eq0.Zz0);
            return;
        }
        this.m50.ma0 = new B6(this.m50, this.TC, this.S20);
        this.m50.SL(this.m50.ma0);
    }
}
