package cn.pokemmo.graphics.task;

import f.bi0_1;
import f.nk_0;

public class ActorMovementGLTask extends BaseGLTask {
    public final bi0_1 c00;

    public ActorMovementGLTask(bi0_1 bi0_1) {
        super();
        this.c00 = bi0_1;
    }

    @Override
    public void run() {
        this.c00.il0.LE(new nk_0[]{nk_0.uj, nk_0.aA, nk_0.cOm4});
        this.c00.il0.LE(new nk_0[]{nk_0.cOm4});
    }
}
