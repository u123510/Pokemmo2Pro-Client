package cn.pokemmo.ui.widget.pc;

import f.*;

public class PcStorageBoxGridWidget extends NK {

    public cn_0[] wS;

    public PcStorageBoxGridWidget(QT v1) {
        super(v1, _volatile.Bf0, -1);
    }

    public static void Fi0(tx_0 v0, String v1) {
        tw0_0.rl.fk0.uQ(new de0_1(v0.wo, v1));
    }

    @Override
    public final void CW() {
        byte b = tw0_0.rl.k0.hL0;
        byte i1 = tx_0.bm0(b);
        this.Pm = new com6__3[i1 * 6];
        this.wS = new cn_0[i1];
        v2 v2_by = new v2((tz0_0) this);
        I7 v3 = new I7(this);
        Hm0 v4 = new Hm0(this);
        Hm0 v5 = new Hm0(this);
        I7 v6 = new I7(this);
        v6.Ze0();

        for (int i7 = 0; i7 < i1; i7++) {
            int i8 = 3;
            jb0_0[] v9 = new jb0_0[3];
            I7 v10 = new I7(this);
            Hm0 v11 = new Hm0(this);
            tx_0 v12 = tw0_0.rl.dh0.Ed0((byte) i7);
            cn_0 label = new cn_0(null, 0);
            this.wS[i7] = label;
            label.uf("label-battle-box");
            label.ZZ(e -> rn0(v12, (e90_0) e));
            v10.X20(new Hm0(this).LPt3(new le0_2[]{this.wS[i7]}));
            v11.X20(new I7(this).LPt3(new le0_2[]{this.wS[i7]}));
            int i13 = 0;
            for (byte i14 = 0; i14 < 6; i14++) {
                com6__3 v15 = new com6__3(this.Br, this, tw0_0.rl.r1(_volatile.Bf0), v12, i14);
                int i16 = (i7 % 3) * 3 + Math.floorDiv(i7, 3) * 18 + (i14 % 3) + Math.floorDiv(i14, 3) * 9;
                ((com6__3[]) this.Pm)[i16] = v15;
                v15.Sg = v2_by;
                v15.Nj = () -> Of0(i16);
                v9[i13] = v15;
                i13++;
                if (i13 % i8 == 0) {
                    i13 = 0;
                    v10.X20(new Hm0(this).LPt3(v9));
                    v11.X20(new I7(this).LPt3(v9));
                }
            }
            v5.X20(v10);
            v6.X20(v11);
            int nextI7 = i7 + 1;
            int rem3 = nextI7 % 3;
            if (rem3 > 0) {
                v6.qd(25);
            }
            if (rem3 == 0) {
                v3.X20(v5);
                v4.X20(v6);
                v3.Ze0();
                v5 = new Hm0(this);
                v6 = new I7(this);
            }
        }

        if (i1 < 30 && h50_0.Bj0) {
            xe_1 v1_btn = new xe_1(sm0_0.c0(4018));
            v1_btn.RR(this.Br::y1);
            v3.qd(15);
            v3.X20(C7(new le0_2[]{v1_btn}));
            v4.X20(C7(new le0_2[]{v1_btn}).Ze0());
        }
        v3.Ze0();
        WQ(new I7(this).Xq(new ya_1[]{v4}));
        x40(new Hm0(this).Xq(new ya_1[]{v3}));
        if (tw0_0.kz0()) {
            this.pJ0.Ze0();
        }
    }

    public final void PH(String[] v1_ignore) {
        HY v1 = tw0_0.rl.dh0;
        for (byte i2 = 0; i2 < tx_0.bm0(tw0_0.rl.k0.hL0); i2++) {
            tx_0 v3 = v1.Ed0(i2);
            for (byte i4 = 0; i4 < 6; i4++) {
                VU v5 = tw0_0.rl.FJ0(v3.NG0[i4], new _volatile[]{_volatile.BV, _volatile.Bf0});
                int i6 = (i2 % 3) * 3 + Math.floorDiv(i2, 3) * 18 + (i4 % 3) + Math.floorDiv(i4, 3) * 9;
                com6__3 v6 = ((com6__3[]) this.Pm)[i6];
                v6.bY = v5;
                v6.iV(v6.Vt0);
                if (v5 != null) {
                    short species = v5.I8.Kr();
                    byte form = v5.Dg0();
                    boolean shiny = v5.I8.aR();
                    v6.E1(yh_0.Xm0.qC0(species, form, shiny)[0]);
                } else {
                    v6.z70 = null;
                    v6.E1(null);
                    v6.yj0 = null;
                    v6.yB0();
                }
                v6.ER.lK0(false);
            }
            if (!v3.i30.isEmpty()) {
                this.wS[i2].Sk(v3.i30);
            } else {
                this.wS[i2].Sk(sm0_0.wa0(2360, Integer.toString(i2 + 1)));
            }
        }
    }

    @Override
    public final void EP(int i1) {
        super.EP(i1);
        ((lo0_0) this.K20.K20).Rn(((com6__3[]) this.Pm)[i1]);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        int i2 = v1.zu;
        if (E00.C10(i2)) {
            if (i2 == 3) {
                if (this.Br.wf0()) {
                    lo0_0 v2 = this.Br.bH;
                    if (v2.Em0 != null) {
                        mh_1 cL = v2.Em0.cL;
                        cL.HV.sj0(v2.Wc, true);
                    }
                }
            } else if (i2 == 4) {
                lo0_0 v2 = this.Br.bH;
                if (v2.Em0 != null) {
                    mh_1 cL = v2.Em0.cL;
                    cL.HV.sj0(v2.Wc, true);
                    C90 v3 = v2.Wc;
                    if (v3 == null) {
                        throw new NullPointerException("processor cannot be null");
                    }
                    cL.HV.P6(0, v3);
                }
            }
        }
        return super.nd0(v1);
    }

    @Override
    public final void a80(Jn0 v1) {
    }

    @Override
    public final int sD0() {
        return 9;
    }

    @Override
    public final ye_0[] YG() {
        return (com6__3[]) this.Pm;
    }

    public final void rn0(tx_0 v1, e90_0 v2) {
        if (v2 == e90_0.VG) {
            this.Br.F9(this.Br.fU(), new ox_1(sm0_0.c0(2362), 20, (String name) -> Fi0(v1, name)));
        }
    }
}
