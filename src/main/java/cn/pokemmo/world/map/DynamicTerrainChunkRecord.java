package cn.pokemmo.world.map;

import f.C8;
import f.ld_0;
import java.nio.ByteBuffer;

/**
 * 动态地形区块数据记录 (Dynamic Terrain Chunk Record)
 * <p>
 * 原始混淆类: {@code f.Q90}
 */
public class DynamicTerrainChunkRecord {
    public final int pN;
    public final byte[] AV = new byte[4];
    public final int[] ev0 = new int[4];
    public final int[] VI = new int[4];
    public final C8 Kh;
    public final int cI;

    public DynamicTerrainChunkRecord(int n, ByteBuffer byteBuffer) {
        this.pN = n;
        byteBuffer.position();
        for (int i = 0; i < 4; ++i) {
            this.AV[i] = byteBuffer.get();
            byteBuffer.position(byteBuffer.position() + 3);
        }
        ld_0 filter = new ld_0();
        for (int j = 0; j < 4; ++j) {
            int val = byteBuffer.getInt();
            if (val != 0 && filter.l90(val)) {
                val = 0;
            }
            filter.Vn(val);
            this.ev0[j] = val;
        }
        for (int j = 0; j < 4; ++j) {
            this.VI[j] = byteBuffer.getInt() >> 4;
        }
        float y = (float) (byteBuffer.getShort() & 0xFFFF) / 65536.0f + (float) byteBuffer.getShort();
        this.Kh = new C8((float) (byteBuffer.getShort() & 0xFFFF) / 65536.0f + (float) byteBuffer.getShort(), y, (float) (byteBuffer.getShort() & 0xFFFF) / 65536.0f + (float) byteBuffer.getShort());
        this.cI = byteBuffer.getInt();
        byte[] byArray = new byte[48];
        byteBuffer.get(byArray);
    }
}
