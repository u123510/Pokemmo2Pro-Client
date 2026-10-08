package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackYu implements Runnable  {
    public final vl_0 Aj0;

    public TaskCallbackYu(vl_0 owner) {
        this.Aj0 = owner;
    }

    @Override
    public final void run() {
        String value = ((wn0_0) this.Aj0.uj0.dI0).YA.toString();
        if (value.isEmpty()) {
            return;
        }
        tw0_0.rl.fk0.uQ(new zf_0(value));
        this.Aj0.uj0.Gv("");
        this.Aj0.E20.f00();
    }
}
