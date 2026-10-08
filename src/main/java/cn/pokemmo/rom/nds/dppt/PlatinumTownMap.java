package cn.pokemmo.rom.nds.dppt;

import f.Cq0;
import f.Lo0;
import f.Ts;
import f.dl_1;
import f.tx_1;
import f.uz_1;
import java.nio.ByteBuffer;

/**
 * 白金（Platinum）城镇地图数据解析器
 * 解析 /data/tmap_block.dat 与 /data/tmap_flags.dat
 */
public class PlatinumTownMap {
    public static final dl_1 eC0 = Cq0.E1(PlatinumTownMap.class);
    public static final int[][] my0;
    public final Ts If;
    public final uz_1[] lPT7;

    public PlatinumTownMap(Ts owner) {
        this.If = owner;
        ByteBuffer blocks = owner.nuL().COM7("/data/tmap_block.dat").j90();
        ByteBuffer flags = owner.nuL().COM7("/data/tmap_flags.dat").j90();
        int count = blocks.getInt();
        flags.getInt();
        this.lPT7 = new uz_1[count];

        ByteBuffer adjustments = owner.Gr();
        tx_1.qR(75301397, 1963133952, adjustments);
        short[][] table = new short[20][8];
        for (int row = 0; row < 20; row++) {
            for (int column = 0; column < 8; column++) {
                table[row][column] = adjustments.getShort();
            }
        }

        for (int index = 0; index < count; index++) {
            this.lPT7[index] = new uz_1((Lo0) this, blocks, flags);
            for (byte row = 0; row < 20; row++) {
                uz_1 block = this.lPT7[index];
                short[] values = table[row];
                if (block.Yr0 == values[3]
                        && (row != 19 || block.fQ == 17)
                        && (row != 14 || block.fQ == 18)) {
                    block.rt0(row, (short) (values[7] + 2480));
                }
            }
        }

        if (blocks.remaining() != 0 || flags.remaining() != 0) {
            eC0.error("PlatinumTownMap has more data to be read {} | {} !",
                    Integer.valueOf(blocks.remaining()), Integer.valueOf(flags.remaining()));
        }
    }

    public static Ts X9(Lo0 value) {
        return value.If;
    }

    public uz_1[] getEntries() {
        return this.lPT7;
    }

    public Ts getOwner() {
        return this.If;
    }

    static {
        my0 = new int[32][32];
        my0[5][26] = 1;
        my0[3][27] = 1;
        my0[14][16] = 1;
        my0[20][10] = 1;
        my0[25][14] = 1;
        my0[26][17] = 1;
        my0[9][16] = 4;
        my0[19][13] = 6;
        my0[17][20] = 6;
        my0[26][18] = 7;
        my0[9][28] = 7;
        my0[1][22] = 2;
        my0[9][23] = 2;
        my0[5][19] = 2;
        my0[11][6] = 2;
        my0[4][23] = 3;
        my0[14][21] = 3;
        my0[21][18] = 3;
        my0[18][25] = 3;
        my0[26][23] = 3;
    }
}
