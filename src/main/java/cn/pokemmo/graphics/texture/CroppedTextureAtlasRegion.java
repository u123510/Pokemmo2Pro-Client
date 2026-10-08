package cn.pokemmo.graphics.texture;

import f.Dn0;
import f.LW;
import f.dc0_0;
import f.hz0;
import f.i4_0;
import f.lg_0;

public class CroppedTextureAtlasRegion implements dc0_0 {
    public hz0 um0;
    public i4_0 NM;

    public CroppedTextureAtlasRegion(Dn0 v1, int i2, int i3, int i4, int i5, int i6, int i7) {
        super();
        i4_0 v8 = new i4_0(v1);
        int w = LW.uo0(i4);
        int h = LW.uo0(i5);
        this.NM = new i4_0(w, h, v8.rH0());
        this.NM.dw0(v8, i2, i3, i4, i5);
        this.um0 = lg_0.S4.JB0(this.NM, i6, i7);
        v8.dispose();
    }
}
