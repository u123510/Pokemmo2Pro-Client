package cn.pokemmo.graphics.texture;

import f.*;

public class CubemapTextureFaceSet implements jp0_0 {
    public final E9[] Hk0;

    public CubemapTextureFaceSet() {
        this((E9) null, (E9) null, (E9) null, (E9) null, (E9) null, (E9) null);
    }

    public CubemapTextureFaceSet(Dn0 dn0, Dn0 dn02, Dn0 dn03, Dn0 dn04, Dn0 dn05, Dn0 dn06) {
        this(cm_0.Zp0(dn0, false), cm_0.Zp0(dn02, false), cm_0.Zp0(dn03, false), cm_0.Zp0(dn04, false), cm_0.Zp0(dn05, false), cm_0.Zp0(dn06, false));
    }

    public CubemapTextureFaceSet(Dn0 dn0, Dn0 dn02, Dn0 dn03, Dn0 dn04, Dn0 dn05, Dn0 dn06, boolean z) {
        this(cm_0.Zp0(dn0, z), cm_0.Zp0(dn02, z), cm_0.Zp0(dn03, z), cm_0.Zp0(dn04, z), cm_0.Zp0(dn05, z), cm_0.Zp0(dn06, z));
    }

    public CubemapTextureFaceSet(i4_0 i4_0Var, i4_0 i4_0Var2, i4_0 i4_0Var3, i4_0 i4_0Var4, i4_0 i4_0Var5, i4_0 i4_0Var6) {
        this(i4_0Var, i4_0Var2, i4_0Var3, i4_0Var4, i4_0Var5, i4_0Var6, false);
    }

    public CubemapTextureFaceSet(i4_0 i4_0Var, i4_0 i4_0Var2, i4_0 i4_0Var3, i4_0 i4_0Var4, i4_0 i4_0Var5, i4_0 i4_0Var6, boolean z) {
        this(i4_0Var == null ? null : new S60(i4_0Var, (ix0_0) null, z, false),
             i4_0Var2 == null ? null : new S60(i4_0Var2, (ix0_0) null, z, false),
             i4_0Var3 == null ? null : new S60(i4_0Var3, (ix0_0) null, z, false),
             i4_0Var4 == null ? null : new S60(i4_0Var4, (ix0_0) null, z, false),
             i4_0Var5 == null ? null : new S60(i4_0Var5, (ix0_0) null, z, false),
             i4_0Var6 == null ? null : new S60(i4_0Var6, (ix0_0) null, z, false));
    }

    public CubemapTextureFaceSet(int i, int i2, int i3, ix0_0 ix0_0Var) {
        this(new S60(new i4_0(i3, i2, ix0_0Var), (ix0_0) null, false, true),
             new S60(new i4_0(i3, i2, ix0_0Var), (ix0_0) null, false, true),
             new S60(new i4_0(i, i3, ix0_0Var), (ix0_0) null, false, true),
             new S60(new i4_0(i, i3, ix0_0Var), (ix0_0) null, false, true),
             new S60(new i4_0(i, i2, ix0_0Var), (ix0_0) null, false, true),
             new S60(new i4_0(i, i2, ix0_0Var), (ix0_0) null, false, true));
    }

    public CubemapTextureFaceSet(E9 e9, E9 e92, E9 e93, E9 e94, E9 e95, E9 e96) {
        this.Hk0 = new E9[]{e9, e92, e93, e94, e95, e96};
    }

    @Override
    public final boolean wx() {
        for (E9 e9 : this.Hk0) {
            if (!e9.wx()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean xZ() {
        return false;
    }

    @Override
    public final void Dx0() {
        for (int i = 0; i < this.Hk0.length; i++) {
            if (this.Hk0[i] == null) {
                throw new nf_1("You need to complete your cubemap data before using it");
            }
        }
        for (int i = 0; i < this.Hk0.length; i++) {
            if (!this.Hk0[i].xZ()) {
                this.Hk0[i].Dx0();
            }
        }
    }

    @Override
    public final void Ww() {
        for (int i = 0; i < this.Hk0.length; i++) {
            if (this.Hk0[i].getType() == ed_2.k4) {
                this.Hk0[i].wJ(i + 34069);
            } else {
                i4_0 pixmap = this.Hk0[i].JX();
                boolean disposePixmap = this.Hk0[i].mZ();
                if (this.Hk0[i].uv() != pixmap.rH0()) {
                    i4_0 tmp = new i4_0(pixmap.XF.SH, pixmap.XF.mB0, this.Hk0[i].uv());
                    tmp.Pa0(DF0.Ha0);
                    tmp.XF.bJ(pixmap.XF, 0, 0, 0, 0, pixmap.XF.SH, pixmap.XF.mB0);
                    if (this.Hk0[i].mZ()) {
                        pixmap.dispose();
                    }
                    disposePixmap = true;
                    pixmap = tmp;
                }
                lg_0.OH0.glPixelStorei(3317, 1);
                lg_0.OH0.glTexImage2D(
                        i + 34069,
                        0,
                        pixmap.ro(),
                        pixmap.XF.SH,
                        pixmap.XF.mB0,
                        0,
                        pixmap.Wc(),
                        pixmap.t30(),
                        pixmap.Rh0());
                if (disposePixmap) {
                    pixmap.dispose();
                }
            }
        }
    }
}
