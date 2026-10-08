package cn.pokemmo.graphics;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.S60
 */
public class Modern_Gdx_S60 implements E9 {

    public final i4_0 lq0;
    public final ix0_0 Zi;
    public final boolean YV;
    public final boolean UR;
    public final boolean synchronized$;

    public Modern_Gdx_S60(i4_0 var1, ix0_0 var2, boolean var3, boolean var4) {
        this(var1, var2, var3, var4, false);
    }

    public Modern_Gdx_S60(i4_0 var1, ix0_0 var2, boolean var3, boolean var4, boolean var5) {
        this.lq0 = var1;
        this.Zi = var2 == null ? var1.rH0() : var2;
        this.YV = var3;
        this.UR = var4;
        this.synchronized$ = var5;
    }

    @Override public final boolean mZ() { return this.UR; }
    @Override public final i4_0 JX() { return this.lq0; }
    @Override public final int Nx() { return this.lq0.XF.SH; }
    @Override public final int Af() { return this.lq0.XF.mB0; }
    @Override public final ix0_0 uv() { return this.Zi; }
    @Override public final boolean bm() { return this.YV; }
    @Override public final boolean wx() { return this.synchronized$; }
    @Override public final ed_2 getType() { return ed_2.AM; }
    @Override public final void wJ(int unused) { throw new nf_1("This TextureData implementation does not upload data itself"); }
    @Override public final boolean xZ() { return true; }
    @Override public final void Dx0() { throw new nf_1("prepare() must not be called on a PixmapTextureData instance as it is already prepared."); }
}

