package cn.pokemmo.rom.nds.dppt;

import f.*;
public class PlatinumSpearPillarScene extends XD {
    public final C8 IG0;
    public final C8 D6;
    public final C8 W70;
    public final C8 Com8;
    public final C8 Lp0;
    public final C8 prn;
    public int m10;
    public final com3__3[][] ZM;
    public Ou0 Wn0;
    public Ou0 wh;
    public Ou0 Ag;
    public Ou0 ut;
    public Ou0 rf;
    public Ou0 Dj;
    public Ou0 NI;
    public Ou0 Et;
    public Ou0 gf0;
    public Ou0 QK;
    public Ou0 H10;
    public Ou0 Xh0;
    public Ou0 Xm0;
    public Ou0 f00;
    public Ou0 So0;
    public Ou0 Vi0;
    public Wr[] Hx0;
    public com3__3 Ic0;
    public pw_1 PG0;

    public PlatinumSpearPillarScene() {
        super(30, false);
        this.IG0 = new C8();
        this.D6 = new C8(0.0f, 1.0f, 0.0f);
        this.W70 = new C8(0.0f, 0.1f, 3.0f);
        this.Com8 = new C8(0.0f, 1.2f, 4.0f);
        this.Lp0 = new C8(0.0f, 0.1f, 1.1f);
        this.prn = new C8(0.0f, 1.2f, 2.1f);
        this.m10 = 0;
        this.ZM = new com3__3[q10_0.Pn0.length + 1][9];
        this.I0.set(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public final void IZ() {
        super.IZ();
        this.fC0.Wu0 = 0.1f;
        this.fC0.Qy = 200.0f;
        this.fC0.zo0 = 20.0f;
        this.fC0.d00 = 0.0f;
        this.fC0.Q30 = -40.0f;
        this.fC0.Rg0 = 8.0f;
    }

    public final void ux() {
        Ts ts = tw0_0.Ll0.nC0;
        FJ fj = new FJ((Ae) ts.fd0.dg.get("/arc/demo_tengan_gra.narc"));
        FJ fj2 = new FJ((Ae) ts.fd0.dg.get("/data/demo_climax.narc"));
        this.sg.Ue0(v80_0.CW(fj, 46, new int[]{-1}));
        Ou0 PC0 = v80_0.PC0(fj, 24, true, true, false, new int[]{22, 23});
        this.Wn0 = PC0;
        this.sg.Ue0(PC0);
        this.wh = v80_0.CW(fj, 53, new int[]{51, 52});
        this.Ag = v80_0.CW(fj, 55, new int[]{54, 56});
        this.ut = v80_0.CW(fj, 84, new int[]{82});
        Ou0 PC02 = v80_0.PC0(fj, 7, false, false, true, new int[]{8, 9, 10, 11});
        this.rf = PC02;
        Xz0 Ve0 = PC02.Ve0("polygon1_tama_naka", true);
        if (Ve0 != null) {
            this.rf.ZE0.sj0(Ve0, true);
            this.rf.Ve0("bubble_out", true).lPt7(Ve0);
            Ve0.BI0.na(0.0f, 0.0f, 0.02f);
        }
        Xz0 Ve02 = this.rf.Ve0("polygon2_tama_edge", true);
        if (Ve02 != null) {
            this.rf.ZE0.sj0(Ve02, true);
            this.rf.Ve0("bubble_in", true).lPt7(Ve02);
            Ve02.BI0.na(0.0f, 0.0f, 0.05f);
            Ve02.Fc0.x = 1.05f;
            Ve02.Fc0.y = 1.05f;
            Ve02.Fc0.z = 1.05f;
        }
        Xz0 Ve03 = this.rf.Ve0("polygon3_tama_edge", true);
        if (Ve03 != null) {
            this.rf.ZE0.sj0(Ve03, true);
            this.rf.Ve0("bubble_in", true).lPt7(Ve03);
            Ve03.BI0.na(10000.0f, 10000.0f, 0.15f);
        }
        this.Dj = v80_0.CW(fj2, 41, new int[]{40});
        this.NI = v80_0.CW(fj2, 42, new int[]{-1});
        this.Et = v80_0.CW(fj2, 26, new int[]{25, 27});
        this.gf0 = v80_0.CW(fj2, 29, new int[]{28, 30});
        this.QK = v80_0.CW(fj2, 32, new int[]{31, 33});
        this.H10 = v80_0.CW(fj2, 35, new int[]{34, 36});
        this.Xh0 = v80_0.CW(fj2, 38, new int[]{37, 39});
        this.Xm0 = v80_0.CW(fj2, 66, new int[]{67});
        this.f00 = v80_0.CW(fj2, 68, new int[]{69});
        Wr[] f80 = tw0_0.Ll0.nC0.f80((short) 120);
        this.Hx0 = f80;
        com3__3 com3__3Var = new com3__3(32, 32, new LPT6_(f80[0].H8()), false);
        this.Ic0 = com3__3Var;
        com3__3Var.qq0(true);
        this.Ic0.OF0(0.011f);
    }

    public final void pG0() {
        int i = this.m10;
        if (i >= 4 && i < 6) {
            this.fC0.Ws0.x = System.currentTimeMillis() % 5L == 0 ? 0.01f : 0.0f;
        }
        this.fC0.rj.np(this.D6).Vy(0.0f, 1.0f, 0.0f);
        this.fC0.JP(this.D6.x, this.D6.y, this.D6.z);
    }

    public final void i5() {
        iw_1 Py0 = tw0_0.FL.Py0();
        if (Py0 != null) {
            jy_1 aj = tw0_0.LD0.aj;
            this.IG0.np(this.Lp0).na(0.0f, 0.125f, 0.0f);
            this.fC0.zz(this.IG0);
            aj.v3.ZX(this.IG0, (float) aj.df, (float) aj.gS, (float) aj.Ty, (float) aj.Ja);
            pk0_0.K60(Py0, (int) this.IG0.x, (int) this.IG0.y);
        }

        switch (this.m10) {
            case 0:
                wv0(14);
                break;
            case 2:
                wv0(16);
                break;
            case 4:
                this.m10++;
                Ou0 ip0 = tq0_0.ip0(this.rf, this.rf);
                ip0.I0 = true;
                Ou0 ip02 = tq0_0.ip0(this.rf, this.rf);
                ip02.I0 = true;
                ip0.ho.el0(-0.75f, 0.15f, -0.75f);
                ip02.ho.el0(0.75f, 0.15f, -0.75f);
                ip0.sC0(0, false, null);
                ip02.sC0(0, false, new ke_1((uv_1) (Object) this, ip0, ip02));
                this.sg.Ue0(ip0);
                this.sg.Ue0(ip02);
                this.Xm0.ho.el0(-0.75f, 0.15f, -0.75f);
                this.f00.ho.el0(0.75f, 0.15f, -0.75f);
                this.Xm0.ho.EW[0] = 0.05f;
                this.f00.ho.EW[0] = 0.05f;
                break;
            case 6:
                this.sg.Ue0(this.Xm0);
                this.sg.Ue0(this.f00);
                this.m10++;
                this.Xm0.sC0(0, true, null);
                this.f00.sC0(0, true, null);
                break;
            case 7:
                if (LW.LH0(this.Xm0.ho.EW[0], 1.0f)) {
                    this.m10++;
                }
                this.Xm0.ho.EW[0] = Math.min(1.0f, this.Xm0.ho.EW[0] + 0.05f);
                this.f00.ho.EW[0] = Math.min(1.0f, this.f00.ho.EW[0] + 0.05f);
                break;
            case 8:
                tw0_0.LD0.Gx0 = new L0();
                this.m10++;
                break;
            case 9:
                d3 d3Var = tw0_0.LD0.Gx0;
                if (d3Var == null || d3Var.gL0()) {
                    this.m10++;
                }
                break;
            case 10:
                if (this.So0 == null) {
                    Ou0 ip03 = tq0_0.ip0(this.ut, this.ut);
                    ip03.I0 = true;
                    this.So0 = ip03;
                    Ou0 ip04 = tq0_0.ip0(this.ut, this.ut);
                    ip04.I0 = true;
                    this.Vi0 = ip04;
                    this.sg.Ue0(this.So0);
                    this.sg.Ue0(this.Vi0);
                    this.So0.ho.el0(-0.75f, 0.25f, -0.75f);
                    this.Vi0.ho.el0(0.75f, 0.25f, -0.75f);
                    this.So0.ho.hr(0.01f);
                    this.Vi0.ho.hr(0.01f);
                    this.So0.sC0(0, true, null);
                    this.Vi0.sC0(0, true, null);
                }
                if (this.So0.ho.EW[0] >= 0.6f) {
                    this.m10++;
                } else {
                    float[] fArr = this.So0.ho.EW;
                    fArr[0] += 0.0075f;
                    fArr[5] += 0.0075f;
                    fArr[10] += 0.0075f;
                    float[] fArr2 = this.Vi0.ho.EW;
                    fArr2[0] += 0.0075f;
                    fArr2[5] += 0.0075f;
                    fArr2[10] += 0.0075f;
                }
                break;
            case 11:
                wv0(18);
                break;
            case 13:
                wv0(19);
                break;
            case 15:
                this.sg.sj0(this.So0, true);
                this.sg.sj0(this.Vi0, true);
                this.m10++;
                break;
            case 16:
            case 17:
                this.m10++;
                break;
            case 18:
                this.m10++;
                ao_1 dx = ao_1.DX(this.fC0, 6, 1.0f);
                dx.h5[0] = -25.0f;
                this.PG0 = (pw_1) pw_1.xC().Xf0().y80(dx).mz0().Ms(this.cn);
                break;
            case 19:
                if (this.PG0.BJ0()) {
                    wv0(20);
                }
                break;
            case 21:
                ao_1 dx2 = ao_1.DX(this.D6, 3, 1.0f);
                dx2.h5[0] = 1.0f;
                this.PG0 = (pw_1) pw_1.xC().Xf0().y80(dx2).mz0().Ms(this.cn);
                this.m10++;
                break;
            case 22:
                if (this.PG0.BJ0()) {
                    this.Ic0.bq0.I3.uj = this.Hx0[11].H8();
                    wv0(21);
                }
                break;
            case 24:
                wv0(22);
                break;
            case 26:
                this.PG0 = (pw_1) pw_1.xC().Xf0().y80(ao_1.DX(this.UF.v50, 0, 1.0f).Om0(new float[]{0.55f, 0.55f, 0.55f, 1.0f})).mz0().Ms(this.cn);
                this.m10++;
                break;
            case 27:
                if (this.PG0.BJ0()) {
                    wv0(23);
                }
                break;
            case 29:
                ao_1 dx3 = ao_1.DX(this.D6, 3, 1.0f);
                dx3.h5[0] = -0.75f;
                this.PG0 = (pw_1) pw_1.xC().Xf0().y80(dx3).mz0().Ms(this.cn);
                this.m10++;
                break;
            case 30:
                if (this.PG0.BJ0()) {
                    this.Ic0.bq0.I3.uj = this.Hx0[0].H8();
                    this.sg.Ue0(this.Dj);
                    this.Dj.sC0(0, false, new JP((uv_1) (Object) this));
                    this.m10++;
                }
                break;
            case 32:
                this.sg.Ue0(this.Et);
                this.Et.sC0(0, false, new ho_2((uv_1) (Object) this));
                this.Et.ho.Yp0(0.0f, -1.2f, 0.0f);
                this.m10++;
                break;
            case 33:
                float[] fArr3 = this.Et.ho.EW;
                if (fArr3[13] <= -0.8f) {
                    fArr3[13] += 0.005f;
                }
                break;
            case 34:
                this.sg.Ue0(this.Ag);
                this.Ag.sC0(0, false, null);
                this.Wn0.sC0(0, false, new FX((uv_1) (Object) this));
                this.sg.sj0(this.Et, true);
                this.gf0.ho.Dd0(this.Et.ho.EW);
                this.sg.Ue0(this.gf0);
                this.gf0.sC0(0, true, null);
                this.m10++;
                break;
            case 35:
                float[] fArr4 = this.gf0.ho.EW;
                if (fArr4[13] < 0.0f) {
                    fArr4[13] += 0.005f;
                }
                break;
            case 36:
                wv0(24);
                break;
            case 38:
                this.QK.ho.Dd0(this.gf0.ho.EW);
                this.QK.sC0(0, false, new wq_1((uv_1) (Object) this));
                this.sg.Ue0(this.QK);
                this.sg.sj0(this.gf0, true);
                Ou0 ip05 = tq0_0.ip0(this.wh, this.wh);
                ip05.I0 = true;
                Ou0 ip06 = tq0_0.ip0(this.wh, this.wh);
                ip06.I0 = true;
                this.sg.Ue0(ip05);
                this.sg.Ue0(ip06);
                ip05.ho.el0(-0.25f, 0.0f, 0.0f);
                ip06.ho.el0(0.25f, 0.0f, 0.0f);
                ip05.sC0(0, false, null);
                ip06.sC0(0, false, null);
                this.m10++;
                break;
            case 40:
                this.H10.ho.Dd0(this.QK.ho.EW);
                this.H10.sC0(0, true, null);
                this.sg.Ue0(this.H10);
                this.sg.sj0(this.QK, true);
                wv0(25);
                break;
            case 42:
                tw0_0.FL.iQ(new kt_0(sm0_0.Bw((byte) 3, lpt6__2.YG0, 234, 26, sm0_0.zb0), jm_1.hK, hg_2.bx, null));
                this.m10++;
                break;
            case 43:
                this.Xh0.ho.Dd0(this.H10.ho.EW);
                this.Xh0.sC0(0, false, new pq0_0((uv_1) (Object) this));
                this.sg.Ue0(this.Xh0);
                this.sg.sj0(this.H10, true);
                this.m10++;
                break;
            case 45:
                iw_1 Py02 = tw0_0.FL.Py0();
                if (Py02 != null) {
                    Py02.wQ();
                }
                this.PG0 = (pw_1) pw_1.xC().Xf0().y80(ao_1.DX(this.UF.v50, 0, 0.1f).Om0(new float[]{0.0f, 0.0f, 0.0f, 1.0f})).p1(1.0f).mz0().Ms(this.cn);
                this.m10++;
                break;
        }

        this.OB0.A80(this.sg, this.BH);
        this.W70.x = 0.0f;
        this.W70.y = 0.5f;
        this.W70.z = 3.0f;
        this.Com8.x = 0.0f;
        this.Com8.y = 1.5f;
        this.Com8.z = 4.0f;
        byte b = 1;
        E90 jB0 = tw0_0.e60.jB0;
        if (jB0.LH0() || jB0.Ze()) {
            b = -26;
        } else if (jB0.oI0()) {
            b = -17;
        }
        long j = hk0_1.KG;
        this.Hx0[0].Ik = j;
        this.Hx0[11].Ik = j;
        tw0_0.pv.hF(this.OB0, this.BH, tw0_0.e60.jB0, null, this.ZM, b, this.W70, this.Com8, this.fC0.St0, false, false);
        this.Ic0.qr0(this.Lp0);
        this.Ic0.DB0(this.prn, this.fC0.St0);
        this.OB0.Lh0(this.Ic0, this.BH);
    }

    public final boolean Lpt1() {
        return this.m10 == 46 && this.PG0.BJ0();
    }

    public final void wv0(int i) {
        String str = "";
        E90 jB0 = tw0_0.e60.jB0;
        if (jB0 != null) {
            str = jB0.oc0;
        }
        tw0_0.FL.iQ(new kt_0(sm0_0.Bw((byte) 3, lpt6__2.YG0, 234, i, new String[]{str}), jm_1.hK, hg_2.bx, new qa_1((uv_1) (Object) this)));
        this.m10++;
    }
}
