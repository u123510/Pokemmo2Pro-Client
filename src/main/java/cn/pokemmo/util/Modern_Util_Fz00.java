package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.fz0_0
 */
public class Modern_Util_Fz00 extends nq0_0 {

    public final mc0_1 ss0;

    public Modern_Util_Fz00(mc0_1 mc0_1Var) {
        this.ss0 = mc0_1Var;
    }

    @Override
    public final boolean nX(int i, String str) {
        if (this.ss0.Z8 == i) {
            return true;
        }
        return tx_1.qp0(tx_1.J10(sm0_0.c0(this.ss0.Nl), false), str);
    }

    @Override
    public final void E60(A40 a40) {
        S70 s70 = new S70(24, 24, 0);
        s70.og.Nk(new Wr[] { gh_1.aH0.Jg(this.ss0.Z8, false) });
        s70.og.OA0 = true;
        s70.og.IF = 24;
        s70.og.gx0 = 24;
        a40.vx0(s70.og);

        byte b = this.ss0.PX;
        if (b >= 0 && b < 10) {
            a40.DL(b + 250000);
        } else if (b == 10) {
            a40.es("Custom");
        } else {
            a40.es("-");
        }

        a40.es(String.valueOf((int) this.ss0.Z8));
        xe_1 xe_1Var = new xe_1(sm0_0.c0(this.ss0.Nl));
        xe_1Var.RR(this);
        a40.vx0(xe_1Var).goto$();
    }

    @Override
    public final void run() {
        String cmd = "//createitem " + tw0_0.rl.k0.Nw0 + " " + ((int) this.ss0.Z8) + " 1";
        tw0_0.rl.Cp(zo_0.Pk, cmd, "", true);
    }
}

