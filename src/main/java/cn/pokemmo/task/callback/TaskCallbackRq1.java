package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackRq1 implements Runnable  {
    public final vl_0 Yw0;

    public TaskCallbackRq1(vl_0 owner) {
        this.Yw0 = owner;
    }

    @Override
    public final void run() {
        wn0_0 firstBuilder = (wn0_0) this.Yw0.vo.dI0;
        String first = firstBuilder.YA.toString();
        if (first.isEmpty()) {
            return;
        }
        wn0_0 secondBuilder = (wn0_0) this.Yw0.y7.dI0;
        String second = secondBuilder.YA.toString();
        tw0_0.rl.fk0.uQ(new T20(first, second));
        this.Yw0.vo.Gv("");
        this.Yw0.y7.Gv("");
        this.Yw0.hn.f00();
    }
}
