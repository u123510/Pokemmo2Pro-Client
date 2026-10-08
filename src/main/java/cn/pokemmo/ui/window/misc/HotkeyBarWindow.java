package cn.pokemmo.ui.window.misc;

import f.*;


/**
 * 快捷键技能道具栏悬浮窗
 *
 * 原混淆类: f.IA
 */
public class HotkeyBarWindow extends R90 {
    public final IA asBridge() { return (IA) (Object) this; }

    public final qr_0[] Mx0;
    public final BU Nm;
    public qr_0 Ex;
    public qr_0 er;
    public boolean fh0 = true;
    public boolean Yl = false;

    public HotkeyBarWindow(BU object) {
        fy_2 fy_23 = new fy_2();
        fy_23.uf("content");
        hc_0 hc_02 = new hc_0(asBridge());
        this.Nm = object;
        this.Mx0 = new qr_0[9];
        for (short s = 0; s < this.Mx0.length; s = (short)(s + 1)) {
            short s2 = 0;
            CH0 cH0 = CH0.j1;
            switch (s) {
                default: {
                    break;
                }
                case 8: {
                    s2 = lpt2__0.switch$;
                    cH0 = CH0.Ab(lpt2__0.mI);
                    break;
                }
                case 7: {
                    s2 = lpt2__0.T0;
                    cH0 = CH0.Ab(lpt2__0.wg0);
                    break;
                }
                case 6: {
                    s2 = lpt2__0.bE0;
                    cH0 = CH0.Ab(lpt2__0.CY);
                    break;
                }
                case 5: {
                    s2 = lpt2__0.jp0;
                    cH0 = CH0.Ab(lpt2__0.A80);
                    break;
                }
                case 4: {
                    s2 = lpt2__0.E5;
                    cH0 = CH0.Ab(lpt2__0.XD0);
                    break;
                }
                case 3: {
                    s2 = lpt2__0.hi0;
                    cH0 = CH0.Ab(lpt2__0.o40);
                    break;
                }
                case 2: {
                    s2 = lpt2__0.PG;
                    cH0 = CH0.Ab(lpt2__0.TH0);
                    break;
                }
                case 1: {
                    s2 = lpt2__0.FP;
                    cH0 = CH0.Ab(lpt2__0.br0);
                    break;
                }
                case 0: {
                    s2 = lpt2__0.ER;
                    cH0 = CH0.Ab(lpt2__0.Ix);
                }
            }
            m30_0 m30_03 = new m30_0(asBridge(), asBridge(), s2, cH0, s);
            this.Mx0[s] = m30_03;
            this.Mx0[s].cl0(hc_02);
            fy_23.SL(this.Mx0[s]);
        }
        if (tw0_0.rl.Fb0()) {
            this.Lf0(tw0_0.rl.jE(), tw0_0.rl.Ra0());
        }
        if (tw0_0.kz0()) {
            fy_2 fy_24 = fy_23;
            fy_24.WQ(fy_24.lo0().LPt3(this.Mx0));
            fy_24.x40(fy_24.H10().LPt3(this.Mx0));
        } else {
            fy_2 fy_25 = fy_23;
            fy_25.WQ(fy_25.H10().LPt3(this.Mx0));
            fy_25.x40(fy_25.lo0().LPt3(this.Mx0));
        }
        this.SL(fy_23);
        this.uf("hotkeybar");
        this.u5(new A10(asBridge()));
        this.ff0(1);
        this.bD(false);
        this.Ko(false);
    }

    public final void Lf0(short[] sArray, CH0[] cH0Array) {
        if (sArray.length > 0 && cH0Array.length > 0) {
            int n = 0;
            while (true) {
                qr_0[] qr_0Array = this.Mx0;
                if (n >= this.Mx0.length) break;
                boolean bl = false;
                boolean bl2 = true;
                qr_0Array[n].NK = bl;
                qr_0Array[n].zE0 = bl2;
                qr_0Array[n].Z8((short)0, CH0.j1, false);
                ++n;
            }
            for (n = 0; n < sArray.length; ++n) {
                HotkeyBarWindow iA = this;
                short s = sArray[n];
                iA.Mx0[n].Z8(s, cH0Array[n], false);
                qr_0 qr_02 = iA.Mx0[n];
                qr_02.NK = true;
                qr_02.zE0 = true;
            }
        } else {
            int n = 0;
            while (n < this.Mx0.length) {
                qr_0 qr_03;
                short s = 0;
                CH0 cH0 = CH0.j1;
                switch (n) {
                    default: {
                        break;
                    }
                    case 8: {
                        s = lpt2__0.switch$;
                        cH0 = CH0.Ab(lpt2__0.mI);
                        break;
                    }
                    case 7: {
                        s = lpt2__0.T0;
                        cH0 = CH0.Ab(lpt2__0.wg0);
                        break;
                    }
                    case 6: {
                        s = lpt2__0.bE0;
                        cH0 = CH0.Ab(lpt2__0.CY);
                        break;
                    }
                    case 5: {
                        s = lpt2__0.jp0;
                        cH0 = CH0.Ab(lpt2__0.A80);
                        break;
                    }
                    case 4: {
                        s = lpt2__0.E5;
                        cH0 = CH0.Ab(lpt2__0.XD0);
                        break;
                    }
                    case 3: {
                        s = lpt2__0.hi0;
                        cH0 = CH0.Ab(lpt2__0.o40);
                        break;
                    }
                    case 2: {
                        s = lpt2__0.PG;
                        cH0 = CH0.Ab(lpt2__0.TH0);
                        break;
                    }
                    case 1: {
                        s = lpt2__0.FP;
                        cH0 = CH0.Ab(lpt2__0.br0);
                        break;
                    }
                    case 0: {
                        s = lpt2__0.ER;
                        cH0 = CH0.Ab(lpt2__0.Ix);
                    }
                }
                int n2 = n;
                qr_0 qr_04 = qr_03 = this.Mx0[n];
                qr_04.NK = false;
                qr_04.zE0 = false;
                qr_03.Z8(s, cH0, true);
                n = (short)(n2 + 1);
            }
        }
    }

    @Override
    public final void K8() {
        HotkeyBarWindow iA = this;
        super.K8();
        iA.TT();
    }

    public final void TT() {
        if (tw0_0.kz0()) {
            if (dw_2.Lm) {
                this.vf(pa0_0.Ht0);
            } else {
                this.vf(pa0_0.rr0);
            }
            this.Yc0 = false;
            this.dz0 = false;
            this.ff0(1);
        } else if (dw_2.aN >= 0 && dw_2.yL0 >= 0) {
            this.E40(Math.min(dw_2.aN, tw0_0.LD0.ew0() - this.Mx), Math.min(dw_2.yL0, tw0_0.LD0.Hv0() - this.OB));
        }
        this.Yl = true;
    }

    @Override
    public final void a80(Jn0 jn0) {
    }

    public final void Mj0(gn_0 gn_02) {
        qr_0[] qr_0Array = this.Mx0;
        int n = qr_0Array.length;
        for (int j = 0; j < n; ++j) {
            qr_0 qr_02 = qr_0Array[j];
            if (qr_02.z70 == null) {
                t5_0 t5_03 = new t5_0(qr_02);
                N1 n12 = new N1(t5_03, gn_0.WHITE);
                qr_02.z70 = n12;
            }
            qr_02.z70.bT(gn_02, 100);
        }
    }

    @Override
    public final boolean nd0(i70_0 i70_02) {
        block5: {
            boolean bl;
            block7: {
                rp_0 rp_02;
                int n;
                block14: {
                    block13: {
                        block12: {
                            block11: {
                                block10: {
                                    block9: {
                                        block8: {
                                            block6: {
                                                if (!E00.ZU(i70_02.zu) || !i70_02.iT()) break block5;
                                                Qy0 qy0 = Qy0.yI0;
                                                qy0.getClass();
                                                if (Qy0.af(qy0) && BU.T50.p80 == null) {
                                                    return super.nd0(i70_02);
                                                }
                                                n = i70_02.finally$;
                                                rp_02 = rp_0.com1;
                                                if (rp_02 == null || !rp_02.Ov(n)) break block6;
                                                bl = this.Mx0[0].Yr0();
                                                break block7;
                                            }
                                            rp_02 = rp_0.ew;
                                            if (rp_02 == null || !rp_02.Ov(n)) break block8;
                                            bl = this.Mx0[1].Yr0();
                                            break block7;
                                        }
                                        rp_02 = rp_0.eL;
                                        if (rp_02 == null || !rp_02.Ov(n)) break block9;
                                        bl = this.Mx0[2].Yr0();
                                        break block7;
                                    }
                                    rp_02 = rp_0.aE0;
                                    if (rp_02 == null || !rp_02.Ov(n)) break block10;
                                    bl = this.Mx0[3].Yr0();
                                    break block7;
                                }
                                rp_02 = rp_0.LPT3;
                                if (rp_02 == null || !rp_02.Ov(n)) break block11;
                                bl = this.Mx0[4].Yr0();
                                break block7;
                            }
                            rp_02 = rp_0.VE0;
                            if (rp_02 == null || !rp_02.Ov(n)) break block12;
                            bl = this.Mx0[5].Yr0();
                            break block7;
                        }
                        rp_02 = rp_0.lpT9;
                        if (rp_02 == null || !rp_02.Ov(n)) break block13;
                        bl = this.Mx0[6].Yr0();
                        break block7;
                    }
                    rp_02 = rp_0.gr0;
                    if (rp_02 == null || !rp_02.Ov(n)) break block14;
                    bl = this.Mx0[7].Yr0();
                    break block7;
                }
                rp_02 = rp_0.lPT5;
                if (rp_02 == null || !rp_02.Ov(n)) break block5;
                bl = this.Mx0[8].Yr0();
            }
            if (bl) {
                return true;
            }
        }
        return super.nd0(i70_02);
    }

    public final void kb0(i70_0 i70_02) {
        if (this.Ex != null) {
            le0_2 le0_22 = this.Nm;
            i70_0 i70_03 = i70_02;
            int n = i70_03.f8;
            int n2 = i70_03.AN;
            le0_2 le0_23 = le0_22.dh0(n, n2);
            if (le0_23 != null) {
                le0_22 = le0_23.BQ(n, n2);
            }
            if (le0_22 instanceof qr_0) {
                this.d7((qr_0)le0_22);
            } else {
                i70_0 i70_04 = i70_02;
                int n3 = i70_04.f8;
                int n4 = i70_04.AN;
                le0_2 le0_24 = this.dh0(n3, n4);
                le0_2 le0_25 = le0_24 != null ? le0_24.BQ(n3, n4) : this;
                if (le0_25 instanceof qr_0) {
                    this.d7((qr_0)le0_25);
                } else {
                    this.d7(null);
                }
            }
        }
    }

    public final void mg(int n, CH0 cH0, short s) {
        if (n >= 0) {
            qr_0[] qr_0Array = this.Mx0;
            if (n < qr_0Array.length) {
                qr_0Array[n].Z8(s, cH0, true);
                return;
            }
        }
    }

    public final byte YF(short s) {
        byte by = 0;
        while (true) {
            qr_0[] qr_0Array = this.Mx0;
            if (by >= this.Mx0.length) break;
            if (qr_0Array[by].wE0 == s) {
                return by;
            }
            by = (byte)(by + 1);
        }
        return -1;
    }

    public final boolean Ji(short s, short s2) {
        if (s == s2) {
            return false;
        }
        boolean bl = false;
        int n = 0;
        while (true) {
            qr_0[] slots = this.Mx0;
            if (n >= this.Mx0.length) break;
            qr_0 slot = slots[n];
            if (slot.wE0 == s) {
                slot.Z8(s2, CH0.j1, true);
                bl = true;
            }
            n = (byte)(n + 1);
        }
        return bl;
    }

    public final void b2(boolean bl) {
        boolean bl2;
        HotkeyBarWindow iA;
        this.fh0 = bl;
        if (!bl && !tw0_0.kz0()) {
            iA = this;
            this.Yc0 = true;
            bl2 = true;
        } else {
            iA = this;
            this.Yc0 = false;
            bl2 = false;
        }
        iA.dz0 = bl2;
    }

    public final void d7(qr_0 qr_02) {
        qr_0 qr_03 = this.er;
        if (qr_02 != qr_03) {
            if (qr_03 != null) {
                qr_03.RI(false, false);
            }
            this.er = qr_02;
            if (qr_02 != null) {
                boolean bl = true;
                if (qr_02 != this.Ex) {
                    qr_02.getClass();
                }
                qr_02.RI(bl, true);
            }
        }
    }
}
