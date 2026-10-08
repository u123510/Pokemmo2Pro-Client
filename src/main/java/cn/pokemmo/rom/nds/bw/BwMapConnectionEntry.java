package cn.pokemmo.rom.nds.bw;

import java.nio.ByteBuffer;

/**
 * 黑白版地图连接数据记录 (BW Map Connection Entry)
 * <p>
 * 原始混淆类: {@code f.qg0_0}
 */
public class BwMapConnectionEntry {
    public final short[] Y3;

    public BwMapConnectionEntry(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        this.Y3 = new short[5];
        byteBuffer2.getShort();
        byteBuffer2.get();
        byteBuffer2.get();
        for (int n = 0; n < this.Y3.length; ++n) {
            this.Y3[n] = byteBuffer.getShort();
        }
        byteBuffer.getShort();
    }
}
