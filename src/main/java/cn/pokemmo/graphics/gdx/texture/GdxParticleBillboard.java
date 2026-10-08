package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public class GdxParticleBillboard implements Cloneable {
    public static final vo_1 Ty = new vo_1();
    public static final float Q3 = Color.WHITE.toFloatBits();
    public int cOm6;
    public int wN;
    public int Q1;
    public int lo0;
    public int yJ;
    public int tX;
    public int J5;
    public LPT4_ Ej;
    public int cg;
    public float xh;
    public int ht;
    public int MP;
    public float Sg0;
    public float fj0;
    public float I40;
    public float UD0;
    public float S7;
    public final int v8;
    public final int Gt0;
    public float Rk;
    public float h3;
    public final int[] cb;
    public final int Pd;
    public final Texture lm0;
    public final LPT6_ ep0;
    public final Wr CF;
    public final AG0 Ps0;
    public final AG0[] HB;

    public GdxParticleBillboard() {
        this.Q1 = -1;
        this.lo0 = -1;
        this.J5 = 255;
        this.xh = Q3;
        this.ht = 1;
        this.MP = 1;
        this.fj0 = 1.0f;
        this.I40 = 1.0f;
        this.UD0 = 1.0f;
        this.S7 = 1.0f;
        this.cb = null;
        this.Pd = 0;
        this.lm0 = null;
        this.ep0 = null;
        this.CF = null;
        this.Ps0 = null;
        this.HB = null;
        this.v8 = 0;
        this.Gt0 = 0;
    }

    public GdxParticleBillboard(Texture texture) {
        this.Q1 = -1;
        this.lo0 = -1;
        this.J5 = 255;
        this.xh = Q3;
        this.ht = 1;
        this.MP = 1;
        this.fj0 = 1.0f;
        this.I40 = 1.0f;
        this.UD0 = 1.0f;
        this.S7 = 1.0f;
        this.cb = null;
        this.Pd = 0;
        this.ep0 = null;
        this.CF = null;
        this.Ps0 = null;
        this.HB = null;
        this.v8 = 0;
        this.Gt0 = 0;
        this.lm0 = texture;
        this.cOm6 = texture.getWidth();
        int height = texture.getHeight();
        this.wN = height;
        this.Kh((float) (this.cOm6 / 2), (float) (height / 2));
    }

    public GdxParticleBillboard(LPT6_ lpt6_) {
        this.Q1 = -1;
        this.lo0 = -1;
        this.J5 = 255;
        this.xh = Q3;
        this.ht = 1;
        this.MP = 1;
        this.fj0 = 1.0f;
        this.I40 = 1.0f;
        this.UD0 = 1.0f;
        this.S7 = 1.0f;
        this.cb = null;
        this.Pd = 0;
        this.lm0 = null;
        this.CF = null;
        this.Ps0 = null;
        this.HB = null;
        this.v8 = 0;
        this.Gt0 = 0;
        this.ep0 = lpt6_;
        this.cOm6 = lpt6_.R90();
        int height = lpt6_.dV();
        this.wN = height;
        this.Kh((float) (this.cOm6 / 2), (float) (height / 2));
    }

    public GdxParticleBillboard(Wr wr) {
        this.Q1 = -1;
        this.lo0 = -1;
        this.J5 = 255;
        this.xh = Q3;
        this.ht = 1;
        this.MP = 1;
        this.fj0 = 1.0f;
        this.I40 = 1.0f;
        this.UD0 = 1.0f;
        this.S7 = 1.0f;
        this.cb = null;
        this.Pd = 0;
        this.lm0 = null;
        this.ep0 = null;
        this.Ps0 = null;
        this.HB = null;
        this.v8 = 0;
        this.Gt0 = 0;
        this.CF = wr;
        if (wr.zz() < 0) {
            wr.H8();
        }
        this.cOm6 = wr.zz();
        int height = wr.K0();
        this.wN = height;
        this.Kh((float) (this.cOm6 / 2), (float) (height / 2));
    }

    public GdxParticleBillboard(AG0 ag0) {
        this.Q1 = -1;
        this.lo0 = -1;
        this.J5 = 255;
        this.xh = Q3;
        this.ht = 1;
        this.MP = 1;
        this.fj0 = 1.0f;
        this.I40 = 1.0f;
        this.UD0 = 1.0f;
        this.S7 = 1.0f;
        this.cb = null;
        this.Pd = 0;
        this.lm0 = null;
        this.ep0 = null;
        this.CF = null;
        this.HB = null;
        this.v8 = 0;
        this.Gt0 = 0;
        this.Ps0 = ag0;
        if (ag0.k60() < 0) {
            ag0.d3();
        }
        this.cOm6 = ag0.k60();
        int height = ag0.COM9();
        this.wN = height;
        this.Kh((float) (this.cOm6 / 2), (float) (height / 2));
    }

    public GdxParticleBillboard(AG0[] aG0Array, float f, int[] nArray) {
        this.Q1 = -1;
        this.lo0 = -1;
        this.J5 = 255;
        this.xh = Q3;
        this.ht = 1;
        this.MP = 1;
        this.fj0 = 1.0f;
        this.I40 = 1.0f;
        this.lm0 = null;
        this.ep0 = null;
        this.CF = null;
        this.Ps0 = null;
        this.HB = aG0Array;
        this.UD0 = f;
        this.S7 = f;
        double d1 = (double) (1.0f - f) * 0.5;
        double d4 = d1 * 32.0;
        double d6 = d1 * 64.0;
        if (aG0Array[0].k60() < 0) {
            aG0Array[0].d3();
        }
        this.v8 = (int) ((double) (aG0Array[0].k60() * -1 / 2 + 32) + d4);
        this.Gt0 = (int) ((double) (aG0Array[0].COM9() * -1 / 2 + 64) + d6);
        this.cOm6 = aG0Array[0].k60();
        int height = aG0Array[0].COM9();
        this.wN = height;
        this.Kh((float) (this.cOm6 / 2), (float) (height / 2));
        if (nArray != null) {
            if (nArray.length != aG0Array.length) {
                throw new RuntimeException();
            }
            this.cb = nArray;
            int total = 0;
            for (int i = 0; i < nArray.length; i++) {
                total += nArray[i];
            }
            this.Pd = total;
        } else {
            this.cb = null;
            this.Pd = 0;
        }
    }

    public final int Nv() {
        if (this.cb != null) {
            int i1 = (int) (hk0_1.KG % (long) this.Pd);
            int i2 = 0;
            for (int i3 = 0; i3 < this.cb.length; i3++) {
                i2 += this.cb[i3];
                if (i1 < i2) {
                    return i3;
                }
            }
        }
        if (this.HB != null) {
            return (int) ((hk0_1.KG / 50L) % (long) this.HB.length);
        }
        return 0;
    }

    public final void kH0() {
        LPT4_ lpt4_;
        if ((lpt4_ = this.Ej) != null) {
            LPT4_ rj0 = lpt4_.RJ0(this.cg);
            Color color = new Color((float) rj0.Cc() / 255.0f, (float) rj0.TB0() / 255.0f, (float) rj0.tr() / 255.0f, 2.0f);
            this.xh = color.mul(1.0f, 1.0f, 1.0f, (float) this.J5 / 255.0f).toFloatBits();
        } else if (this.J5 != 255) {
            this.xh = new Color(1.0f, 1.0f, 1.0f, (float) this.J5 / 255.0f).toFloatBits();
        } else {
            this.xh = Q3;
        }
    }

    public final int dq() {
        int i;
        if ((i = this.Q1) != -1) {
            return i;
        }
        Texture texture;
        if ((texture = this.lm0) != null) {
            return texture.getWidth();
        }
        Wr wr;
        if ((wr = this.CF) != null) {
            return wr.H8().getWidth();
        }
        LPT6_ lpt6_;
        if ((lpt6_ = this.ep0) != null) {
            return lpt6_.bz;
        }
        AG0 ag0;
        if ((ag0 = this.Ps0) != null) {
            return ag0.gj;
        }
        if (this.HB != null && this.HB.length > 0) {
            return this.HB[0].gj;
        }
        return 0;
    }

    public final int native$() {
        int i;
        if ((i = this.lo0) != -1) {
            return i;
        }
        Texture texture;
        if ((texture = this.lm0) != null) {
            return texture.getHeight();
        }
        Wr wr;
        if ((wr = this.CF) != null) {
            return wr.H8().getHeight();
        }
        LPT6_ lpt6_;
        if ((lpt6_ = this.ep0) != null) {
            return lpt6_.xZ;
        }
        AG0 ag0;
        if ((ag0 = this.Ps0) != null) {
            return ag0.g6;
        }
        if (this.HB != null && this.HB.length > 0) {
            return this.HB[0].g6;
        }
        return 0;
    }

    public final void CC0(int i, int i2) {
        this.cOm6 = i;
        this.wN = i2;
    }

    public final void Kh(float f, float f2) {
        this.Rk = f;
        this.h3 = f2;
    }

    public GdxParticleBillboard Hy() {
        try {
            return (jk_0) super.clone();
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }

    @Override
    public Object clone() {
        return this.Hy();
    }

    public final void Ty() {
        this.ht = 5;
        this.MP = 5;
    }

    public void gy(hl0_1 hl0_12) {
        this.Ql(hl0_12, this.yJ, this.tX);
    }

    public void Ql(hl0_1 hl0_12, int i, int i2) {
        this.yJ = i;
        this.tX = i2;
        float f4 = this.xh;
        float f5 = Q3;
        if (f4 != f5) {
            Color.abgr8888ToColor(hl0_12.oH, f4);
            hl0_12.og = f4;
        }
        Texture texture = this.lm0;
        if (this.CF != null) {
            texture = this.CF.H8();
        }
        if (texture != null && hl0_12 != null) {
            float f6 = this.Sg0;
            if (f6 == 0.0f && this.fj0 == 1.0f && this.I40 == 1.0f && this.UD0 == 1.0f && this.S7 == 0.0f) {
                hl0_12.vv0(texture, (float) (i + this.v8), (float) (i2 + this.Gt0), (float) this.dq(), (float) this.native$());
            } else {
                float f2 = (float) (i + this.v8);
                float f3 = (float) (i2 + this.Gt0);
                float f7 = this.Rk;
                float f8 = this.h3;
                float f9 = (float) this.cOm6;
                float f10 = (float) this.wN;
                float f11 = this.fj0 * this.UD0 * (float) this.ht;
                float f12 = this.I40 * this.S7 * (float) this.ht;
                int width = texture.getWidth() * this.ht;
                int height = texture.getHeight() * this.MP;
                hl0_12.J2(texture, f2, f3, f7, f8, f9, f10, f11, f12, f6, 0, 0, width, height, false);
            }
        } else {
            LPT6_ lpt6_ = this.ep0;
            if (this.HB != null && this.HB.length > 0) {
                lpt6_ = this.HB[this.Nv()].d3();
            } else if (this.Ps0 != null) {
                lpt6_ = this.Ps0.d3();
            }
            if (lpt6_ != null) {
                float f6 = this.Sg0;
                if (f6 == 0.0f && this.fj0 == 1.0f && this.I40 == 1.0f && this.UD0 == 1.0f && this.S7 == 0.0f) {
                    hl0_12.S50(lpt6_, (float) (i + this.v8), (float) (i2 + this.Gt0), (float) this.cOm6, (float) this.wN);
                } else {
                    Texture texture2 = lpt6_.OB;
                    float f3 = (float) (i + this.v8);
                    float f7 = (float) (i2 + this.Gt0);
                    float f8 = this.Rk;
                    float f9 = this.h3;
                    float f10 = (float) this.cOm6;
                    float f11 = (float) this.wN;
                    float f12 = this.fj0 * this.UD0;
                    float f13 = this.I40 * this.S7;
                    int zi0 = lpt6_.Zi0();
                    int round = Math.round(lpt6_.Y60 * (float) lpt6_.OB.getHeight());
                    int bz = lpt6_.bz;
                    int xZ = lpt6_.xZ;
                    hl0_12.J2(texture2, f3, f7, f8, f9, f10, f11, f12, f13, f6, zi0, round, bz, xZ, false);
                }
            }
        }
        if (this.xh != f5) {
            Color.abgr8888ToColor(hl0_12.oH, f5);
            hl0_12.og = f5;
        }
    }
}
