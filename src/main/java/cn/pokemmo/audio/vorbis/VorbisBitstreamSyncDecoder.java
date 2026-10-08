/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  f.L20
 *  f.hj_0
 */
package cn.pokemmo.audio.vorbis;

import f.*;

import f.L20;
import f.hj_0;

public class VorbisBitstreamSyncDecoder {
    public byte[] ej0;
    public int Ej;
    public int v60;
    public int QY;
    public int[] dq0;
    public long[] f1;
    public int Vn;
    public int Qa0;
    public int Wq;
    public int RI;
    public int oG0;
    public int fH;
    public long P8;

    public VorbisBitstreamSyncDecoder() {
        VorbisBitstreamSyncDecoder v50 = this;
        v50.Dl();
    }

    public final void Dl() {
        VorbisBitstreamSyncDecoder v50 = this;
        v50.Ej = 16384;
        v50.ej0 = new byte[16384];
        v50.Vn = 1024;
        v50.dq0 = new int[1024];
        v50.f1 = new long[1024];
    }

    public final int CA0(hj_0 hj_02) {
        long l;
        VorbisBitstreamSyncDecoder v50 = this;
        int n = v50.RI;
        if (v50.Wq <= n) {
            return 0;
        }
        int n2 = this.dq0[n];
        if ((n2 & 0x400) != 0) {
            this.RI = n + 1;
            ++this.P8;
            return -1;
        }
        int n3 = n2;
        int n4 = n2;
        hj_02.Xf0 = this.ej0;
        hj_02.Hm = this.QY;
        hj_02.A00 = n4 & 0x200;
        hj_02.s30 = n3 & 0x100;
        int n5 = n2 &= 0xFF;
        while (n2 == 255) {
            int n6 = this.dq0[++n];
            n2 = n6 & 0xFF;
            if ((n6 & 0x200) != 0) {
                hj_02.A00 = 512;
            }
            n5 += n2;
        }
        hj_02.Gl0 = l = this.P8;
        hj_02.mE = this.f1[n];
        hj_02.Uf = n5;
        this.QY += n5;
        this.RI = n + 1;
        this.P8 = l + 1L;
        return 1;
    }

    public final int k1(L20 l20) {
        int n;
        int n2;
        byte[] byArray = l20.Lz0;
        int n3 = l20.kf0;
        L20 l202 = l20;
        L20 l203 = l20;
        byte[] byArray2 = l203.JD;
        int n4 = l203.GL0;
        int n5 = l203.iB0;
        int n6 = 0;
        int n7 = byArray[n3 + 4] & 0xFF;
        byte by = byArray[n3 + 5];
        int n8 = by & 1;
        int n9 = by & 2;
        int n10 = byArray[n3 + 5] & 4;
        long l = (((((((long)(byArray[n3 + 13] & 0xFF) << 8 | (long)(byArray[n3 + 12] & 0xFF)) << 8 | (long)(byArray[n3 + 11] & 0xFF)) << 8 | (long)(byArray[n3 + 10] & 0xFF)) << 8 | (long)(byArray[n3 + 9] & 0xFF)) << 8 | (long)(byArray[n3 + 8] & 0xFF)) << 8 | (long)(byArray[n3 + 7] & 0xFF)) << 8 | (long)(byArray[n3 + 6] & 0xFF);
        int n11 = l202.mK();
        byte[] byArray3 = l202.Lz0;
        int n12 = l20.kf0;
        n12 = l202.Lz0[n12 + 18] & 0xFF | (byArray3[n12 + 19] & 0xFF) << 8 | (byArray3[n12 + 20] & 0xFF) << 16 | (byArray3[n12 + 21] & 0xFF) << 24;
        int n13 = l20.Lz0[n3 + 26] & 0xFF;
        int n14 = this.RI;
        int n15 = this.QY;
        if (n15 != 0) {
            this.v60 = n2 = this.v60 - n15;
            if (n2 != 0) {
                System.arraycopy(this.ej0, n15, this.ej0, 0, n2);
            }
            this.QY = 0;
        }
        if (n14 != 0) {
            n15 = this.Qa0 - n14;
            if (n15 != 0) {
                System.arraycopy(this.dq0, n14, this.dq0, 0, n15);
                long[] lArray = this.f1;
                n2 = this.Qa0 - n14;
                System.arraycopy(this.f1, n14, lArray, 0, n2);
            }
            this.Qa0 -= n14;
            this.Wq -= n14;
            this.RI = 0;
        }
        if (n11 != this.oG0) {
            return -1;
        }
        if (n7 > 0) {
            return -1;
        }
        n11 = this.Vn;
        n7 = n13 + 1;
        if (n11 <= this.Qa0 + n7) {
            this.Vn = n13 + 33 + n11;
            int[] objectArray = new int[this.Vn];
            n11 = this.dq0.length;
            System.arraycopy(this.dq0, 0, objectArray, 0, n11);
            this.dq0 = objectArray;
            long[] timestamps = new long[this.Vn];
            n11 = this.f1.length;
            System.arraycopy(this.f1, 0, timestamps, 0, n11);
            this.f1 = timestamps;
        }
        if (n12 != this.fH) {
            int n16;
            for (n16 = this.Wq; n16 < this.Qa0; ++n16) {
                this.v60 -= this.dq0[n16] & 0xFF;
            }
            this.Qa0 = n16 = this.Wq;
            if (this.fH != -1) {
                int n17 = n16++;
                this.Qa0 = n16;
                this.dq0[n17] = 1024;
                this.Wq = n16;
            }
            if (n8 != 0) {
                n9 = 0;
                while (n6 < n13) {
                    n16 = byArray[n3 + 27 + n6] & 0xFF;
                    n4 += n16;
                    n5 -= n16;
                    if (n16 < 255) {
                        ++n6;
                        break;
                    }
                    ++n6;
                }
            }
        }
        if (n5 != 0) {
            int n18 = this.Ej;
            if (n18 <= this.v60 + n5) {
                this.Ej = n5 + 1024 + n18;
                byte[] byArray4 = new byte[this.Ej];
                n8 = this.ej0.length;
                System.arraycopy(this.ej0, 0, byArray4, 0, n8);
                this.ej0 = byArray4;
            }
            System.arraycopy(byArray2, n4, this.ej0, this.v60, n5);
            this.v60 += n5;
        }
        int n19 = -1;
        while (n6 < n13) {
            n4 = byArray[n3 + 27 + n6] & 0xFF;
            int[] nArray = this.dq0;
            int n20 = this.Qa0;
            this.dq0[n20] = n4;
            this.f1[n20] = -1L;
            if (n9 != 0) {
                int n21;
                nArray[n20] = n4 | 0x100;
                n9 = n21 = 0;
            }
            if (n4 < 255) {
                n19 = n20;
            }
            int n22 = n4;
            this.Qa0 = n4 = n20 + 1;
            ++n6;
            if (n22 >= 255) continue;
            this.Wq = n4;
        }
        if (n19 != -1) {
            this.f1[n19] = l;
        }
        if (n10 != 0 && (n = this.Qa0) > 0) {
            this.dq0[--n] = this.dq0[n] | 0x200;
        }
        this.fH = n12 + 1;
        return 0;
    }
}
