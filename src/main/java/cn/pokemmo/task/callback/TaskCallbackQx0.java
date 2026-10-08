package cn.pokemmo.task.callback;

import f.*;

import f.D0;
import f.Qy0;
import f.ez_1;
import f.lpt2__5;
import f.lpt3__4;
import f.sm0_0;

public class TaskCallbackQx0
implements Runnable  {
    public final /* synthetic */ lpt2__5 GK0;
    public final /* synthetic */ ez_1 lo0;

    public TaskCallbackQx0(ez_1 ez_12, lpt2__5 lpt2__52) {
        this.lo0 = ez_12;
        this.GK0 = lpt2__52;
    }

    @Override
    public final void run() {
        String string = sm0_0.c0(2806);
        D0 d0 = new D0((Qx0) this);
        Qy0.yI0.sr0(new lpt3__4(string, d0, this.lo0));
    }
}
