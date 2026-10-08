package cn.pokemmo.graphics;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.o
 */
public class Modern_Gdx_o
implements wl0_2 {

    public final gn_0 nT;
    public final int Mg0;
    public final int vN;

    public Modern_Gdx_o(xu_1 xu_12, int n, int n2, gn_0 gn_02, boolean bl) {
        this.Mg0 = n;
        this.vN = n2;
        if (gn_02 == null) {
            gn_02 = gn_0.WHITE;
        }
        this.nT = gn_02;
    }

    public Modern_Gdx_o(o o2, gn_0 gn_02) {
        this.Mg0 = o2.Mg0;
        this.vN = o2.vN;
        this.nT = gn_02;
    }

    @Override
    public final int Af() {
        return this.vN;
    }

    @Override
    public final int Nx() {
        return this.Mg0;
    }

    @Override
    public final void GO(VT vT, int n, int n2) {
    }

    @Override
    public final void uf(rb_1 rb_12, int n, int n2, int n3, int n4) {
    }

    @Override
    public final wl0_2 so(gn_0 gn_02) {
        if (gn_02 != null) {
            if ((gn_02 = this.nT.Uy(gn_02)).equals(this.nT)) {
                return (o)this;
            }
            return new o((o)this, gn_02);
        }
        throw new NullPointerException("color");
    }

    @Override
    public final LPT6_ LT() {
        return null;
    }
}


