package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackFn2 implements Runnable  {
    public final da0_0 vG0;

    public TaskCallbackFn2(da0_0 v1) {
        this.vG0 = v1;
    }

    public final void run() {
        BR br = tw0_0.rl;
        CH0 ch = this.vG0.xj.YX;
        pg0_0 pg = this.vG0.jG0;
        br.fk0.uQ(new eh_0(ch, pg));
    }
}
