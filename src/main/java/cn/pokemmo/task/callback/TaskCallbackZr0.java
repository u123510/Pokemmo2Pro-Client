package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackZr0 implements Runnable  {
    public final P1 M80;
    public final th_0 kJ0;

    public TaskCallbackZr0(P1 v1, th_0 v2) {
        this.M80 = v1;
        this.kJ0 = v2;
    }

    public final void run() {
        this.M80.tj.add(0, this.kJ0);
        this.M80.VP.private$(this.M80.Jn);
        this.M80.jB0();
        this.M80.COm3();
    }
}
