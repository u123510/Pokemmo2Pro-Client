/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Texture;

/*
 * Renamed from f.LPT6
 */
public class GdxTextureRegion {
    public Texture OB;
    public float yQ;
    public float Y60;
    public float Yo;
    public float Ll0;
    public int bz;
    public int xZ;

    public GdxTextureRegion() {
    }

    public GdxTextureRegion(Texture texture) {
        if (texture != null) {
            Texture texture2 = this.OB = texture;
            int n = texture2.getWidth();
            int n2 = texture2.getHeight();
            this.lpT6(0, 0, n, n2);
            return;
        }
        throw new IllegalArgumentException("texture cannot be null.");
    }

    public GdxTextureRegion(Texture texture, int n, int n2) {
        GdxTextureRegion lPT6_ = this;
        lPT6_.OB = texture;
        lPT6_.lpT6(0, 0, n, n2);
    }

    public GdxTextureRegion(Texture texture, int n, int n2, int n3, int n4) {
        GdxTextureRegion lPT6_ = this;
        lPT6_.OB = texture;
        lPT6_.lpT6(n, n2, n3, n4);
    }

    public GdxTextureRegion(Texture texture, float f, float f2, float f3, float f4) {
        GdxTextureRegion lPT6_ = this;
        lPT6_.OB = texture;
        lPT6_.Ur0(f, f2, f3, f4);
    }

    public GdxTextureRegion(GdxTextureRegion lPT6_) {
        GdxTextureRegion lPT6_2 = this;
        lPT6_2.t60(lPT6_);
    }

    public GdxTextureRegion(GdxTextureRegion lPT6_, int n, int n2, int n3, int n4) {
        GdxTextureRegion lPT6_2 = this;
        lPT6_2.KF0(lPT6_, n, n2, n3, n4);
    }

    public final void lpT6(int n, int n2, int n3, int n4) {
        GdxTextureRegion lPT6_ = this;
        float f = 1.0f / (float)lPT6_.OB.getWidth();
        float f2 = 1.0f / (float)lPT6_.OB.getHeight();
        float f3 = (float)n * f;
        float f4 = (float)n2 * f2;
        f = (float)(n + n3) * f;
        f2 = (float)(n2 + n4) * f2;
        this.Ur0(f3, f4, f, f2);
        this.bz = Math.abs(n3);
        this.xZ = Math.abs(n4);
    }

    public void Ur0(float f, float f2, float f3, float f4) {
        int n;
        GdxTextureRegion lPT6_ = this;
        int n2 = lPT6_.OB.getWidth();
        int n3 = lPT6_.OB.getHeight();
        float f5 = n2;
        this.bz = Math.round(Math.abs(f3 - f) * f5);
        float f6 = n3;
        this.xZ = n = Math.round(Math.abs(f4 - f2) * f6);
        if (this.bz == 1 && n == 1) {
            float f7 = f4;
            float f8 = f2;
            float f9 = f;
            f = 0.25f / f5;
            f2 = f9 + f;
            f3 -= f;
            f = 0.25f / f6;
            f4 = f8 + f;
            f = f7 - f;
            float f10 = f2;
            float f11 = f4;
            f4 = f;
            f2 = f11;
            f = f10;
        }
        GdxTextureRegion lPT6_2 = this;
        lPT6_2.yQ = f;
        lPT6_2.Y60 = f2;
        lPT6_2.Yo = f3;
        lPT6_2.Ll0 = f4;
    }

    public final void t60(GdxTextureRegion lPT6_) {
        GdxTextureRegion lPT6_2 = lPT6_;
        this.OB = lPT6_.OB;
        float f = lPT6_2.yQ;
        float f2 = lPT6_2.Y60;
        float f3 = lPT6_2.Yo;
        float f4 = lPT6_2.Ll0;
        this.Ur0(f, f2, f3, f4);
    }

    public final void KF0(GdxTextureRegion lPT6_, int n, int n2, int n3, int n4) {
        this.OB = lPT6_.OB;
        this.lpT6(lPT6_.Zi0() + n, Math.round(lPT6_.Y60 * (float)lPT6_.OB.getHeight()) + n2, n3, n4);
    }

    public final Texture Ae() {
        return this.OB;
    }

    public final int Zi0() {
        return Math.round(this.yQ * (float)this.OB.getWidth());
    }

    public final int R90() {
        return this.bz;
    }

    public final int dV() {
        return this.xZ;
    }

    public void Wu0(boolean bl, boolean bl2) {
        if (bl) {
            GdxTextureRegion lPT6_ = this;
            float f = lPT6_.yQ;
            lPT6_.yQ = lPT6_.Yo;
            lPT6_.Yo = f;
        }
        if (bl2) {
            GdxTextureRegion lPT6_ = this;
            float f = lPT6_.Y60;
            lPT6_.Y60 = lPT6_.Ll0;
            lPT6_.Ll0 = f;
        }
    }
}

