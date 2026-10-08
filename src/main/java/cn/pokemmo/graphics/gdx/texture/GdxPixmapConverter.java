/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import f.Dn0;
import f.E9;
import f.F40;
import f.ed_2;
import f.i4_0;
import f.ix0_0;
import f.nf_1;

/*
 * Renamed from f.Mc
 */
public class GdxPixmapConverter
implements E9 {
    public final Dn0 gz;
    public int vt = 0;
    public int Dd0 = 0;
    public ix0_0 RI;
    public i4_0 t10;
    public final boolean ok;
    public boolean LD0 = false;

    public GdxPixmapConverter(Dn0 dn0, i4_0 i4_02, ix0_0 ix0_02, boolean bl) {
        this.gz = dn0;
        this.t10 = i4_02;
        this.RI = ix0_02;
        this.ok = bl;
        if (i4_02 != null) {
            this.vt = i4_02.Sq0();
            this.Dd0 = this.t10.Oi();
            if (ix0_02 == null) {
                this.RI = this.t10.rH0();
            }
        }
    }

    @Override
    public final boolean xZ() {
        return this.LD0;
    }

    @Override
    public final void Dx0() {
        if (!this.LD0) {
            if (this.t10 == null) {
                this.t10 = this.gz.BN().equals("cim") ? F40.RK0(this.gz) : new i4_0(this.gz);
                GdxPixmapConverter mc_02 = this;
                i4_0 i4_02 = mc_02.t10;
                Gdx2DPixmap gdx2DPixmap = i4_02.XF;
                mc_02.vt = gdx2DPixmap.SH;
                mc_02.Dd0 = gdx2DPixmap.mB0;
                if (mc_02.RI == null) {
                    this.RI = i4_02.rH0();
                }
            }
            this.LD0 = true;
            return;
        }
        throw new nf_1("Already prepared");
    }

    @Override
    public final i4_0 JX() {
        if (this.LD0) {
            this.LD0 = false;
            i4_0 i4_02 = this.t10;
            this.t10 = null;
            return i4_02;
        }
        throw new nf_1("Call prepare() before calling getPixmap()");
    }

    @Override
    public final boolean mZ() {
        return true;
    }

    @Override
    public final int Nx() {
        return this.vt;
    }

    @Override
    public final int Af() {
        return this.Dd0;
    }

    @Override
    public final ix0_0 uv() {
        return this.RI;
    }

    @Override
    public final boolean bm() {
        return this.ok;
    }

    @Override
    public final boolean wx() {
        return true;
    }

    @Override
    public final ed_2 getType() {
        return ed_2.AM;
    }

    @Override
    public final void wJ(int n) {
        throw new nf_1("This TextureData implementation does not upload data itself");
    }

    public final String toString() {
        return this.gz.toString();
    }
}

