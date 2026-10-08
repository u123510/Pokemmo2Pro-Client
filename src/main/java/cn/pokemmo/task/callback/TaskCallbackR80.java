package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackR80 implements Runnable  {
    public final /* synthetic */ yb_1 lO;
    public final /* synthetic */ COm8_ CO;

    public TaskCallbackR80(COm8_ v1, yb_1 v2) {
        this.CO = v1;
        this.lO = v2;
    }

    public final void run() {
        COm8_ com8 = this.CO;
        byte at = this.lO.at0;
        X90 x90 = (X90) com8.COM1.get(com8.EB0);
        if (x90 != null) {
            com8.ip.qd(at, com8.EB0, x90.ax);
        }
    }
}
