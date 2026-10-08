package cn.pokemmo.graphics.task;

import f.C8;
import f.L00;

public class CameraTrackingGLTask extends BaseGLTask {
    public final C8 IK0;
    public final boolean U6;
    public final L00 Ga;

    public CameraTrackingGLTask(L00 l00, C8 c8, boolean z) {
        super();
        this.Ga = l00;
        this.IK0 = c8;
        this.U6 = z;
    }

    @Override
    public void run() {
        this.Ga.o7((byte) 0, this.IK0, 1, true, this.U6, false);
    }
}
