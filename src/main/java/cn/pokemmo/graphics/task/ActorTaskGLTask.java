package cn.pokemmo.graphics.task;

import f.C8;
import f.DD;
import f.EA0;
import f.Ou0;
import f.bi0_1;

public class ActorTaskGLTask extends BaseGLTask {
    public final bi0_1 Es0;
    public final DD Mz;

    public ActorTaskGLTask(DD task, bi0_1 owner) {
        this.Mz = task;
        this.Es0 = owner;
    }

    @Override
    public void run() {
        EA0 state = this.Es0.il0;
        DD task = this.Mz;
        Ou0 object = task.Ql.lK[task.lp];
        state.f60(object, false, C8.Zero);
        task.Ql.Qo0[task.lp] = false;
    }
}
