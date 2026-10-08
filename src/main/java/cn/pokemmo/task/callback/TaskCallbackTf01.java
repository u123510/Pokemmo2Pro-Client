package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackTf01 implements Runnable  {
    public final YP WF0;

    public TaskCallbackTf01(YP owner) {
        this.WF0 = owner;
    }

    @Override
    public final void run() {
        yt_1 state = tw0_0.e60;
        if (state == null || state.N60() == null) {
            return;
        }
        if (this.WF0.P70.mu0.Mw0 == state.N60().A30) {
            Qy0.yI0.dk(-1, sm0_0.c0(1903));
            return;
        }
        le0_2 parent = this.WF0.K20;
        if (parent != null) {
            parent.u3(this.WF0);
        }
        BR battle = tw0_0.rl;
        byte mode = (byte) this.WF0.P70.mu0.Mw0;
        boolean enabled = this.WF0.mE.ER.U20();
        battle.fk0.uQ(new ve0_0(mode, enabled));
    }
}
