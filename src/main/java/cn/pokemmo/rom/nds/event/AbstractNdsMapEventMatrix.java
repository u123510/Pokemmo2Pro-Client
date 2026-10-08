package cn.pokemmo.rom.nds.event;

import f.Ae;
import f.l50_0;
import java.nio.ByteBuffer;

/**
 * NDS 地图事件与脚本矩阵抽象基类
 * 
 * 职责:
 * 管理 NDS 地图事件分块、二进制事件切片、以及心金魂银特别地图 (Map 571) 的脚本补丁解密。
 * 
 * 原混淆类: f.ab0 / ab0_2
 */
public abstract class AbstractNdsMapEventMatrix {
    public static final byte[] Nb0;
    public final l50_0 H50;
    public final short M2;
    public final Ae il;
    public int qB0 = 0;
    public int N70 = 0;
    public int p90;
    public int vW;
    public int[] mc0;
    public int eo;

    public AbstractNdsMapEventMatrix(l50_0 rom, short mapId, Ae file) {
        this.H50 = rom;
        this.M2 = mapId;
        this.il = file;
    }

    public AbstractNdsMapEventMatrix(AbstractNdsMapEventMatrix other) {
        this.H50 = other.H50;
        this.M2 = other.M2;
        this.il = other.il;
        this.qB0 = other.qB0;
        this.N70 = other.N70;
        this.p90 = other.p90;
        this.vW = other.vW;
        this.mc0 = other.mc0;
        this.eo = other.eo;
    }

    static {
        byte[] byArray = new byte[132];
        byte[] byArray2 = byArray;
        byArray[0] = -83;
        byArray2[1] = 8;
        byArray2[2] = -120;
        byArray2[3] = 17;
        byArray2[4] = -124;
        byArray2[5] = 51;
        byArray2[6] = -126;
        byArray2[7] = 17;
        byArray2[8] = -116;
        byArray2[9] = -40;
        byArray2[10] = -86;
        byArray2[11] = 1;
        byArray2[12] = -120;
        byArray2[13] = -40;
        byArray2[14] = 100;
        byArray2[15] = 34;
        byArray2[16] = -118;
        byArray2[17] = 1;
        byArray2[18] = 100;
        byArray2[19] = 2;
        byArray2[20] = 46;
        byArray2[21] = -4;
        byArray2[22] = -16;
        byArray2[23] = 0;
        byArray2[24] = 9;
        byArray2[25] = 38;
        byArray2[26] = -8;
        byArray2[27] = -20;
        byArray2[28] = 8;
        byArray2[29] = 0;
        byArray2[30] = -12;
        byArray2[31] = 37;
        byArray2[32] = -8;
        byArray2[33] = -16;
        byArray2[34] = 9;
        byArray2[35] = 1;
        byArray2[36] = -91;
        byArray2[37] = 24;
        byArray2[38] = -128;
        byArray2[39] = 1;
        byArray2[40] = -116;
        byArray2[41] = 34;
        byArray2[42] = -118;
        byArray2[43] = 1;
        byArray2[44] = -116;
        byArray2[45] = -20;
        byArray2[46] = -86;
        byArray2[47] = 1;
        byArray2[48] = -120;
        byArray2[49] = -20;
        byArray2[50] = -86;
        byArray2[51] = 0;
        byArray2[52] = 120;
        byArray2[53] = 37;
        byArray2[54] = -4;
        byArray2[55] = -12;
        byArray2[56] = 8;
        byArray2[57] = 0;
        byArray2[58] = 45;
        byArray2[59] = -16;
        byArray2[60] = -8;
        byArray2[61] = 0;
        byArray2[62] = 8;
        byArray2[63] = 37;
        byArray2[64] = -16;
        byArray2[65] = -8;
        byArray2[66] = 8;
        byArray2[67] = 1;
        byArray2[68] = -83;
        byArray2[69] = -4;
        byArray2[70] = 100;
        byArray2[71] = 1;
        byArray2[72] = -120;
        byArray2[73] = 0;
        byArray2[74] = 116;
        byArray2[75] = 37;
        byArray2[76] = 112;
        byArray2[77] = -8;
        byArray2[78] = -120;
        byArray2[79] = 0;
        byArray2[80] = -83;
        byArray2[81] = -32;
        byArray2[82] = 104;
        byArray2[83] = 0;
        byArray2[84] = -120;
        byArray2[85] = 52;
        byArray2[86] = -116;
        byArray2[87] = 28;
        byArray2[88] = -120;
        byArray2[89] = 0;
        byArray2[90] = -91;
        byArray2[91] = 12;
        byArray2[92] = -124;
        byArray2[93] = 0;
        byArray2[94] = -120;
        byArray2[95] = 37;
        byArray2[96] = 124;
        byArray2[97] = -12;
        byArray2[98] = -120;
        byArray2[99] = 0;
        byArray2[100] = -83;
        byArray2[101] = 20;
        byArray2[102] = -124;
        byArray2[103] = 0;
        byArray2[104] = -120;
        byArray2[105] = 37;
        byArray2[106] = 100;
        byArray2[107] = -20;
        byArray2[108] = -120;
        byArray2[109] = 0;
        byArray2[110] = 8;
        byArray2[111] = -4;
        byArray2[112] = -83;
        byArray2[113] = -36;
        byArray2[114] = 84;
        byArray2[115] = 0;
        byArray2[116] = -119;
        byArray2[117] = 53;
        byArray2[118] = 116;
        byArray2[119] = -4;
        byArray2[120] = -119;
        byArray2[121] = 16;
        byArray2[122] = -83;
        byArray2[123] = -16;
        byArray2[124] = 120;
        byArray2[125] = 0;
        byArray2[126] = -120;
        byArray2[127] = 37;
        byArray2[128] = -44;
        byArray2[129] = -36;
        byArray2[130] = 8;
        byArray2[131] = 1;
        Nb0 = byArray2;
    }

    public abstract void nk();

    public final short sK0() {
        return this.M2;
    }

    public final Ae Xy0() {
        return this.il;
    }

    public final int TM() {
        return this.eo;
    }

    public final ByteBuffer GE() {
        this.nk();
        ByteBuffer byteBuffer = this.il.MH(false);
        byteBuffer.position(this.vW);
        if (this.H50.Tz() == 3 && this.M2 == 571) {
            byteBuffer.position(this.vW + 25401);
            byte by = byteBuffer.get();
            byteBuffer.position(byteBuffer.position() + 7);
            byte by2 = byteBuffer.get();
            byteBuffer.position(byteBuffer.position() + 7);
            byte by3 = byteBuffer.get();
            byteBuffer.position(byteBuffer.position() + 7);
            byte by4 = byteBuffer.get();
            if (by == -120 && by2 == 0 && by3 == -128 && by4 == 16) {
                byteBuffer.position(0);
                ByteBuffer byteBuffer5 = ByteBuffer.allocate(byteBuffer.limit()).order(byteBuffer.order());
                byteBuffer5.put(byteBuffer);
                byteBuffer5.position(this.vW + 25401);
                int n = 0;
                while (true) {
                    byte[] byArray = Nb0;
                    if (n >= 132) break;
                    byteBuffer5.put((byte) (byteBuffer5.get(byteBuffer5.position()) ^ byArray[n]));
                    byteBuffer5.position(byteBuffer5.position() + 7);
                    ++n;
                }
                byteBuffer = byteBuffer5;
            }
            byteBuffer.position(this.vW);
        }
        return byteBuffer;
    }
}
