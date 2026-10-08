package cn.pokemmo.ui.window.social;

import f.*;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 训练家档案卡片窗口
 *
 * 原混淆类: f.jf_0
 */
public class TrainerCardWindow extends yz_1 implements tr_1  {
    public final jf_0 asBridge() {
        return (jf_0) (Object) this;
    }

    public final cn_0 Iv0;
    public final cn_0 KG0;
    public final cn_0 mf0;
    public final cn_0 Ri0;
    public final cn_0 Lo0;
    public final cn_0 Ut0;
    public final cn_0 o00;
    public final S70[] Sr0;
    public final us_0 Ww;
    public final S70 p80;
    public final S70 cL;
    public final S70 Wv0;
    public final S70 Dk;
    public final S70 yc;
    public final Mm Ce0;
    public byte K;

    public TrainerCardWindow(BU v1) {
        this.K = 0;
        Pb0(new lc0_1(v1));
        uf("trainercard");
        Hy("");
        ff0(1);
        this.Iv0 = new cn_0();
        this.KG0 = new cn_0();
        this.mf0 = new cn_0();
        this.Ri0 = new cn_0();
        this.Lo0 = new cn_0();
        this.Ut0 = new cn_0();
        this.Iv0.uf("trainer-name");
        this.Dk = (S70) new S70(32, 32).JH().r8(new LPT6_[]{fn_0.qz0().X40()});
        this.Wv0 = (S70) new S70(32, 32).JH().r8(new LPT6_[]{fn_0.qz0().wh()});
        this.cL = (S70) new S70(32, 32).JH().r8(new LPT6_[]{fn_0.qz0().DQ()});
        this.p80 = (S70) new S70(32, 32).JH().Nk(new Wr[]{gh_1.Jh0().S1((short) 5431)});
        this.p80.JH().nq0(24, 24);
        this.yc = (S70) new S70(32, 32).JH().Nk(new Wr[]{gh_1.Jh0().S1((short) 5216)});
        this.yc.JH().nq0(24, 24);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        date.setTime(tw0_0.rl.ex().bg() * 1000L);
        this.o00 = new cn_0(ig_0.u9(1606, new StringBuilder(), " ").append(sdf.format(date)).toString());
        this.o00.uf("label-centered");
        this.Ww = new us_0();
        byte b1 = 0;
        _else elseVal = tw0_0.e60.N60();
        if (elseVal != null) {
            b1 = elseVal.ZE();
        }
        this.Sr0 = new S70[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.Sr0[i2] = new S70(32, 32);
            if (tw0_0.rl.hz().Ny(b1, md_1.CL(b1, i2))) {
                this.Sr0[i2].JH().o60(new AG0[]{ob0_0.Ui0().tG0(b1, i2)});
                Br0 br0 = this.Sr0[i2].JH();
                float scale = (b1 == 2 || b1 == 3 || b1 == 4) ? 1.0f : 2.0f;
                br0.dA(scale);
                if (b1 == 2) {
                    this.Sr0[i2].JH().Gy0(8, 0);
                    this.Sr0[i2].JH().nq0(16, 32);
                } else if (b1 == 3) {
                    this.Sr0[i2].JH().Gy0(-4, -4);
                }
            }
            this.Ww.SL(this.Sr0[i2]);
        }
        this.Ww.SL(this.Iv0);
        this.Ww.SL(this.KG0);
        this.Ww.SL(this.mf0);
        this.Ww.SL(this.Ri0);
        this.Ww.SL(this.Lo0);
        this.Ww.SL(this.o00);
        this.Ww.SL(this.Ut0);
        this.Ww.SL(this.Dk);
        this.Ww.SL(this.p80);
        this.Ww.SL(this.cL);
        this.Ww.SL(this.Wv0);
        this.Ww.SL(this.yc);
        S70 spriteLabel = new S70(256, 256);
        spriteLabel.JH().Gy0(0, -10);
        spriteLabel.uf("spritelabeltop");
        spriteLabel.JH().nq0(512, 512);
        this.Ww.SL(spriteLabel);
        this.SL(this.Ww);
        update();
        this.Ce0 = new Mm(asBridge(), tw0_0.e60.at());
        this.Ce0.MA();
        this.Ce0.CF0(2);
    }

    public final void update() {
        BR br = tw0_0.rl;
        if (br == null || br.tp0 == null) {
            return;
        }
        yt_1 yt = tw0_0.e60;
        if (yt == null) {
            return;
        }
        E90 e90 = yt.jB0;
        if (e90 == null) {
            return;
        }
        this.K = e90.Vv;
        int i2 = 0;
        for (Object obj : mp_1.vf0().GG((byte) -1)) {
            cq_0 cq = (cq_0) obj;
            if (tw0_0.rl.tp0.ID0((byte) 1, cq.dR)) {
                i2++;
            }
        }
        int i3 = tw0_0.rl.k0.oc0 / 3600;
        if (tw0_0.kz0()) {
            Hy(e90.oc0);
        }
        this.Iv0.Sk(e90.oc0);
        this.KG0.Sk(ig_0.u9(1602, new StringBuilder(), " $").append(NumberFormat.getInstance().format(tw0_0.rl.k0.il)).toString());
        this.mf0.Sk(ig_0.u9(1605, new StringBuilder(), " ").append(NumberFormat.getInstance().format(tw0_0.rl.k0.HI)).toString());
        this.Ri0.Sk(sm0_0.c0(1) + ": " + i2);
        this.Lo0.Sk(sm0_0.wa0(1603, NumberFormat.getInstance().format(i3)));
        this.Ut0.Sk(sm0_0.wa0(1607, tw0_0.rl.yh0.IL0(e90.ba0.uS) + ""));
    }

    public final void K8() {
        this.Ww.lt0();
        this.Iv0.lt0();
        int i1 = this.A20;
        int i2 = this.SB0;
        this.o00.E40(i1 + 87, i2 + 87);
        this.Iv0.E40(i1 + 14, i2 + 45);
        for (int i3 = 0; i3 < 8; i3++) {
            this.Sr0[i3].E40(i1 + 42 + i3 * 48, i2 + 265);
        }
        int i0 = this.A20;
        int i1_dup = i0 + 170;
        this.p80.E40(i1_dup, i2 + 99);
        int i0_dup = i0 + 196;
        this.Ri0.E40(i0_dup, i2 + 111);
        this.cL.E40(i1_dup, i2 + 127);
        this.KG0.E40(i0_dup, i2 + 139);
        this.Wv0.E40(i1_dup, i2 + 155);
        this.mf0.E40(i0_dup, i2 + 167);
        this.Dk.E40(i1_dup, i2 + 183);
        this.Lo0.E40(i0_dup, i2 + 195);
        this.yc.E40(i1_dup, i2 + 211);
        this.Ut0.E40(i0_dup, i2 + 223);
        super.K8();
        oY(454, 317);
    }

    public final void x00() {
        lpt6__0.v90(this);
    }

    public final void Dw0(zk0_1 v1) {
        update();
        this.Ce0.eQ(this.K, 5, 80);
    }

    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            if (Qy0.af(this)) {
                return super.nd0(v1);
            }
            int i2 = v1.finally$;
            rp_0 v3 = rp_0.nK0;
            int ff = dw_2.ff;
            if (v3 != null && v3.Ov(i2)) {
                BU.T50.Dj0();
                return true;
            }
        } else {
            int i2 = v1.zu;
            if (E00.C10(i2) && i2 == 5) {
                BU.T50.Dj0();
                return true;
            }
        }
        return super.nd0(v1);
    }
}
