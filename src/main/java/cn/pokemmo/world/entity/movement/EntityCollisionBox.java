package cn.pokemmo.world.entity.movement;

import f.*;

public class EntityCollisionBox extends vg_1 {
    public final xg_0 Sl;
    public final si_0 Cl;
    public final OT coM3;
    public final cn_0 ZI;
    public final cn_0 iK0;
    public qj_2[] Aj0;

    public EntityCollisionBox(xg_0 xg_02, si_0 si_02) {
        this.Sl = xg_02;
        this.Cl = si_02;
        this.uf("link-slot");
        this.RE(!tw0_0.kz0());
        if (tw0_0.kz0()) {
            this.coM3 = new OT(48, 48, si_02.vf0());
            this.coM3.VL0(2);
        } else {
            this.coM3 = new OT(24, 24, si_02.vf0());
            this.coM3.Te0(-24, -24);
        }
        this.ZI = new cn_0(si_02.GS());
        this.ZI.uf("label");
        this.iK0 = new cn_0();
        this.iK0.uf("is-leader");
        this.iK0.Ll(true);
        this.nuL();
        this.SL(this.coM3);
        this.SL(this.ZI);
        this.SL(this.iK0);
    }

    public final void nuL() {
        this.aS(qj_2.class);
        ls_0[] ls = this.Cl.qJ0;
        this.Aj0 = new qj_2[ls.length];
        for (int j = 0; j < ls.length; ++j) {
            final int idx = j;
            if (tw0_0.kz0()) {
                this.Aj0[j] = new qj_2("", 72, 72);
                this.Aj0[j].tp0.EJ0 = 2.0f;
                this.Aj0[j].RR(() -> this.y20(ls, idx));
            } else {
                this.Aj0[j] = new qj_2("", 36, 36);
                this.Aj0[j].RR(() -> this.H10(ls, idx));
            }
            this.Aj0[j].tp0.o60(new AG0[]{yh_0.Xm0.qC0(ls[j].Xm0, (byte) 0, false)[0]});
            this.Aj0[j].yj0 = ((cq_0) mp_1.vf0().k2.get(ls[j].Xm0)).Ay(false);
            this.Aj0[j].yB0();
            this.Aj0[j].GH0 = 0;
            this.Aj0[j].uf("link-monster");
            this.F9(this.fU(), this.Aj0[j]);
        }
    }

    @Override
    public final boolean nd0(i70_0 i70_02) {
        if (i70_02.Li() && i70_02.zu == 4) {
            this.Sl.gz0((bn_2) this);
            return true;
        }
        return super.nd0(i70_02);
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            this.coM3.E40(this.A20, this.SB0);
            this.ZI.E40(this.A20 + 80, this.SB0 + 40);
            int n = this.ZI.hr0() + this.ZI.A20 + 5;
            this.iK0.lt0();
            this.iK0.E40(n, this.ZI.SB0 - 5);
            if (this.iK0.eE) {
                n = this.iK0.Mx + 6 + n;
            }
            for (int j = 0; j < this.Aj0.length; ++j) {
                qj_2 qj = this.Aj0[j];
                qj.E40(n, this.SB0 - 8);
                n += qj.Mx;
            }
            this.RY(this.Aj0.length * 72 + (this.ZI.hr0() + (this.iK0.eE ? 20 : 0) + 100), 80);
            this.oY(this.Aj0.length * 72 + (this.ZI.hr0() + (this.iK0.eE ? 20 : 0) + 100), 80);
        } else {
            this.coM3.E40(this.A20 + 10, this.SB0 + 10);
            this.ZI.E40(this.A20 + 30, this.SB0 + 14);
            int n = this.ZI.hr0() + this.ZI.A20 + 5;
            this.iK0.lt0();
            this.iK0.E40(n, this.SB0 + 7);
            if (this.iK0.eE) {
                n = this.iK0.Mx + 6 + n;
            }
            for (int j = 0; j < this.Aj0.length; ++j) {
                qj_2 qj = this.Aj0[j];
                qj.E40(n, this.SB0 - 8);
                n += qj.Mx;
            }
            this.RY(this.Aj0.length * 36 + (this.ZI.hr0() + (this.iK0.eE ? 20 : 0) + 40), 30);
            this.oY(this.Aj0.length * 36 + (this.ZI.hr0() + (this.iK0.eE ? 20 : 0) + 40), 30);
        }
    }

    public final void H10(ls_0[] ls, int n) {
        BR br = tw0_0.rl;
        CH0 ch = this.Cl.HU;
        CH0 ch2 = ls[n].Y9;
        if (ch.Uz0()) {
            ch = br.cJ0.dj0;
        }
        br.fk0.uQ(new tg0_0(ch, ch2));
    }

    public final void y20(ls_0[] ls, int n) {
        BR br = tw0_0.rl;
        CH0 ch = this.Cl.HU;
        CH0 ch2 = ls[n].Y9;
        if (ch.Uz0()) {
            ch = br.cJ0.dj0;
        }
        br.fk0.uQ(new tg0_0(ch, ch2));
    }
}

