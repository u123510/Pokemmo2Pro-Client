package cn.pokemmo.ui.window.inventory;

import f.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 物品槽位详情展示小窗
 *
 * 原混淆类: f.qv0_0
 */
public class ItemSlotDetailWindow extends yz_1 implements tr_1  {
    public final qv0_0 asBridge() {
        return (qv0_0) (Object) this;
    }

    public final VM NO;
    public final dg0_0 jL;
    public final dg0_0 ZG0;
    public final fy_2 cs;
    public final xe_1 LpT8;
    public final xe_1 dV;
    public final Qv0 Td;

    public ItemSlotDetailWindow(K5 v1) {
        super();
        Pb0(this::close);
        if (tw0_0.kz0()) {
            uf("mysterious-gem");
        } else {
            uf("seed-plant-dialog");
            Hy(sm0_0.c0(101176));
        }
        fy_2 cs = new fy_2();
        this.cs = cs;
        xe_1 lpT8 = new xe_1(sm0_0.c0(16780461));
        this.LpT8 = lpT8;
        xe_1 dv = new xe_1(sm0_0.c0(nf0_0.Bq0));
        this.dV = dv;
        lpT8.RR(this::jw0);
        dv.RR(this::close);
        lpT8.pw0(false);
        dg0_0 jL = new dg0_0();
        this.jL = jL;
        dg0_0 zg0 = new dg0_0();
        this.ZG0 = zg0;
        for (dg0_0 dg : Arrays.asList(jL, zg0)) {
            dg.tD0(() -> zr(dg));
            dg.Mj0(true);
            dg.RR(this::Nf0);
        }
        VM vm = new VM(v1);
        this.NO = vm;
        vm.pw0(false);
        vm.uf("item-slot");
        Qv0 qv = new Qv0("\n\n");
        this.Td = qv;
        qv.Ll(false);

        ya_1 h10 = cs.H10().qd(15);
        ya_1 y1 = bo_0.ph0(cs.lo0(), new le0_2[]{jL, vm, zg0}, h10, 15);
        ya_1 y2 = bo_0.ph0(cs.lo0(), new le0_2[]{qv}, y1, 15);
        cs.x40(cs.H10().LPt3(new le0_2[]{lpT8, dv}).X20(y2).Ze0());

        ya_1 col1 = cs.H10().Ze0()
                .Kn0(jL).Ze0()
                .Kn0(vm).Ze0()
                .LPt3(new le0_2[]{zg0}).Ze0();
        ya_1 col2 = cs.H10().Ze0().Kn0(qv).Ze0();
        ya_1 buttons = cs.lo0().LPt3(new le0_2[]{lpT8, dv});
        cs.WQ(cs.lo0().X20(col1).X20(col2).X20(buttons));
        SL(cs);
        Nf0();
    }

    public static int rH0(VU v0) {
        return v0.I8.ou0;
    }

    public final void jw0() {
        VU v1 = this.jL.AG;
        if (v1 != null) {
            VU v2 = this.ZG0.AG;
            if (v2 != null) {
                tw0_0.rl.fk0.uQ(new RK(v1.pu, v2.pu));
                close();
                return;
            }
        }
        close();
    }

    public final void close() {
        BU bu = BU.T50;
        qv0_0 bw = bu.Bw;
        if (bw != null) {
            bw.xe0();
            bu.Bw = null;
        }
    }

    @Override
    public final void x00() {
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            kh0();
            this.cs.vf(pa0_0.Ol);
            this.cs.oY(550, 550);
        } else {
            super.K8();
            lt0();
            N80(pa0_0.Ol);
        }
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            int key = v1.finally$;
            rp_0 sJ0 = rp_0.sJ0;
            if (sJ0 != null && sJ0.Ov(key) && this.LpT8.Of()) {
                a7_0.bH(this.LpT8.ER.Fc0);
                return true;
            }
            rp_0 nK0 = rp_0.nK0;
            if (nK0 != null && nK0.Ov(key)) {
                a7_0.bH(this.dV.ER.Fc0);
                return true;
            }
            if (sJ0 != null && sJ0.Ov(key) && this.dV.Of()) {
                a7_0.bH(this.dV.ER.Fc0);
                return true;
            }
            rp_0 kC0 = rp_0.kC0;
            if ((kC0 != null && kC0.Ov(key)) || (rp_0.I90 != null && rp_0.I90.Ov(key))) {
                Uz(-1, true);
                return true;
            }
            rp_0 sync = rp_0.synchronized$;
            if ((sync != null && sync.Ov(key)) || (rp_0.Ni != null && rp_0.Ni.Ov(key))) {
                Uz(1, true);
                return true;
            }
        }
        return super.nd0(v1);
    }

    public final List dB() {
        return Arrays.stream(tw0_0.rl.r1(_volatile.BV).y0())
                .filter(this::zR)
                .sorted(Comparator.comparingInt(qv0_0::rH0))
                .collect(Collectors.toList());
    }

    public final void Nf0() {
        VU v1 = this.jL.AG;
        VU v2 = this.ZG0.AG;
        this.Td.Ll(true);
        if (v1 == null || v2 == null) {
            this.LpT8.pw0(false);
            this.Td.Sk(sm0_0.c0(16780472));
            return;
        }
        if (v1.I8.vn() || v2.I8.vn()) {
            this.Td.Sk(sm0_0.c0(16780462));
            this.LpT8.pw0(false);
            return;
        }
        cq_0 v3 = v1.f60;
        cq_0 v4 = v2.f60;
        v3.getClass();
        if (v4.dR != v3.dR) {
            cq_0 v5 = v4.ng;
            cq_0 v6 = (v5 == null) ? v4 : v5;
            short i6 = v6.dR;
            cq_0 v7 = v3.ng;
            cq_0 v8 = (v7 == null) ? v3 : v7;
            short i8 = v8.dR;
            if (i8 == 29 || i8 == 32) {
                if (i6 != 29 && i6 != 32) {
                    this.Td.Sk(sm0_0.c0(16780467));
                    this.LpT8.pw0(false);
                    return;
                }
            } else if (i8 == 313 || i8 == 314) {
                if (i6 != 313 && i6 != 314) {
                    this.Td.Sk(sm0_0.c0(16780467));
                    this.LpT8.pw0(false);
                    return;
                }
            } else {
                if (v7 != null) {
                    v3 = v7;
                }
                if (v5 != null) {
                    v4 = v5;
                }
                if (v3 != v4) {
                    this.Td.Sk(sm0_0.c0(16780467));
                    this.LpT8.pw0(false);
                    return;
                }
            }
        }
        if (!v1.I8.ca() && !v2.I8.ca()) {
            this.Td.Sk(sm0_0.c0(16780466));
            this.LpT8.pw0(false);
            return;
        }
        if (v1.I8.ca() && v2.I8.ca()) {
            this.Td.Sk(sm0_0.c0(16780465));
            this.LpT8.pw0(false);
            return;
        }
        VU v3_seed = v1.I8.ca() ? v1 : v2;
        VU v4_seed = (v1 == v3_seed) ? v2 : v1;
        short i5 = (short) (v4_seed.I8.I() ? 3 : 1);
        StringBuilder sb = new StringBuilder();
        String str1;
        String str2;
        if (v1.I8.Yb0 == v2.I8.Yb0) {
            boolean b = (v4_seed == v1);
            str1 = sm0_0.wa0(b ? 16780473 : 16780474, v4_seed.na0());
            str2 = sm0_0.wa0(b ? 16780474 : 16780473, v3_seed.na0());
        } else {
            str1 = v4_seed.na0();
            str2 = v3_seed.na0();
        }
        cq_0 cq4 = v4_seed.f60;
        if (cq4.h5[2] > 0) {
            sb.append(sm0_0.Bx(16780470, new String[]{str1, sm0_0.c0(cq4.Lh(2) + 210000)}));
        } else {
            sb.append(sm0_0.wa0(16780471, str1));
        }
        sb.append("\n\n")
                .append(sm0_0.wa0(16780464, str2))
                .append("\n\n")
                .append(sm0_0.wa0(16780463, Integer.toString(i5)));
        this.Td.Sk(sb.toString());
        this.LpT8.pw0(this.NO.ax >= i5);
    }

    public final boolean zR(VU v1) {
        return v1 != null && v1 != this.jL.AG && v1 != this.ZG0.AG;
    }

    public final void zr(dg0_0 v1) {
        List list = dB();
        boolean hasAg = (v1.AG != null);
        Vt0 vt = pv0_0.instanceof$(v1, list, hasAg);
        UA.zd(vt, v1);
    }
}
