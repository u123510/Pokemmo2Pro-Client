package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackG2 implements Runnable  {
    public final At0 Yf;

    public TaskCallbackG2(At0 v1) {
        this.Yf = v1;
    }

    @Override
    public final void run() {
        String first = ((wn0_0) this.Yf.G1.dI0).YA.toString();
        String second = ((wn0_0) this.Yf.gT.dI0).YA.toString();
        tw0_0.rl.fk0.uQ(new dz_1(first, second));
    }
}
