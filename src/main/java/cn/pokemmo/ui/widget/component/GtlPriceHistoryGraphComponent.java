package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.ArrayDeque;

public class GtlPriceHistoryGraphComponent extends BaseComponent {
    public final ZJ qi0;
    public long s2;
    public long JS;
    public String uI;
    public final ArrayDeque Xo;

    public GtlPriceHistoryGraphComponent(boolean isEnemy) {
        super();
        this.s2 = 0L;
        this.JS = 0L;
        this.uI = "";
        this.Xo = new ArrayDeque();
        ZJ zj = new ZJ(2500, 0);
        this.qi0 = zj;
        zj.uf("label");
        zj.Lt();
        this.SL(zj);
        if (isEnemy) {
            this.uf("battle-ability-enemy");
        } else {
            this.uf("battle-ability");
        }
        this.LPT8(new N1(this, gn_0.TRANSPARENT));
        this.Ll(false);
    }

    public final void fl0(String v1) {
        if (v1 != null && !v1.isEmpty()) {
            this.Xo.add(v1);
            this.Ll(true);
        }
    }

    @Override
    public final void HP(zk0_1 v1) {
        super.HP(v1);
        if (this.uI.isEmpty() && !this.z70.pb0 && this.JS < 1L && this.s2 < 1L) {
            if (this.Xo.isEmpty()) {
                this.Ll(false);
            } else {
                this.uI = (String) this.Xo.poll();
                this.qi0.Sk("");
                tw0_0.RE0.Hq0((byte) 2, (short) 1395);
                this.s2 = System.currentTimeMillis() + 500L;
                this.JS = -1L;
                this.Ll(true);
                this.z70.bT(gn_0.WHITE, 500);
            }
        }
        if (this.s2 < System.currentTimeMillis() && !this.uI.isEmpty() && this.qi0.Eg0()) {
            this.qi0.dr.add(new dc0_1(this.uI));
            this.uI = "";
            this.JS = System.currentTimeMillis() + 2000L;
            this.s2 = -1L;
        }
        long j2 = this.JS;
        if (j2 > 0L && j2 <= System.currentTimeMillis()) {
            this.JS = -1L;
            this.z70.iG0(500);
        }
    }

    @Override
    public final void K8() {
        this.qi0.lt0();
        ZJ v1 = this.qi0;
        int i0 = this.A20 + (tw0_0.kz0() ? 40 : 100);
        int i2 = this.SB0 - (tw0_0.kz0() ? 36 : 24);
        v1.E40(i0, i2);
    }
}
