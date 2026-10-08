package cn.pokemmo.rom.nds.bw;

import f.FJ;
import f.hb_1;
import java.nio.ByteBuffer;

/**
 * 黑白版地图点数据块表 (BW Map Point Data Block Table)
 * <p>
 * 从 NARC 归档 {@link FJ} 中批量读取各分区的地图点数据块头信息 {@link hb_1}。
 * <p>
 * 原始混淆类: {@code f.D9}
 */
public class BwMapPointDataBlockTable {
    public final hb_1[] Vo0;

    public BwMapPointDataBlockTable(FJ narcArchive) {
        this.Vo0 = new hb_1[narcArchive.size()];
        for (int j = 0; j < this.Vo0.length; ++j) {
            ByteBuffer buffer = narcArchive.EG(j).j90();
            this.Vo0[j] = new hb_1(j, buffer);
        }
    }

    public hb_1[] getHeaders() {
        return this.Vo0;
    }

    public hb_1[] Vo() {
        return this.Vo0;
    }
}
