package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackNq implements Runnable  {
    public final Ge0 a60;
    public final Qy0 pH0;

    public TaskCallbackNq(Qy0 value, BR owner) {
        this.pH0 = value;
        this.a60 = owner;
    }

    @Override
    public final void run() {
        le0_2 current = this.pH0.s2;
        if (current != null) {
            current.xe0();
        }

        current = this.pH0.uw0;
        if (current != null) {
            current.xe0();
            this.pH0.uw0 = null;
        }

        current = this.pH0.fv;
        if (current != null) {
            current.xe0();
        }

        this.pH0.s2 = new RT(this.pH0, this.a60);
        RT runtime = this.pH0.s2;
        this.pH0.F9(this.pH0.fU(), runtime);
        lpt6__0.v90(runtime.o20());
    }
}
