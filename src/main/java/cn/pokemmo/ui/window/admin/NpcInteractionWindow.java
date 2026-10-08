package cn.pokemmo.ui.window.admin;

import f.*;

import java.util.ArrayList;
import java.util.Collection;

/**
 * NPC交互事件调试窗口
 *
 * 原混淆类: f.la_2
 */
public class NpcInteractionWindow extends R90 {
    public final tk0_0 n30;
    public final cg_0 hW;
    public final es_1 OW;
    public final tk0_0 DN;
    public nq0_0 Tv0;

    public NpcInteractionWindow() {
        this.OW = new es_1();
        uf("npc-interaction-panel");
        Pb0(this::xe0);
        this.n30 = new tk0_0();
        A40 a40 = this.n30.gg0;
        this.DN = new tk0_0();
        lo0_0 lo0_0 = new lo0_0();
        lo0_0.AH0(this.DN);
        lo0_0.Qs0(2);
        Wr jg = gh_1.Jh0().Jg((short) 361, false);
        for (mc0_1 mc0_1 : (Collection<mc0_1>) gu0.Az0().Wp0()) {
            this.OW.Ue0(new fz0_0(mc0_1));
        }
        for (ZT zt : (ArrayList<ZT>) Z0.Bm().Oe0()) {
            this.OW.Ue0(new T70(zt, jg));
        }
        l50_0[] sw = tw0_0.Ll0.SW();
        for (l50_0 l50_0 : sw) {
            Z50[] nf = l50_0.G80().nF();
            for (Z50 z50 : nf) {
                this.OW.Ue0(new fe0_0(z50, jg));
            }
        }
        this.hW = new cg_0();
        this.hW.Ii(this::zk);
        a40.vx0(this.hW).Yt().im0();
        a40.vx0(lo0_0).LPt4(370.0F).Jq(300.0F).Wa0().goto$();
        SL(this.n30);
    }

    @Override
    public final void Bt() {
        super.Bt();
        xe0();
    }

    @Override
    public final void C(zk0_1 zk0_1) {
        lg_0.k.lPT5(this.hW::BL);
    }

    public final void zk(int i) {
        if (i == 111) {
            xe0();
            return;
        }
        if (i == 66) {
            if (this.Tv0 != null) {
                this.Tv0.run();
            }
            xe0();
            return;
        }
        A40 a40 = this.DN.gg0;
        String string = ((wn0_0) this.hW.dI0).YA.toString();
        if (string.isEmpty()) {
            a40.x7();
            return;
        }
        int i2 = -1;
        try {
            i2 = Integer.parseInt(string);
        } catch (NumberFormatException ignored) {
        }
        this.Tv0 = null;
        a40.x7();
        a40.Dr0(10.0F);
        ((A40) a40.uc()).X0();
        a40.FU.Wa0().ys0(2.0F);
        a40.yu0(1).sn0 = new vl0_0(60.0F);
        a40.yu0(3).LPt7 = Float.valueOf(1.0F);
        int i3 = 0;
        I2 zd = this.OW.ZD();
        while (zd.hasNext()) {
            nq0_0 nq0_0 = (nq0_0) zd.next();
            if (i3 > 100) {
                j1_0 es = a40.es("Showing first 100 results only");
                es.mA = 1;
                es.d80 = 99;
                return;
            }
            if (nq0_0.nX(i2, string)) {
                if (this.Tv0 == null) {
                    this.Tv0 = nq0_0;
                }
                nq0_0.E60(a40);
                a40.Rg();
                i3++;
            }
        }
    }
}
