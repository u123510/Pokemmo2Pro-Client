package cn.pokemmo.ui.window.misc;

import f.*;

/**
 * 副队伍状态悬浮窗
 *
 * 原混淆类: f.s_0
 */
public class SubPartyWindow extends R90 implements tr_1  {
    public final s_0 asBridge() {
        return (s_0) (Object) this;
    }

    public final byte B40;
    public final oq_0 v9;
    public int m1 = -1;
    public byte XK = -1;
    public int JJ;
    public final int Lr0;
    public final cn_0[] xx0;

    public SubPartyWindow(byte b, int i) {
        uf("base-frame-padded");
        Hy(gu0.Az0().lPT6((short) 5621).getName());
        ff0(1);
        this.B40 = b;
        this.v9 = OJ0.t1.dn(i);
        this.JJ = 0;
        int i2 = 0;
        while (i2 < 4 && this.v9.Yy0(i2) >= 0) {
            this.JJ++;
            i2++;
        }
        int ew0 = (int) ((((double) tw0_0.LD0.ew0()) * 0.75d) / 4.0d);
        if (tw0_0.kz0()) {
            ew0 = tw0_0.LD0.ew0() / 4;
        }
        this.Lr0 = ew0 / 128;
        String na0 = "";
        byte k60 = 0;
        if (tw0_0.e60.at() != null) {
            na0 = tw0_0.e60.at().na0();
            k60 = tw0_0.e60.at().K60();
        }
        this.xx0 = new cn_0[this.JJ];
        for (byte b2 = 0; b2 < this.JJ; b2++) {
            S70 s70 = new S70(0, 0);
            byte fl0 = this.v9.fl0(b2);
            int i3 = pj0_1.C8[c8_0.A90().sj0().o30()];
            if (i3 == 1) {
                fl0 = (byte) (fl0 + 1);
            } else if (i3 == 2 || i3 == 3) {
                fl0 = (byte) (fl0 + 2);
            }
            s70.JH().Nk(new Wr[]{OJ0.t1.YX(fl0)});
            s70.JH().dA((float) this.Lr0);
            s70.JH().Gy0(b2 * 128 * this.Lr0 + 2, 0);
            SL(s70);
            S70 s702 = new S70(0, 0);
            s702.JH().Nk(new Wr[]{OJ0.t1.I70(this.v9.y0(k60, b2))});
            s702.JH().dA((float) this.Lr0);
            s702.JH().Gy0(b2 * 128 * this.Lr0 + 2, 0);
            if (this.v9.Yy0(b2) == 0 || this.v9.Yy0(b2) == 5) {
                s702.JH().wx0(gn_0.BLACK);
            }
            SL(s702);
            this.xx0[b2] = new cn_0(this.v9.nG0(b2, na0));
            this.xx0[b2].qF0(pa0_0.Ol);
            SL(this.xx0[b2]);
        }
        int i4 = this.JJ * 128 * this.Lr0 + 3;
        int i5 = this.Lr0 * 192 + 2;
        RY(i4, i5);
        oY(this.JJ * 128 * this.Lr0 + 3, this.Lr0 * 192 + 2);
    }

    @Override
    public final void C(zk0_1 zk0_1Var) {
        le0_2 le0_2Var = this.K20;
        int lpT2 = kq_0.lpT2(le0_2Var.a3(), this.Mx, 2, le0_2Var.A20 + le0_2Var.e80);
        le0_2 le0_2Var2 = this.K20;
        E40(lpT2, kq_0.lpT2(le0_2Var2.k5(), this.OB, 4, le0_2Var2.SB0 + le0_2Var2.y9));
        BD();
    }

    public final void BD() {
        int i = this.m1 + 1;
        this.m1 = i;
        oq_0 oq_0Var = this.v9;
        byte[] bArr = oq_0Var.Xy;
        if (i >= bArr.length) {
            BU.T50.u3(this);
            tw0_0.rl.ze0(this.B40, (byte) 0);
            return;
        }
        String str = "";
        yt_1 yt_1Var = tw0_0.e60;
        if (yt_1Var != null && yt_1Var.jB0 != null) {
            str = yt_1Var.jB0.oc0;
        }
        int i2 = this.m1;
        lpt6__2 lpt6__2Var = lpt6__2.Q80;
        int i3 = oq_0Var.jK + 191;
        if (i2 < 0 || i2 >= bArr.length) {
            i2 = 0;
        }
        String trim = sm0_0.Bw((byte) 2, lpt6__2Var, i3, bArr[i2], new String[]{str}).trim();
        oq_0 oq_0Var2 = this.v9;
        int i4 = this.m1;
        if (i4 < 0 || i4 >= oq_0Var2.Xy.length) {
            i4 = 0;
        }
        this.XK = oq_0Var2.ih[i4];
        tw0_0.FL.iQ(new kt_0(trim, jm_1.hK, hg_2.bx, new Zb(asBridge())));
    }

    @Override
    public final boolean nd0(i70_0 i70_0Var) {
        if (tw0_0.kz0()) {
            int i = i70_0Var.zu;
            if (E00.C10(i) && i == 5) {
                iw_1 Py0 = tw0_0.FL.Py0();
                if (Py0 != null) {
                    Py0.p3(dw_2.RM);
                }
            }
        }
        return super.nd0(i70_0Var);
    }

    @Override
    public final void HP(zk0_1 zk0_1Var) {
        iw_1 Py0 = tw0_0.FL.Py0();
        byte b = this.XK;
        if (b != -1 && Py0 != null) {
            pk0_0.K60(Py0, (b * 128 * this.Lr0 + (this.A20 + this.e80)) + this.Lr0 * 64, (this.SB0 + this.y9) + 45);
            if (Of()) {
                lpt6__0.v90(Py0);
            }
        }
        super.HP(zk0_1Var);
    }

    @Override
    public final void K8() {
        super.K8();
        for (byte b = 0; b < this.JJ; b++) {
            this.xx0[b].qF0(pa0_0.Ol);
            this.xx0[b].oY(this.Lr0 * 128, 20);
            this.xx0[b].E40(b * 128 * this.Lr0 + (this.A20 + this.e80 + 2), this.SB0 + this.y9 + 10);
        }
    }
}
