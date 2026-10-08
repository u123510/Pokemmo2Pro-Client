package cn.pokemmo.graphics.gdx.render;

import f.*;


import com.badlogic.gdx.graphics.Color;

public class GdxLayeredTexture extends ql_2 {
    public static final C8 Kz0 = new C8();
    public static final C8 bs = new C8();
    public static final C8 CoM2 = new C8();
    public static final SQ lg0 = new SQ();
    public static final SQ coN = new SQ();
    public p_0 r2;
    public float tz;
    public float XV = 1.0f;
    public final int a50;
    public final int kn0;
    public boolean WL0;
    public final C8 j;
    public final me0_2 uF;
    public final C8 oW;
    public boolean TM = false;
    public final PRN_ CQ;
    public final Rv0 Cf0;
    public final mz_2 bq0;
    public final LPT6_ WQ;
    public float dG;
    public float im = 0.01f;
    public xt_0 Kj = null;

    public GdxLayeredTexture(GdxLayeredTexture v1) {
        super(jv0(v1.a50, v1.kn0, v1.WL0));
        this.a50 = v1.a50;
        this.kn0 = v1.kn0;
        this.WL0 = v1.WL0;
        this.j = new C8();
        this.uF = new me0_2();
        this.oW = new C8(1.0f, 1.0f, 1.0f);
        this.bq0 = v1.bq0;
        this.WQ = v1.WQ;
        mz_2 v2 = v1.bq0;
        if (v2 != null) {
            this.K7.LPT8(v2);
        }
        if (v1.K7.tM(sh_0.vF0)) {
            this.K7.LPT8(new sh_0(1.0f));
            this.K7.LPT8(new mb0_2(mb0_2.k6, 0.01f));
        }
        this.CQ = new PRN_(PRN_.Ly, Color.WHITE);
        this.K7.LPT8(this.CQ);
        if (v1.Cf0 != null) {
            this.Cf0 = new Rv0(Rv0.XT, 0);
            this.K7.LPT8(this.Cf0);
        } else {
            this.Cf0 = null;
        }
        this.Kj = v1.Kj;
    }

    public GdxLayeredTexture(int i1, int i2, LPT6_ v3, boolean i4) {
        super(jv0(i1, i2, true));
        this.a50 = i1;
        this.kn0 = i2;
        this.WL0 = true;
        this.j = new C8();
        this.uF = new me0_2();
        this.oW = new C8(1.0f, 1.0f, 1.0f);
        this.bq0 = new mz_2(mz_2.g7, v3);
        this.WQ = v3;
        this.K7.LPT8(this.bq0);
        this.K7.LPT8(new sh_0(1.0f));
        this.K7.LPT8(new mb0_2(mb0_2.k6, 0.1f));
        this.CQ = new PRN_(PRN_.Ly, Color.WHITE);
        this.K7.LPT8(this.CQ);
        if (i4) {
            this.Cf0 = new Rv0(Rv0.XT, 0);
            this.K7.LPT8(this.Cf0);
        } else {
            this.Cf0 = null;
        }
    }

    public static GdxLayeredTexture xD(xt_0 v0) {
        LPT6_ v1 = v0.yq();
        float f2 = v0.cOm4;
        int i3 = (int) (v1.bz / f2);
        int i2 = (int) (v1.xZ / f2);
        GdxLayeredTexture result = new GdxLayeredTexture(i3, i2, v1, true);
        result.Kj = v0;
        return result;
    }

    public static ut_0 jv0(int i0, int i1, boolean i2) {
        i0 = Math.abs(i0);
        i1 = Math.abs(i1);
        int i3 = (i0 << 16) | i1;
        SQ v4 = i2 ? lg0 : coN;
        ut_0 v5 = (ut_0) v4.get(i3);
        if (v5 != null) {
            return v5;
        }
        float f0 = (float) i0 / 2.0f;
        float f1 = (float) i1 / 2.0f;
        float f5 = -f0;
        float f6 = -f1;
        BM bm = new BM(new hf_1[]{new PRN_(PRN_.Ly, Color.WHITE)});
        long j3 = 17 | (i2 ? 8 : 0);
        v5 = new P6().Q3(f5, f6, 0.0f, f0, f6, 0.0f, f0, f1, 0.0f, f5, f1, 0.0f, 1.0f, 1.0f, bm, j3);
        v4.j10(v4.yw0(i3), v5);
        return v5;
    }

    public static GdxLayeredTexture Pd(LPT6_ v0) {
        return new GdxLayeredTexture(v0.bz, v0.xZ, v0, false);
    }

    public static GdxLayeredTexture DE(LPT6_[] v0, float f1) {
        LPT6_ v4 = v0[0];
        GdxLayeredTexture v3 = new GdxLayeredTexture((int) (v4.bz * f1), (int) (v4.xZ * f1), v4, true);
        p_0 p0 = new p_0(0.1f, v0);
        v3.r2 = p0;
        p0.kK0 = OI0.MW;
        v3.bq0.R4(v0[0]);
        v3.OF0(0.01f);
        v3.nu(1.0f, 1.0f, 1.0f, 1.0f);
        return v3;
    }

    public final void Vg() {
        if (this.TM) {
            return;
        }
        this.qI0.oF0(this.j, this.uF, this.oW);
        this.TM = true;
    }

    public final void GA(float f1) {
        p_0 v2 = this.r2;
        if (v2 == null) {
            return;
        }
        float f0 = this.tz + f1 * this.XV;
        this.tz = f0;
        this.bq0.R4((LPT6_) v2.hE0(f0));
    }

    public final void DB0(C8 v1, C8 v2) {
        C8 v3 = CoM2;
        v3.x = v1.x;
        v3.y = v1.y;
        v3.z = v1.z;
        v3.Vy(this.j.x, this.j.y, this.j.z).KM();
        Ji(v3, v2);
    }

    public final void ej(C8 v1) {
        C8 v2 = CoM2;
        v2.x = 0.0f;
        v2.y = 1.0f;
        v2.z = 0.0f;
        Ji(v2, v1);
    }

    public final void Ji(C8 v1, C8 v2) {
        C8 kz = Kz0;
        kz.x = v2.x;
        kz.y = v2.y;
        kz.z = v2.z;
        kz.Xv0(v1).KM();
        C8 bsC = bs;
        bsC.x = v1.x;
        bsC.y = v1.y;
        bsC.z = v1.z;
        bsC.Xv0(kz).KM();
        this.uF.WA0(false, kz.x, bsC.x, v1.x, kz.y, bsC.y, v1.y, kz.z, bsC.z, v1.z);
        this.TM = false;
        Vg();
    }

    public final void QG(boolean z) {
        mz_2 v2 = this.bq0;
        float f3 = z ? this.WQ.Yo : this.WQ.yQ;
        v2.B50 = f3;
        LPT6_ lpt = this.WQ;
        float f1 = lpt.Y60;
        v2.j70 = f1;
        float f4 = z ? lpt.yQ : lpt.Yo;
        v2.m90 = f4 - f3;
        v2.aU = lpt.Ll0 - f1;
    }

    public final void Gb0(LPT6_ v1, boolean z) {
        this.bq0.R4(v1);
        if (z) {
            float f0 = v1.yQ;
            float f1 = v1.Yo;
            float f2 = v1.Y60;
            float f3 = v1.Ll0;
            mz_2 v4 = this.bq0;
            v4.B50 = f1;
            v4.j70 = f2;
            v4.m90 = f0 - f1;
            v4.aU = f3 - f2;
        }
    }

    public final Color MI0() {
        if (this.CQ != null) {
            return this.CQ.v50;
        }
        return null;
    }

    public final void nu(float f1, float f2, float f3, float f4) {
        if (this.Cf0 != null) {
            this.Cf0.Vr.set(f1, f2, f3, f4);
        }
    }

    public final void qr0(C8 v1) {
        this.j.x = v1.x;
        this.j.y = v1.y;
        this.j.z = v1.z;
        this.TM = false;
    }

    public final void zf0(float f1, float f2, float f3) {
        this.j.x = f1;
        this.j.y = f2;
        this.j.z = f3;
        this.TM = false;
    }

    public final void Qw0(float f1, float f2) {
        C8 v3 = this.oW;
        if (v3.x == f1 && v3.y == f2) {
            return;
        }
        v3.x = f1;
        v3.y = f2;
        this.TM = false;
    }

    public final void OF0(float f1) {
        C8 v2 = this.oW;
        if (v2.x == f1 && v2.y == f1) {
            return;
        }
        v2.x = f1;
        v2.y = f1;
        v2.z = f1;
        this.TM = false;
    }

    public final void op0(Color v1, float f2) {
        this.K7.LPT8(new na0_0(na0_0.UG, v1, f2));
        this.dG = f2;
    }

    public final void qq0(boolean z) {
        if (this.WL0 == z) {
            return;
        }
        this.WL0 = z;
        this.rl = ((I20) ((Xz0) jv0(this.a50, this.kn0, z).Wc0.KI()).sJ0.KI()).d40;
    }

    public final Object clone() {
        return new GdxLayeredTexture(this);
    }
}
