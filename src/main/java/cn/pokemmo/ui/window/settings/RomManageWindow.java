package cn.pokemmo.ui.window.settings;

import f.*;

import java.util.HashSet;

/**
 * ROM管理与校验设置窗口
 *
 * 原混淆类: f.ro_2
 */
public class RomManageWindow extends R90 {
    public final ro_2 asBridge() {
        return (ro_2) (Object) this;
    }

    public fy_2 LO;
    public pg0_2 pf;
    public X6 FO;
    public W9[] ju0;
    public boolean Zf0;
    public xe_1 Qd0;

    public RomManageWindow() {
        this.Zf0 = false;
        Pb0(this::i);
        ff0(1);
        bD(false);
        uf("rom-panel");
        Gd0();
    }

    public final void oH(boolean z) {
        dw_2.S6 = true;
        if (z) {
            int i = this.FO.mu0.Mw0;
            if (i > -1) {
                String str = (String) this.pf.w7.get(i);
                G50 g50 = null;
                for (G50 g502 : G50.aG) {
                    if (g502.d0.equalsIgnoreCase(str)) {
                        g50 = g502;
                        break;
                    }
                }
                if (g50 == null) {
                    g50 = G50.OJ;
                }
                if (g50 != null && !dw_2.fP.equalsIgnoreCase(g50.PM)) {
                    dw_2.fP = g50.PM;
                    BR br = tw0_0.rl;
                    if (br != null) {
                        br.da0();
                    }
                }
            }
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < this.ju0.length; i2++) {
                if (!this.ju0[i2].ER.U20()) {
                    hashSet.add(G50.oZ((byte) i2, true));
                }
            }
            if (dw_2.x70(hashSet)) {
                BR br2 = tw0_0.rl;
                if (br2 != null) {
                    br2.da0();
                }
            }
        }
        dw_2.CY();
        xe0();
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            kh0();
        }
        super.K8();
        if (tw0_0.kz0()) {
            this.Qd0.lt0();
            this.Qd0.A20(pa0_0.Mk, -68, 0);
        }
    }

    public final void Gd0() {
        if (this.LO != null) {
            u3(this.LO);
        }
        Hy(sm0_0.c0(1390));
        this.LO = new fy_2();
        this.Qd0 = new xe_1(sm0_0.c0(54));
        this.Qd0.RR(this::UT);
        xe_1 xe_1Var = new xe_1(sm0_0.c0(1391));
        xe_1Var.RR(this::Nc0);
        zc0_1 zc0_1Var = new zc0_1();
        zc0_1Var.uf("dialoglayout");
        ya_1 ya_1Var = zc0_1Var.L4;
        ya_1 ya_1Var2 = zc0_1Var.pJ0;

        cn_0 cn_0Var = new cn_0(null, 0);
        cn_0Var.Sk(sm0_0.c0(1392));

        String[] strArr = new String[G50.aG.length];
        for (int i = 0; i < G50.aG.length; i++) {
            strArr[i] = G50.aG[i].d0;
        }
        this.pf = new pg0_2(strArr);
        X6 x6 = new X6();
        x6.r30(this.pf);
        this.FO = x6;
        this.FO.Rm0(this::y2);
        this.FO.uf("combobox-small");

        for (int i2 = 0; i2 < this.pf.w7.size(); i2++) {
            if (((String) this.pf.w7.get(i2)).equalsIgnoreCase(G50.Rw(dw_2.fP).d0)) {
                this.FO.Bd(i2);
            }
        }
        this.FO.Rm0(this::cB);

        le0_2[] le0_2Arr = new le0_2[]{cn_0Var, this.FO};
        zc0_1Var.L4.X20(zc0_1Var.hb(le0_2Arr));
        zc0_1Var.pJ0.X20(new I7(zc0_1Var).Ze0().LPt3(le0_2Arr).Ze0()).p70(20);

        cn_0 cn_0Var2 = new cn_0(null, 0);
        cn_0Var2.Sk(sm0_0.c0(1393));

        G50[] g50Arr = G50.aG;
        cn_0[] cn_0Arr = new cn_0[g50Arr.length];
        this.ju0 = new W9[g50Arr.length];
        for (int i3 = 0; i3 < g50Arr.length; i3++) {
            G50 g50 = g50Arr[i3];
            cn_0 cn_0Var3 = new cn_0(null, 0);
            cn_0Var3.Sk(VG.Mq(new StringBuilder().append(g50.d0).append(" ["), g50.na, "]"));
            cn_0Arr[g50.Sf0] = cn_0Var3;
            cn_0Arr[g50.Sf0].uf("label-set");
            this.ju0[g50.Sf0] = new W9();
            this.ju0[g50.Sf0].uf("togglebutton");
            this.ju0[g50.Sf0].ER.lK0(!dw_2.U70().contains(g50));
            this.ju0[g50.Sf0].RR(() -> Jn0(g50));
        }

        le0_2[] le0_2Arr2 = new le0_2[]{cn_0Var2};
        zc0_1Var.L4.X20(zc0_1Var.hb(le0_2Arr2));
        zc0_1Var.pJ0.X20(new I7(zc0_1Var).Ze0().LPt3(le0_2Arr2).Ze0());

        for (int i4 = 0; i4 < this.ju0.length; i4++) {
            if (i4 < this.ju0.length - 3) {
                int i5 = i4 + 1;
                int i6 = i4 + 2;
                zc0_1Var.qG0(new le0_2[]{
                    cn_0Arr[i4], this.ju0[i4],
                    cn_0Arr[i5], this.ju0[i5],
                    cn_0Arr[i6], this.ju0[i6]
                });
            } else {
                zc0_1Var.qG0(new le0_2[]{
                    cn_0Arr[i4], this.ju0[i4]
                });
            }
        }

        if (!tw0_0.kz0()) {
            ya_1Var.qd(5);
            ya_1Var2.X20(zc0_1Var.hb(new le0_2[]{xe_1Var, this.Qd0})).qd(5);
            zc0_1Var.pJ0.X20(zc0_1Var.C7(new le0_2[]{xe_1Var}).Ze0().LPt3(new le0_2[]{this.Qd0}).qd(5));
        } else {
            ya_1Var.qd(5);
            ya_1Var2.X20(zc0_1Var.hb(new le0_2[]{xe_1Var})).qd(5);
            zc0_1Var.pJ0.X20(new I7(zc0_1Var).Ze0().Kn0(xe_1Var));
        }
        zc0_1Var.x40(ya_1Var);
        zc0_1Var.WQ(ya_1Var2);

        this.LO.x40(new I7(this.LO).Ze0().Kn0(zc0_1Var).Ze0());
        this.LO.WQ(new I7(this.LO).Ze0().Kn0(zc0_1Var).Ze0());
        y2();
        F9(fU(), this.LO);
        if (tw0_0.kz0()) {
            this.Qd0.uf("mobile-save-icon");
            this.Qd0.SU("");
            F9(fU(), this.Qd0);
        }
    }

    public final void y2() {
        int i = this.FO.mu0.Mw0;
        if (i < 0 || this.ju0 == null) {
            return;
        }
        String str = (String) this.pf.w7.get(i);
        G50 g50 = null;
        for (G50 g502 : G50.aG) {
            if (g502.d0.equalsIgnoreCase(str)) {
                g50 = g502;
                break;
            }
        }
        if (g50 == null) {
            g50 = G50.OJ;
        }
        for (int i2 = 0; i2 < this.ju0.length; i2++) {
            if (i2 == g50.Sf0) {
                if (!this.ju0[i2].ER.U20()) {
                    this.ju0[i2].ER.lK0(true);
                }
                this.ju0[i2].pw0(false);
            } else {
                this.ju0[i2].pw0(true);
            }
        }
    }

    public final void Jn0(G50 g50) {
        if (this.Zf0 && this.ju0[g50.Sf0].ER.U20() && g50.Sf0 != this.FO.mu0.Mw0) {
            this.Zf0 = false;
        }
    }

    public final void cB() {
        if (this.Zf0) {
            for (int i = 0; i < this.ju0.length; i++) {
                this.ju0[i].ER.lK0(this.FO.mu0.Mw0 == i);
            }
        } else {
            this.ju0[this.FO.mu0.Mw0].ER.lK0(true);
        }
    }

    public final void Nc0() {
        for (int i = 0; i < this.ju0.length; i++) {
            int i2 = this.FO.mu0.Mw0;
            if (i2 != i) {
                this.ju0[i].ER.lK0(i2 == i);
            }
        }
        this.Zf0 = true;
    }

    public final void UT() {
        oH(true);
    }

    public final void i() {
        oH(false);
    }
}
