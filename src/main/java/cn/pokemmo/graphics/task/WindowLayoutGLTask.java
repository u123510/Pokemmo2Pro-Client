package cn.pokemmo.graphics.task;

import f.BR;
import f.Yl;
import f.ZI;
import f.tw0_0;
import f.wn0_0;

public class WindowLayoutGLTask extends BaseGLTask {
    public final Yl H5;

    public WindowLayoutGLTask(Yl v1) {
        this.H5 = v1;
    }

    @Override
    public void run() {
        BR br = tw0_0.rl;
        byte b = this.H5.D10;
        String s = ((wn0_0) this.H5.aB.dI0).YA.toString();
        br.fk0.uQ(new ZI(b, s));
    }
}
