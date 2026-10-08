package cn.pokemmo.ui.window.map;

import f.*;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 树果粉碎调和窗口
 *
 * 原混淆类: f.VL
 */
public class BerryCrushWindow extends yz_1 implements tr_1  {
    public final VL asBridge() {
        return (VL) (Object) this;
    }

    public final fy_2 mQ;
    public final SK0 qq;
    public final xe_1 w80;
    public final xe_1 mp0;
    public final SK0 J3;
    public final Qv0 be;
    public final K5 Tg;

    public BerryCrushWindow(K5 item) {
        this.Tg = item;
        this.Pb0(this::close);
        this.uf(tw0_0.kz0() ? "berry-crush" : "seed-plant-dialog");
        this.Hy(sm0_0.c0(8570));
        this.mQ = new fy_2();
        this.w80 = new xe_1(sm0_0.c0(8571));
        this.mp0 = new xe_1(sm0_0.c0(nf0_0.Bq0));
        this.w80.RR(this::ZI);
        this.mp0.RR(this::close);
        this.qq = new SK0(asBridge());
        this.qq.of(this::GP);
        this.J3 = new SK0(asBridge());
        this.be = new Qv0("\n\n");
        this.J3.Ll(false);
        this.be.Ll(false);

        ya_1 top = this.mQ.H10().qd(15);
        ya_1 selection = bo_0.ph0(this.mQ.lo0(), new le0_2[]{this.qq}, top, 15);
        this.mQ.x40(bo_0.ph0(this.mQ.lo0(), new le0_2[]{this.J3, this.be}, selection, 15)
                .X20(this.mQ.H10().LPt3(this.w80, this.mp0)).Ze0());
        this.mQ.WQ(this.mQ.lo0().X20(this.mQ.H10().Ze0().Kn0(this.qq).Ze0())
                .X20(this.mQ.H10().Ze0().LPt3(this.J3, this.be).Ze0())
                .X20(this.mQ.lo0().Kn0(this.w80).Kn0(this.mp0)));
        this.SL(this.mQ);
    }

    public final void ZI() {
        tw0_0.rl.sn0((short)372, CH0.j1, this.qq.ks, this.qq.ax, (byte)-1);
        this.qq.UR(null);
        this.close();
    }

    public final void close() {
        BU client = BU.T50;
        VL dialog = client.PF;
        if (dialog != null) {
            dialog.xe0();
            client.PF = null;
        }
    }

    @Override
    public final void x00() {
        if (this.Tg.cL.X80()) {
            this.qq.UR(this.Tg);
        }
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            this.kh0();
            this.mQ.vf(pa0_0.Ol);
            this.mQ.oY(500, 450);
        } else {
            super.K8();
            this.lt0();
            this.N80(pa0_0.Ol);
        }
    }

    @Override
    public final boolean nd0(i70_0 event) {
        if (!E00.ZU(event.zu) || !event.iT()) {
            return super.nd0(event);
        }

        int key = event.finally$;
        rp_0 action = rp_0.sJ0;
        if (action != null && action.Ov(key) && this.qq.Of()) {
            Runnable callback = this.qq.M40;
            if (callback != null) {
                callback.run();
            }
            return true;
        }
        if (action != null && action.Ov(event.finally$) && this.w80.Of()) {
            a7_0.bH(this.w80.ER.Fc0);
            return true;
        }

        action = rp_0.nK0;
        if ((action != null && action.Ov(event.finally$))
                || (rp_0.sJ0 != null && rp_0.sJ0.Ov(event.finally$) && this.mp0.Of())) {
            a7_0.bH(this.mp0.ER.Fc0);
            return true;
        }

        action = rp_0.kC0;
        if ((action != null && action.Ov(event.finally$))
                || (rp_0.I90 != null && rp_0.I90.Ov(event.finally$))) {
            this.Uz(-1, true);
            if (this.J3.Of()) {
                this.Uz(-1, true);
            }
            return true;
        }

        action = rp_0.synchronized$;
        if ((action != null && action.Ov(event.finally$))
                || (rp_0.Ni != null && rp_0.Ni.Ov(event.finally$))) {
            this.Uz(1, true);
            if (this.J3.Of()) {
                this.Uz(1, true);
            }
            return true;
        }

        return super.nd0(event);
    }

    public final void Yd(short count) {
        if (count < 1) {
            this.J3.Ll(false);
            this.be.Ll(false);
            return;
        }
        mc0_1 seed = gu0.l2.lPT6((short)1119);
        this.J3.Uj0((byte)0, (short)1119, count);
        this.be.Sk(seed.Com4((byte)-1, 38));
        this.J3.Ll(true);
        this.be.Ll(true);
    }

    public final void GP() {
        if (!this.qq.Of()) {
            return;
        }

        Vt0 menu = new Vt0();
        RJ0 inventory = tw0_0.rl.NC[1];
        ArrayList<K5> items = new ArrayList<>();
        wx_2 seen = new wx_2();
        for (K5 item : inventory.KL()) {
            if (!seen.bL0(item.nn.wQ) && item.cL.X80()) {
                items.add(item);
                seen.TI0(item.nn.wQ);
            }
        }

        Collections.sort(items);
        for (K5 item : items) {
            String label = new StringBuilder().append(inventory.a90(item.nn.wQ)).append("x ").append(item.Ua()).toString();
            Wr icon = gh_1.aH0.F10(item.cL, false);
            menu.hx.add(new kf0_1(label, icon, 3, 3, 24, 24, () -> this.TV(item), false));
        }

        if (menu.hx.size() < 1) {
            menu.mA0(sm0_0.c0(6007), null);
        }
        UA.jP(menu, this.w80, this.qq);
    }

    public final void TV(K5 item) {
        this.qq.UR(item);
    }
}
