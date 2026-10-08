package cn.pokemmo.graphics;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.qi_1
 */
public class Modern_Gdx_qi_1 {

    public final cc0_2 iG;
    public boolean TV;
    public int fj0;
    public int mC;
    public int Zj0;
    public float lp;
    public float mo0;
    public boolean Wz;
    public int UG;

    public Modern_Gdx_qi_1(cc0_2 cc0_22) {
        this.iG = cc0_22;
    }

    public final void vk0(int n, float f, float f2) {
        int n2 = this.Zj0;
        boolean bl = n2 != 0;
        boolean bl2 = n != 0;
        if (n2 != n) {
            this.Zj0 = n;
            if (bl2) {
                lg_0.OH0.glEnable(2929);
                lg_0.OH0.glDepthFunc(n);
            } else {
                lg_0.OH0.glDisable(2929);
            }
        }
        if (bl2) {
            if (!bl || this.Zj0 != n) {
                this.Zj0 = n;
                lg_0.OH0.glDepthFunc(n);
            }
            if (!bl || this.lp != f || this.mo0 != f2) {
                this.lp = f;
                this.mo0 = f2;
                lg_0.OH0.glDepthRangef(f, f2);
            }
        }
    }

    public final void mx0(int n, int n2, boolean bl) {
        if (bl != this.TV) {
            this.TV = bl;
            if (bl) {
                lg_0.OH0.glEnable(3042);
            } else {
                lg_0.OH0.glDisable(3042);
            }
        }
        if (bl && (this.fj0 != n || this.mC != n2)) {
            lg_0.OH0.glBlendFunc(n, n2);
            this.fj0 = n;
            this.mC = n2;
        }
    }

    public final void fh0(int n) {
        if (n != this.UG) {
            this.UG = n;
            if (n != 1028 && n != 1029 && n != 1032) {
                lg_0.OH0.glDisable(2884);
            } else {
                lg_0.OH0.glEnable(2884);
                lg_0.OH0.glCullFace(n);
            }
        }
    }
}


