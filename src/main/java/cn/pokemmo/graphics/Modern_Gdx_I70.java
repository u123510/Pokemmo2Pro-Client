package cn.pokemmo.graphics;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.I70
 */
public class Modern_Gdx_I70
implements E9 {

    public final int jZ;
    public final int f30;
    public boolean y8 = false;
    public final int ZB0;
    public final int hc;
    public final int mT;
    public final int k60;

    public Modern_Gdx_I70(int n, int n2, int n3, int n4, int n5, int n6) {
        this.jZ = n;
        this.f30 = n2;
        this.ZB0 = n3;
        this.hc = n4;
        this.mT = n5;
        this.k60 = n6;
    }

    @Override
    public final ed_2 getType() {
        return ed_2.k4;
    }

    @Override
    public final boolean xZ() {
        return this.y8;
    }

    @Override
    public final void Dx0() {
        if (!this.y8) {
            this.y8 = true;
            return;
        }
        throw new nf_1("Already prepared");
    }

    @Override
    public final void wJ(int n) {
        int n2 = n;
        Modern_Gdx_I70 i70 = this;
        int n3 = i70.ZB0;
        n = i70.hc;
        int n4 = i70.jZ;
        int n5 = i70.f30;
        int n6 = i70.mT;
        int n7 = i70.k60;
        lg_0.OH0.glTexImage2D(n2, n3, n, n4, n5, 0, n6, n7, null);
    }

    @Override
    public final i4_0 JX() {
        throw new nf_1("This TextureData implementation does not return a Pixmap");
    }

    @Override
    public final boolean mZ() {
        throw new nf_1("This TextureData implementation does not return a Pixmap");
    }

    @Override
    public final int Nx() {
        return this.jZ;
    }

    @Override
    public final int Af() {
        return this.f30;
    }

    @Override
    public final ix0_0 uv() {
        return ix0_0.Vw;
    }

    @Override
    public final boolean bm() {
        return false;
    }

    @Override
    public final boolean wx() {
        return false;
    }
}


