package cn.pokemmo.graphics.task;

import f.gz_1;
import f.tw0_0;

public class ShaderCompileGLTask extends BaseGLTask {
    public final gz_1 XT;

    public ShaderCompileGLTask(gz_1 gz_12) {
        this.XT = gz_12;
    }

    @Override
    public void run() {
        gz_1 gz_12 = this.XT;
        if (!gz_12.Uq0) {
            gz_12.Uq0 = true;
            gz_12.kw();
            tw0_0.Xl0.HV.sj0(gz_12, true);
        }
    }
}
