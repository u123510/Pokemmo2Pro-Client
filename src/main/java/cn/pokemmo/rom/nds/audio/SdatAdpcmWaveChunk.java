package cn.pokemmo.rom.nds.audio;

import f.Gd;
import java.nio.ByteBuffer;

/**
 * NDS SDAT/SWAV ADPCM 音频波形数据块 (SDAT ADPCM Wave Chunk)
 * <p>
 * 原始混淆类: {@code f.CS}
 */
public class SdatAdpcmWaveChunk {
    public static final int[] iH;
    public static final int[] Lm0;
    public final ByteBuffer EB;
    public final byte NP;
    public final int prn;
    public final int C50;
    public final int Lz0;
    public final int lK;
    public final int LPt1;

    public SdatAdpcmWaveChunk(ByteBuffer byteBuffer) {
        int n;
        byte by = byteBuffer.get();
        ByteBuffer byteBuffer2 = byteBuffer;
        ByteBuffer byteBuffer3 = byteBuffer;
        this.NP = by;
        byteBuffer3.get();
        this.prn = byteBuffer3.getShort() & 0xFFFF;
        byteBuffer.getShort();
        this.C50 = n = L0(by);
        int n2 = (byteBuffer2.getShort() & 0xFFFF) * 4;
        int n3 = byteBuffer2.getInt() * 4;
        if (by == 2) {
            int n4 = n2;
            n2 = 16;
            n3 = n4 + n3 - 4;
            this.lK = byteBuffer.getShort() & 0xFFFF;
            this.LPt1 = byteBuffer.get() & 0x7F;
        } else {
            int n5 = n2;
            n2 = 12;
            n3 = n5 + n3;
            this.lK = 0;
            this.LPt1 = 0;
        }
        this.Lz0 = by == 2 ? n3 * 4 + 2 : n3 / (n / 8);
        byteBuffer = byteBuffer.duplicate().order(byteBuffer.order());
        byteBuffer.position(n2);
        byteBuffer.limit(n2 + n3);
        this.EB = byteBuffer.slice();
    }

    static {
        int[] nArray = new int[89];
        int[] nArray2 = nArray;
        nArray[0] = 7;
        nArray2[1] = 8;
        nArray2[2] = 9;
        nArray2[3] = 10;
        nArray2[4] = 11;
        nArray2[5] = 12;
        nArray2[6] = 13;
        nArray2[7] = 14;
        nArray2[8] = 16;
        nArray2[9] = 17;
        nArray2[10] = 19;
        nArray2[11] = 21;
        nArray2[12] = 23;
        nArray2[13] = 25;
        nArray2[14] = 28;
        nArray2[15] = 31;
        nArray2[16] = 34;
        nArray2[17] = 37;
        nArray2[18] = 41;
        nArray2[19] = 45;
        nArray2[20] = 50;
        nArray2[21] = 55;
        nArray2[22] = 60;
        nArray2[23] = 66;
        nArray2[24] = 73;
        nArray2[25] = 80;
        nArray2[26] = 88;
        nArray2[27] = 97;
        nArray2[28] = 107;
        nArray2[29] = 118;
        nArray2[30] = 130;
        nArray2[31] = 143;
        nArray2[32] = 157;
        nArray2[33] = 173;
        nArray2[34] = 190;
        nArray2[35] = 209;
        nArray2[36] = 230;
        nArray2[37] = 253;
        nArray2[38] = 279;
        nArray2[39] = 307;
        nArray2[40] = 337;
        nArray2[41] = 371;
        nArray2[42] = 408;
        nArray2[43] = 449;
        nArray2[44] = 494;
        nArray2[45] = 544;
        nArray2[46] = 598;
        nArray2[47] = 658;
        nArray2[48] = 724;
        nArray2[49] = 796;
        nArray2[50] = 876;
        nArray2[51] = 963;
        nArray2[52] = 1060;
        nArray2[53] = 1166;
        nArray2[54] = 1282;
        nArray2[55] = 1411;
        nArray2[56] = 1552;
        nArray2[57] = 1707;
        nArray2[58] = 1878;
        nArray2[59] = 2066;
        nArray2[60] = 2272;
        nArray2[61] = 2499;
        nArray2[62] = 2749;
        nArray2[63] = 3024;
        nArray2[64] = 3327;
        nArray2[65] = 3660;
        nArray2[66] = 4026;
        nArray2[67] = 4428;
        nArray2[68] = 4871;
        nArray2[69] = 5358;
        nArray2[70] = 5894;
        nArray2[71] = 6484;
        nArray2[72] = 7132;
        nArray2[73] = 7845;
        nArray2[74] = 8630;
        nArray2[75] = 9493;
        nArray2[76] = 10442;
        nArray2[77] = 11487;
        nArray2[78] = 12635;
        nArray2[79] = 13899;
        nArray2[80] = 15289;
        nArray2[81] = 16818;
        nArray2[82] = 18500;
        nArray2[83] = 20350;
        nArray2[84] = 22385;
        nArray2[85] = 24623;
        nArray2[86] = 27086;
        nArray2[87] = 29794;
        nArray2[88] = Short.MAX_VALUE;
        iH = nArray2;
        Lm0 = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    }

    public static void iE(byte by, Gd gd) {
        by = (byte)(by & 0xF);
        int n = gd.GG0;
        int n2 = iH[n];
        int n3 = n2 >> 3;
        if ((by & 1) != 0) {
            n3 += n2 >> 2;
        }
        if ((by & 2) != 0) {
            n3 += n2 >> 1;
        }
        if ((by & 4) != 0) {
            n3 += n2;
        }
        gd.O10 = (by & 8) != 0 ? (gd.O10 -= n3) : (gd.O10 += n3);
        if (gd.O10 < Short.MIN_VALUE) {
            gd.O10 = Short.MIN_VALUE;
        }
        if (gd.O10 > Short.MAX_VALUE) {
            gd.O10 = Short.MAX_VALUE;
        }
        if ((gd.GG0 = n + Lm0[by & 7]) < 0) {
            gd.GG0 = 0;
        }
        if (gd.GG0 > 88) {
            gd.GG0 = 88;
        }
    }

    public static int L0(int n) {
        return n == 0 ? 8 : 16;
    }
}
