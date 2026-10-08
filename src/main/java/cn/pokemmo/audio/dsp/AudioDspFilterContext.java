/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.audio.dsp;

import f.*;

import f.kq_0;

public class AudioDspFilterContext {
    public static final int[] nuL;
    public int n = 0;
    public byte[] Yl = null;
    public int Hm0 = 0;
    public int AS = 0;
    public int rE0 = 0;

    static {
        int[] nArray = new int[33];
        int[] nArray2 = nArray;
        nArray[0] = 0;
        nArray2[1] = 1;
        nArray2[2] = 3;
        nArray2[3] = 7;
        nArray2[4] = 15;
        nArray2[5] = 31;
        nArray2[6] = 63;
        nArray2[7] = 127;
        nArray2[8] = 255;
        nArray2[9] = 511;
        nArray2[10] = 1023;
        nArray2[11] = 2047;
        nArray2[12] = 4095;
        nArray2[13] = 8191;
        nArray2[14] = 16383;
        nArray2[15] = Short.MAX_VALUE;
        nArray2[16] = 65535;
        nArray2[17] = 131071;
        nArray2[18] = 262143;
        nArray2[19] = 524287;
        nArray2[20] = 1048575;
        nArray2[21] = 0x1FFFFF;
        nArray2[22] = 0x3FFFFF;
        nArray2[23] = 0x7FFFFF;
        nArray2[24] = 0xFFFFFF;
        nArray2[25] = 0x1FFFFFF;
        nArray2[26] = 0x3FFFFFF;
        nArray2[27] = 0x7FFFFFF;
        nArray2[28] = 0xFFFFFFF;
        nArray2[29] = 0x1FFFFFFF;
        nArray2[30] = 0x3FFFFFFF;
        nArray2[31] = Integer.MAX_VALUE;
        nArray2[32] = -1;
        nuL = nArray2;
    }

    public final int IQ(int n) {
        int n2;
        int n3 = n;
        n = nuL[n];
        int n4 = this.Hm0;
        int n5 = n3 + n4;
        int n6 = this.AS;
        int n7 = this.rE0;
        if (n6 + 4 >= n7) {
            n2 = -1;
            if (kq_0.lpT2(n5, 1, 8, n6) >= n7) {
                int n8 = n5 / 8;
                this.n += n8;
                this.AS = n6 + n8;
                this.Hm0 = n5 & 7;
                return n2;
            }
        }
        byte[] byArray = this.Yl;
        n2 = this.n;
        int n9 = (this.Yl[n2] & 0xFF) >>> n4;
        if (n5 > 8) {
            n9 |= (byArray[n2 + 1] & 0xFF) << 8 - n4;
            if (n5 > 16) {
                n9 |= (byArray[n2 + 2] & 0xFF) << 16 - n4;
                if (n5 > 24) {
                    n9 |= (byArray[n2 + 3] & 0xFF) << 24 - n4;
                    if (n5 > 32 && n4 != 0) {
                        n9 |= (byArray[n2 + 4] & 0xFF) << 32 - n4;
                    }
                }
            }
        }
        int n10 = n5 / 8;
        this.n = n2 + n10;
        this.AS = n6 + n10;
        this.Hm0 = n5 & 7;
        return n9 & n;
    }
}

