/*
 * Reconstructed from bytecode (FernFlower cross-reference + javap verification).
 * CFR 0.152 failed: "Back jump on a try block".
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class CharacterPaletteSwapProvider extends BaseSpriteFrameProvider {
    public final boolean Fu0;
    public final boolean hn;
    public final boolean o1;
    public final boolean Vu;
    public final boolean a9;
    public final c20_0 Wp0;

    public CharacterPaletteSwapProvider(c20_0 c20_02, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.Wp0 = c20_02;
        this.Fu0 = bl;
        this.hn = bl2;
        this.o1 = bl3;
        this.Vu = bl4;
        this.a9 = bl5;
    }

    @Override
    public final i4_0 KN() {
        c20_0 c20_0_ = this.Wp0;
        boolean fu0 = this.Fu0;
        boolean hn = this.hn;
        boolean o1 = this.o1;
        boolean vu = this.Vu;
        boolean a9 = this.a9;
        c20_0_.getClass();
        int n6 = 256;
        int n7 = 256;
        i4_0 i4_0_ = new i4_0(n6, n7, ix0_0.Vw);
        byte[] palette = new byte[256];
        palette[0] = -34;
        palette[1] = 127;
        palette[2] = -25;
        palette[3] = 24;
        palette[4] = -100;
        palette[5] = 115;
        palette[6] = -1;
        palette[7] = 127;
        palette[8] = -67;
        palette[9] = 2;
        palette[10] = 56;
        palette[11] = 13;
        palette[12] = 121;
        palette[13] = 1;
        palette[14] = 63;
        palette[15] = 19;
        palette[16] = -5;
        palette[17] = 17;
        palette[18] = -97;
        palette[19] = 22;
        palette[20] = 71;
        palette[21] = 126;
        palette[22] = 116;
        palette[23] = 127;
        palette[24] = -64;
        palette[25] = 60;
        palette[26] = 17;
        palette[27] = 0;
        palette[28] = -116;
        palette[29] = 45;
        palette[30] = 0;
        palette[31] = 0;
        palette[32] = 123;
        palette[33] = 111;
        palette[34] = -1;
        palette[35] = 127;
        palette[36] = -67;
        palette[37] = 2;
        palette[38] = 127;
        palette[39] = 1;
        palette[40] = -69;
        palette[41] = 0;
        palette[42] = 127;
        palette[43] = 1;
        palette[44] = -69;
        palette[45] = 0;
        palette[46] = 127;
        palette[47] = 1;
        palette[48] = -69;
        palette[49] = 0;
        palette[50] = 127;
        palette[51] = 1;
        palette[52] = -69;
        palette[53] = 0;
        palette[54] = 127;
        palette[55] = 1;
        palette[56] = -69;
        palette[57] = 0;
        palette[58] = 63;
        palette[59] = 19;
        palette[60] = 19;
        palette[61] = 0;
        palette[62] = 0;
        palette[63] = 0;
        palette[64] = 0;
        palette[65] = 0;
        palette[66] = -1;
        palette[67] = 127;
        palette[68] = 41;
        palette[69] = 105;
        palette[70] = -82;
        palette[71] = 126;
        palette[72] = -114;
        palette[73] = 38;
        palette[74] = -77;
        palette[75] = 39;
        palette[76] = 127;
        palette[77] = 1;
        palette[78] = -97;
        palette[79] = 22;
        palette[80] = -65;
        palette[81] = 19;
        palette[82] = -69;
        palette[83] = 0;
        palette[84] = -9;
        palette[85] = 94;
        palette[86] = 115;
        palette[87] = 78;
        palette[88] = -17;
        palette[89] = 61;
        palette[90] = 107;
        palette[91] = 45;
        palette[92] = 8;
        palette[93] = 33;
        palette[94] = 0;
        palette[95] = 0;
        palette[96] = 0;
        palette[97] = 0;
        palette[98] = -67;
        palette[99] = 2;
        palette[100] = -75;
        palette[101] = 53;
        palette[102] = 123;
        palette[103] = 78;
        palette[104] = 82;
        palette[105] = 41;
        palette[106] = 24;
        palette[107] = 66;
        palette[108] = -31;
        palette[109] = 1;
        palette[110] = 0;
        palette[111] = 0;
        palette[112] = 0;
        palette[113] = 0;
        palette[114] = 0;
        palette[115] = 0;
        palette[116] = 0;
        palette[117] = 0;
        palette[118] = 0;
        palette[119] = 0;
        palette[120] = 0;
        palette[121] = 0;
        palette[122] = -5;
        palette[123] = 17;
        palette[124] = 63;
        palette[125] = 19;
        palette[126] = 121;
        palette[127] = 1;
        palette[128] = 123;
        palette[129] = 111;
        palette[130] = -6;
        palette[131] = 0;
        palette[132] = 121;
        palette[133] = 1;
        palette[134] = -1;
        palette[135] = 127;
        palette[136] = -67;
        palette[137] = 2;
        palette[138] = 0;
        palette[139] = 96;
        palette[140] = 22;
        palette[141] = 1;
        palette[142] = 22;
        palette[143] = 1;
        palette[144] = -96;
        palette[145] = 1;
        palette[146] = -96;
        palette[147] = 1;
        palette[148] = -22;
        palette[149] = 125;
        palette[150] = 126;
        palette[151] = 2;
        palette[152] = 126;
        palette[153] = 2;
        palette[154] = -59;
        palette[155] = 42;
        palette[156] = -59;
        palette[157] = 42;
        palette[158] = 0;
        palette[159] = 0;
        palette[160] = 123;
        palette[161] = 111;
        palette[162] = -6;
        palette[163] = 0;
        palette[164] = 121;
        palette[165] = 1;
        palette[166] = -1;
        palette[167] = 127;
        palette[168] = -67;
        palette[169] = 2;
        palette[170] = -128;
        palette[171] = 118;
        palette[172] = 29;
        palette[173] = 2;
        palette[174] = 29;
        palette[175] = 2;
        palette[176] = 96;
        palette[177] = 3;
        palette[178] = 96;
        palette[179] = 3;
        palette[180] = -15;
        palette[181] = 127;
        palette[182] = -65;
        palette[183] = 55;
        palette[184] = -65;
        palette[185] = 55;
        palette[186] = -14;
        palette[187] = 75;
        palette[188] = -14;
        palette[189] = 75;
        palette[190] = 0;
        palette[191] = 0;
        palette[192] = 90;
        palette[193] = 87;
        palette[194] = 0;
        palette[195] = 0;
        palette[196] = 0;
        palette[197] = 0;
        palette[198] = 0;
        palette[199] = 0;
        palette[200] = 0;
        palette[201] = 0;
        palette[202] = 0;
        palette[203] = 0;
        palette[204] = 0;
        palette[205] = 0;
        palette[206] = 0;
        palette[207] = 0;
        palette[208] = 0;
        palette[209] = 0;
        palette[210] = 0;
        palette[211] = 0;
        palette[212] = 0;
        palette[213] = 0;
        palette[214] = 0;
        palette[215] = 0;
        palette[216] = 0;
        palette[217] = 0;
        palette[218] = 0;
        palette[219] = 0;
        palette[220] = 0;
        palette[221] = 0;
        palette[222] = 0;
        palette[223] = 0;
        palette[224] = -4;
        palette[225] = 114;
        palette[226] = 8;
        palette[227] = 33;
        palette[228] = -1;
        palette[229] = 127;
        palette[230] = -79;
        palette[231] = 127;
        palette[232] = -11;
        palette[233] = 127;
        palette[234] = 45;
        palette[235] = 111;
        palette[236] = 126;
        palette[237] = 63;
        palette[238] = -97;
        palette[239] = 91;
        palette[240] = -6;
        palette[241] = 46;
        palette[242] = -37;
        palette[243] = 0;
        palette[244] = -65;
        palette[245] = 3;
        palette[246] = 62;
        palette[247] = 59;
        palette[248] = 122;
        palette[249] = 22;
        palette[250] = -34;
        palette[251] = 0;
        palette[252] = -5;
        palette[253] = 103;
        palette[254] = -97;
        palette[255] = 115;
        ByteBuffer byteBuffer = ByteBuffer.wrap(palette).order(ByteOrder.LITTLE_ENDIAN);
        byte n10 = 6;
        i8_0[] i8_0Array = new i8_0[6];
        for (int n12 = 0; n12 < n10; n12++) {
            i8_0Array[n12] = new i8_0(XG0.hi0, n12 * 32, byteBuffer);
        }
        ByteBuffer byteBuffer2 = c20_0_.A0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer2.position(c20_0_.Gb);
        boolean isEncrypted = tx_1.T30(byteBuffer2, kd_2.Gu0) > 0;
        if (isEncrypted) {
            byteBuffer2 = ByteBuffer.wrap(tx_1.Gi(c20_0_.Gb, byteBuffer2)).order(ByteOrder.LITTLE_ENDIAN);
        }
        int n21 = 0;
        int n24 = 0;
        while (byteBuffer2.remaining() > 1) {
            int n25 = byteBuffer2.getShort();
            if (!isEncrypted && n25 == 0) {
                break;
            }
            int n15 = n25 & 1023;
            boolean n16 = (n25 & 1024) != 0;
            boolean n17 = (n25 & 2048) != 0;
            n25 = n25 >> 12 & 7;
            if (n25 == 4) {
                switch (n15) {
                    case 2:
                    case 3:
                    case 4:
                    case 13:
                    case 14:
                    case 42:
                    case 44:
                    case 58:
                    case 60:
                        if (vu) n25 = 5;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 15:
                    case 16:
                    case 23:
                    case 43:
                    case 45:
                    case 59:
                    case 61:
                        if (a9) n25 = 5;
                        break;
                    case 8:
                    case 9:
                    case 17:
                    case 18:
                    case 19:
                    case 70:
                    case 73:
                        if (fu0) n25 = 5;
                        break;
                    case 10:
                    case 11:
                    case 20:
                    case 21:
                    case 22:
                    case 69:
                    case 72:
                        if (hn) n25 = 5;
                        break;
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 71:
                    case 74:
                        if (o1) n25 = 5;
                        break;
                    default:
                        break;
                }
            }
            i8_0 i8_0_ = i8_0Array[n25];
            c20_0_.zp.xx0(i4_0_, n21, n24, n15, i8_0_, 0, n16, n17);
            n21 += 8;
            if (n21 >= n6) {
                n21 = 0;
                n24 += 8;
                if (n24 >= n7) {
                    break;
                }
            }
        }
        return i4_0_;
    }
}
