package cn.pokemmo.task.action;

import cn.pokemmo.task.callback.TaskCallbackWhile;
import f.E30;
import f.fb0_1;
import f.l3_0;
import f.le0_2;
import f.o60_0;
import f.qu_2;
import f.tw0_0;

public class EntityActionRunnerZX implements Runnable {
    public final TaskCallbackWhile Uu0;

    public EntityActionRunnerZX(TaskCallbackWhile owner) {
        this.Uu0 = owner;
    }

    @Override
    public void run() {
        l3_0 screen = this.Uu0.COm5;
        le0_2 next = screen.K20;
        if (next == null) {
            return;
        }
        next.u3(screen);
        fb0_1 packet = new fb0_1(screen.Lpt3.QA0[screen.Lpt3.zJ.iL], 0);
        o60_0 descriptor = this.Uu0.D20;
        qu_2 context = this.Uu0.n5;
        tw0_0.rl.fk0.uQ(new E30(descriptor.Uv0, descriptor.sA,
                packet, context.Dw.GM, (byte) 0));
    }
}
