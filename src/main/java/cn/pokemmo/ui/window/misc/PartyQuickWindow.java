package cn.pokemmo.ui.window.misc;

import f.*;

/**
 * 队伍快速状态浮窗
 *
 * 原混淆类: f.nm0_0
 */
public class PartyQuickWindow extends R90 implements tr_1  {
    public final nm0_0 asBridge() {
        return (nm0_0) (Object) this;
    }

    public final byte Ov;
    public final int fe0;
    public final int Y40;
    public final cn_0[] LJ;

    public PartyQuickWindow(byte b, int i) {
        uf("base-frame-padded");
        Hy("");
        ff0(1);
        this.Ov = b;
        int ew0 = (int) (((double) tw0_0.LD0.ew0()) * 0.6) / 256;
        this.Y40 = ew0;
        this.fe0 = i;
        if (i == 0 || i == 1) {
            S70 s70 = new S70(0, 0);
            s70.JH().Nk(new Wr[]{yj_0.ne0.zt(i)});
            s70.JH().dA((float) ew0);
            s70.JH().Gy0(2, 0);
            SL(s70);
            this.LJ = new cn_0[3];
            String playerName = "";
            yt_1 yt_1Var = tw0_0.e60;
            if (yt_1Var != null && yt_1Var.at() != null) {
                playerName = tw0_0.e60.at().na0();
            }
            lpt6__2 lpt6__2Var = lpt6__2.YG0;
            this.LJ[0] = new cn_0(sm0_0.YG((byte) 2, lpt6__2Var, 1, 0, new iz0_0[]{new iz0_0((byte) 0, (byte) 5, playerName)}));
            this.LJ[1] = new cn_0(sm0_0.Vw(lpt6__2Var, (i * 5) + 1));
            this.LJ[2] = new cn_0(sm0_0.Vw(lpt6__2Var, 3));
            for (int k = 0; k < this.LJ.length; k++) {
                SL(this.LJ[k]);
            }
        } else {
            if (i == 2) {
                for (int k = 0; k < 2; k++) {
                    S70 s70 = new S70(0, 0);
                    s70.JH().Nk(new Wr[]{yj_0.ne0.ZV(k)});
                    s70.JH().dA((float) this.Y40);
                    s70.JH().Gy0(2, 0);
                    SL(s70);
                }
            }
            this.LJ = null;
        }
        RY((this.Y40 * 256) + 3, (this.Y40 * 192) + 2);
        oY((this.Y40 * 256) + 3, (this.Y40 * 192) + 2);
    }

    @Override
    public final void C(zk0_1 v1) {
        le0_2 parent = this.K20;
        int parentX = parent.A20 + parent.e80;
        int x = kq_0.lpT2(parent.a3(), this.Mx, 2, parentX);
        le0_2 parent2 = this.K20;
        int parentY = parent2.SB0 + parent2.y9;
        int y = kq_0.lpT2(parent2.k5(), this.OB, 4, parentY);
        E40(x, y);
        lpt6__0.v90(this);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            int i2 = v1.finally$;
            rp_0 sJ0 = rp_0.sJ0;
            int ff = dw_2.ff;
            if ((sJ0 != null && sJ0.Ov(i2)) || (rp_0.nK0 != null && rp_0.nK0.Ov(i2))) {
                BU.T50.u3(this);
                tw0_0.rl.ze0(this.Ov, (byte) 0);
                return true;
            }
        }
        K8();
        return super.nd0(v1);
    }

    @Override
    public final void K8() {
        super.K8();
        int i1 = this.fe0;
        if (i1 == 0) {
            pa0_0 pa0_0Var = pa0_0.Ol;
            this.LJ[0].qF0(pa0_0Var);
            this.LJ[1].qF0(pa0_0Var);
            this.LJ[2].qF0(pa0_0Var);
            this.LJ[0].E40(this.A20 + this.e80, this.SB0 + this.y9 + (this.Y40 * -70));
            this.LJ[1].E40(this.A20 + this.e80, this.SB0 + this.y9 + (this.Y40 * -10));
            this.LJ[2].E40(this.A20 + this.e80, this.SB0 + this.y9 + (this.Y40 * 40));
        } else if (i1 == 1) {
            pa0_0 pa0_0Var2 = pa0_0.qQ;
            this.LJ[0].qF0(pa0_0Var2);
            this.LJ[1].qF0(pa0_0Var2);
            this.LJ[2].qF0(pa0_0.Mk);
            this.LJ[0].E40(this.A20 + this.e80 + (this.Y40 * 60), this.SB0 + this.y9 + (this.Y40 * 20));
            this.LJ[1].E40(this.A20 + this.e80 + (this.Y40 * 60), this.SB0 + this.y9 + (this.Y40 * 44));
            this.LJ[2].E40(this.A20 + this.e80 + (this.Y40 * -60), this.SB0 + this.y9 + (this.Y40 * 138));
        }
    }
}
