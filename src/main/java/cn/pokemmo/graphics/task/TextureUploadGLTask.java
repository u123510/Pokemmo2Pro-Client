package cn.pokemmo.graphics.task;

import f.kt_0;

public class TextureUploadGLTask extends BaseGLTask {
    public final kt_0 Ks;

    public TextureUploadGLTask(kt_0 kt_02) {
        this.Ks = kt_02;
    }

    @Override
    public void run() {
        this.Ks.os0();
    }
}
