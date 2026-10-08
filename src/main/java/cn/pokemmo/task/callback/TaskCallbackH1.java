package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackH1 implements Runnable  {
    public final CH0 c50;

    public TaskCallbackH1(CH0 cH0) {
        this.c50 = cH0;
    }

    @Override
    public final void run() {
        BU window = BU.T50;
        if (window == null) return;
        if (window.Ld == null) window.qD0(true);
        cb0_1 state = BU.T50.Ld;
        CH0 value = c50;
        if (state.Z60.Bb() > 1) {
            P8 list = state.Z60;
            list.Zd((com2__3) list.g6.get(0));
        }
        tw0_0.rl.fk0.uQ(new yz_0(value));
    }
}
