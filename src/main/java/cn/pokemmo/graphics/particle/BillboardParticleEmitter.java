/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.particle;

import f.*;

import f.LB0;
import f.ii0_1;

public abstract class BillboardParticleEmitter {
    public static final /* synthetic */ boolean O00;
    public int NJ;
    public int m70;
    public boolean Ug0;
    public float Sq0;
    public float sS;
    public float o80;
    public float Gg;
    public float vP;
    public boolean fb0;
    public boolean vj0;
    public boolean Hn;
    public boolean w6;
    public LB0 xF0;
    public int cOM8;
    public boolean ix;
    public boolean G;

    static {
        O00 = BillboardParticleEmitter.class.desiredAssertionStatus() ^ true;
    }

    public abstract Object C20();

    public abstract void bC0();

    public final float oX() {
        int n = this.m70;
        if (n < 0) {
            return -1.0f;
        }
        BillboardParticleEmitter d2 = this;
        float f = this.sS;
        float f2 = d2.Sq0 + f;
        return (d2.o80 + f) * (float)n + f2;
    }

    public final boolean BJ0() {
        return this.Hn || this.w6;
    }

    public abstract void YW();

    public abstract void kQ();

    public void SM() {
    }

    public final void Ge(float f) {
        BillboardParticleEmitter d2 = this;
        d2.Gg = f - this.oX();
        d2.NJ = d2.m70 * 2 + 1;
        d2.Ug0 = false;
        d2.kQ();
    }

    public final void gR(int n) {
        LB0 lB0 = this.xF0;
        if (lB0 != null && (this.cOM8 & n) > 0) {
            lB0.LPT3(n, (D2) this);
        }
    }

    public final void mh(float delta) {
        if (!this.fb0 || this.w6) {
            return;
        }

        this.vP = delta;
        if (!this.vj0 && this.Gg + delta >= this.Sq0) {
            this.SM();
            this.vj0 = true;
            this.Ug0 = true;
            this.NJ = 0;
            this.vP -= this.Sq0 - this.Gg;
            this.Gg = 0.0f;
            this.gR(1);
            this.gR(2);
        }

        if (this.vj0) {
            if (!this.Ug0 && this.m70 >= 0 && this.NJ < 0 && this.Gg + this.vP >= 0.0f) {
                if (!BillboardParticleEmitter.O00 && this.NJ != -1) {
                    throw new AssertionError();
                }
                float dt = 0.0f - this.Gg;
                this.Ug0 = true;
                this.NJ = 0;
                this.vP -= dt;
                this.Gg = 0.0f;
                this.gR(1);
                this.gR(2);
                this.nA(this.Ug0, this.NJ, this.NJ - 1, dt);
            } else if (!this.Ug0 && this.m70 >= 0 && this.NJ > this.m70 * 2 && this.Gg + this.vP < 0.0f) {
                int lastStep = this.m70 * 2;
                if (!BillboardParticleEmitter.O00 && this.NJ != lastStep + 1) {
                    throw new AssertionError();
                }
                float dt = 0.0f - this.Gg;
                this.Ug0 = true;
                this.NJ = lastStep;
                this.vP -= dt;
                this.Gg = this.sS;
                this.gR(16);
                this.gR(32);
                this.nA(this.Ug0, this.NJ, this.NJ + 1, dt);
            }

            while ((this.NJ >= 0 && this.NJ <= this.m70 * 2) || this.m70 < 0) {
                int step = this.NJ;
                boolean iterationStep = this.Ug0;

                if (!iterationStep && this.Gg + this.vP <= 0.0f) {
                    float dt = 0.0f - this.Gg;
                    this.Ug0 = true;
                    this.NJ = step - 1;
                    this.vP -= dt;
                    this.Gg = this.sS;
                    this.kQ();
                    this.gR(32);
                    this.nA(this.Ug0, this.NJ, this.NJ + 1, dt);
                    continue;
                }

                if (!iterationStep && this.Gg + this.vP >= this.o80) {
                    float dt = this.o80 - this.Gg;
                    this.Ug0 = true;
                    this.NJ = step + 1;
                    this.vP -= dt;
                    this.Gg = 0.0f;
                    this.YW();
                    this.gR(2);
                    this.nA(this.Ug0, this.NJ, this.NJ - 1, dt);
                    continue;
                }

                if (iterationStep && this.Gg + this.vP < 0.0f) {
                    float dt = 0.0f - this.Gg;
                    this.Ug0 = false;
                    this.NJ = step - 1;
                    this.vP -= dt;
                    this.Gg = 0.0f;
                    this.nA(false, this.NJ, step, dt);
                    this.gR(64);
                    if (this.NJ < 0 && this.m70 >= 0) {
                        this.gR(128);
                        continue;
                    }
                    this.Gg = this.o80;
                    continue;
                }

                if (iterationStep && this.Gg + this.vP > this.sS) {
                    float dt = this.sS - this.Gg;
                    this.Ug0 = false;
                    this.NJ = step + 1;
                    this.vP -= dt;
                    this.Gg = this.sS;
                    this.nA(false, this.NJ, step, dt);
                    this.gR(4);
                    int repeatCnt = this.m70;
                    if (this.NJ > repeatCnt * 2 && repeatCnt >= 0) {
                        this.gR(8);
                    }
                    this.Gg = 0.0f;
                    continue;
                }

                float dt = this.vP;
                this.vP = 0.0f;
                this.Gg += dt;
                if (iterationStep) {
                    this.nA(true, step, step, dt);
                }
                break;
            }

            int repeatCnt = this.m70;
            this.Hn = repeatCnt >= 0 && (this.NJ > repeatCnt * 2 || this.NJ < 0);
        }

        this.Gg += this.vP;
        this.vP = 0.0f;
    }

    public abstract void nA(boolean var1, int var2, int var3, float var4);

    public void t() {
        this.C20();
        this.Gg = 0.0f;
        this.fb0 = true;
    }

    public final BillboardParticleEmitter Ms(ii0_1 ii0_12) {
        if (!ii0_12.n10.contains(this)) {
            ii0_12.n10.add(this);
        }
        if (this.G) {
            this.t();
        }
        return this;
    }

    public final BillboardParticleEmitter Yu0(int n, float f) {
        if (!this.fb0) {
            this.m70 = n;
            if (!(f >= 0.0f)) {
                f = 0.0f;
            }
            this.o80 = f;
            return this;
        }
        throw new RuntimeException("You can't change the repetitions of a tween or timeline once it is started");
    }
}
