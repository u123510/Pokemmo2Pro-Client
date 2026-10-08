package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackVx implements Runnable  {
    public final zp0_0 s3;
    public final U80 bS;
    public final cb0_1 XD;

    public TaskCallbackVx(cb0_1 owner, zp0_0 entry, U80 action) {
        this.XD = owner;
        this.s3 = entry;
        this.bS = action;
    }

    @Override
    public final void run() {
        tw0_0.rl.fk0.uQ(new Nx0(this.s3.LB0, this.bS.Cb0));
        this.XD.h9.qD0(false);
    }
}
