package cn.pokemmo.rom.nds.base;

import f.*;
public abstract class AbstractNdsMapZone extends _else {
    public final l50_0 xk0;
    public wa0_2 i80;
    public int yd = 0;
    public int ie = 0;
    public boolean o6 = false;
    public Z50 Ro0 = null;
    public F90 aA0 = null;
    public int Sm0 = 1;
    public Z50[][] uJ = null;
    public bm_1[][] Qm = null;
    public boolean[][] Hw = null;
    public boolean Fm = false;
    public short Z10;
    public final TE sp0;
    public es_1 ht0;

    public AbstractNdsMapZone(l50_0 l50_0Var, short s, byte b, short s2, TE te) {
        super(l50_0Var.Tz(), J4.AD0(s), J4.K9(s), b);
        this.xk0 = l50_0Var;
        Z50 Sc0 = l50_0Var.Sc0(s);
        this.Ro0 = Sc0;
        this.aA0 = l50_0Var.eg0(Sc0.ES);
        this.lm0 = gh_0.wZ;
        this.Z10 = s2;
        this.sp0 = te;
        this.zC0 = this.yd;
        this.BJ = this.ie;
    }

    public final boolean IS() {
        return this.Fm;
    }

    public void gA() {
        l50_0 l50_0Var = this.xk0;
        short s = this.Z10;
        if (s < 1) {
            s = this.Ro0.Va0;
        }
        wa0_2 V10 = l50_0Var.V10(s);
        this.i80 = V10;
        boolean z = V10 != null && V10.l1 != null;
        this.o6 = z;
        if (z) {
            this.uJ = new Z50[V10.It0][V10.WH];
        }
        this.Qm = new bm_1[V10.It0][V10.WH];
        this.Hw = new boolean[V10.It0][V10.WH];
    }

    public abstract void hl(short s, short s2);

    public final boolean nn() {
        return this.o6;
    }

    public void jc0(Z50 z50) {
        if (this.Ro0 == z50) {
            return;
        }
        z50.KJ();
        this.Ro0 = z50;
        this.Bm0 = (byte) (z50.O60 & 255);
        this.case$ = J4.K9(z50.O60);
        bi0_1 bi0_1Var = null;
        if (tw0_0.e60 != null) {
            for (Object obj : tw0_0.e60.pn0.values()) {
                bi0_1 bi0_1Var2 = (bi0_1) obj;
                if (bi0_1Var2 != null) {
                    bi0_1Var2.ba0.OL0();
                }
            }
            bi0_1Var = tw0_0.e60.jB0;
        }
        this.aA0 = this.xk0.eg0(this.Ro0.ES);
        if (tw0_0.PK0 == null) {
            if (bi0_1Var != null && bi0_1Var.LH0() && !bi0_1Var.Ze()) {
                byte b = bi0_1Var.ba0.uS;
                if (b == 2) {
                    tw0_0.RE0.Eh((byte) 2, (short) 1013, true, false);
                } else if (b == 3) {
                    tw0_0.RE0.Eh((byte) 3, (short) 1151, true, false);
                } else if (b == 4) {
                    tw0_0.RE0.Eh((byte) 4, (short) 1014, true, false);
                }
            } else {
                tw0_0.RE0.Eh(this.dw, hh0(), true, false);
            }
        }
    }

    public final short gd0() {
        return this.i80.SM;
    }

    public final int uF0() {
        return this.i80.It0;
    }

    public final int cH0() {
        return this.i80.WH;
    }

    public final int Kb() {
        return this.yd;
    }

    public final int To() {
        return this.ie;
    }

    public final Z50 W5() {
        return this.Ro0;
    }

    public Z50 W4(int i, int i2) {
        if (this.o6 && i >= 0 && i2 >= 0 && i < this.uJ.length) {
            Z50[] z50Arr = this.uJ[i];
            if (i2 < z50Arr.length) {
                Z50 z50 = z50Arr[i2];
                return z50 == null ? this.Ro0 : z50;
            }
        }
        return this.Ro0;
    }

    public final bm_1 gg(int i, int i2) {
        if (i >= 0 && i2 >= 0 && i < this.Qm.length && i2 < this.Qm[i].length) {
            if (!this.Hw[i][i2]) {
                hl((short) i, (short) i2);
                this.Hw[i][i2] = true;
            }
            return this.Qm[i][i2];
        }
        return null;
    }

    public final String OE() {
        return this.Ro0.mn();
    }

    public final short hh0() {
        short s = 0;
        byte b = this.dw;
        if (b == 2) {
            switch (c8_0.JD0.YG()) {
                case 0:
                    s = this.Ro0.Tq0;
                    break;
                case 1:
                    s = this.Ro0.hC0;
                    break;
                case 2:
                    s = this.Ro0.aV;
                    break;
                case 3:
                    s = this.Ro0.xS;
                    break;
            }
            if (s == 1033) {
                s = 1034;
            }
        } else if (b == 3 || b == 4) {
            int i = LU.gC[c8_0.JD0.Yj().om];
            if (i == 1) {
                s = this.Ro0.qh0;
            } else if (i == 2) {
                s = this.Ro0.z1;
            }
            BR br = tw0_0.rl;
            if (this.dw == 4 && br != null) {
                short s2 = this.Ro0.O60;
                if (s2 == 96) {
                    if (br.yh0.Ny((byte) 4, (short) 2451)) {
                        s = 1091;
                    }
                } else if (s2 == 102 || s2 == 104) {
                    if (br.yh0.Ny((byte) 4, (short) 2451)) {
                        s = 1090;
                    }
                } else if (s2 == 112 || (s2 >= 186 && s2 <= 190)) {
                    if (br.yh0.Ny((byte) 4, (short) 2459)) {
                        s = 1094;
                    }
                }
            }
        }
        return s;
    }

    public final LT Fn(int i, int i2, int i3) {
        return rc0((byte) i3, (short) i, (short) i2);
    }

    public final LT LB0(short s, short s2, float f) {
        if (this.Sm0 == 1) {
            return rc0((byte) 0, s, s2);
        }
        Ll0 rc0 = rc0((byte) 0, s, s2);
        for (byte b = 1; b < this.Sm0; b = (byte) (b + 1)) {
            Ll0 rc02 = rc0(b, s, s2);
            if (rc02 != null && !rc02.rK0()) {
                if (rc0 == null || rc0.rK0() || Math.abs(f - rc0.S80()) > Math.abs(f - rc02.S80())) {
                    if (rc0 == null || Math.abs(rc0.S80() - rc02.S80()) >= 0.005f) {
                        rc0 = rc02;
                    }
                }
            }
        }
        return rc0;
    }

    public final F90 Xg0() {
        return this.aA0;
    }

    public final void b60(LT lt) {
        if (this.ht0 == null) {
            this.ht0 = new es_1(false, 32);
        }
        if (!this.ht0.j4(lt, true)) {
            this.ht0.Ue0(lt);
        }
    }

    public final es_1 L90() {
        return this.ht0;
    }

    public final Ll0 rc0(byte b, short s, short s2) {
        int i = this.yd;
        if (i < 1) {
            return null;
        }
        int i2 = this.ie;
        if (i2 < 1) {
            return null;
        }
        if (b < 0) {
            b = 0;
        }
        wa0_2 wa0_2Var = this.i80;
        short s3 = (short) (s - wa0_2Var.Iz0);
        short s4 = (short) (s2 - wa0_2Var.Ig);
        bm_1 gg = gg(s3 / i, s4 / i2);
        if (gg == null) {
            return null;
        }
        return gg.n5(b, (short) (s3 % this.yd), (short) (s4 % this.ie));
    }
}
