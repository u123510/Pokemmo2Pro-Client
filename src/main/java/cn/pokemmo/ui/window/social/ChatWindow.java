package cn.pokemmo.ui.window.social;

import f.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 聊天频道与社交聊天主窗口
 *
 * 原混淆类: f.es_2
 */
public class ChatWindow extends R90 implements tr_1  {
    public final es_2 asBridge() {
        return (es_2) (Object) this;
    }

    public final lo0_0 WO;
    public final fy_2 Zi;
    public int Li = 0;
    public final ArrayList ad;

    public ChatWindow() {
        this.ad = new ArrayList();
        uf("base-frame-padded");
        Hy(sm0_0.c0(8));
        ff0(1);
        fy_2 fy_2Var = new fy_2();
        this.Zi = fy_2Var;
        fy_2Var.WQ(fy_2Var.lo0());
        this.Zi.x40(this.Zi.H10());
        lo0_0 lo0_0Var = new lo0_0(this.Zi);
        this.WO = lo0_0Var;
        lo0_0Var.Qs0(2);
        SL(this.WO);
        Iterator it = h40_0.Hg().ui().values().iterator();
        while (it.hasNext()) {
            ot_1 ot_1Var = (ot_1) it.next();
            if (ot_1Var.nQ() == -1 || tw0_0.rl.hz().Ny(ot_1Var.yB(), ot_1Var.nQ())) {
                if (ot_1Var.PS() == -1 || ot_1Var.PS() == tw0_0.e60.at().K60()) {
                    short Ys = (short) ot_1Var.Ys();
                    xe_1 xe_1Var = new xe_1(ot_1Var.xM() + " " + ot_1Var.Pc());
                    xe_1Var.RR(new Dk(asBridge(), Ys));
                    this.Zi.kl0().Kn0(xe_1Var);
                    this.Zi.nt0().Kn0(xe_1Var);
                    this.ad.add(xe_1Var);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ug0_0.ho().kG0().iterator();
        while (it2.hasNext()) {
            Yr0 yr0 = (Yr0) it2.next();
            if (tw0_0.rl.hz().Rd0(yr0.YG0())) {
                arrayList.add(yr0);
            }
        }
        Collections.sort(arrayList, new ac_1());
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Yr0 yr02 = (Yr0) it3.next();
            short YG0 = yr02.YG0();
            xe_1 xe_1Var2 = new xe_1(yr02.Iy() + " " + yr02.W90());
            xe_1Var2.RR(new BL0(asBridge(), YG0));
            this.Zi.kl0().Kn0(xe_1Var2);
            this.Zi.nt0().Kn0(xe_1Var2);
            this.ad.add(xe_1Var2);
        }
        xe_1 xe_1Var3 = new xe_1(sm0_0.c0(65));
        xe_1Var3.RR(new wc0_1(asBridge()));
        this.Zi.kl0().Kn0(xe_1Var3);
        this.Zi.nt0().Kn0(xe_1Var3);
        this.ad.add(xe_1Var3);
        RY(210, 250);
        oY(210, 250);
    }

    @Override
    public final void C(zk0_1 zk0_1Var) {
        if (this.Li >= this.ad.size()) {
            this.Li = this.ad.size() - 1;
        }
        if (this.Li < 0) {
            this.Li = 0;
        }
        xe_1 xe_1Var = (this.Li >= this.ad.size()) ? null : (xe_1) this.ad.get(this.Li);
        if (xe_1Var != null) {
            lpt6__0.v90(xe_1Var);
            lo0_0 lo0_0Var = this.WO;
            if (lo0_0Var != null) {
                lo0_0Var.Rn(xe_1Var);
            }
        }
    }

    public final void nD() {
        if (this.Li >= this.ad.size()) {
            this.Li = this.ad.size() - 1;
        }
        if (this.Li < 0) {
            this.Li = 0;
        }
        xe_1 xe_1Var = (this.Li >= this.ad.size()) ? null : (xe_1) this.ad.get(this.Li);
        if (xe_1Var != null) {
            lpt6__0.v90(xe_1Var);
            lo0_0 lo0_0Var = this.WO;
            if (lo0_0Var != null) {
                lo0_0Var.Rn(xe_1Var);
            }
        }
    }

    @Override
    public final boolean nd0(i70_0 i70_0Var) {
        if (E00.ZU(i70_0Var.zu) && i70_0Var.iT()) {
            int i = i70_0Var.finally$;
            rp_0 rp_0Var = rp_0.kC0;
            int i2 = dw_2.ff;
            if (rp_0Var != null && rp_0Var.Ov(i)) {
                int i3 = this.Li - 1;
                this.Li = i3;
                if (i3 >= this.ad.size()) {
                    this.Li = this.ad.size() - 1;
                }
                if (this.Li < 0) {
                    this.Li = 0;
                }
                xe_1 xe_1Var = (this.Li >= this.ad.size()) ? null : (xe_1) this.ad.get(this.Li);
                if (xe_1Var != null) {
                    lpt6__0.v90(xe_1Var);
                    lo0_0 lo0_0Var = this.WO;
                    if (lo0_0Var != null) {
                        lo0_0Var.Rn(xe_1Var);
                    }
                }
                return true;
            }
            rp_0 rp_0Var2 = rp_0.synchronized$;
            if (rp_0Var2 != null && rp_0Var2.Ov(i)) {
                int i4 = this.Li + 1;
                this.Li = i4;
                if (i4 >= this.ad.size()) {
                    this.Li = this.ad.size() - 1;
                }
                if (this.Li < 0) {
                    this.Li = 0;
                }
                xe_1 xe_1Var2 = (this.Li >= this.ad.size()) ? null : (xe_1) this.ad.get(this.Li);
                if (xe_1Var2 != null) {
                    lpt6__0.v90(xe_1Var2);
                    lo0_0 lo0_0Var2 = this.WO;
                    if (lo0_0Var2 != null) {
                        lo0_0Var2.Rn(xe_1Var2);
                    }
                }
                return true;
            }
            rp_0 rp_0Var3 = rp_0.sJ0;
            if (rp_0Var3 != null && rp_0Var3.Ov(i)) {
                if (this.Li >= this.ad.size()) {
                    this.Li = this.ad.size() - 1;
                }
                if (this.Li < 0) {
                    this.Li = 0;
                }
                xe_1 xe_1Var3 = (this.Li >= this.ad.size()) ? null : (xe_1) this.ad.get(this.Li);
                if (xe_1Var3 != null) {
                    a7_0.bH(xe_1Var3.ER.Fc0);
                }
                return true;
            }
            rp_0 rp_0Var4 = rp_0.nK0;
            if (rp_0Var4 != null && rp_0Var4.Ov(i)) {
                a7_0.bH(((xe_1) this.ad.get(this.ad.size() - 1)).ER.Fc0);
                return true;
            }
        }
        return super.nd0(i70_0Var);
    }

    @Override
    public final void K8() {
        this.Zi.RY(186, 10);
        this.Zi.lt0();
        this.WO.RY(210, 250);
        this.WO.lt0();
        this.WO.vi(7, 7, 7, 7);
        super.K8();
    }
}
