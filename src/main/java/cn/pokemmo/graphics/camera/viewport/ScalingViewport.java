package cn.pokemmo.graphics.camera.viewport;

import f.*;

public class ScalingViewport extends jy_1 {
    public final P9 pm0;

    public ScalingViewport(P9 v1, float f2, float f3) {
        this(v1, f2, f3, new PC0());
    }

    public ScalingViewport(P9 v1, float f2, float f3, Tv0 v4) {
        super();
        this.pm0 = v1;
        this.Nn0(f2, f3);
        this.b50(v4);
    }

    public final void Yw0(int i1, int i2) {
        Bp0 bp = this.pm0.ZA(this.qj, this.eY, (float) i1, (float) i2);
        int roundX = Math.round(bp.x);
        int roundY = Math.round(bp.y);
        int dfVal = (i1 - roundX) / 2;
        int gsVal = (i2 - roundY) / 2;
        this.df = dfVal;
        this.gS = gsVal;
        this.Ty = roundX;
        this.Ja = roundY;
        this.kF(true);
    }
}
