package cn.pokemmo.graphics.task;

import f.ur_2;

public class SpriteAnimationGLTask extends BaseGLTask {
    public final ur_2 pE;

    public SpriteAnimationGLTask(ur_2 ur_22) {
        this.pE = ur_22;
    }

    @Override
    public void run() {
        this.pE.MR();
    }
}
