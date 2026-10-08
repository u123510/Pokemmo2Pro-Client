package cn.pokemmo.ui.window.admin;

import f.*;

/**
 * BGM与游戏音效调试器窗口
 *
 * 原混淆类: f.f90_0
 */
public class SoundDebuggerWindow extends R90 {
    public final f90_0 asBridge() { return (f90_0) (Object) this; }

    public final fy_2 QL0;
    public final Aj xi;
    public final Aj KE0;
    public final cn_0 Nf0;
    public final W9[] qX;

    public SoundDebuggerWindow(xn0_0 xn0_0Var) {
        this.qX = new W9[16];
        fy_2 fy_2Var = new fy_2();
        this.QL0 = fy_2Var;
        ff0(1);
        uf("adminframe");
        Hy("Sound Debugger");
        Pb0(new ve_1(asBridge(), xn0_0Var));
        cn_0 cn_0Var = new cn_0("Region ID: ");
        cn_0 cn_0Var2 = new cn_0("Track ID: ");
        Aj aj = new Aj(0, 10, 0);
        this.xi = aj;
        Gh0 gh0 = new Gh0(aj);
        Aj aj2 = new Aj(1, 5000, 1);
        this.KE0 = aj2;
        Gh0 gh02 = new Gh0(aj2);
        cn_0 cn_0Var3 = new cn_0();
        this.Nf0 = cn_0Var3;
        cn_0Var3.RY(300, 20);
        this.xi.Kj(new nn_2(asBridge()));
        this.KE0.Kj(new uw_1(asBridge()));
        xe_1 playBtn = new xe_1("PLAY");
        playBtn.RR(new ra_0(asBridge()));
        xe_1 stopBtn = new xe_1("STOP");
        stopBtn.RR(new WI0());
        for (int i = 0; i < this.qX.length; i++) {
            W9 w9 = new W9();
            this.qX[i] = w9;
            w9.k50((Fy0.fG0 & (1 << i)) != 0);
            this.qX[i].RR(new ab0_0(asBridge(), i));
        }
        this.QL0.WQ(this.QL0.lo0().LPt3(new le0_2[]{cn_0Var, gh0, cn_0Var2, gh02, this.Nf0, playBtn, stopBtn}).X20(this.QL0.C7(new le0_2[]{this.qX[0], this.qX[1], this.qX[2], this.qX[3], this.qX[4], this.qX[5], this.qX[6], this.qX[7]})).X20(this.QL0.C7(new le0_2[]{this.qX[8], this.qX[9], this.qX[10], this.qX[11], this.qX[12], this.qX[13], this.qX[14], this.qX[15]})));
        this.QL0.x40(this.QL0.H10().LPt3(new le0_2[]{cn_0Var, gh0, cn_0Var2, gh02, this.Nf0, playBtn, stopBtn}).X20(this.QL0.hb(new le0_2[]{this.qX[0], this.qX[1], this.qX[2], this.qX[3], this.qX[4], this.qX[5], this.qX[6], this.qX[7]})).X20(this.QL0.hb(new le0_2[]{this.qX[8], this.qX[9], this.qX[10], this.qX[11], this.qX[12], this.qX[13], this.qX[14], this.qX[15]})));
        SL(this.QL0);
    }

    public final void mi0() {
        for (int i = 0; i < this.qX.length; i++) {
            W9 w9 = this.qX[i];
            if (w9 != null) {
                w9.Ll(N50.Fc((byte) this.xi.cx0));
            }
        }
        tw0_0.RE0.BK0(false);
        try {
            Thread.sleep(50L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        byte b = (byte) this.xi.cx0;
        if (b == 10) {
            tw0_0.RE0.Hq0((byte) 10, (short) this.KE0.cx0);
        } else {
            tw0_0.RE0.Eh(b, (short) this.KE0.cx0, true, false);
        }
        if (N50.Fc((byte) this.xi.cx0)) {
            cn_0 cn_0Var = this.Nf0;
            l50_0 ab = tw0_0.Ll0.AB((byte) this.xi.cx0);
            hx_2 rp = ab.RP();
            int i0 = this.KE0.cx0;
            int i3 = 0;
            if (rp.YZ == null) {
                if (rp.Wo != 0) {
                    rp.YZ = new Uz0(rp);
                } else {
                    cn_0Var.Sk("--");
                    return;
                }
            }
            if (i0 < 0 || i0 >= rp.YZ.Rw[i3].KB.length) {
                cn_0Var.Sk("--");
                return;
            }
            cn_0Var.Sk(rp.YZ.Rw[i3].KB[i0]);
        }
    }

    @Override
    public final void K8() {
        lt0();
        this.QL0.lt0();
        super.K8();
    }
}
