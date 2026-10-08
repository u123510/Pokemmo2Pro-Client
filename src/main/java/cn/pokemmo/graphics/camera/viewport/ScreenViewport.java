package cn.pokemmo.graphics.camera.viewport;

import f.*;

public class ScreenViewport extends jy_1 {
    public final float Uw;

    public ScreenViewport() {
        this(new PC0());
    }

    public ScreenViewport(Tv0 tv0) {
        super();
        this.Uw = 1.0f;
        b50(tv0);
    }

    @Override
    public final void Yw0(int i, int j) {
        this.df = 0;
        this.gS = 0;
        this.Ty = i;
        this.Ja = j;
        this.qj = i * this.Uw;
        this.eY = j * this.Uw;
        kF(true);
    }
}
