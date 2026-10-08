package cn.pokemmo.graphics.gdx.texture;

import f.*;
import com.badlogic.gdx.graphics.Color;

public class GdxPaletteLookupTexture {
    public final byte at0;
    public final LPT4_ cOM7;
    public final LPT4_ Is0;
    public final int TH;
    public final Color YH0;
    public final Color tg0;

    public GdxPaletteLookupTexture(int i, LPT4_ lpt4_, int i2) {
        this.YH0 = new Color();
        this.at0 = (byte) i;
        this.cOM7 = lpt4_;
        this.TH = i2 / 2;
        this.Is0 = lpt4_.RJ0(i2 / 2);
        this.tg0 = new Color(
            ((float) this.Is0.Cc()) / 255.0f,
            ((float) this.Is0.TB0()) / 255.0f,
            ((float) this.Is0.tr()) / 255.0f,
            1.0f
        );
    }

    public final LPT4_ Q2() {
        return this.Is0;
    }

    public final String Xe() {
        int i = this.at0 + 32000;
        if (sm0_0.cU.l90(i)) {
            return sm0_0.c0(i);
        }
        return "PAL_" + ((int) this.at0);
    }
}
