package cn.pokemmo.world.map;

import f.*;

public class MapTilePropertyReader extends Ll0 {
    public final zb_0 SL0;

    public MapTilePropertyReader(XF0 v1, zb_0 v2, short i3, short i4, byte i5) {
        super(v1, v2, i3, i4, i5);
        this.SL0 = v2;
        this.dH = s0();
        ep0();
    }

    public final boolean rK0() {
        return eq0() == 254;
    }

    public final boolean LPt1() {
        return ((byte) this.dH & 1) != 0;
    }

    public final boolean V50(byte i1) {
        return ((byte) this.dH & 2) != 0;
    }

    public final boolean fV() {
        return ((byte) this.dH & 8) != 0;
    }

    public byte re() {
        return (byte) eq0();
    }

    public short coM9() {
        return this.SL0.r4[this.Sm][0][this.op0][this.ev0];
    }

    public short HM() {
        return this.SL0.r4[this.Sm][1][this.op0][this.ev0];
    }

    public short eq0() {
        return this.SL0.r4[this.Sm][2][this.op0][this.ev0];
    }

    public short s0() {
        return this.SL0.r4[this.Sm][3][this.op0][this.ev0];
    }

    public final boolean Og(LT v1, bi0_1 v2, byte i3, byte i4) {
        F90 aA0 = this.zN.aA0;
        if (aA0 != null) {
            bH0 lc = aA0.LC(this instanceof nC0, Tz(), HR(), this.Sm, S80());
            if (lc != null && lc.SZ() && i3 == lc.iA) {
                return Ll0.HF(this, v2, lc, i3);
            }
        }
        return u40().fu(v1, v2, i3);
    }

    public final boolean lpT2(LT v1, bi0_1 v2, byte i3, byte i4) {
        F90 aA0 = this.zN.aA0;
        if (aA0 != null) {
            bH0 lc = aA0.LC(this instanceof nC0, Tz(), HR(), this.Sm, S80());
            if (lc != null && !lc.SZ() && Math.abs(S80() - v2.E7()) < 1.27f) {
                return Ll0.HF(this, v2, lc, i3);
            }
        }
        return u40().aH(v1, v2, i3, i4);
    }

    public final nk_0 Oo(bi0_1 v1) {
        F90 aA0 = this.zN.aA0;
        bH0 lc = aA0.LC(this instanceof nC0, Tz(), HR(), this.Sm, S80());
        if (lc != null && !lc.SZ()) {
            if (lc.SZ()) {
                return null;
            }
            byte b = lc.iA;
            if (b == 0) {
                return nk_0.cOM9;
            }
            if (b == 2) {
                return nk_0.lpT8;
            }
            if (b == 3) {
                return nk_0.pM;
            }
            return nk_0.t20;
        }
        return u40().new$();
    }

    public final void ep0() {
        if (rK0()) {
            return;
        }
        XF0 map = this.zN;
        if (map.dw == 2 && J4.p5(map.Bm0, map.case$) == 97 && this.Sm > 0) {
            this.Ds0 = (float) (this.Sm * 10 + 20);
            return;
        }
        short com9 = coM9();
        if (com9 != 0) {
            short i1;
            short i2;
            if (com9 == 2) {
                short[] sArr = this.SL0.ZK[this.Sm][HM()];
                i1 = sArr[1];
                i2 = sArr[3];
            } else {
                i1 = (short) (coM9() >> 2);
                i2 = HM();
            }
            if (i1 < 0 || i1 >= 329) {
                i1 = 0;
            }
            float[] fArr = fh_2.bH[i1];
            float[] kB = fh_2.kB;
            if (i2 >= 1326) {
                i2 = 0;
            }
            float f0 = kB[i2] * fArr[2];
            float f1 = (float) this.SL0.qB0 * 0.5f - 0.5f;
            float f2 = (float) this.SL0.N70 * 0.5f - 0.5f;
            float f3 = fArr[0];
            f0 = fe_2.Ga0((float) this.op0, f1, f3, f0);
            float f4 = fArr[1];
            this.Ds0 = fe_2.Ga0((float) this.ev0, f2, f4, f0);
        } else {
            short hm = HM();
            float[] kB = fh_2.kB;
            if (hm >= 1326) {
                hm = 0;
            }
            this.Ds0 = kB[hm];
        }
    }
}
