package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.math.Matrix4;

public class GdxMipmapGenerator {
    public String mw;
    public boolean Mo;
    public boolean Jq;
    public final C8 BI0;
    public final me0_2 RG;
    public final C8 Fc0;
    public final Matrix4 TJ0;
    public final Matrix4 TG0;
    public final es_1 sJ0;
    public GdxMipmapGenerator sy;
    public final es_1 yn;

    public GdxMipmapGenerator() {
        this.Mo = true;
        this.BI0 = new C8();
        this.RG = new me0_2(0.0f, 0.0f, 0.0f, 1.0f);
        this.Fc0 = new C8(1.0f, 1.0f, 1.0f);
        this.TJ0 = new Matrix4();
        this.TG0 = new Matrix4();
        this.sJ0 = new es_1(2);
        this.yn = new es_1(2);
    }

    public static GdxMipmapGenerator ry0(es_1 es_12, String str, boolean z) {
        int i = es_12.KB;
        for (int i2 = 0; i2 < i; i2++) {
            GdxMipmapGenerator xz0 = (GdxMipmapGenerator) es_12.get(i2);
            if (xz0.mw.equals(str)) {
                return xz0;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < i; i3++) {
                GdxMipmapGenerator ry0 = ry0(((GdxMipmapGenerator) es_12.get(i3)).yn, str, true);
                if (ry0 != null) {
                    return ry0;
                }
            }
        }
        return null;
    }

    public final void Z90() {
        if (!this.Jq) {
            this.TJ0.oF0(this.BI0, this.RG, this.Fc0);
        }
        Matrix4 matrix4 = this.TJ0;
        if (this.Mo && this.sy != null) {
            Matrix4 matrix42 = this.TG0;
            Matrix4 matrix43 = this.sy.TG0;
            matrix43.getClass();
            Matrix4 Dd0 = matrix42.Dd0(matrix43.EW);
            Matrix4.md0(Dd0.EW, this.TJ0.EW);
        } else {
            Matrix4 matrix44 = this.TG0;
            matrix4.getClass();
            matrix44.Dd0(matrix4.EW);
        }
        I2 ZD = this.yn.ZD();
        while (ZD.hasNext()) {
            ((GdxMipmapGenerator) ZD.next()).Z90();
        }
    }

    public final void pF0() {
        I2 ZD = this.sJ0.ZD();
        while (ZD.hasNext()) {
            I20 i20 = (I20) ZD.next();
            cf_2 cf_22 = i20.RQ;
            if (cf_22 != null) {
                Matrix4[] matrix4Arr = i20.IC0;
                if (matrix4Arr != null) {
                    int i = cf_22.tb0;
                    if (i == matrix4Arr.length) {
                        for (int i2 = 0; i2 < i; i2++) {
                            Matrix4 matrix4 = i20.IC0[i2];
                            Matrix4 matrix42 = ((GdxMipmapGenerator) i20.RQ.ev[i2]).TG0;
                            matrix42.getClass();
                            matrix4.Dd0(matrix42.EW);
                            Matrix4.md0(matrix4.EW, ((Matrix4[]) i20.RQ.hv)[i2].EW);
                        }
                    }
                }
            }
        }
        I2 ZD2 = this.yn.ZD();
        while (ZD2.hasNext()) {
            ((GdxMipmapGenerator) ZD2.next()).pF0();
        }
    }

    public final void Xm0(ly0_0 ly0_02) {
        int i = this.sJ0.KB;
        for (int i2 = 0; i2 < i; i2++) {
            I20 i20 = (I20) this.sJ0.get(i2);
            if (i20.eh) {
                U30 u30 = i20.d40;
                u30.m8.Bn0(ly0_02, u30.d30, u30.I8, this.TG0);
            }
        }
        int i3 = this.yn.KB;
        for (int i4 = 0; i4 < i3; i4++) {
            ((GdxMipmapGenerator) this.yn.get(i4)).Xm0(ly0_02);
        }
    }

    public final void X50() {
        GdxMipmapGenerator xz0 = this.sy;
        if (xz0 != null) {
            if (xz0.yn.sj0(this, true)) {
                this.sy = null;
            }
            this.sy = null;
        }
    }

    public final void lPt7(GdxMipmapGenerator xz0) {
        GdxMipmapGenerator xz02 = this;
        while (xz02 != null) {
            if (xz02 != xz0) {
                xz02 = xz02.sy;
            } else {
                throw new nf_1("Cannot add a parent as a child");
            }
        }
        GdxMipmapGenerator xz03 = xz0.sy;
        if (xz03 != null) {
            if (xz03.yn.sj0(xz0, true)) {
                xz0.sy = null;
            } else {
                throw new nf_1("Could not remove child from its current parent");
            }
        }
        this.yn.Ue0(xz0);
        xz0.sy = this;
    }

    public GdxMipmapGenerator Ii0() {
        return this.sy;
    }

    public final boolean Jg() {
        return this.sy != null;
    }

    protected GdxMipmapGenerator createInstance() { return new Xz0(); }

    public GdxMipmapGenerator wb0() {
        GdxMipmapGenerator xz0 = createInstance();
        xz0.X50();
        xz0.mw = this.mw;
        xz0.Jq = this.Jq;
        xz0.Mo = this.Mo;
        xz0.BI0.np(this.BI0);
        xz0.RG.CA0(this.RG);
        xz0.Fc0.np(this.Fc0);
        Matrix4 matrix4 = this.TJ0;
        matrix4.getClass();
        xz0.TJ0.Dd0(matrix4.EW);
        Matrix4 matrix42 = this.TG0;
        matrix42.getClass();
        xz0.TG0.Dd0(matrix42.EW);
        xz0.sJ0.clear();
        I2 ZD = this.sJ0.ZD();
        while (ZD.hasNext()) {
            I20 i20 = (I20) ZD.next();
            es_1 es_12 = xz0.sJ0;
            i20.getClass();
            I20 i202 = new I20();
            i202.d40 = new U30(i20.d40);
            i202.jK0 = i20.jK0;
            i202.eh = i20.eh;
            cf_2 cf_22 = i20.RQ;
            if (cf_22 == null) {
                i202.RQ = null;
                i202.IC0 = null;
            } else {
                cf_2 cf_23 = i202.RQ;
                if (cf_23 == null) {
                    i202.RQ = new cf_2(true, cf_22.tb0, Xz0.class, Matrix4.class);
                } else {
                    cf_23.clear();
                }
                cf_2 cf_24 = i202.RQ;
                cf_2 cf_25 = i20.RQ;
                cf_24.getClass();
                int i = cf_25.tb0;
                int i2 = cf_24.tb0 + i;
                if (i2 >= cf_24.ev.length) {
                    cf_24.JK(Math.max(8, (int) (((float) i2) * 1.75f)));
                }
                System.arraycopy(cf_25.ev, 0, cf_24.ev, cf_24.tb0, i);
                System.arraycopy(cf_25.hv, 0, cf_24.hv, cf_24.tb0, i);
                cf_24.tb0 += i;
                Matrix4[] matrix4Arr = i202.IC0;
                if (matrix4Arr == null || matrix4Arr.length != i202.RQ.tb0) {
                    i202.IC0 = new Matrix4[i202.RQ.tb0];
                }
                for (int i3 = 0; i3 < i202.IC0.length; i3++) {
                    if (i202.IC0[i3] == null) {
                        i202.IC0[i3] = new Matrix4();
                    }
                }
            }
            es_12.Ue0(i202);
        }
        xz0.yn.clear();
        I2 ZD2 = this.yn.ZD();
        while (ZD2.hasNext()) {
            xz0.lPt7(((GdxMipmapGenerator) ZD2.next()).wb0());
        }
        return xz0;
    }
}
