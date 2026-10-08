package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackXv00 implements Runnable  {
    public final RT Aq;
    public final Qy0 Ra0;

    public TaskCallbackXv00(RT rt, Qy0 qy0) {
        this.Aq = rt;
        this.Ra0 = qy0;
    }

    @Override
    public final void run() {
        this.Ra0.u3(this.Aq);
        if (tw0_0.rl != null) {
            tw0_0.rl.m9();
        }
    }
}
