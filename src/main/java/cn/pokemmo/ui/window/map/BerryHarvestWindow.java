package cn.pokemmo.ui.window.map;

import f.*;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 树果采摘弹窗
 *
 * 原混淆类: f.n4_0
 */
public class BerryHarvestWindow extends yz_1 implements tr_1  {
    public final n4_0 asBridge() {
        return (n4_0) (Object) this;
    }

    public UA fJ;
    public final K5 av0;
    public final HK0 Y20;
    public final fy_2 Com7;
    public final xe_1 sw;
    public final xe_1 gk;
    public final CH0 yD;

    public BerryHarvestWindow(K5 v1, CH0 v2) {
        Pb0(this::close);
        if (tw0_0.kz0()) {
            uf("multi-use-item");
        } else {
            uf("seed-plant-dialog");
            Hy(v1.Ua());
        }
        this.av0 = v1;
        this.yD = v2;
        fy_2 v2_fy;
        this.Com7 = v2_fy = new fy_2();
        xe_1 v3_sw = new xe_1(sm0_0.c0(8551));
        this.sw = v3_sw;
        xe_1 v4_gk = new xe_1(sm0_0.c0(nf0_0.Bq0));
        this.gk = v4_gk;
        v3_sw.SU(sm0_0.c0(8551));
        v3_sw.RR(() -> De0(v1));
        v4_gk.RR(this::IC0);

        HK0 v5 = new HK0(asBridge());
        short i1 = v1.pm();
        short i6 = v1.I7();
        v5.Uj0((byte) 0, i1, i6);
        v5.TK();
        v5.Oq0(false);

        cn_0 v1_cn = new cn_0(sm0_0.c0(8550));
        HK0 v6 = new HK0(asBridge());
        this.Y20 = v6;
        Runnable r = this::Ml;
        v6.RR(r);
        v6.of(r);

        ya_1 ya1 = Com7.H10().qd(15).Kn0(v1_cn).qd(15);
        Com7.x40(Com7.H10().LPt3(new le0_2[]{v3_sw, v4_gk}).X20(bo_0.ph0(Com7.lo0(), new le0_2[]{v5, v6}, ya1, 15)).Ze0());
        Com7.WQ(Com7.lo0().Kn0(v1_cn).X20(Com7.H10().Ze0().Kn0(v5).Ze0().Kn0(v6).Ze0()).X20(Com7.lo0().Kn0(v3_sw).Kn0(v4_gk)));
        SL(Com7);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            int i2 = v1.finally$;
            rp_0 v3 = rp_0.sJ0;
            int ff = dw_2.ff;
            if (v3 != null) {
                if (v3.Ov(i2) && this.Y20.Of()) {
                    a7_0.bH(this.Y20.ER.Fc0);
                    return true;
                }
            }
            if (v3 != null) {
                if (v3.Ov(v1.finally$) && this.sw.Of()) {
                    a7_0.bH(this.sw.ER.Fc0);
                    return true;
                }
            }
            rp_0 v4 = rp_0.nK0;
            if (v4 != null && v4.Ov(v1.finally$)) {
                a7_0.bH(this.gk.ER.Fc0);
                return true;
            }
            if (v3 != null && v3.Ov(v1.finally$) && this.gk.Of()) {
                a7_0.bH(this.gk.ER.Fc0);
                return true;
            }
            rp_0 v3_kc = rp_0.kC0;
            if (v3_kc != null && v3_kc.Ov(v1.finally$)) {
                Uz(-1, true);
                return true;
            }
            rp_0 v3_i9 = rp_0.I90;
            if (v3_i9 != null && v3_i9.Ov(v1.finally$)) {
                Uz(-1, true);
                return true;
            }
            rp_0 v3_sync = rp_0.synchronized$;
            if (v3_sync != null && v3_sync.Ov(v1.finally$)) {
                Uz(1, true);
                return true;
            }
            rp_0 v3_ni = rp_0.Ni;
            if (v3_ni != null && v3_ni.Ov(v1.finally$)) {
                Uz(1, true);
                return true;
            }
        }
        return super.nd0(v1);
    }

    public final void x00() {
        CH0 v1 = this.yD;
        if (v1.Sa != 0L) {
            A5 a5 = A5.PG0;
            RJ0 rj0 = tw0_0.rl.NC[1];
            K5 k5 = rj0.zg(v1);
            if (k5 != null && k5.cL.X80() && k5.nn.wQ != 1446) {
                this.Y20.UR(k5);
                if (k5.nn.PA0 > 1) {
                    return;
                }
            }
        }
        lpt6__0.v90(this.Y20);
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            kh0();
            this.Com7.vf(pa0_0.Ol);
            this.Com7.oY(500, 325);
        } else {
            super.K8();
            lt0();
            N80(pa0_0.Ol);
        }
    }

    public final void close() {
        BU bu = BU.T50;
        n4_0 v1 = bu.ae;
        if (v1 != null) {
            v1.xe0();
            bu.ae = null;
        }
    }

    public final void Ml() {
        if (this.Y20.Of()) {
            Vt0 v1 = new Vt0();
            ArrayList<K5> v2 = new ArrayList<>();
            A5 a5 = A5.PG0;
            K5[] k5Array = tw0_0.rl.NC[1].KL();
            for (K5 k6 : k5Array) {
                if (k6.cL.X80() && k6.nn.wQ != 1446) {
                    v2.add(k6);
                }
            }
            Collections.sort(v2);
            for (K5 v3 : v2) {
                String v5 = v3.nn.PA0 + "x " + v3.Ua();
                Wr v3_wr = gh_1.aH0.F10(v3.cL, false);
                kf0_1 v4 = new kf0_1(v5, v3_wr, 3, 3, 24, 24, () -> Rb0(v3), false);
                v1.hx.add(v4);
            }
            if (v1.hx.size() < 1) {
                v1.mA0(sm0_0.c0(6007), null);
            }
            this.fJ = UA.zd(v1, this.Y20);
        }
    }

    public final void Rb0(K5 v1) {
        this.Y20.UR(v1);
    }

    public final void IC0() {
        close();
        jc_2 v = BU.T50.lB0;
        if (v != null) {
            v.vK();
        }
    }

    public final void De0(K5 v1) {
        if (this.Y20.wE0 < 1) {
            tw0_0.rl.qK(sm0_0.c0(8557));
            return;
        }
        Qy0 v2 = Qy0.yI0;
        String[] v5 = new String[2];
        v5[0] = fp0_0.uD(new StringBuilder(), this.Y20.ax, "");
        short i7 = this.Y20.wE0;
        String v7 = (i7 < 1) ? "???" : sm0_0.c0(gu0.l2.lPT6(i7).Nl);
        v5[1] = v7;
        String text = sm0_0.Bx(8552, v5);
        lpt3__4 v3 = new lpt3__4(text, () -> EV(v1), asBridge());
        v2.sr0(v3);
    }

    public final void EV(K5 v1) {
        tw0_0.rl.sn0(v1.nn.wQ, v1.nn.Br, this.Y20.Gu0, this.Y20.ax, (byte) -1);
        close();
    }
}
