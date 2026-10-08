package cn.pokemmo.rom.nds.model;

import f.db0_2;
import f.p2_0;
import java.nio.ByteBuffer;

/**
 * NDS 模型数据块数组记录
 */
public class NdsModelChunkArrayRecord {
    public final db0_2[] z00;

    public NdsModelChunkArrayRecord(int n, int n2, p2_0 p2_02, int n3, byte by, ByteBuffer byteBuffer) {
        byteBuffer.position(n);
        this.z00 = new db0_2[n3];
        for (int i = 0; i < n3; ++i) {
            int n4 = p2_02 == null ? 0 : p2_02.GL();
            this.z00[i] = new db0_2(i + n4, byteBuffer);
        }
    }

    public final db0_2[] lpt2() {
        return this.z00;
    }
}
