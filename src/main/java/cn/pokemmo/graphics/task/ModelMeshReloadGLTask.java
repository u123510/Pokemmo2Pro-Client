package cn.pokemmo.graphics.task;

import f.lr_0;
import f.qd_0;

public class ModelMeshReloadGLTask extends BaseGLTask {
    public final qd_0 coM3;
    public final lr_0 aW;

    public ModelMeshReloadGLTask(lr_0 lr_02, qd_0 qd_02) {
        this.aW = lr_02;
        this.coM3 = qd_02;
    }

    @Override
    public void run() {
        this.aW.If(this.coM3);
    }
}
