package cn.pokemmo.ui.window.admin;

import f.*;

/**
 * 倒计时进度条窗口
 *
 * 原混淆类: f.ek0_0
 */
public class ProgressBarWindow extends R90 {
    public final tk0_0 T5;
    public final ae0_1 n80;
    public final W9[] Dk0;
    public final long Sv;
    public final float E90;
    public final xe_1 Vc;

    public ProgressBarWindow(int i1, G50 v2, CH0[] v3, boolean[] v4) {
        super();
        ff0(1);
        bD(false);
        Hy(sm0_0.c0(6732));
        this.E90 = (float) i1 * 1000.0f;
        this.Sv = System.currentTimeMillis() + (long) i1 * 1000L;
        tk0_0 tk0_0 = new tk0_0();
        this.T5 = tk0_0;
        A40 a40 = tk0_0.gg0;
        a40.yI().ys0(10.0f);
        ae0_1 ae0_1 = new ae0_1();
        this.n80 = ae0_1;
        ae0_1.aE(1.0f);
        for (int i5 = 0; i5 < v3.length; i5++) {
            CH0 ch0 = v3[i5];
            String name = "???";
            E90 e90 = tw0_0.e60.at();
            if (e90 != null) {
                if (e90.ZK().equals(ch0)) {
                    name = e90.na0();
                } else if (tw0_0.rl.Qu() != null && tw0_0.rl.Qu().W(ch0)) {
                    name = tw0_0.rl.Qu().EC0(ch0).GS();
                } else if (tw0_0.rl.t7() != null && tw0_0.rl.t7().MH0(ch0)) {
                    name = tw0_0.rl.t7().ci(ch0).getName();
                } else if (tw0_0.rl.U20() != null && tw0_0.rl.U20().rY(ch0)) {
                    name = tw0_0.rl.U20().GC0(ch0).getName();
                }
            }
            a40.vx0(new cn_0(name));
        }
        a40.Rg();
        this.Dk0 = new W9[v4.length];
        for (int i3 = 0; i3 < v4.length; i3++) {
            this.Dk0[i3] = new W9();
            this.Dk0[i3].pw0(false);
            this.Dk0[i3].k50(v4[i3]);
            a40.vx0(this.Dk0[i3]).ru();
        }
        a40.Rg();
        a40.vx0(this.n80).goto$().ae0(Integer.valueOf(this.Dk0.length));
        this.n80.uf("time-progressbar");
        this.Vc = new xe_1(sm0_0.c0(5048));
        this.Vc.RR(this::wu);
        S70 s70 = new S70(32, 32);
        s70.JH().df();
        s70.JH().r8(new LPT6_[]{fn_0.qz0().ln0(v2.sv0())});
        a40.Rg();
        ka0_1 ka0_1 = new ka0_1();
        ka0_1.SL(s70);
        ka0_1.SL(new cn_0(v2.aD()));
        a40.vx0(ka0_1).Wa0().Yt().ae0(Integer.valueOf(this.Dk0.length));
        a40.Rg();
        a40.vx0(this.Vc).ae0(Integer.valueOf(this.Dk0.length)).goto$();
        SL(this.T5);
        tw0_0.RE0.Hq0((byte) 2, (short) 1383);
    }

    public final void FW(zk0_1 v1) {
        long remaining = this.Sv - System.currentTimeMillis();
        if (remaining > 0L) {
            this.n80.aE((float) remaining / this.E90);
        } else if (this.Vc.OI) {
            this.Vc.pw0(false);
            tw0_0.rl.fk0.uQ(new ye0_0(true));
        }
    }

    public final void wu() {
        this.Vc.pw0(false);
        tw0_0.rl.fk0.uQ(new ye0_0(false));
    }
}
