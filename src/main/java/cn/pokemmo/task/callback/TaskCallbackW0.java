package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackW0 implements Runnable  {
    public final HV YX;
    public final un_1 RI0;

    public TaskCallbackW0(un_1 source, HV value) {
        this.RI0 = source;
        this.YX = value;
    }

    @Override
    public final void run() {
        if (tw0_0.rl.Cl.coN < this.YX.yx0) {
            String title = sm0_0.c0(3011);
            String message = sm0_0.c0(3012);
            String cancel = sm0_0.c0(nf0_0.Bq0);
            Qy0.yI0.sr0(new lpt3__4(title, message, cancel, new yc_0((w_0) this), null));
            return;
        }
        String prompt = sm0_0.Bx(3005,
                this.RI0.eB0.j50.toString(),
                fp0_0.uD(new StringBuilder(), this.YX.yx0, ""));
        Qy0.yI0.sr0(new lpt3__4(prompt, new A9((w_0) this), this.RI0));
    }
}
