package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackJx1 implements Runnable  {
    public final P1 Xi;
    public final int p9;

    public TaskCallbackJx1(P1 v1, int i2) {
        this.Xi = v1;
        this.p9 = i2;
    }

    public final void run() {
        this.Xi.tj.remove(this.p9);
        this.Xi.VP.private$(this.Xi.Jn);
        this.Xi.jB0();
        this.Xi.COm3();
    }
}
