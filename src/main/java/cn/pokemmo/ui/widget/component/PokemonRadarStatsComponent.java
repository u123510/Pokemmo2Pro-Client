package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.HashMap;

public class PokemonRadarStatsComponent extends BaseComponent implements sp0_0 {
    public final HashMap f80;
    public final fy_2 h40;
    public CH0 Xf;

    public PokemonRadarStatsComponent() {
        this.f80 = new HashMap();
        uf("/link-status");
        fy_2 fy_2Var = new fy_2();
        this.h40 = fy_2Var;
        fy_2Var.uf("content");
    }

    public static void bF0() {
        tw0_0.rl.fk0.uQ(new yi0_2());
    }

    public static void qJ(bn_2 v0) {
        tw0_0.rl.fk0.uQ(new WQ(v0.Cl.HU));
    }

    public static void mF0(bn_2 v0) {
        tw0_0.rl.fk0.uQ(new IK(v0.Cl.HU));
    }

    public final void DN(si_0 v1) {
        bn_2 bn_2Var = (bn_2) this.f80.get(v1.HU);
        if (bn_2Var == null) {
            bn_2Var = new bn_2((f.xg_0)(Object)this, v1);
            this.f80.put(v1.HU, bn_2Var);
            if (tw0_0.kz0()) {
                bn_2Var.E40(105, (this.f80.size() * 80) - 40);
            } else {
                bn_2Var.E40(10, (this.f80.size() * 46) + 200);
            }
            lt0();
            F9(fU(), bn_2Var);
        }
        bn_2Var.iK0.Ll(v1.HU.equals(this.Xf));
        bn_2Var.COm3();
        bn_2Var.nuL();
    }

    public final void a80(Jn0 v1) {
    }

    @Override
    public final void K8() {
        this.h40.lt0();
        lt0();
        if (!tw0_0.kz0()) {
            if (this.A20 + this.Mx > tw0_0.LD0.ew0() - this.Mx) {
                E40(tw0_0.LD0.ew0() - this.Mx, this.SB0);
            }
            if (this.SB0 + this.OB > tw0_0.LD0.Hv0()) {
                E40(this.A20, tw0_0.LD0.Hv0() - this.OB);
            }
        }
    }

    @Override
    public final boolean JL() {
        return false;
    }

    public final void gz0(bn_2 v1) {
        Vt0 vt0 = new Vt0();
        CH0 dj0 = tw0_0.e60.dj0;
        if (v1.Cl == null) {
            return;
        }
        if (dj0.equals(this.Xf)) {
            if (!dj0.equals(v1.Cl.HU)) {
                vt0.hx.add(new at_0(sm0_0.c0(2503), () -> mF0(v1)));
            }
            vt0.hx.add(new at_0(sm0_0.c0(2500), () -> qJ(v1)));
        }
        if (v1.Cl.HU.equals(tw0_0.e60.dj0)) {
            vt0.hx.add(new at_0(sm0_0.c0(2501), () -> bF0()));
        }
        if (vt0.hx.size() < 1) {
            return;
        }
        vt0.hx.add(new at_0(sm0_0.c0(nf0_0.Bq0), null));
        UA.zd(vt0, v1);
    }

    @Override
    public final void HP(zk0_1 v1) {
        super.HP(v1);
    }
}
