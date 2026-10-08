/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.viewport;

import f.*;

import f.Bp0;
import f.C8;
import f.CI0;
import f.P9;
import f.PC0;
import f.Tv0;
import f.dw_2;
import f.lg_0;
import f.vk0_2;

/*
 * Renamed from f.Yh0
 */
public class FixedResolutionScreenViewport
extends vk0_2 {
    public final boolean kl0;
    public int EJ;
    public int H7;
    public int cK0;
    public int un0;

    public FixedResolutionScreenViewport(PC0 pC0, boolean bl) {
        super(1280.0f, 720.0f, pC0);
        this.kl0 = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void Yw0(int n, int n2) {
        float f;
        int n3;
        int n4;
        int n5;
        int n6;
        float f2;
        float f3;
        boolean bl;
        block4: {
            block5: {
                block7: {
                    block6: {
                        bl = true;
                        this.EJ = 0;
                        this.H7 = 0;
                        this.un0 = 0;
                        this.cK0 = 0;
                        if (!this.kl0) break block4;
                        int n7 = dw_2.pG0;
                        if (n7 == 1) break block5;
                        if (n7 == 2) break block6;
                        if (n7 != 3) break block4;
                        lg_0.S4.getClass();
                        this.EJ = 0;
                        lg_0.S4.getClass();
                        this.H7 = 0;
                        lg_0.S4.getClass();
                        this.cK0 = 0;
                        break block7;
                    }
                    lg_0.S4.getClass();
                    this.EJ = 0;
                    lg_0.S4.getClass();
                    this.H7 = 0;
                }
                lg_0.S4.getClass();
                this.un0 = 0;
                break block4;
            }
            lg_0.S4.getClass();
            this.EJ = 0;
            lg_0.S4.getClass();
            this.H7 = 0;
        }
        float f4 = this.Pd0;
        float f5 = this.zk;
        float f6 = n;
        float f7 = n2;
        Bp0 bp0 = P9.Pi0.ZA(f4, f5, f6, f7);
        int n8 = Math.round(bp0.x);
        int n9 = Math.round(bp0.y);
        if (n8 < n) {
            float f8;
            float f9 = n9;
            f3 = f9 / f5;
            f2 = f5 / f9;
            f2 = (float)(n - n8) * f2;
            float f10 = this.qa;
            if (f10 > 0.0f) {
                f2 = Math.min(f2, f10 - this.Pd0);
            }
            f4 += f2;
            n8 = Math.round(f2 * f3) + n8;
        }
        if (n9 < n2) {
            float f11 = n8;
            f3 = f11 / f4;
            f2 = f4 / f11;
            f2 = (float)(n2 - n9) * f2;
            if (this.Vn0 > 0.0f) {
                f2 = Math.min(f2, this.qa - this.zk);
            }
            f5 += f2;
            n9 = Math.round(f2 * f3) + n9;
        }
        int n10 = n9;
        float f12 = (float)n8 / f4;
        float f13 = (float)n9 / f5;
        this.H7 = n6 = (int)((float)this.H7 / f12);
        this.EJ = n5 = (int)((float)this.EJ / f12);
        this.cK0 = n4 = (int)((float)this.cK0 / f13);
        this.un0 = n3 = (int)((float)this.un0 / f13);
        this.Ty = n8;
        this.Ja = n9;
        n9 = (n - n8) / 2;
        n8 = (n2 - n10) / 2;
        this.df = n9;
        this.gS = n8;
        this.qj = f = f4 - (float)n5 - (float)n6;
        this.eY = f5 - (float)n4 - (float)n3;
        this.kF(bl);
    }

    @Override
    public final void kF(boolean bl) {
        FixedResolutionScreenViewport yh0_02 = this;
        FixedResolutionScreenViewport yh0_03 = this;
        int f4 = yh0_03.gS;
        int n = yh0_03.Ty;
        int n2 = yh0_03.Ja;
        CI0.r40(yh0_02.df, f4, n, n2);
        int n3 = this.EJ;
        float f = yh0_02.qj + (float)n3 + (float)this.H7;
        n2 = this.cK0;
        float f2 = yh0_02.eY + (float)n2 + (float)this.un0;
        Tv0 tv0 = yh0_02.v3;
        tv0.Ui = f;
        yh0_02.v3.yG = f2;
        if (bl) {
            C8 c8 = tv0.v40;
            float f3 = f2;
            f2 = -n3;
            f2 = f / 2.0f + f2;
            float f5 = -n2;
            f5 = f3 / 2.0f + f5;
            float f6 = f2;
            f2 = 0.0f;
            c8.x = f6;
            c8.y = f5;
            c8.z = f2;
        }
        tv0.lP();
    }
}

