package cn.pokemmo.ui.window.map;

import f.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 神秘宝石插槽窗口
 *
 * 原混淆类: f.kt_1
 */
public class MysteriousGemWindow extends yz_1 implements tr_1  {
    public final kt_1 asBridge() {
        return (kt_1) (Object) this;
    }

    public static final short[] d80;
    public static final short[] Cu;
    public final lpt1__3 Wc0;
    public final lpt1__3 Bz0;
    public final fy_2 nl;
    public final xe_1 pRN;
    public final xe_1 kx0;
    public final lpt1__3 C60;
    public final Qv0 x3;
    public final CH0 Yu;
    public int OY;

    static {
        d80 = new short[]{
                5249, 5243, 5242, 5239, 5246, 5241, 5245, 5237, 5244, 5248, 5222, 5238, 5247, 5250, 5240, 5233, 5251
        };
        Cu = new short[]{
                5548, 5549, 5550, 5551, 5552, 5553, 5554, 5555, 5556, 5557, 5558, 5559, 5560, 5561, 5562, 5563, 5564
        };
    }

    public MysteriousGemWindow(K5 v1, CH0 v2) {
        super();
        this.OY = 0;
        Pb0(this::xe0);
        this.Yu = v2;
        if (tw0_0.kz0()) {
            uf("mysterious-gem");
        } else {
            uf("seed-plant-dialog");
            Hy(sm0_0.c0(101114));
        }

        fy_2 layout = new fy_2();
        this.nl = layout;
        this.pRN = new xe_1(sm0_0.c0(8574));
        this.kx0 = new xe_1(sm0_0.c0(nf0_0.Bq0));
        this.pRN.RR(this::ej);
        this.kx0.RR(kt_1::gK0);

        this.Wc0 = new lpt1__3(asBridge());
        short pm = v1.pm();
        short count = v1.I7() > 999 ? 999 : v1.I7();
        this.Wc0.Uj0(v1.Ph0().uI(), pm, count);

        this.Bz0 = new lpt1__3(asBridge());
        this.Bz0.of(this::Yt);

        this.C60 = new lpt1__3(asBridge());
        this.x3 = new Qv0("\n\n");
        this.C60.Ll(false);
        this.x3.Ll(false);

        ya_1 v8 = layout.H10().qd(15);
        v8 = bo_0.ph0(layout.lo0(), new le0_2[]{this.Wc0, this.Bz0}, v8, 15);
        v8 = bo_0.ph0(layout.lo0(), new le0_2[]{this.C60, this.x3}, v8, 15);

        layout.x40(layout.H10().LPt3(new le0_2[]{this.pRN, this.kx0}).X20(v8).Ze0());
        layout.WQ(layout.lo0().X20(layout.H10().Ze0().Kn0(this.Wc0).Ze0().Kn0(this.Bz0).Ze0())
                .X20(layout.H10().Ze0().Kn0(this.C60).Ze0().Kn0(this.x3).Ze0())
                .X20(layout.lo0().LPt3(new le0_2[]{this.pRN, this.kx0})));
        SL(layout);
    }

    public static void gK0() {
        BU bu = BU.T50;
        if (bu.Wi != null) {
            bu.Wi.xe0();
            bu.Wi = null;
        }
    }

    public final void ej() {
        tw0_0.rl.sn0(this.Wc0.wE0, this.Wc0.XX, this.Bz0.XX, this.Bz0.ax, (byte) -1);
        this.Bz0.UR(null);
        short newCount = (short) Math.min(9999, this.Wc0.ax - this.OY);
        this.Wc0.Uj0((byte) 0, this.Wc0.wE0, newCount);
        if (this.Wc0.ax < 1) {
            BU bu = BU.T50;
            if (bu.Wi != null) {
                bu.Wi.xe0();
                bu.Wi = null;
            }
        }
    }

    @Override
    public final void x00() {
        CH0 ch = this.Yu;
        if (ch.Sa != 0L) {
            K5 k5 = tw0_0.rl.NC[1].zg(ch);
            if (k5 != null) {
                this.Bz0.UR(k5);
                if (k5.nn.PA0 > 1) {
                    return;
                }
            }
        }
        lpt6__0.v90(this.Bz0);
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            kh0();
            this.nl.vf(pa0_0.Ol);
            this.nl.oY(500, 450);
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
            rp_0 sj = rp_0.sJ0;
            int dummy = dw_2.ff;
            if (sj != null && sj.Ov(key) && this.Bz0.Of()) {
                if (this.Bz0.M40 != null) {
                    this.Bz0.M40.run();
                }
                return true;
            }
            if (sj != null && sj.Ov(key) && this.pRN.Of()) {
                a7_0.bH(this.pRN.ER.Fc0);
                return true;
            }
            rp_0 nk = rp_0.nK0;
            if ((nk != null && nk.Ov(key)) || (sj != null && sj.Ov(key) && this.kx0.Of())) {
                a7_0.bH(this.kx0.ER.Fc0);
                return true;
            }
            rp_0 kc = rp_0.kC0;
            rp_0 i9 = rp_0.I90;
            if ((kc != null && kc.Ov(key)) || (i9 != null && i9.Ov(key))) {
                Uz(-1, true);
                if (this.C60.Of()) {
                    Uz(-1, true);
                }
                return true;
            }
            rp_0 sync = rp_0.synchronized$;
            rp_0 ni = rp_0.Ni;
            if ((sync != null && sync.Ov(key)) || (ni != null && ni.Ov(key))) {
                Uz(1, true);
                if (this.C60.Of()) {
                    Uz(1, true);
                }
                return true;
            }
        }
        return super.nd0(v1);
    }

    public final void wB(short i1) {
        if (i1 < 1) {
            this.C60.Ll(false);
            this.x3.Ll(false);
            return;
        }
        mc0_1 mc = gu0.l2.lPT6(i1);
        this.OY = Math.min((int) this.Wc0.ax, (int) this.Bz0.ax);
        this.x3.Sk(mc.Com4((byte) -1, 38));
        this.C60.Uj0((byte) 0, i1, (short) (this.OY * 10));
        this.x3.Ll(true);
        this.C60.Ll(true);
        if (tw0_0.kz0()) {
            this.C60.ge = 50;
            this.C60.ej0 = 25;
        }
    }

    public final void Yt() {
        if (this.Bz0.Of()) {
            Vt0 popup = new Vt0();
            RJ0 bag = tw0_0.rl.Bb(tw0_0.rl.u40);
            ArrayList list = new ArrayList();
            for (short s : d80) {
                K5 item = bag.coM8(s);
                if (item != null) {
                    list.add(item);
                }
            }
            Collections.sort(list);
            for (Object obj : list) {
                K5 k5 = (K5) obj;
                String text = k5.nn.PA0 + "x " + k5.Ua();
                Wr icon = gh_1.aH0.F10(k5.cL, false);
                kf0_1 entry = new kf0_1(text, icon, 3, 3, 24, 24, () -> bk0(k5), false);
                popup.hx.add(entry);
            }
            if (popup.hx.size() < 1) {
                popup.mA0(sm0_0.c0(6007), null);
            }
            UA.jP(popup, this.pRN, this.Bz0);
        }
    }

    public final void bk0(K5 v1) {
        this.Bz0.UR(v1);
    }
}
