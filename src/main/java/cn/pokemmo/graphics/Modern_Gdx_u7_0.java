package cn.pokemmo.graphics;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.u7_0
 */
public class Modern_Gdx_u7_0
implements gw_0 {

    public final /* synthetic */ cn.pokemmo.graphics.gdx.particle.GdxParticleController sH0;

    public Modern_Gdx_u7_0(cn.pokemmo.graphics.gdx.particle.GdxParticleController mg_02) {
        this.sH0 = mg_02;
    }

    @Override
    public final void lS() {
        lg_0.k.lPT5(this::Ie0);
    }

    @Override
    public final void em() {
    }

    public final void Ie0() {
        cn.pokemmo.graphics.gdx.particle.GdxParticleController mg_02 = this.sH0;
        mg_02.Np0 = false;
        mg_02.Cs = null;
        mg_02.WV = null;
        int n = 150;
        nf_0.zo0().COn.m(0, 255, n);
    }
}


