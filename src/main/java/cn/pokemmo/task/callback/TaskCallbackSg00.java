package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackSg00 implements Runnable  {
    public final String Ln0;

    public TaskCallbackSg00(String v1) {
        this.Ln0 = v1;
    }

    public final void run() {
        BU bu = BU.T50;
        String s = this.Ln0;
        nq_1 nq = (nq_1) bu.zi.get(s);
        if (nq != null) {
            nq.xe0();
            bu.zi.remove(s);
        }
    }
}
