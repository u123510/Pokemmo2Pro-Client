package cn.pokemmo.graphics.task;

import f.ur_2;

public class FrameBufferSwapGLTask extends BaseGLTask {
    public final ur_2 Ql0;

    public FrameBufferSwapGLTask(ur_2 ur_22) {
        this.Ql0 = ur_22;
    }

    @Override
    public void run() {
        this.Ql0.MR();
    }
}
