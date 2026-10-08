package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public class GdxAnimatedTextureDrawable extends MD implements wl0_2 {
    public final qq_0 GS;
    public final gn_0 HS;
    public final B5 i6;

    public GdxAnimatedTextureDrawable(qq_0 qq_0Var, Texture texture, int i, int i2, int i3, int i4, gn_0 gn_0Var) {
        super(0, 0, i, i2);
        this.GS = qq_0Var;
        this.HS = gn_0Var;
        B5 b5 = new B5(texture, 0, 0, i, i2);
        this.i6 = b5;
        b5.Wu0(false, true);
    }

    public GdxAnimatedTextureDrawable(qq_0 qq_0Var, Texture texture, int i, int i2, int i3, int i4, int i5, int i6, gn_0 gn_0Var) {
        super(i, i2, i3, i4);
        this.GS = qq_0Var;
        this.HS = gn_0Var;
        B5 b5 = new B5(texture, i, i2, i3, i4);
        this.i6 = b5;
        b5.Wu0(false, true);
    }

    public GdxAnimatedTextureDrawable(GdxAnimatedTextureDrawable z30, gn_0 gn_0Var) {
        super(z30);
        this.GS = z30.GS;
        this.HS = gn_0Var;
        B5 b5 = new B5(z30.i6.Ae(), z30.Qj, z30.gx0, z30.zb, z30.iX);
        this.i6 = b5;
        b5.Wu0(false, true);
    }

    @Override
    public final wl0_2 so(gn_0 gn_0Var) {
        if (gn_0Var == null) {
            throw new NullPointerException("color");
        }
        gn_0 uy = this.HS.Uy(gn_0Var);
        if (this.HS.equals(uy)) {
            return this;
        }
        return new GdxAnimatedTextureDrawable(this, uy);
    }

    @Override
    public final void GO(VT vt, int i, int i2) {
        uf(vt, i, i2, this.zb, this.iX);
    }

    @Override
    public final void uf(rb_1 rb_1Var, int i, int i2, int i3, int i4) {
        ui_1 ui_1Var = this.GS.zi;
        Color.abgr8888ToColor(ui_1Var.oH, qq_0.fe0);
        ui_1Var.og = qq_0.fe0;
        this.i6.Wx(this.GS.w70(this.HS));
        this.i6.ss((float) i, (float) i2, (float) i3, (float) i4);
        this.i6.jN(this.GS.zi);
    }

    @Override
    public final LPT6_ LT() {
        return new LPT6_(this.i6.OB, this.i6.yQ, this.i6.Y60, this.i6.Yo, this.i6.Ll0);
    }
}
