package cn.pokemmo.ui.window.battle;

import f.*;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/**
 * 匹配与排位战绩统计窗口
 *
 * 原混淆类: f.kf0_2
 */
public class PvPStatsWindow extends cx_0 implements tr_1  {
    public final kf0_2 asBridge() {
        return (kf0_2) (Object) this;
    }

    public static final DecimalFormat xD;
    public final DateFormat Vf0;
    public final BU Jj;
    public final P8 Sl;
    public final HashMap CL0;
    public TB0 ke0;

    static {
        xD = new DecimalFormat("#0.00");
    }

    public PvPStatsWindow(BU bu, byte b, HZ[] hzArr) {
        super(tw0_0.kz0(), true);
        Locale locale = wi0_0.pI().TK();
        this.Vf0 = DateFormat.getDateTimeInstance(3, 3, locale);
        this.Sl = new P8();
        this.CL0 = new HashMap();
        this.Jj = bu;
        uf("matchmaking-stats-frame");
        Hy(sm0_0.c0(5670));
        Pb0(this::op);
        ff0(1);
        ArrayList list = new ArrayList(Arrays.asList(N2.Ev0));
        list.addAll(Arrays.asList(N2.ov0));
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            N2 n2 = (N2) it.next();
            OG0 og;
            if (n2 == N2.BF) {
                og = new OG0(Cq.ez, n2);
            } else {
                og = new OG0(Cq.Wn0, n2);
            }
            com2__3 tab = this.Sl.Wq(null, og.toString());
            TB0 tb = new TB0(asBridge(), tab, og, b, hzArr);
            this.CL0.put(tab, tb);
            tab.fK0(() -> Xb(tb, og, tab));
            if (n2 == N2.yH0) {
                this.Sl.Zd(tab);
            }
        }
        SL(this.Sl);
    }

    public final void aUX(zk0_1 zk) {
        super.aUX(zk);
        if (this.ke0 != null) {
            lg_0.k.lPT5(this::qw0);
        }
    }

    public final void lt0() {
        if (tw0_0.kz0()) {
            VB();
            oY(this.Em0.Mx, this.Em0.OB);
        } else {
            super.lt0();
        }
    }

    public final boolean nd0(i70_0 event) {
        if (this.ke0 == null) {
            return super.nd0(event);
        }
        if (E00.ZU(event.zu) && event.iT()) {
            if (Qy0.af(this.Jj)) {
                return super.nd0(event);
            }
            int key = event.finally$;
            rp_0 rp = rp_0.nK0;
            if (rp != null && rp.Ov(key) && !this.ke0.wp0.Of()) {
                if (this.Jj.yQ != null) {
                    this.Jj.yQ.xe0();
                    this.Jj.yQ = null;
                }
                return true;
            }
        }
        return super.nd0(event);
    }

    public final void op() {
        if (this.Jj.yQ != null) {
            this.Jj.yQ.xe0();
            this.Jj.yQ = null;
        }
    }

    public final void qw0() {
        if (this.ke0.y2 != null) {
            lg_0.k.lPT5(this.ke0.y2);
        }
    }

    public final void Xb(TB0 tb, OG0 og, com2__3 tab) {
        this.ke0 = tb;
        tb.RL0 = og;
        if (tab.to0 == null) {
            tab.gn(tb.D50());
        }
    }
}
