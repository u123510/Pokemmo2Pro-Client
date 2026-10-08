package cn.pokemmo.pokemon.species;

import f.*;

public class PokemonSpeciesSummaryRecord {
    public final CH0 WN;
    public String Nw0;
    public final String FL0;
    public final int import$;
    public byte Gi0;
    public final int HM;
    public final long m50;
    public final int Aux;
    public final int oc0;
    public int il;
    public short Lpt5;
    public int HI;
    public final byte rQ;
    public byte kC;
    public byte Oq0;
    public byte Zl0;
    public short sL0;
    public short t60;
    public byte HL;
    public short Kx;
    public short yL0;
    public short ey;
    public short a;
    public j30_0 Uj;
    public short Sq0;
    public byte hh0;
    public int oM;
    public byte Ta;
    public byte hL0;
    public byte Kk0;
    public final Object x30;
    public QL[] Bx;

    static {
        Cq0.E1(e30_0.class);
    }

    public PokemonSpeciesSummaryRecord(CH0 ch0, String str, String str2, int i4, byte b5, int i6, long j7, int i9, int i10, int i11, short s12, int i13, byte b14, byte b15, short s16, byte b17, int i18, byte b19, byte b20, byte b21) {
        this.HI = 0;
        this.HL = 0;
        this.Kx = 0;
        this.yL0 = 0;
        this.ey = 0;
        this.a = 0;
        this.Uj = j30_0.Hi;
        this.Ta = 0;
        this.hL0 = 0;
        this.Kk0 = 0;
        c8_0.A90().YG();
        this.x30 = new Object();
        this.Bx = QL.rn0;
        this.WN = ch0;
        this.Nw0 = str;
        this.FL0 = str2;
        this.import$ = i4;
        this.Gi0 = b5;
        this.HM = i6;
        this.m50 = j7;
        this.Aux = i9;
        this.oc0 = i10;
        this.il = i11;
        this.Lpt5 = s12;
        this.HI = i13;
        this.rQ = b14;
        this.HL = b15;
        this.Sq0 = s16;
        this.hh0 = b17;
        this.oM = i18;
        this.Ta = b19;
        this.hL0 = b20;
        this.Kk0 = b21;
    }

    public final CH0 yE() {
        return this.WN;
    }

    public final String uv0() {
        return this.Nw0;
    }

    public final String Y00() {
        return this.FL0;
    }

    public final int cM() {
        return this.import$;
    }

    public final byte dR() {
        return this.Gi0;
    }

    public final int kJ0() {
        return this.HM;
    }

    public final long d1() {
        return this.m50;
    }

    public final int bg() {
        return this.Aux;
    }

    public final int k10() {
        return this.oc0;
    }

    public final int bk0() {
        return this.il;
    }

    public final short qu0() {
        return this.Lpt5;
    }

    public final int JA() {
        return this.HI;
    }

    public final byte Hr() {
        return this.kC;
    }

    public final byte Tg0() {
        return this.Oq0;
    }

    public final byte EN() {
        return this.Zl0;
    }

    public final short PL() {
        return this.sL0;
    }

    public final short CZ() {
        return this.t60;
    }

    public final short nf0() {
        return this.Sq0;
    }

    public final boolean wv(byte b, byte b2) {
        int n = 1 << (b * 3 + b2);
        return (this.oM | n) == this.oM;
    }

    public final byte X1() {
        return this.hL0;
    }

    public final boolean IJ0(QL ql) {
        if (ql.aUx != zj_0.dC0) {
            return false;
        }
        synchronized (this.x30) {
            return S.ZT(ql, this.Bx);
        }
    }

    public final boolean eo0() {
        String str = this.Nw0;
        if (str.length() < 2 || str.charAt(0) != 'd') {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
