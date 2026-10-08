package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.ArrayList;

public class CombatHudOverviewComponent extends BaseComponent implements tr_1 {
    public final Qy0 YP;
    public final fy_2 qN;
    public final boolean interface$;
    public final ArrayList Ue0;
    public int bC0;

    public CombatHudOverviewComponent(Qy0 qy0) {
        ArrayList arrayList = new ArrayList();
        this.Ue0 = arrayList;
        this.bC0 = 0;
        this.YP = qy0;
        fy_2 fy_2Var = new fy_2();
        this.qN = fy_2Var;
        this.interface$ = false;
        uf("gamemenugui");
        fy_2Var.uf("game-menu-panel");
        xe_1 xe_1Var = new xe_1(sm0_0.c0(1110));
        xe_1Var.RR(new dm0_1((f.o4)(Object)this));
        xe_1 xe_1Var2 = new xe_1(sm0_0.c0(1111));
        xe_1Var2.RR(new DR((f.o4)(Object)this, qy0));
        xe_1 xe_1Var3 = new xe_1(sm0_0.c0(1112));
        xe_1Var3.RR(new UK0((f.o4)(Object)this, qy0));
        xe_1 xe_1Var4 = new xe_1(sm0_0.c0(1159));
        xe_1Var4.RR(new v0_0((f.o4)(Object)this));
        xe_1 xe_1Var5 = new xe_1(sm0_0.c0(1124));
        xe_1Var5.RR(new S4((f.o4)(Object)this));
        xe_1 xe_1Var6 = new xe_1(sm0_0.c0(1114));
        xe_1Var6.RR(new nd0_0((f.o4)(Object)this));
        I7 hGroup = fy_2Var.H10();
        Hm0 vGroup = fy_2Var.lo0();
        hGroup.Kn0(xe_1Var);
        vGroup.Kn0(xe_1Var);
        arrayList.add(xe_1Var);
        hGroup.Kn0(xe_1Var2);
        vGroup.Kn0(xe_1Var2);
        arrayList.add(xe_1Var2);
        BR br = tw0_0.rl;
        if (br != null && br.n2() == 5) {
            hGroup.Kn0(xe_1Var3);
            vGroup.Kn0(xe_1Var3);
            arrayList.add(xe_1Var3);
            hGroup.Kn0(xe_1Var5);
            vGroup.Kn0(xe_1Var5);
            arrayList.add(xe_1Var5);
            hGroup.Kn0(xe_1Var4);
            vGroup.Kn0(xe_1Var4);
            arrayList.add(xe_1Var4);
        }
        hGroup.Kn0(xe_1Var6);
        hGroup.Ze0();
        vGroup.Kn0(xe_1Var6);
        arrayList.add(xe_1Var6);
        fy_2Var.x40(hGroup);
        fy_2Var.WQ(vGroup);
        SL(fy_2Var);
    }

    public final void C(zk0_1 zk0_1Var) {
        lpt6__0.v90(fy0());
    }

    @Override
    public final boolean nd0(i70_0 i70_0Var) {
        if (E00.ZU(i70_0Var.zu) && i70_0Var.iT()) {
            int i = i70_0Var.finally$;
            int dummy = dw_2.ff;
            rp_0 rp_0Var = rp_0.kC0;
            if (rp_0Var != null && rp_0Var.Ov(i)) {
                this.bC0--;
                lpt6__0.v90(fy0());
                return true;
            }
            rp_0 rp_0Var2 = rp_0.synchronized$;
            if (rp_0Var2 != null && rp_0Var2.Ov(i)) {
                this.bC0++;
                lpt6__0.v90(fy0());
                return true;
            }
            rp_0 rp_0Var3 = rp_0.sJ0;
            if (rp_0Var3 != null && rp_0Var3.Ov(i)) {
                a7_0.bH(fy0().ER.Fc0);
                return true;
            }
            rp_0 rp_0Var4 = rp_0.nK0;
            if (rp_0Var4 != null && rp_0Var4.Ov(i)) {
                CombatHudOverviewComponent o4Var = this.YP.hl0;
                if (o4Var != null) {
                    o4Var.xe0();
                }
                return true;
            }
        }
        return super.nd0(i70_0Var);
    }

    @Override
    public final void K8() {
        le0_2 le0_2Var = this.K20;
        if (le0_2Var == null) {
            return;
        }
        this.qN.lt0();
        if (this.interface$) {
            this.qN.E40((le0_2Var.A20 + le0_2Var.Mx) - this.qN.Mx, ((le0_2Var.SB0 + le0_2Var.OB) - this.qN.OB) - 40);
        } else {
            this.qN.E40(
                    kq_0.lpT2(le0_2Var.a3(), this.qN.Mx, 2, le0_2Var.A20 + le0_2Var.e80),
                    kq_0.lpT2(le0_2Var.k5(), this.qN.OB, 2, le0_2Var.SB0 + le0_2Var.y9));
        }
    }

    public final xe_1 fy0() {
        if (this.bC0 < 0) {
            this.bC0 = 0;
        }
        if (this.bC0 >= this.Ue0.size()) {
            this.bC0 = this.Ue0.size() - 1;
        }
        return (xe_1) this.Ue0.get(this.bC0);
    }
}
