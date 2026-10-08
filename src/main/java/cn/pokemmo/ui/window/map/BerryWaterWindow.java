package cn.pokemmo.ui.window.map;

import f.*;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 树果浇水管理弹窗
 *
 * 原混淆类: f.j8_0
 */
public class BerryWaterWindow extends yz_1 implements tr_1  {
    public final j8_0 asBridge() {
        return (j8_0) (Object) this;
    }

    public final byte xv;
    public final Rn0[] pd0;
    public final fy_2 i10;
    public final xe_1 tV;
    public final xe_1 lI;
    public final Rn0 UJ;
    public final Qv0 qH;

    public BerryWaterWindow(byte i1) {
        super();
        this.xv = i1;
        Pb0(this::x3);
        uf("seed-plant-dialog");
        Hy(sm0_0.c0(8559));
        fy_2 v1 = new fy_2();
        this.i10 = v1;
        this.tV = new xe_1(sm0_0.c0(8559));
        this.lI = new xe_1(sm0_0.c0(nf0_0.Bq0));
        this.tV.RR(this::Uy0);
        this.lI.RR(this::XQ);
        this.pd0 = new Rn0[3];
        short[] seeds = tw0_0.rl.Bb(A5.PG0).Td();
        for (int i = 0; i < this.pd0.length; i++) {
            this.pd0[i] = new Rn0(asBridge());
            int idx = i;
            this.pd0[i].of(() -> SH(this.pd0[idx], idx));
        }
        Rn0 uj = new Rn0(asBridge());
        this.UJ = uj;
        uj.Hr(12, 10);
        Qv0 qv = new Qv0("\n\n");
        this.qH = qv;
        uj.Ll(false);
        qv.Ll(false);

        ya_1 v4 = this.i10.H10().qd(15).X20(this.i10.lo0().LPt3(this.pd0)).qd(15);
        this.i10.x40(bo_0.ph0(this.i10.lo0(), new le0_2[]{uj, qv}, v4, 15).X20(this.i10.H10().LPt3(new le0_2[]{this.tV, this.lI})).Ze0());
        this.i10.WQ(this.i10.lo0().X20(this.i10.H10().Ze0().Kn0(this.pd0[0]).Ze0().Kn0(this.pd0[1]).Ze0().Kn0(this.pd0[2]).Ze0()).X20(this.i10.H10().Ze0().LPt3(new le0_2[]{uj, qv}).Ze0()).X20(this.i10.lo0().Kn0(this.tV).Kn0(this.lI)));

        for (int i = 0; i < this.pd0.length; i++) {
            short s = seeds[i];
            if (s > 0 && f5(s)) {
                this.pd0[i].Uj0((byte) 0, seeds[i], (short) 1);
            }
        }
        SL(this.i10);
    }

    public static void K8(Rn0 v0, K5 v1, int i2) {
        v0.UR(v1);
        tw0_0.rl.NC[1].U8[i2] = v1.nn.wQ;
    }

    public final void Uy0() {
        BR br = tw0_0.rl;
        byte bXv = this.xv;
        byte[] buf = new byte[10];
        int count = 0;
        for (int i = 0; i < this.pd0.length; i++) {
            short wE = this.pd0[i].wE0;
            if (wE >= 1) {
                byte b = (byte) (wE % 1000);
                int nextCount = count + 1;
                if (nextCount > buf.length) {
                    byte[] newBuf = new byte[Math.max(buf.length << 1, nextCount)];
                    System.arraycopy(buf, 0, newBuf, 0, buf.length);
                    buf = newBuf;
                }
                buf[count] = b;
                count = nextCount;
            }
        }
        byte[] result = new byte[count];
        if (count > 0) {
            System.arraycopy(buf, 0, result, 0, count);
        }
        br.hB(bXv, result);
        xe0();
    }

    public final void x3() {
        tw0_0.rl.ze0(this.xv, (byte) 0);
        xe0();
    }

    public final void x00() {
        if (this.UJ.wE0 > 0) {
            lpt6__0.v90(this.tV);
        } else {
            for (Rn0 r : this.pd0) {
                if (r.wE0 < 1) {
                    lpt6__0.v90(r);
                    return;
                }
            }
        }
    }

    @Override
    public final void K8() {
        super.K8();
        lt0();
        N80(pa0_0.Ol);
    }

    public final boolean f5(short i1) {
        TE te = new TE();
        for (Rn0 r : this.pd0) {
            short s = r.wE0;
            if (s >= 1) {
                int idx = te.O50(s);
                if (idx < 0) {
                    idx = -idx - 1;
                    te.YG0[idx] = (short) (te.YG0[idx] + 1);
                } else {
                    te.YG0[idx] = 1;
                }
                byte b = te.Ut[idx];
                if (b != 0) {
                    te.OC0(te.L0);
                }
            }
        }
        short s2 = (short) (te.f5(i1) + 1);
        return tw0_0.rl.NC[1].Dj0((byte) -1, i1, s2);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            for (Rn0 r : this.pd0) {
                int key = v1.finally$;
                rp_0 sj = rp_0.sJ0;
                int dummy = dw_2.ff;
                if (sj != null && sj.Ov(key) && r.Of()) {
                    Runnable rAction = r.M40;
                    if (rAction != null) {
                        rAction.run();
                    }
                    return true;
                }
            }
            int key2 = v1.finally$;
            rp_0 sj = rp_0.sJ0;
            int dummy = dw_2.ff;
            if (sj != null && sj.Ov(key2) && this.tV.Of()) {
                a7_0.bH(this.tV.ER.Fc0);
                return true;
            }
            int key3 = v1.finally$;
            rp_0 nk = rp_0.nK0;
            if (nk != null && nk.Ov(key3)) {
                a7_0.bH(this.lI.ER.Fc0);
                return true;
            }
            if (sj != null && sj.Ov(key3) && this.lI.Of()) {
                a7_0.bH(this.lI.ER.Fc0);
                return true;
            }
            int key4 = v1.finally$;
            rp_0 kc = rp_0.kC0;
            if ((kc != null && kc.Ov(key4)) || (rp_0.I90 != null && rp_0.I90.Ov(key4))) {
                Uz(-1, true);
                if (this.UJ.Of()) {
                    Uz(-1, true);
                }
                return true;
            }
            int key5 = v1.finally$;
            rp_0 sync = rp_0.synchronized$;
            if ((sync != null && sync.Ov(key5)) || (rp_0.Ni != null && rp_0.Ni.Ov(key5))) {
                Uz(1, true);
                if (this.UJ.Of()) {
                    Uz(1, true);
                }
                return true;
            }
        }
        return super.nd0(v1);
    }

    public final void SH(Rn0 v1, int i2) {
        if (!v1.Of()) {
            return;
        }
        Vt0 menu = new Vt0();
        RJ0 rj = tw0_0.rl.NC[1];
        ArrayList list = new ArrayList();
        wx_2 seen = new wx_2();
        K5[] items = rj.KL();
        for (K5 k5 : items) {
            short id = k5.nn.wQ;
            if (!seen.bL0(id)) {
                if ((id >= 7030 && id <= 7039) || (id >= 1030 && id <= 1039) || id == 1446) {
                    list.add(k5);
                    seen.TI0(id);
                }
            }
        }
        Collections.sort(list);
        for (Object obj : list) {
            K5 k5 = (K5) obj;
            String text = rj.a90(k5.nn.wQ) + "x " + k5.Ua();
            Wr icon = gh_1.aH0.F10(k5.cL, false);
            Runnable r = () -> K8(v1, k5, i2);
            menu.hx.add(new kf0_1(text, icon, 3, 3, 24, 24, r, true));
        }
        xe_1 nextFocus;
        if (i2 < 2) {
            nextFocus = this.pd0[i2 + 1];
        } else {
            nextFocus = this.tV;
        }
        if (menu.hx.size() < 1) {
            menu.mA0(sm0_0.c0(6007), null);
        }
        UA.jP(menu, nextFocus, this.pd0[i2]);
    }

    public final void XQ() {
        RJ0 rj = tw0_0.rl.NC[1];
        for (byte i = 0; i < rj.U8.length; i++) {
            rj.U8[i] = 0;
        }
        x3();
    }
}
