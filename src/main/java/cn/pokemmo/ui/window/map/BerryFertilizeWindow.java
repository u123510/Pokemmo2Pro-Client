package cn.pokemmo.ui.window.map;

import f.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 树果施肥弹窗
 *
 * 原混淆类: f.qf0_1
 */
public class BerryFertilizeWindow extends yz_1 implements tr_1  {
    public final qf0_1 asBridge() {
        return (qf0_1) (Object) this;
    }

    public final byte nj0;
    public final B3 qa0;
    public final xe_1 Ip0;
    public final xe_1 CB;
    public final B3 fD;
    public final Qv0 wB;
    public final Qv0 ej;
    public final Qv0 Iw0;

    public BerryFertilizeWindow(byte i1) {
        this.nj0 = i1;
        Pb0(this::AC);
        uf("seed-plant-dialog");
        Hy(sm0_0.c0(8582));
        fy_2 v1 = new fy_2();
        this.Ip0 = new xe_1(sm0_0.c0(8574));
        this.CB = new xe_1(sm0_0.c0(nf0_0.Bq0));
        this.Ip0.RR(this::pe);
        this.CB.RR(this::AC);
        this.qa0 = new B3(asBridge());
        this.qa0.of(this::Rn);
        this.fD = new B3(asBridge());
        this.fD.Hr(12, 10);
        this.wB = new Qv0("\n\n");
        this.ej = new Qv0("");
        this.Iw0 = new Qv0("");
        this.fD.Ll(false);
        this.wB.Ll(false);
        this.ej.Ll(false);
        this.Iw0.Ll(false);

        ya_1 layoutH = v1.H10().qd(15).X20(v1.lo0().Kn0(this.qa0)).qd(15);
        layoutH = bo_0.ph0(v1.lo0(), new le0_2[]{this.fD, this.wB}, layoutH, 15);
        layoutH = bo_0.ph0(v1.lo0(), new le0_2[]{this.ej, this.Iw0}, layoutH, 15);
        v1.x40(layoutH.X20(v1.H10().LPt3(new le0_2[]{this.Ip0, this.CB})).Ze0());

        v1.WQ(v1.lo0().X20(v1.H10().Ze0().Kn0(this.qa0).Ze0()).X20(v1.H10().Ze0().LPt3(new le0_2[]{this.fD, this.wB}).Ze0()).X20(v1.H10().Ze0().LPt3(new le0_2[]{this.ej, this.Iw0}).Ze0()).X20(v1.lo0().Kn0(this.Ip0).Kn0(this.CB)));
        SL(v1);
    }

    public final void pe() {
        if (this.fD.wE0 < 1) {
            AC();
            return;
        }
        BR rl = tw0_0.rl;
        byte nj0 = this.nj0;
        yj_1 yj = new yj_1(10, 0);
        yj.uo0(this.qa0.wE0);
        yj.uo0(this.qa0.ax);
        short[] qe = yj.qE();
        byte[] bytes = new byte[qe.length * 2];
        ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(qe);
        rl.hB(nj0, bytes);
        xe0();
    }

    public final void AC() {
        tw0_0.rl.ze0(this.nj0, (byte) 0);
        xe0();
    }

    @Override
    public final void x00() {
        lpt6__0.v90(this.qa0);
    }

    @Override
    public final void K8() {
        super.K8();
        lt0();
        N80(pa0_0.Ol);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            int key = v1.finally$;
            if (rp_0.sJ0 != null && rp_0.sJ0.Ov(key)) {
                if (this.qa0.Of()) {
                    Runnable run = this.qa0.M40;
                    if (run != null) {
                        run.run();
                    }
                    return true;
                }
                if (this.Ip0.Of()) {
                    a7_0.bH(this.Ip0.ER.Fc0);
                    return true;
                }
            }
            if ((rp_0.nK0 != null && rp_0.nK0.Ov(key)) || (rp_0.sJ0 != null && rp_0.sJ0.Ov(key) && this.CB.Of())) {
                a7_0.bH(this.CB.ER.Fc0);
                return true;
            }
            if ((rp_0.kC0 != null && rp_0.kC0.Ov(key)) || (rp_0.I90 != null && rp_0.I90.Ov(key))) {
                Uz(-1, true);
                if (this.fD.Of()) {
                    Uz(-1, true);
                }
                return true;
            }
            if ((rp_0.synchronized$ != null && rp_0.synchronized$.Ov(key)) || (rp_0.Ni != null && rp_0.Ni.Ov(key))) {
                Uz(1, true);
                if (this.fD.Of()) {
                    Uz(1, true);
                }
                return true;
            }
        }
        return super.nd0(v1);
    }

    public final void ij0(int i1, short i2) {
        if (i2 < 1) {
            this.fD.Ll(false);
            this.wB.Ll(false);
            this.ej.Ll(false);
            this.Iw0.Ll(false);
            return;
        }
        mc0_1 mc = gu0.l2.lPT6(i2);
        this.fD.Uj0((byte) 0, i2, this.qa0.ax);
        this.wB.Sk(mc.Com4((byte) -1, 38));
        int total = i1 * this.qa0.ax;
        this.ej.Sk(sm0_0.wa0(1926, NumberFormat.getInstance().format((long) i1)));
        this.Iw0.Sk(sm0_0.wa0(1925, NumberFormat.getInstance().format((long) total)));
        this.fD.Ll(true);
        this.wB.Ll(true);
        this.ej.Ll(true);
        this.Iw0.Ll(true);
    }

    public final void Rn() {
        if (!this.qa0.Of()) {
            return;
        }
        Vt0 v1 = new Vt0();
        RJ0 bag = tw0_0.rl.NC[1];
        ArrayList<K5> list = new ArrayList<>();
        wx_2 seen = new wx_2();
        K5[] items = bag.KL();
        for (K5 item : items) {
            if (!seen.bL0(item.nn.wQ)) {
                short id = item.cL.Z8;
                if (id >= 5485 && id <= 5491) {
                    list.add(item);
                    seen.TI0(item.nn.wQ);
                }
            }
        }
        Collections.sort(list);
        for (K5 item : list) {
            String title = bag.a90(item.nn.wQ) + "x " + item.Ua();
            Wr icon = gh_1.aH0.F10(item.cL, false);
            kf0_1 kf = new kf0_1(title, icon, 3, 3, 24, 24, new wi0_1(asBridge(), item), true);
            v1.hx.add(kf);
        }
        xe_1 cancelBtn = this.Ip0;
        if (v1.hx.size() < 1) {
            v1.mA0(sm0_0.c0(6007), new M4());
        }
        UA.jP(v1, cancelBtn, this.qa0);
    }
}
