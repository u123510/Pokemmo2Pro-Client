package cn.pokemmo.audio.vorbis;

import f.CK0;
import f.DY;
import f.IH0;
import f.Jd0;
import f.MB;
import f.SL0;
import f.TA;
import f.Yn0;
import f.cu_1;
import f.d4_0;
import f.hj_0;
import f.i30_0;
import f.lu_0;
import f.vZ;
import f.yl0_1;

/**
 * Ogg Vorbis 音频流元数据与头解析器 (Vorbis Audio Info Header & Setup Decoder)
 * <p>
 * 原始混淆类: {@code f.i30_0}
 */
public class VorbisAudioInfo {
    public int tc;
    public int OF;
    public int Ne0;
    public int dB;
    public int LPT1;
    public int M8;
    public final int[] u5;
    public int v9;
    public int w40;
    public int jQ;
    public int uE0;
    public int OO;
    public int LT;
    public d4_0[] mE;
    public int[] AA;
    public Object[] HB0;
    public int[] Gu0;
    public Object[] ZC;
    public int[] DQ;
    public Object[] qF0;
    public int[] gt;
    public Object[] RJ;
    public lu_0[] lPt9;

    static {
        "vorbis".getBytes();
    }

    public VorbisAudioInfo() {
        this.u5 = new int[2];
        this.mE = null;
        this.AA = null;
        this.HB0 = null;
        this.Gu0 = null;
        this.ZC = null;
        this.DQ = null;
        this.qF0 = null;
        this.gt = null;
        this.RJ = null;
        this.lPt9 = null;
    }

    public final void ac() {
        for (int i = 0; i < this.v9; i++) {
            this.mE[i] = null;
        }
        this.mE = null;

        for (int i = 0; i < this.w40; i++) {
            yl0_1 yl0_12 = yl0_1.qF0[this.AA[i]];
            Object obj = this.HB0[i];
            obj.getClass();
        }
        this.HB0 = null;

        for (int i = 0; i < this.jQ; i++) {
            cu_1 cu_12 = cu_1.HA[this.Gu0[i]];
            Object obj = this.ZC[i];
            obj.getClass();
        }
        this.ZC = null;

        for (int i = 0; i < this.uE0; i++) {
            DY.ye0[this.DQ[i]].tX();
        }
        this.qF0 = null;

        for (int i = 0; i < this.OO; i++) {
            Jd0 jd0 = Jd0.Du[this.gt[i]];
            Object obj = this.RJ[i];
            obj.getClass();
        }
        this.RJ = null;

        for (int i = 0; i < this.LT; i++) {
            lu_0[] arrt = this.lPt9;
            if (arrt[i] != null) {
                arrt[i] = null;
            }
        }
        this.lPt9 = null;
    }

    public final int Ja(CK0 cK0, hj_0 hj_02) {
        IH0 iH0 = new IH0();
        if (hj_02 == null) {
            return -1;
        }
        byte[] byArray = hj_02.Xf0;
        int n = hj_02.Hm;
        int n2 = hj_02.Uf;
        iH0.n = n;
        iH0.Yl = byArray;
        iH0.AS = 0;
        iH0.Hm0 = 0;
        iH0.rE0 = n2;

        byte[] byArray2 = new byte[6];
        int n3 = iH0.IQ(8);
        int n4 = 6;
        int n5 = 0;
        while (n4-- != 0) {
            byArray2[n5++] = (byte) iH0.IQ(8);
        }

        if (byArray2[0] != 118 || byArray2[1] != 111 || byArray2[2] != 114 || byArray2[3] != 98 || byArray2[4] != 105 || byArray2[5] != 115) {
            return -1;
        }

        if (n3 == 1) {
            if (hj_02.s30 == 0) {
                return -1;
            }
            if (this.Ne0 != 0) {
                return -1;
            }
            int n6 = iH0.IQ(32);
            this.tc = n6;
            if (n6 != 0) {
                return -1;
            }
            this.OF = iH0.IQ(8);
            this.Ne0 = iH0.IQ(32);
            this.dB = iH0.IQ(32);
            this.LPT1 = iH0.IQ(32);
            this.M8 = iH0.IQ(32);
            this.u5[0] = 1 << iH0.IQ(4);
            this.u5[1] = 1 << iH0.IQ(4);
            if (this.Ne0 < 1 || this.OF < 1) {
                this.ac();
                return -1;
            }
            int[] nArray = this.u5;
            int n7 = nArray[0];
            if (n7 < 8 || nArray[1] < n7 || iH0.IQ(1) != 1) {
                this.ac();
                return -1;
            }
            return 0;
        }

        if (n3 == 3) {
            if (this.Ne0 == 0) {
                return -1;
            }
            cK0.getClass();
            int n8 = iH0.IQ(32);
            if (n8 < 0) {
                cK0.Vd();
                return -1;
            }
            byte[] byArray3 = new byte[n8 + 1];
            cK0.Dm = byArray3;
            int n9 = 0;
            while (n8-- != 0) {
                byArray3[n9++] = (byte) iH0.IQ(8);
            }
            int n10 = iH0.IQ(32);
            cK0.b60 = n10;
            if (n10 < 0) {
                cK0.Vd();
                return -1;
            }
            int n11 = n10 + 1;
            cK0.WK = new byte[n11][];
            cK0.iu = new int[n11];
            for (int i = 0; i < cK0.b60; i++) {
                int n12 = iH0.IQ(32);
                if (n12 < 0) {
                    cK0.Vd();
                    return -1;
                }
                cK0.iu[i] = n12;
                byte[] byArray4 = new byte[n12 + 1];
                cK0.WK[i] = byArray4;
                int n13 = 0;
                while (n12-- != 0) {
                    byArray4[n13++] = (byte) iH0.IQ(8);
                }
            }
            if (iH0.IQ(1) != 1) {
                cK0.Vd();
                return -1;
            }
            return 0;
        }

        if (n3 != 5) {
            return -1;
        }

        if (this.Ne0 == 0 || cK0.Dm == null) {
            return -1;
        }

        int n14 = iH0.IQ(8) + 1;
        this.LT = n14;
        lu_0[] arrt = this.lPt9;
        if (arrt == null || arrt.length != n14) {
            this.lPt9 = new lu_0[n14];
        }

        for (int i = 0; i < this.LT; i++) {
            lu_0 lu_02 = new lu_0();
            this.lPt9[i] = lu_02;
            if (iH0.IQ(24) != 5653314) {
                this.ac();
                return -1;
            }
            lu_02.jA = iH0.IQ(16);
            int n15 = iH0.IQ(24);
            lu_02.BY = n15;
            if (n15 == -1) {
                this.ac();
                return -1;
            }
            int n16 = iH0.IQ(1);
            if (n16 != 0) {
                if (n16 != 1) {
                    this.ac();
                    return -1;
                }
                int n17 = iH0.IQ(5) + 1;
                lu_02.Ky0 = new int[lu_02.BY];
                int n18 = 0;
                while (n18 < lu_02.BY) {
                    int n19 = lu_02.BY;
                    int n20 = iH0.IQ(MB.iY(n19 - n18));
                    if (n20 == -1) {
                        this.ac();
                        return -1;
                    }
                    for (int j = 0; j < n20; j++) {
                        lu_02.Ky0[n18] = n17;
                        n18++;
                    }
                    n17++;
                }
            } else {
                lu_02.Ky0 = new int[lu_02.BY];
                if (iH0.IQ(1) != 0) {
                    for (int j = 0; j < lu_02.BY; j++) {
                        if (iH0.IQ(1) != 0) {
                            int n21 = iH0.IQ(5);
                            if (n21 == -1) {
                                this.ac();
                                return -1;
                            }
                            lu_02.Ky0[j] = n21 + 1;
                        } else {
                            lu_02.Ky0[j] = 0;
                        }
                    }
                } else {
                    for (int j = 0; j < lu_02.BY; j++) {
                        int n22 = iH0.IQ(5);
                        if (n22 == -1) {
                            this.ac();
                            return -1;
                        }
                        lu_02.Ky0[j] = n22 + 1;
                    }
                }
            }

            int n23 = iH0.IQ(4);
            lu_02.kf0 = n23;
            if (n23 != 0) {
                if (n23 != 1 && n23 != 2) {
                    this.ac();
                    return -1;
                }
                lu_02.Y0 = iH0.IQ(32);
                lu_02.zi0 = iH0.IQ(32);
                lu_02.Nt = iH0.IQ(4) + 1;
                lu_02.Xg = iH0.IQ(1);
                int n24 = 0;
                int n25 = lu_02.kf0;
                if (n25 == 1) {
                    n24 = lu_02.Em();
                } else if (n25 == 2) {
                    n24 = lu_02.BY * lu_02.jA;
                }
                lu_02.rl = new int[n24];
                for (int j = 0; j < n24; j++) {
                    lu_02.rl[j] = iH0.IQ(lu_02.Nt);
                }
                if (lu_02.rl[n24 - 1] == -1) {
                    this.ac();
                    return -1;
                }
            }
        }

        int n26 = iH0.IQ(6) + 1;
        this.jQ = n26;
        int[] nArray2 = this.Gu0;
        if (nArray2 == null || nArray2.length != n26) {
            this.Gu0 = new int[n26];
        }
        Object[] arrobject = this.ZC;
        if (arrobject == null || arrobject.length != n26) {
            this.ZC = new Object[n26];
        }
        for (int i = 0; i < this.jQ; i++) {
            this.Gu0[i] = iH0.IQ(16);
            int n27 = this.Gu0[i];
            if (n27 < 0 || n27 >= 1) {
                this.ac();
                return -1;
            }
            cu_1 cu_12 = cu_1.HA[n27];
            cu_12.getClass();
            this.ZC[i] = "";
            if (this.ZC[i] == null) {
                this.ac();
                return -1;
            }
        }

        int n28 = iH0.IQ(6) + 1;
        this.uE0 = n28;
        int[] nArray3 = this.DQ;
        if (nArray3 == null || nArray3.length != n28) {
            this.DQ = new int[n28];
        }
        Object[] arrobject2 = this.qF0;
        if (arrobject2 == null || arrobject2.length != n28) {
            this.qF0 = new Object[n28];
        }
        for (int i = 0; i < this.uE0; i++) {
            this.DQ[i] = iH0.IQ(16);
            int n29 = this.DQ[i];
            if (n29 < 0 || n29 >= 2) {
                this.ac();
                return -1;
            }
            this.qF0[i] = DY.ye0[n29].Pl((i30_0) this, iH0);
            if (this.qF0[i] == null) {
                this.ac();
                return -1;
            }
        }

        int n30 = iH0.IQ(6) + 1;
        this.OO = n30;
        int[] nArray4 = this.gt;
        if (nArray4 == null || nArray4.length != n30) {
            this.gt = new int[n30];
        }
        Object[] arrobject3 = this.RJ;
        if (arrobject3 == null || arrobject3.length != n30) {
            this.RJ = new Object[n30];
        }
        for (int i = 0; i < this.OO; i++) {
            this.gt[i] = iH0.IQ(16);
            int n31 = this.gt[i];
            if (n31 < 0 || n31 >= 3) {
                this.ac();
                return -1;
            }
            Object[] arrobject4 = this.RJ;
            TA tA = (TA) Jd0.Du[n31];
            tA.getClass();
            int n32 = 0;
            SL0 sL0 = new SL0();
            sL0.lpT3 = iH0.IQ(24);
            sL0.vr0 = iH0.IQ(24);
            sL0.fs = iH0.IQ(24) + 1;
            sL0.Ig = iH0.IQ(6) + 1;
            sL0.this$ = iH0.IQ(8);
            for (int j = 0; j < sL0.Ig; j++) {
                int n33 = iH0.IQ(3);
                if (iH0.IQ(1) != 0) {
                    n33 |= iH0.IQ(5) << 3;
                }
                sL0.rG[j] = n33;
                int n34 = 0;
                while (n33 != 0) {
                    n34 += n33 & 1;
                    n33 >>>= 1;
                }
                n32 += n34;
            }
            for (int j = 0; j < n32; j++) {
                sL0.gD0[j] = iH0.IQ(8);
            }
            SL0 sL02;
            if (sL0.this$ >= this.LT) {
                sL02 = null;
            } else {
                sL02 = sL0;
                for (int j = 0; j < n32; j++) {
                    if (sL0.gD0[j] >= this.LT) {
                        sL02 = null;
                        break;
                    }
                }
            }
            arrobject4[i] = sL02;
            if (this.RJ[i] == null) {
                this.ac();
                return -1;
            }
        }

        int n35 = iH0.IQ(6) + 1;
        this.w40 = n35;
        int[] nArray5 = this.AA;
        if (nArray5 == null || nArray5.length != n35) {
            this.AA = new int[n35];
        }
        Object[] arrobject5 = this.HB0;
        if (arrobject5 == null || arrobject5.length != n35) {
            this.HB0 = new Object[n35];
        }
        for (int i = 0; i < this.w40; i++) {
            this.AA[i] = iH0.IQ(16);
            int n36 = this.AA[i];
            if (n36 < 0 || n36 >= 1) {
                this.ac();
                return -1;
            }
            Object[] arrobject6 = this.HB0;
            Yn0 yn0 = (Yn0) yl0_1.qF0[n36];
            yn0.getClass();
            vZ vZ2 = new vZ();
            if (iH0.IQ(1) != 0) {
                vZ2.a7 = iH0.IQ(4) + 1;
            } else {
                vZ2.a7 = 1;
            }
            boolean bl = false;
            if (iH0.IQ(1) != 0) {
                vZ2.op = iH0.IQ(8) + 1;
                for (int j = 0; j < vZ2.op; j++) {
                    int[] nArray6 = vZ2.SH0;
                    int n37 = this.OF;
                    int n38 = 0;
                    while (n37 > 1) {
                        n38++;
                        n37 >>>= 1;
                    }
                    int n39 = iH0.IQ(n38);
                    nArray6[j] = n39;
                    int[] nArray7 = vZ2.Q5;
                    int n40 = this.OF;
                    int n41 = 0;
                    while (n40 > 1) {
                        n41++;
                        n40 >>>= 1;
                    }
                    int n42 = iH0.IQ(n41);
                    nArray7[j] = n42;
                    if (n39 < 0 || n42 < 0 || n39 == n42 || n39 >= this.OF || n42 >= this.OF) {
                        vZ2.bA0();
                        vZ2 = null;
                        bl = true;
                        break;
                    }
                }
            }
            if (!bl) {
                if (iH0.IQ(2) > 0) {
                    vZ2.bA0();
                    vZ2 = null;
                } else {
                    if (vZ2.a7 > 1) {
                        for (int j = 0; j < this.OF; j++) {
                            vZ2.e9[j] = iH0.IQ(4);
                            if (vZ2.e9[j] >= vZ2.a7) {
                                vZ2.bA0();
                                vZ2 = null;
                                bl = true;
                                break;
                            }
                        }
                    }
                    if (!bl) {
                        for (int j = 0; j < vZ2.a7; j++) {
                            vZ2.pM[j] = iH0.IQ(8);
                            if (vZ2.pM[j] >= this.jQ) {
                                vZ2.bA0();
                                vZ2 = null;
                                bl = true;
                                break;
                            }
                            vZ2.OE[j] = iH0.IQ(8);
                            if (vZ2.OE[j] >= this.uE0) {
                                vZ2.bA0();
                                vZ2 = null;
                                bl = true;
                                break;
                            }
                            vZ2.E10[j] = iH0.IQ(8);
                            if (vZ2.E10[j] >= this.OO) {
                                vZ2.bA0();
                                vZ2 = null;
                                break;
                            }
                        }
                    }
                }
            }
            arrobject6[i] = vZ2;
            if (this.HB0[i] == null) {
                this.ac();
                return -1;
            }
        }

        int n43 = iH0.IQ(6) + 1;
        this.v9 = n43;
        d4_0[] arrt2 = this.mE;
        if (arrt2 == null || arrt2.length != n43) {
            this.mE = new d4_0[n43];
        }
        for (int i = 0; i < this.v9; i++) {
            d4_0[] arrt3 = this.mE;
            d4_0 d4_02 = new d4_0();
            arrt3[i] = d4_02;
            d4_02.Fx = iH0.IQ(1);
            this.mE[i].JM = iH0.IQ(16);
            this.mE[i].Sx = iH0.IQ(16);
            this.mE[i].switch$ = iH0.IQ(8);
            d4_0 d4_03 = this.mE[i];
            if (d4_03.JM >= 1 || d4_03.Sx >= 1 || d4_03.switch$ >= this.w40) {
                this.ac();
                return -1;
            }
        }

        if (iH0.IQ(1) != 1) {
            this.ac();
            return -1;
        }
        return 0;
    }

    public final String toString() {
        return "version:" + this.tc + ", channels:" + this.OF + ", rate:" + this.Ne0 + ", bitrate:" + this.dB + "," + this.LPT1 + "," + this.M8;
    }
}
