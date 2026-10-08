package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

public class ChatBadgePrefixLabel extends BaseLabel {
    public int NZ;
    public final int WE0;
    public final Br0 Lz;

    public ChatBadgePrefixLabel(int i1, String v2, short i3) {
        super((dw_2.U8 && !tw0_0.kz0()) ? "" : v2);
        this.NZ = 0;
        this.WE0 = 32;
        Br0 br0 = new Br0(this);
        this.Lz = br0;
        if (tw0_0.H30() && dw_2.U8) {
            if (i1 > 0) {
                Xr0(AN.nK0(v2, " (").append(tw0_0.iE.X80(i1)).append(")").toString());
            } else {
                Xr0(v2);
            }
            Bb(150);
        }
        br0.Nk(new Wr[]{gh_1.Jh0().Jg(i3, true), gh_1.Jh0().S1(i3)});
        br0.nq0(24, 24);
        if (dw_2.U8 && !tw0_0.kz0()) {
            this.NZ = 24;
            br0.Gy0(0, 0);
        } else {
            br0.Gy0(4, 3);
        }
        if (tw0_0.kz0()) {
            iv(480, 64);
            br0.nq0(48, 48);
            br0.Dg(pa0_0.xE);
        }
        uf("hud-item-button");
    }

    @Override
    public final void C(zk0_1 v1) {
        super.C(v1);
    }

    public final void a80(Jn0 v1) {
    }

    public final void el0(Jn0 v1) {
    }

    public final void Kz0(Jn0 v1) {
    }

    @Override
    public final void aUX(zk0_1 v1) {
        super.aUX(v1);
    }

    @Override
    public final void df(Y30 v1) {
        super.df(v1);
        if (!dw_2.U8) {
            int n = hr0() + 35;
            this.NZ = n;
            if (n < 66) {
                this.NZ = 66;
            }
        }
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            int key = v1.finally$;
            rp_0 sJ0 = rp_0.sJ0;
            int unused = dw_2.ff;
            if (sJ0 != null && sJ0.Ov(key)) {
                a7_0.bH(this.ER.Fc0);
                return true;
            }
            int key2 = v1.finally$;
            rp_0 kC0 = rp_0.kC0;
            if (kC0 != null && kC0.Ov(key2)) {
                a7_0.bH(this.ER.Fc0);
                return true;
            }
        }
        return super.nd0(v1);
    }

    @Override
    public final void K8() {
        if (!tw0_0.kz0()) {
            RY(this.NZ, this.WE0);
            oY(this.NZ, this.WE0);
        }
    }

    @Override
    public final void hs() {
        Qy0.yI0.vk(this, this.yj0, pa0_0.L00);
    }

    @Override
    public final void Bt() {
        Qy0.yI0.zm0();
    }

    public final void Dw0(zk0_1 v1) {
        int i1 = 0;
        if (this.M.t5(dz_2.H7) || this.M.t5(le0_2.gz)) {
            i1 = 1;
        }
        this.Lz.oC0(i1);
    }
}
