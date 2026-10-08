package cn.pokemmo.rom.gba;

import f.G1;
import f.SQ;
import f.br_2;
import f.com7__5;
import f.qa0_1;

/**
 * GBA ROM 偏移与数据结构描述符
 * 原混淆类: f.br_2
 */
public class GbaRomConfig implements Cloneable {
    public static final int sp = 2;
    public static final int ki = 3;
    public static final int fB0 = 4;
    public static final int HE = 5;
    public static final int NR = 6;
    public static final int C60 = 7;
    public static final int Oy0 = 8;
    public static final int Am0 = 9;
    public static final int CG0 = 10;
    public static final int gF0 = 11;
    public static final int Sf = 12;
    public static final int ce = 13;
    public static final int HA = 14;
    public static final int Tb = 15;
    public static final int HK = 16;
    public static final int eM0 = 17;
    public static final int QB = 18;
    public static final int Cq0 = 19;
    public static final int B1 = 20;
    public static final int IK = 21;
    public static final int ex0 = 22;
    public static final int Wa0 = 23;
    public static final int nm = 24;
    public static final int vm0 = 25;
    public static final int hu = 26;
    public static final int UU = 27;
    public static final int Yk0 = 28;
    public static final int sE0 = 29;
    public static final int oC = 30;
    public static final int n2 = 31;
    public static final int T70 = 32;
    public static final int sx0 = 33;
    public static final int b2 = 34;
    public static final int L10 = 35;
    public static final int Ds = 36;
    public static final int J90 = 37;
    public static final int Yt0 = 38;
    public static final int bD = 39;
    public static final int AZ = 40;
    public static final int Ww0 = 41;
    public static final int we0 = 42;
    public static final int yG = 43;
    public static final int by0 = 45;
    public static final int fX = 46;
    public static final int YG0 = 47;
    public static final int mm0 = 48;
    public static final int Hu = 49;
    public static final int ns = 50;
    public static final int LE0 = 51;
    public static final int qM = 52;
    public static final int kZ = 53;
    public static final int Nr0 = 54;
    public static final int PP = 55;
    public static final int Pp0 = 56;
    public static final int UL = 58;
    public static final int Fo = 59;
    public static final int NL0 = 60;
    public static final int hK0 = 61;
    public static final int Ju0 = 62;
    public static final int zE0 = 63;
    public static final int l30 = 64;
    public static final int ke = 65;
    public static final int Me = 67;
    public static final int yY = 68;
    public static final int ft = 69;
    public static final int h40 = 70;
    public static final int y10 = 71;
    public static final int Mh = 72;
    public static final int Ck0 = 73;
    public static final int xV = 74;
    public static final int jH = 75;
    public static final int LPT7 = 76;
    public static final int cn0 = 77;
    public static final int coM5 = 78;
    public static final int cb0 = 79;
    public static final int mR = 80;
    public static final int oA0 = 81;
    public static final int ED0 = 82;
    public static final int Co0 = 83;
    public static final int T3 = 84;
    public static final int yw = 85;
    public static final int Qq0 = 86;
    public static final int uC0 = 87;
    public static final int QJ = 88;
    public static final int UK0 = 89;
    public static final int F5 = 90;
    public static final int Pv = 91;
    public static final int mW = 92;
    public static final int com1 = 93;
    public static final int lC0 = 94;
    public static final int mo0 = 95;
    public static final int Jx = 96;
    public static final int gz = 97;
    public static final int vj = 98;
    public static final int rK = 99;
    public static final int ZV = 100;
    public static final int BJ0 = 101;
    public static final int Jr = 102;
    public static final int Uz0 = 103;
    public static final int XB = 104;
    public static final int Q6 = 105;
    public static final int TI0 = 106;
    public static final int mb = 107;
    public static final int jf = 108;
    public static final int SY = 109;
    public static final int W5 = 110;
    public static final int r3 = 111;
    public static final int xt = 112;
    public static final int GE0 = 113;
    public static final int QF0 = 114;
    public static final int l9 = 115;
    public static final int ti0 = 116;
    public static final int d1 = 117;
    public static final int ej = 118;
    public static final int ZP = 119;
    public static final int Mi0 = 120;
    public static final int SU = 121;
    public static final int ZL0 = 122;
    public static final int Jn0 = 123;
    public static final int c9 = 124;
    public static final int CS = 125;
    public static final int an0 = 126;
    public static final int dW = 127;
    public static final int qH = 128;
    public static final int Eo0 = 129;
    public static final int sv = 130;
    public static final int D3 = 131;
    public static final int QT = 132;
    public static final int ql = 133;
    public static final int O20 = 134;
    public static final int lr = 135;
    public static final int Xq = 136;
    public static final int rj = 137;
    public static final int Wc = 138;
    public static final int jO = 139;
    public static final int Ag0 = 140;
    public static final int TK0 = 141;
    public static final int Gb0 = 142;
    public static final int tX = 143;
    public static final int Fn0 = 144;
    public static final int B6 = 145;
    public static final int Yh0 = 146;
    public static final int rA0 = 147;
    public static final int oE0 = 148;
    public static final int V9 = 149;
    public static final int y9 = 150;
    public static final int Tt0 = 151;
    public static final int Ew = 152;
    public static final int S7 = 153;
    public static final int Jh = 154;
    public static final int Xn0 = 155;

    public final String romTitle;
    public final String gameCodePrefix;
    public final byte version;
    public final byte gameType;
    public final String language;
    public br_2 parentConfig;
    public qa0_1 rom;
    public SQ offsetMap;
    public G1 hG;

    // 兼容混淆字段别名
    public final String nu0;
    public final String Ta0;
    public final byte q1;
    public final byte Yw0;
    public final String FQ;
    public br_2 bF;
    public qa0_1 zG0;
    public SQ FC0;

    public GbaRomConfig(String title, String codePrefix, byte version, byte gameType, br_2 parent, String language) {
        this.offsetMap = new SQ();
        this.FC0 = this.offsetMap;
        this.hG = null;
        this.romTitle = title;
        this.nu0 = title;
        this.gameCodePrefix = codePrefix;
        this.Ta0 = codePrefix;
        this.version = version;
        this.q1 = version;
        this.gameType = gameType;
        this.Yw0 = gameType;
        this.language = language;
        this.FQ = language;
        this.parentConfig = parent;
        this.bF = parent;
    }

    public static boolean dM0(SQ sQ, int n, com7__5 c) {
        sQ.j10(sQ.yw0(n), c.lPt8());
        return true;
    }

    public final br_2 wy() {
        return (br_2) this;
    }

    public final br_2 G0() {
        return (br_2) this;
    }

    public final String SA() {
        return this.language != null ? this.language : this.FQ;
    }

    public final int V(int key) {
        Object obj = this.offsetMap.get(key);
        com7__5 c = (obj instanceof com7__5) ? (com7__5) obj : null;
        if (c != null) {
            return c.uO(this.rom != null ? this.rom : this.zG0);
        }
        br_2 parent = this.parentConfig != null ? this.parentConfig : this.bF;
        if (parent != null) {
            Object pObj = parent.FC0.get(key);
            if (pObj instanceof com7__5) {
                return ((com7__5) pObj).uO(this.rom != null ? this.rom : this.zG0);
            }
        }
        throw new RuntimeException("Undefined offset " + key);
    }

    public final boolean ZF0(int key) {
        if (this.offsetMap.get(key) != null) {
            return true;
        }
        br_2 parent = this.parentConfig != null ? this.parentConfig : this.bF;
        return parent != null && parent.FC0.get(key) != null;
    }

    public br_2 ta(qa0_1 romInstance) {
        try {
            br_2 clone = (br_2) super.clone();
            clone.zG0 = romInstance;
            clone.rom = romInstance;
            SQ sQ = new SQ();
            this.offsetMap.JZ((i, v) -> {
                if (v instanceof com7__5) {
                    return GbaRomConfig.dM0(sQ, i, (com7__5) v);
                }
                return true;
            });
            clone.FC0 = sQ;
            clone.offsetMap = sQ;
            G1 g1 = clone.hG;
            if (g1 != null) {
                g1.xo(true);
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
