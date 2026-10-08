package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackRp00 implements Runnable  {
    public final long le0;
    public final _public Cn;

    public TaskCallbackRp00(_public _public, long j, int i, int j2) {
        this.Cn = _public;
        this.le0 = j;
    }

    @Override
    public final void run() {
        this.Cn.Ni = false;
        k3_0.iJ0(this.Cn.Kl, this.le0);
    }
}
