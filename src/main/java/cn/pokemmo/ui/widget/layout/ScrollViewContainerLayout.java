package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrollViewContainerLayout extends BaseLayoutBox implements tr_1 {
    public final vy_2 fO;
    public int nm0;
    public int fu;
    public xe_1[] qM;
    public final fy_2 a8;
    public final ak0_2[] bI0;
    public final cn_0 Ey0;
    public final hh0_1 Fa0;

    public ScrollViewContainerLayout(vy_2 vy_2Var, mc0_1 mc0_1Var, CH0 ch0Var, boolean z) {
        this.fu = 0;
        this.qM = new xe_1[0];
        this.fO = vy_2Var;
        uf(vy_2Var.dv() ? "battle-panel-dark" : "hud-panel-invis");
        this.Ey0 = new cn_0(sm0_0.H5(lpt6__2.Q80, 157, z ? 12 : 13));
        this.Ey0.uf("label-big");
        this.a8 = new fy_2();
        this.bI0 = new ak0_2[6];
        ArrayList<VU> arrayList = new ArrayList<>();
        byte b = 0;
        a10_0 a10_0Var = tw0_0.PK0;
        CH0[] ch0Arr = null;
        if (a10_0Var != null) {
            b = a10_0Var.Ez0();
            ch0Arr = Arrays.stream(a10_0Var.mn(b).Ta(a10_0Var.zn0()))
                    .map(tb0_1::tz0)
                    .toArray(ScrollViewContainerLayout::cOn);
        }
        Mj Wp = tw0_0.rl.Wp();
        int switchVal = NL0.ua0[mc0_1Var.dB0(vy_2Var.dv()).FB0()];
        switch (switchVal) {
            case 1:
                if (a10_0Var == null) {
                    Mj r1 = tw0_0.rl.r1(_volatile.cN);
                    if (r1 != null) {
                        for (VU vuVar : r1.y0()) {
                            if (vuVar.RJ().iB() && vuVar.RJ().SA0() != 492) {
                                arrayList.add(vuVar);
                            }
                        }
                    }
                }
                break;
            case 2:
                if (a10_0Var != null) {
                    b30_0 D0 = a10_0Var.D0();
                    if (D0 != null) {
                        PF Ce = a10_0Var.Ce(D0.a70(), D0.B50());
                        if (Ce != null) {
                            VU sF = Wp.sF(Ce.Zo0());
                            if (sF != null) {
                                arrayList.add(sF);
                            }
                        }
                    }
                }
                break;
            case 3:
                if (a10_0Var != null) {
                    for (PF pfVar : a10_0Var.Yc(b)) {
                        if (pfVar != null && !pfVar.H7()) {
                            VU sF = Wp.sF(pfVar.Zo0());
                            if (sF != null) {
                                arrayList.add(sF);
                            }
                        }
                    }
                }
                break;
            default:
                for (short s = 0; s < 6; s = (short) (s + 1)) {
                    VU Ry0 = Wp.Ry0(s);
                    if (Ry0 != null) {
                        arrayList.add(Ry0);
                    }
                }
                if (vy_2Var.dv() && a10_0Var != null && (a10_0Var.mn(b) instanceof Jh)) {
                    for (PF pfVar : a10_0Var.Yc(b)) {
                        if (pfVar != null && !pfVar.H7()) {
                            if (arrayList.stream().noneMatch(vuVar -> Tt0(pfVar, vuVar))) {
                                arrayList.add(new VU(pfVar.Aw0().mf0()));
                            }
                        }
                    }
                }
                break;
        }

        for (short s = 0; s < this.bI0.length; s = (short) (s + 1)) {
            this.bI0[s] = new x2_0((f.tf_1)(Object)this, tw0_0.kz0() ? 300 : 225, tw0_0.kz0() ? 80 : 54, s);
            this.bI0[s].pw0(false);
            this.bI0[s].uf("battle-button");
            this.bI0[s].qF0(pa0_0.up0);
        }

        CH0[] finalCh0Arr = ch0Arr;
        if (finalCh0Arr != null) {
            arrayList.removeIf(vuVar -> Uh(finalCh0Arr, vuVar));
        }

        for (VU vuVar : arrayList) {
            int indexOf = arrayList.indexOf(vuVar);
            if (indexOf < this.bI0.length) {
                this.bI0[indexOf].ih(vuVar);
                ak0_2 ak0_2Var = this.bI0[indexOf];
                boolean enabled = false;
                if (ak0_2Var != null) {
                    if (!mc0_1Var.ol() || S.ZT(vuVar.Wd(), mc0_1Var.uq())) {
                        enabled = true;
                    }
                }
                ak0_2Var.pw0(enabled);
                this.bI0[indexOf].RR(() -> aA0(vy_2Var, vuVar, z, mc0_1Var, ch0Var));
            }
        }

        if (vy_2Var.dv() && !tw0_0.kz0()) {
            this.a8.x40(this.a8.H10().Xq(
                    this.a8.lo0().LPt3(this.bI0[0], this.bI0[1], this.bI0[2]),
                    this.a8.lo0().LPt3(this.bI0[3], this.bI0[4], this.bI0[5])));
            this.a8.WQ(this.a8.H10().Xq(
                    this.a8.lo0().LPt3(this.bI0[0], this.bI0[3]),
                    this.a8.lo0().LPt3(this.bI0[1], this.bI0[4]),
                    this.a8.lo0().LPt3(this.bI0[2], this.bI0[5])));
        } else {
            this.a8.x40(this.a8.H10().qd(18).Xq(
                    this.a8.lo0().LPt3(this.bI0[0], this.bI0[1]),
                    this.a8.lo0().LPt3(this.bI0[2], this.bI0[3]),
                    this.a8.lo0().LPt3(this.bI0[4], this.bI0[5])));
            this.a8.WQ(this.a8.H10().Xq(
                    this.a8.lo0().LPt3(this.bI0[0], this.bI0[2], this.bI0[4]),
                    this.a8.lo0().LPt3(this.bI0[1], this.bI0[3], this.bI0[5])));
        }
        SL(this.a8);
        if (vy_2Var.dv()) {
            SL(this.Ey0);
            this.Fa0 = null;
        } else {
            hh0_1 hh0_1Var = new hh0_1(sm0_0.c0(nf0_0.Bq0));
            this.Fa0 = hh0_1Var;
            hh0_1Var.RR(vy_2Var::ew0);
            this.Fa0.uf("battle-button-return");
            SL(this.Fa0);
        }
        zK0(this.bI0, (vy_2Var.dv() && !tw0_0.kz0()) ? 3 : 2);
    }

    public static void aA0(vy_2 vy_2Var, VU vuVar, boolean z, mc0_1 mc0_1Var, CH0 ch0Var) {
        vy_2Var.ew0();
        if (vuVar == null) {
            return;
        }
        if (z) {
            vy_2Var.Lj0(mc0_1Var.Z8, vuVar.I8);
            return;
        }
        if (mc0_1Var.dB0(vy_2Var.dv()) == JU.hD) {
            vy_2Var.OV(mc0_1Var, ch0Var, vuVar);
            return;
        }
        if (mc0_1Var.rg && !vy_2Var.dv()) {
            BU.T50.throw$(vy_2Var, ch0Var, vuVar, (byte) -1);
            return;
        }
        vy_2Var.U90(mc0_1Var.Z8, ch0Var, vuVar.pu, (byte) -1);
    }

    public static boolean Uh(CH0[] ch0Arr, VU vuVar) {
        return !S.ZT(vuVar.pu, ch0Arr);
    }

    public static boolean Tt0(PF pfVar, VU vuVar) {
        return vuVar.pu.equals(pfVar.zi0.Bn.YD0);
    }

    public static CH0[] cOn(int i) {
        return new CH0[i];
    }

    @Override
    public final void C(zk0_1 zk0_1Var) {
        this.uc = false;
        lpt6__0.v90(Ba0());
    }

    @Override
    public final boolean nd0(i70_0 i70_0Var) {
        if (E00.ZU(i70_0Var.zu) && i70_0Var.iT()) {
            AT(i70_0Var);
            return true;
        }
        return super.nd0(i70_0Var);
    }

    public final xe_1 Ba0() {
        int i = this.nm0;
        if (i >= 0 && i < this.qM.length) {
            return this.qM[i];
        }
        return null;
    }

    public final void AT(i70_0 i70_0Var) {
        int key = i70_0Var.finally$;
        rp_0 rp_0Var = rp_0.sJ0;
        int unused = dw_2.ff;
        if (rp_0Var != null && rp_0Var.Ov(key)) {
            xe_1 btn = Ba0();
            if (btn != null && btn.OI) {
                a7_0.bH(btn.ER.Fc0);
            }
            return;
        }
        if (this.Fa0 != null) {
            int key2 = i70_0Var.finally$;
            rp_0 nK0 = rp_0.nK0;
            if (nK0 != null && nK0.Ov(key2)) {
                a7_0.bH(this.Fa0.ER.Fc0);
                return;
            }
        }
        int key3 = i70_0Var.finally$;
        rp_0 ni = rp_0.Ni;
        if (ni != null && ni.Ov(key3)) {
            int next = this.nm0 + 1;
            if (next % this.fu != 0) {
                this.nm0 = next;
            }
        } else {
            int key4 = i70_0Var.finally$;
            rp_0 i90 = rp_0.I90;
            if (i90 != null && i90.Ov(key4)) {
                int prev = this.nm0;
                if ((prev + 1) % this.fu != 1) {
                    this.nm0 = prev - 1;
                }
            } else {
                int key5 = i70_0Var.finally$;
                rp_0 kC0 = rp_0.kC0;
                if (kC0 != null && kC0.Ov(key5)) {
                    int up = this.nm0 - this.fu;
                    if (up >= 0) {
                        this.nm0 = up;
                    }
                } else {
                    int key6 = i70_0Var.finally$;
                    rp_0 sync = rp_0.synchronized$;
                    if (sync != null && sync.Ov(key6)) {
                        int down = this.nm0 + this.fu;
                        if (down < this.qM.length) {
                            this.nm0 = down;
                        }
                    }
                }
            }
        }
        lpt6__0.v90(Ba0());
    }

    @Override
    public final void K8() {
        le0_2 parent = this.K20;
        if (parent == null) {
            return;
        }
        if (this.fO.dv() && !tw0_0.kz0()) {
            int px = parent.a3();
            int py = parent.k5();
            int pw = this.A20;
            int ph = this.SB0;
            if (parent instanceof q40_0) {
                q40_0 q = (q40_0) parent;
                px = q.Rg;
                py = q.kr;
                pw = q.fj;
                ph = q.jA;
                oY(px, py);
                E40(pw, ph);
                oY(px, py);
                E40(pw, ph);
            }
            this.Ey0.qF0(pa0_0.Ol);
            int ey0X = (int) ((double) (pw + (px / 2)) - (double) this.Ey0.Mx * 0.5D);
            this.Ey0.E40(ey0X, ph - 20);
            this.a8.oY(px, py);
            this.a8.vi(8, 5, 8, 5);
            this.a8.E40(pw, ph);
            for (int i = 0; i < this.bI0.length; i++) {
                this.bI0[i].RY(200, 48);
            }
            return;
        }

        if (!tw0_0.kz0()) {
            if (this.Fa0 != null) {
                this.Fa0.lt0();
                this.Fa0.E40(parent.cz() - this.Fa0.Mx - 5, parent.VM() - this.Fa0.OB - 6);
            }
            this.a8.oY(parent.a3(), parent.k5());
            this.a8.E40(parent.A20 + parent.e80, parent.SB0 + parent.y9 + 50);
            this.a8.vi(8, 5, 8, 5);
            for (int i = 0; i < this.bI0.length; i++) {
                this.bI0[i].RY(186, 42);
            }
        } else {
            lt0();
            this.a8.oY(630, 350);
            this.a8.E40(parent.A20 + parent.e80, parent.SB0 + parent.y9 + 50);
            this.a8.vi(8, 5, 8, 5);
            for (int i = 0; i < this.bI0.length; i++) {
                this.bI0[i].oY(300, 80);
                this.bI0[i].RY(300, 80);
                this.bI0[i].g2(300, 80);
            }
            if (this.Fa0 != null) {
                this.Fa0.Vi0 = 180;
                this.Fa0.fN = 56;
                this.Fa0.E40(this.a8.A20 + this.a8.Mx - 195, this.a8.OB - 30);
            }
            this.Ey0.E40(this.Ey0.A20, this.Ey0.SB0 + this.Ey0.OB + 10);
        }
    }

    public final void zK0(xe_1[] xe_1Arr, int i) {
        this.nm0 = 0;
        this.fu = i;
        this.qM = xe_1Arr;
        if (xe_1Arr.length == 0) {
            return;
        }
        lpt6__0.v90(xe_1Arr[0]);
    }
}
