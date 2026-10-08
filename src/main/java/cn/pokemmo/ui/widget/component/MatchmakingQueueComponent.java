package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.ArrayList;

public class MatchmakingQueueComponent extends BaseComponent implements tr_1 {
    public final fy_2 hm0;
    public int l6;
    public final ArrayList qw;

    public MatchmakingQueueComponent() {
        this.l6 = 0;
        ArrayList arrayList = new ArrayList();
        this.qw = arrayList;
        this.uf("channelwidget");
        fy_2 fy_22 = new fy_2();
        this.hm0 = fy_22;
        I7 i7 = fy_22.H10();
        Hm0 hm0 = fy_22.lo0();

        xe_1 btn1 = new xe_1(sm0_0.c0(240361));
        btn1.RR(new Z10((f.zj0_0)(Object)this));
        arrayList.add(btn1);

        if (tw0_0.rl.hz().Ny((byte) 1, (short) 303)) {
            xe_1 btn2 = new xe_1(sm0_0.c0(8));
            btn2.RR(new P00((f.zj0_0)(Object)this));
            arrayList.add(btn2);
        }

        xe_1 btn3 = new xe_1(sm0_0.c0(65));
        btn3.RR(new sb_1((f.zj0_0)(Object)this));
        arrayList.add(btn3);

        for (Object obj : arrayList) {
            xe_1 btn = (xe_1) obj;
            i7.Kn0(btn);
            hm0.Kn0(btn);
        }

        this.hm0.x40(i7.Ze0());
        this.hm0.WQ(hm0);
        this.SL(this.hm0);
    }

    @Override
    public final void C(zk0_1 v1) {
        if (this.iJ0() != null) {
            lpt6__0.v90(this.iJ0());
        }
    }

    @Override
    public final void nD() {
        if (this.iJ0() != null) {
            lpt6__0.v90(this.iJ0());
        }
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            int key = v1.finally$;
            rp_0 kC0 = rp_0.kC0;
            int dummy = dw_2.ff;
            if (kC0 != null && kC0.Ov(key)) {
                this.l6--;
                if (this.iJ0() != null) {
                    lpt6__0.v90(this.iJ0());
                }
                return true;
            }
            rp_0 sync = rp_0.synchronized$;
            if (sync != null && sync.Ov(key)) {
                this.l6++;
                if (this.iJ0() != null) {
                    lpt6__0.v90(this.iJ0());
                }
                return true;
            }
            rp_0 sJ0 = rp_0.sJ0;
            if (sJ0 != null && sJ0.Ov(key)) {
                a7_0.bH(this.iJ0().ER.Fc0);
                return true;
            }
            rp_0 nK0 = rp_0.nK0;
            if (nK0 != null && nK0.Ov(key)) {
                a7_0.bH(((xe_1) this.qw.get(this.qw.size() - 1)).ER.Fc0);
                return true;
            }
        }
        return super.nd0(v1);
    }

    @Override
    public final void K8() {
        this.hm0.lt0();
        this.lt0();
        this.N80(pa0_0.Ol);
    }

    public final xe_1 iJ0() {
        if (this.l6 >= this.qw.size()) {
            this.l6 = this.qw.size() - 1;
        }
        if (this.l6 < 0) {
            this.l6 = 0;
        }
        if (this.l6 >= this.qw.size()) {
            return null;
        }
        return (xe_1) this.qw.get(this.l6);
    }
}
