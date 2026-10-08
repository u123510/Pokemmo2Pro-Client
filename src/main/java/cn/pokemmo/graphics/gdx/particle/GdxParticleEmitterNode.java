package cn.pokemmo.graphics.gdx.particle;

import f.*;


import com.badlogic.gdx.math.Matrix4;
import java.util.LinkedList;

public class GdxParticleEmitterNode {
    public final bi0_1 QM;
    public long gd;
    public long fv;
    public long b60;
    public long Fl0;
    public long Li0;
    public long YT;
    public boolean BQ;
    public boolean EL;
    public int Kg;
    public nk_0 mV;
    public long rl0;
    public byte Ba;
    public boolean np;
    public final C8 t60;
    public final C8 g9;
    public final C8 iE0;
    public cn.pokemmo.graphics.gdx.model.GdxModelInstance Nj0;
    public boolean Go0;
    public final C8 rZ;
    public final LinkedList BH0;

    public GdxParticleEmitterNode(bi0_1 v1) {
        this.gd = 0L;
        this.fv = 0L;
        this.b60 = 0L;
        this.Fl0 = 0L;
        this.Li0 = 0L;
        this.YT = 0L;
        this.BQ = false;
        this.EL = false;
        this.Kg = 150;
        this.mV = null;
        this.rl0 = 0L;
        this.Ba = 0;
        this.np = false;
        this.t60 = new C8();
        this.g9 = new C8();
        this.iE0 = new C8();
        this.Nj0 = null;
        this.Go0 = false;
        this.rZ = new C8();
        this.BH0 = new LinkedList();
        this.QM = v1;
    }

    public static void i(zv_2 v0) {
        tw0_0.rl.fk0.uQ(new bw0_0(v0, false, false));
    }

    public final void hw0(long j1) {
        long j3 = hk0_1.KG;
        if (j3 - (this.gd + (long) this.Kg) > 250L) {
            this.YT = j3;
        }
        this.gd = j3 + j1;
    }

    public final void h10() {
        this.LL0(this.QM.ba0.LPt1());
    }

    public final void Iu0() {
        this.QM.uR().Np0 = false;
        ((Ai0) this.QM.rd.hj).Np0 = false;
        nf_0.zo0().COn.m(0, 255, 500);
    }

    public final void OV(nk_0 v1) {
        this.fY(v1, false);
    }

    public final void f60(Ou0 v1, boolean i2, C8 v3) {
        this.Nj0 = v1;
        this.Go0 = i2;
        this.rZ.x = v3.x;
        this.rZ.y = v3.y;
        this.rZ.z = v3.z;
    }

    public final void Cp(Runnable v1) {
        synchronized (this.BH0) {
            this.BH0.add(new pp_1(v1));
        }
    }

    public final void LE(nk_0... v1) {
        synchronized (this.BH0) {
            for (nk_0 v5 : v1) {
                if (v5 != null) {
                    this.BH0.add(new wz0_0(v5));
                }
            }
        }
    }

    public final void Ec0(zv_2 v1, byte i2) {
        synchronized (this.BH0) {
            this.BH0.add(new de_2(v1, i2));
        }
    }

    public final boolean D() {
        if (this.np) {
            return false;
        }
        long j1 = hk0_1.KG;
        if (this.Fl0 > j1) {
            return false;
        }
        if (this.gd + (long) this.Kg > j1) {
            return false;
        }
        return this.fv + 100L <= j1;
    }

    public final synchronized boolean qc0(byte i1) {
        if (!this.D()) {
            return false;
        }
        if (i1 != (byte) -1) {
            _else v2 = (_else) tw0_0.e60.E6.get(J4.iA0(this.QM.ba0.uS, this.QM.ba0.o0, this.QM.ba0.ID0));
            if (v2 == null) {
                return false;
            }
            LT v3 = this.QM.ba0.LPt1();
            if (v3 != null) {
                v3.u40().getClass();
            }
        }
        this.QM.getClass();
        if (!(this.QM instanceof KF)) {
            this.fv = hk0_1.KG;
        }
        this.QM.ba0.Y30 = i1;
        if (this.Ba > 0) {
            this.Ba = (byte) (this.Ba - 1);
        }
        return true;
    }

    public final void LL0(LT v1) {
        this.QM.getClass();
        if (!(this.QM instanceof E90) && !(this.QM instanceof KF)) {
            return;
        }
        if (v1 == null) {
            return;
        }
        if (v1 instanceof go_0) {
            if (this.QM.Ze() && v1.F2().lm0 != gh_0.GM) {
                this.QM.PD0 = (byte) (this.QM.PD0 & -17);
            }
            if (!this.QM.Ze() && v1.F2().lm0 == gh_0.GM) {
                this.QM.PD0 = (byte) (this.QM.PD0 | 16);
            }
        } else if (this.QM.Ze()) {
            this.QM.PD0 = (byte) (this.QM.PD0 & -17);
        }
        if (this.QM.LH0() && !v1.V50(this.QM.ba0.JT)) {
            this.QM.n6(false);
        }
        if (!this.QM.LH0() && v1.V50(this.QM.ba0.JT)) {
            this.QM.n6(true);
        }
    }

    public final void zp0(LT v1) {
        this.QM.getClass();
        if (!(this.QM instanceof E90) || !this.QM.oI0() || this.QM.Ze() || this.QM.LH0()) {
            return;
        }
        short i0 = this.QM.Gi().Nul(q10_0.Qh0);
        if (i0 != 17 && i0 != 40) {
            return;
        }
        byte i2 = v1.F2().dw;
        if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 10) {
            v1.ZD0(new mk0_1(i2, i0));
        } else {
            v1.ZD0(new LPT3_(i0));
        }
    }

    public final boolean qm(LT v1, LT v2, byte i3, boolean i4, boolean i5, boolean i6) {
        if (v2 == null || v1 == null) {
            return false;
        }
        if (v2.LPt1()) {
            return false;
        }
        if (v1.u40().Fj0(i3)) {
            return true;
        }
        byte i4Mask = se0_1.Ak0(i4, i5);
        if (v1.u40().wn0(i3) || v2.u40().zF(v2, this.QM, i3, i4Mask)) {
            return false;
        }
        if (this.Ba > 0) {
            return false;
        }
        byte currentLayer = this.QM.ba0.JT;
        if (v2 instanceof go_0) {
            if (currentLayer == -10 && v1.Es() != 14 && v1.Es() != -2) {
                this.QM.ba0.JT = v1.Es();
                this.QM.ba0.pq = null;
            }
            if (this.QM.ba0.JT != v2.Es()) {
                if ((this.QM.ba0.JT == 0 && v2.Es() == 2)
                        || this.QM.ba0.JT == -10
                        || v1.Es() == -1
                        || v2.Es() == -1
                        || (i6 && v1.Es() == 4 && v2.Es() == 2)) {
                    i3 = v2.Es();
                } else if (v2.Es() != 14 && v2.Es() != -2) {
                    return false;
                }
            }
        } else {
            if (Math.abs(v1.S80() - v2.S80()) > 1.2699999809F) {
                return false;
            }
            if (v2.V50((byte) 0) && !v1.V50((byte) 0)) {
                return false;
            }
        }
        // Player/NPC occupancy is a solid volume. Passing the movement direction
        // here lets bi0_1.a1 apply its directional layer filter and leaves one
        // approach direction unblocked for otherwise identical NPC tiles.
        byte occupancyDirection = this.QM instanceof E90 ? (byte) -1 : i3;
        if ((tw0_0.e60.dj0.equals(this.QM.pu) || this.QM instanceof MO)
                && tw0_0.e60.Vm0(occupancyDirection, v2)) {
            return false;
        }
        this.LL0(v2);
        return true;
    }

    public final void p6(zv_2 v1) {
        synchronized (this.BH0) {
            this.BH0.clear();
        }
        this.QM.uR().OA0.rB0();
        this.QM.ba0.V2(v1);
        this.np = false;
        if (this.QM == tw0_0.e60.jB0) {
            BR v2 = tw0_0.rl;
            if (v2.NA) {
                if (!v2.nz()) {
                    this.hw0(25L);
                }
                nf_0.zo0().w30(500, true);
                v2 = tw0_0.rl;
                if (v2.fw) {
                    v2.fw = false;
                    lg_0.k.lPT5(new kr_0());
                }
                this.QM.uR().Np0 = true;
            }
            e30_0 v3 = tw0_0.rl.k0;
            v3.kC = v1.uS;
            v3.Oq0 = v1.o0;
            v3.Zl0 = v1.ID0;
            v3.sL0 = v1.Lq0;
            v3.t60 = v1.B5;
        }
        this.b60 = 0L;
        this.BQ = false;
    }

    public final void p3() {
        vo_2 v1 = tw0_0.LD0.Sc;
        if (v1 == null || !v1.fX || !this.D()) {
            return;
        }
        synchronized (this.BH0) {
            rg0_1 v2 = (rg0_1) this.BH0.poll();
            if (v2 != null) {
                v2.Gj0((EA0) this);
                return;
            }
            nk_0 v3 = this.mV;
            if ((v3 == nk_0.J9 || v3 == nk_0.Qi0) && this.QM == tw0_0.e60.jB0) {
                return;
            }
            this.mV = null;
        }
    }

    public final void lPT5(bi0_1 v1, LT v2) {
        if (v2 == null) {
            return;
        }
        bi0_1 v3 = v1.Lm();
        if (v3 != null) {
            this.BQ(v1, v3, v2);
            this.BQ(v3, v1.rd, v3.ba0.LPt1());
        } else {
            this.BQ(v1, v1.rd, v2);
        }
    }

    public final void BQ(bi0_1 v1, bi0_1 v2, LT v3) {
        if (v2 == null || !v2.il0.BH0.isEmpty()) {
            return;
        }
        LT v4 = v2.ba0.LPt1();
        byte i1 = v1.ba0.Y30;
        if (v4 != null) {
            for (byte i5 = 0; i5 < 4; i5++) {
                if (v4.F2().gv(v4, i5, 1) == v3) {
                    i1 = i5;
                    break;
                }
            }
        }
        byte i6 = v3.F2().dw;
        byte i7 = v3.F2().Bm0;
        byte i8 = v3.F2().case$;
        boolean i9 = v3.gr0();
        short i10 = v3.Tz();
        short i11 = v3.HR();
        byte i0 = v3.Es() < 0 ? this.QM.ba0.JT : v3.Es();
        v2.il0.Ec0(new zv_2(i6, i7, i8, i9, i10, i11, i0, i1), (byte) 0);
        v2.il0.w7();
        v2.il0.p3();
    }

    public final void ud() {
        this.QM.getClass();
        if (this.QM instanceof KF) {
            this.Kg = ((KF) this.QM).KL0.il0.Kg;
            return;
        }
        LT v1 = this.QM.ba0.LPt1();
        if (v1 != null) {
            int i1 = v1.u40().zd0(this.QM.oI0());
            if (i1 > 0) {
                this.Kg = i1;
                return;
            }
        }
        if (this.BQ) {
            this.Kg = 650;
        } else if (this.EL || this.QM.Ze()) {
            this.Kg = 300;
        } else if (this.QM.LH0()) {
            this.Kg = 100;
        } else if (this.QM.oI0()) {
            if (this.QM.ba0.uS == 3 && !this.QM.uv()) {
                this.Kg = 125;
            } else {
                this.Kg = 75;
            }
        } else if (this.QM.uv()) {
            this.Kg = 175;
        } else {
            this.Kg = 250;
        }
        if (this.QM.rd != null) {
            this.QM.rd.il0.Kg = this.Kg;
        }
        bi0_1 v2 = this.QM.Lm();
        if (v2 != null) {
            v2.il0.Kg = this.Kg;
        }
    }

    public final boolean Zw(LT v1, boolean i2, nk_0... v3) {
        if (!(this.QM instanceof E90)) {
            return false;
        }
        if (v1.Wb0()) {
            i2 = tw0_0.LD0.Sc.wp(v1, true, false);
        } else if (!i2 || !v1.u40().tm(v1, this.QM, false)) {
            i2 = false;
        }
        tw0_0.rl.fw = true;
        long j1 = 0L;
        if (i2) {
            this.LE(nk_0.Iu);
            j1 = nk_0.Iu.h3;
        }
        this.LE(v3);
        for (nk_0 v6 : v3) {
            if (v6 != null) {
                j1 += (long) v6.h3;
            }
        }
        zv_2 v4 = this.QM.ba0.Xr();
        lpt5__5.hL.ZD(() -> EA0.i(v4), j1 + 500L);
        lpt5__5.hL.ZD(this::Iu0, j1);
        return true;
    }

    public final void w7() {
        boolean positionReady = false;
        if (this.np) {
            float f1 = (float) (hk0_1.KG - this.b60) / (float) this.Kg;
            LT v2 = this.QM.ba0.LPt1();
            if (v2 != null && v2.gr0()) {
                this.iE0.np(v2.Ki());
                float f2 = this.iE0.y;
                this.iE0.y = this.iE0.z;
                this.iE0.z = f2;
            } else if (v2 != null && v2.Wb0()) {
                this.iE0.x = (float) this.QM.ba0.Lq0 + 0.5F;
                this.iE0.y = (float) this.QM.ba0.B5 + 0.5F;
                this.iE0.z = this.QM.E7();
            } else {
                this.iE0.x = (float) this.QM.ba0.Lq0;
                this.iE0.y = (float) this.QM.ba0.B5;
                this.iE0.z = this.QM.E7();
            }
            if (f1 < 1.0F) {
                this.t60.np(this.g9).JA(this.iE0, f1);
                if (this.BQ) {
                    if (f1 < 0.5F) {
                        this.t60.z = this.g9.z;
                    } else {
                        f1 = (f1 - 0.5F) * 2.0F;
                        O00 interpolation = LW.Yu;
                        this.t60.z = fe_2.Ga0(this.iE0.z, this.g9.z, f1, this.g9.z);
                    }
                }
                positionReady = true;
            }
        }
        if (!positionReady) {
            this.np = false;
            LT v1 = this.QM.ba0.LPt1();
            if (v1 != null && v1.gr0()) {
                this.t60.np(v1.Ki());
                float f1 = this.t60.y;
                this.t60.y = this.t60.z;
                this.t60.z = f1;
            } else if (v1 != null && v1.Wb0()) {
                this.t60.x = (float) this.QM.ba0.Lq0 + 0.5F;
                this.t60.y = (float) this.QM.ba0.B5 + 0.5F;
                this.t60.z = this.QM.E7();
            } else {
                this.t60.x = (float) this.QM.ba0.Lq0;
                this.t60.y = (float) this.QM.ba0.B5;
                this.t60.z = this.QM.E7();
            }
        }
        cn.pokemmo.graphics.gdx.model.GdxModelInstance v1 = this.Nj0;
        if (v1 == null) {
            return;
        }
        Matrix4 v2 = v1.ho;
        if (this.Go0) {
            this.t60.z = v2.EW[13];
            es_1 v3 = v1.ZE0;
            if (v3.KB > 0) {
                Matrix4 v4 = ((Xz0) v3.get(0)).TJ0;
                this.t60.z += v4.EW[13];
            }
            this.t60.z = (this.t60.z + this.rZ.z) * 4.0F;
            return;
        }
        this.t60.x = v2.EW[12];
        this.t60.y = v2.EW[14];
        this.t60.z = v2.EW[13];
        es_1 v3 = v1.ZE0;
        if (v3.KB > 0) {
            Xz0 v4 = (Xz0) ((Xz0) v3.get(0)).yn.get(0);
            Matrix4 v5 = v4.TJ0;
            this.t60.na(v5.EW[12] / 16.0F, v5.EW[14] / 16.0F, v5.EW[13] / 16.0F);
        }
        this.rZ.na(this.t60.x, this.t60.y, this.t60.z);
        this.t60.Fg0(4.0F);
    }

    public final boolean fY(nk_0 v1, boolean i2) {
        zv_2 position = this.QM.ba0;
        short i3 = position.Lq0;
        short i4 = position.B5;
        float f5 = position.Com6();
        byte i6 = v1.ml0;
        if (v1 == nk_0.Ak && this.QM instanceof MO) {
            i6 = ((MO) this.QM).Wx0;
        }

        short i7;
        short i8;
        switch (i6) {
            case 0:
                i7 = i3;
                i8 = (short) (i4 + v1.Cb0);
                break;
            case 1:
                i7 = i3;
                i8 = (short) (i4 - v1.Cb0);
                break;
            case 2:
                i7 = (short) (i3 - v1.Cb0);
                i8 = i4;
                break;
            case 3:
                i7 = (short) (i3 + v1.Cb0);
                i8 = i4;
                break;
            default:
                i7 = i3;
                i8 = i4;
                break;
        }

        if (v1 == nk_0.iq || v1 == nk_0.X5) {
            this.QM.uR().R5 = this.QM.ba0.Y30;
        } else if (v1 == nk_0.ht0 || v1 == nk_0.fy0) {
            byte renderDirection = this.QM.uR().ZD();
            if (renderDirection != (byte) -1) {
                this.QM.ba0.Y30 = renderDirection;
            }
            this.QM.uR().R5 = (byte) -1;
        }

        if (v1 == nk_0.yD0) {
            E90 player = tw0_0.e60.jB0;
            if (player != null) {
                zv_2 playerPosition = player.ba0;
                if (playerPosition.Lq0 > i7) {
                    i6 = 3;
                } else if (playerPosition.Lq0 < i7) {
                    i6 = 2;
                } else if (playerPosition.B5 < i8) {
                    i6 = 1;
                } else if (playerPosition.B5 > i8) {
                    i6 = 0;
                }
            }
        }
        if (i6 == (byte) -1) {
            i6 = this.QM.ba0.Y30;
        }

        _else map = (_else) tw0_0.e60.E6.get(J4.iA0(position.uS, position.o0, position.ID0));
        if (map == null) {
            return false;
        }
        LT current = position.LPt1();
        LT destination;
        if (current != null && current.gr0()) {
            int step = 0;
            destination = current;
            while (step < v1.Cb0) {
                destination = destination.JG0(i6);
                step++;
            }
        } else {
            float height = current == null ? 0.0F : current.S80();
            destination = map.LB0(i7, i8, height);
        }
        if (destination == null) {
            return false;
        }
        if (destination.gr0()) {
            nt_1 destinationNode = destination.u40();
            destinationNode.getClass();
            if (destinationNode instanceof fh_0) {
                LT redirected = map.Fn((short) (int) destination.Ki().x, (short) (int) destination.Ki().z, 0);
                if (redirected != null) {
                    destination = redirected;
                }
            }
        }

        if (this.QM instanceof E90 && v1.Cb0 > 0
                && !this.qm(current, destination, i6, v1.Dw0, false, false)
                && !i2) {
            return false;
        }

        boolean useNormalMovement = true;
        if (!i2 && v1.Cb0 > 0 && this.QM instanceof MO) {
            useNormalMovement = false;
            if (destination.F2().Bm0 == position.o0
                    && destination.F2().case$ == position.ID0
                    && this.qm(current, destination, i6, v1.Dw0, false, false)) {
                E90 player = tw0_0.e60.jB0;
                useNormalMovement = player == null || !player.a1(position.JT, destination);
            }
        }

        if (!useNormalMovement) {
            if (i6 != position.Y30) {
                position.Y30 = i6;
                this.fv = hk0_1.KG;
            }
            if (v1.Cb0 > 0 && this.qm(current, destination, i6, v1.Dw0, false, false)) {
                this.hw0(0L);
            } else {
                this.fv = hk0_1.KG;
            }
            if (v1.Cb0 > 0 || v1.tu0) {
                this.b60 = hk0_1.KG;
            }
            this.Kg = v1.h3;
            long now = hk0_1.KG;
            this.Fl0 = now + (long) this.Kg;
            this.Li0 = now;
            return false;
        }

        if (current != null && current.gr0()) {
            this.g9.np(current.Ki());
            float value = this.g9.y;
            this.g9.y = this.g9.z;
            this.g9.z = value;
        } else if (current != null && current.Wb0()) {
            this.g9.x = (float) i3 + 0.5F;
            this.g9.y = (float) i4 + 0.5F;
            this.g9.z = f5;
        } else if (position.uS == destination.F2().dw
                && position.o0 == destination.F2().Bm0
                && position.ID0 == destination.F2().case$) {
            this.g9.x = (float) i3;
            this.g9.y = (float) i4;
            this.g9.z = f5;
        } else {
            switch (i6) {
                case 0:
                    this.g9.x = (float) destination.Tz();
                    this.g9.y = (float) (destination.HR() - v1.Cb0);
                    break;
                case 1:
                    this.g9.x = (float) destination.Tz();
                    this.g9.y = (float) (destination.HR() + v1.Cb0);
                    break;
                case 2:
                    this.g9.x = (float) (destination.Tz() + v1.Cb0);
                    this.g9.y = (float) destination.HR();
                    break;
                case 3:
                    this.g9.x = (float) (destination.Tz() - v1.Cb0);
                    this.g9.y = (float) destination.HR();
                    break;
                default:
                    break;
            }
            this.g9.z = f5;
        }

        this.np = true;
        if (v1.Cb0 > 0) {
            this.lPT5(this.QM, current);
        }
        _else destinationType = destination.F2();
        if (destinationType.nn() && N50.Fc(destinationType.dw) && this.QM.Ou()) {
            XF0 animated = (XF0) destinationType;
            int x = destination.Tz();
            int y = destination.HR();
            Z50 frame;
            if (animated.yd >= 1 && animated.ie >= 1) {
                frame = animated.W4(x / animated.yd, y / animated.ie);
            } else {
                frame = animated.W4(0, 0);
            }
            if (frame != null) {
                animated.jc0(frame);
            }
        }

        position.o0 = destinationType.Bm0;
        position.ID0 = destinationType.case$;
        byte layer = destination.Es() < 0 ? position.JT : destination.Es();
        byte direction = i6 < 0 ? position.Y30 : i6;
        position.PX(destination.gr0(), destination.Tz(), destination.HR(), layer, direction);
        this.mV = v1;
        this.BQ = v1.kA0;
        this.QM.Xe = v1.Dw0;
        if (v1.Cb0 > 0 || v1.tu0) {
            this.hw0(0L);
            this.b60 = hk0_1.KG;
        } else {
            this.fv = hk0_1.KG;
        }
        this.Kg = v1.h3;
        long now = hk0_1.KG;
        this.Fl0 = now + (long) this.Kg;
        this.Li0 = now;

        if (current != destination) {
            this.LL0(destination);
            byte transition = (byte) (se0_1.Ak0(v1.Dw0, false) | 1);
            destination.u40().xB(destination, current, this.QM, transition);
            if (current != null) {
                current.u40().K40(this.QM, current);
                this.zp0(current);
            }
        }

        if (v1 == nk_0.com3 || v1 == nk_0.rH0 || v1 == nk_0.GJ || v1 == nk_0.d5) {
            this.gd = 0L;
        }
        if (tw0_0.e60.Com4 == 3 && v1.Qf0 >= -115 && v1.Qf0 <= -104) {
            this.gd = 0L;
            if (v1.Qf0 >= -115 && v1.Qf0 <= -112) {
                position.Y30 = t70_0.Kc0(v1.ml0);
            }
            byte playerLayer = position.JT;
            MO selected = null;
            for (Object candidate : tw0_0.e60.pn0.values()) {
                bi0_1 actor = (bi0_1) candidate;
                if (actor.CI0() && actor.a1(playerLayer, destination)) {
                    selected = (MO) actor;
                    break;
                }
            }
            if (selected != null && selected.Z4 == 118 && selected.hj instanceof z2_0) {
                Ou0 animation = ((z2_0) selected.hj).Oy;
                if (animation != null) {
                    animation.fm0("animation", false);
                }
            }
        }
        if (v1 == nk_0.wE && this.QM.CI0()) {
            ((MO) this.QM).O90 = true;
        }
        position.Fc0 = position.Y30;
        return true;
    }
}
