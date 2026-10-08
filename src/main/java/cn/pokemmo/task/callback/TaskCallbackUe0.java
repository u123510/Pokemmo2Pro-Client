package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackUe0 implements Runnable  {
    public final ch0_2 Nk0;
    public final Qy0 com6;
    public final Ge0 vX;
    public final RT GK0;

    public TaskCallbackUe0(RT request, ch0_2 queue, Qy0 screen, Ge0 world) {
        this.GK0 = request;
        this.Nk0 = queue;
        this.com6 = screen;
        this.vX = world;
    }

    @Override
    public final void run() {
        ch0_2 queue = this.Nk0;
        if (queue.GT == null && !queue.Pc0.eo0()) {
            Qy0 screen = this.com6;
            lg_0.k.lPT5(new IL0(screen, true));
            screen.u3(this.GK0);
            CH0 id = queue.Pc0.WN;
            if (this.vX.n2() == 3) {
                this.vX.fk0.uQ(new vu_2(id));
            }
            return;
        }

        Qy0 screen = this.com6;
        mr0 replacement = new mr0(screen, queue);
        if (screen.TG0 != null) {
            screen.TG0.xe0();
        }
        screen.TG0 = replacement;
        int count = screen.fU();
        replacement.F9(count, replacement);
    }
}
