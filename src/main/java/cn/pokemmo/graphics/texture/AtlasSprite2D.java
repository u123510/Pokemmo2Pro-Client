package cn.pokemmo.graphics.texture;

import f.*;

public class AtlasSprite2D extends B5 {
    public final yo_2 GO;
    public float Ve0;
    public float vP;

    public AtlasSprite2D(yo_2 yo_2) {
        this.GO = new yo_2(yo_2);
        this.Ve0 = yo_2.Z0;
        this.vP = yo_2.JN;
        this.t60(yo_2);
        this.FJ0((float) yo_2.Xr0 / 2.0f, (float) yo_2.BF0 / 2.0f);
        int w = yo_2.R90();
        int h = yo_2.dV();
        if (yo_2.yI) {
            super.tK();
            super.ss(yo_2.Z0, yo_2.JN, (float) w, (float) h);
        } else {
            super.ss(yo_2.Z0, yo_2.JN, (float) h, (float) w);
        }
        this.lE(1.0f, 1.0f, 1.0f);
    }

    public AtlasSprite2D(AtlasSprite2D tz_1) {
        this.GO = tz_1.GO;
        this.Ve0 = tz_1.Ve0;
        this.vP = tz_1.vP;
        this.f8(tz_1);
    }

    @Override
    public final void ak0(float f, float f2) {
        super.ak0(f + this.GO.Z0, f2 + this.GO.JN);
    }

    @Override
    public final void NL0(float f) {
        super.NL0(f + this.GO.Z0);
    }

    @Override
    public final void ZJ(float f) {
        super.ZJ(f + this.GO.JN);
    }

    @Override
    public final void ss(float f, float f2, float f3, float f4) {
        float scaleX = f3 / (float) this.GO.Xr0;
        float scaleY = f4 / (float) this.GO.BF0;
        this.GO.Z0 = this.Ve0 * scaleX;
        this.GO.JN = this.vP * scaleY;
        int regionW = this.GO.yI ? this.GO.P4 : this.GO.wB;
        int regionH = this.GO.yI ? this.GO.wB : this.GO.P4;
        super.ss(f + this.GO.Z0, f2 + this.GO.JN, (float) regionW * scaleX, (float) regionH * scaleY);
    }

    @Override
    public final void An(float f, float f2) {
        this.ss(this.a70(), this.wJ0(), f, f2);
    }

    @Override
    public final void FJ0(float f, float f2) {
        this.Jn0 = f - this.GO.Z0;
        this.si = f2 - this.GO.JN;
        this.o70 = true;
    }

    @Override
    public final void Wu0(boolean z, boolean z2) {
        if (this.GO.yI) {
            super.Wu0(z2, z);
        } else {
            super.Wu0(z, z2);
        }
        float oldOriginX = this.Zu0();
        float oldOriginY = this.kC0();
        float oldOffsetX = this.GO.Z0;
        float oldOffsetY = this.GO.JN;
        float scaleX = this.EI0 / (float) (this.GO.yI ? this.GO.P4 : this.GO.wB);
        float scaleY = this.hk0 / (float) (this.GO.yI ? this.GO.wB : this.GO.P4);
        this.GO.Z0 = this.Ve0;
        this.GO.JN = this.vP;
        this.GO.Wu0(z, z2);
        this.Ve0 = this.GO.Z0;
        this.vP = this.GO.JN;
        this.GO.Z0 = this.Ve0 * scaleX;
        this.GO.JN = this.vP * scaleY;
        this.mI(this.GO.Z0 - oldOffsetX, this.GO.JN - oldOffsetY);
        this.FJ0(oldOriginX, oldOriginY);
    }

    @Override
    public final float a70() {
        return this.pD0 - this.GO.Z0;
    }

    @Override
    public final float wJ0() {
        return this.pV - this.GO.JN;
    }

    @Override
    public final float Zu0() {
        return this.Jn0 + this.GO.Z0;
    }

    @Override
    public final float kC0() {
        return this.si + this.GO.JN;
    }

    @Override
    public final float l() {
        float w = this.EI0;
        float origW = this.GO.yI ? (float) this.GO.P4 : (float) this.GO.wB;
        return (w / origW) * (float) this.GO.Xr0;
    }

    @Override
    public final float LD0() {
        float h = this.hk0;
        float origH = this.GO.yI ? (float) this.GO.wB : (float) this.GO.P4;
        return (h / origH) * (float) this.GO.BF0;
    }

    @Override
    public final String toString() {
        return this.GO.oL;
    }
}
