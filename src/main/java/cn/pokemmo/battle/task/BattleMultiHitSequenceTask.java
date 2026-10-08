package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleMultiHitSequenceTask extends N60 {
    public final jd0_1 La;
    public final short JT;
    public final PF eM;
    public final boolean st0;
    public final boolean IL0;
    public boolean de0;
    public boolean yw;
    public boolean n90;
    public MU ZU;

    public BattleMultiHitSequenceTask(PF pf, jd0_1 jd0_1Var) {
        this(pf, jd0_1Var, null, false, false);
    }

    public BattleMultiHitSequenceTask(PF pf, jd0_1 jd0_1Var, boolean z, boolean z2) {
        this(pf, jd0_1Var, null, z, z2);
    }

    public BattleMultiHitSequenceTask(PF pf, jd0_1 jd0_1Var, MU mu, boolean z, boolean z2) {
        this.de0 = false;
        this.yw = false;
        this.ZU = null;
        int bf = jd0_1Var.bf();
        short uk = pf.uk();
        this.JT = uk;
        this.n90 = uk <= bf;
        this.La = jd0_1Var;
        this.eM = pf;
        this.st0 = z;
        this.IL0 = z2;
        this.ZU = mu;
    }

    public static void Wj0() {
        tw0_0.RE0.lO();
    }

    @Override
    public final boolean lPt1() {
        if (!this.yw) {
            return false;
        }
        ea0_0 ea0_0Var = this.La.ZC;
        if (ea0_0Var.Cm0 == ea0_0Var.fM || !ea0_0Var.eE) {
            MU mu = this.ZU;
            return mu == null || mu.bL();
        }
        return false;
    }

    @Override
    public final void ii() {
        if (this.de0) {
            return;
        }
        this.de0 = true;
        if (this.st0) {
            lpt5__5.hL.ZD(this::f10, 250L);
            return;
        }
        if (!this.n90) {
            if (this.ZU == null) {
                this.ZU = new Ks0(this.eM).us();
            } else {
                this.ZU.us();
            }
        } else {
            A20();
        }
        MU mu = this.ZU;
        if (mu != null) {
            tw0_0.LD0.he0.aY = mu;
        }
        jk();
    }

    @Override
    public final NU gJ0() {
        return NU.K50;
    }

    public final void jk() {
        this.La.le0(this.eM, true, this.JT);
        BR br = tw0_0.rl;
        if (br != null) {
            Mj r1 = br.r1(_volatile.BV);
            Mj pc0 = tw0_0.rl.PC0;
            if (pc0 != null && r1 != pc0) {
                r1.rr0 = true;
                r1.jf = false;
            }
            if (pc0 != null) {
                pc0.rr0 = true;
                pc0.jf = false;
            }
        }
        this.yw = true;
        if (this.n90) {
            ii0_2.Zv0(this.eM.kc ? this.eM.RZ() : this.eM.LpT9);
            this.n90 = false;
        }
    }

    public final void A20() {
        a10_0 a10_0Var = tw0_0.PK0;
        if (a10_0Var != null && !a10_0Var.a40) {
            short s = this.JT;
            if (s > 0 && s <= (int) (this.eM.zi0.Sj * 0.25) && this.eM.cD0 == a10_0Var.Ez0()) {
                lg_0.k.lPT5(BattleMultiHitSequenceTask::Wj0);
            }
        }
    }

    public final void f10() {
        lg_0.k.lPT5(this::Mk);
    }

    public final void Mk() {
        jk();
        if (this.IL0) {
            A20();
        }
    }
}
