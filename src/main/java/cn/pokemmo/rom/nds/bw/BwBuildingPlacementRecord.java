package cn.pokemmo.rom.nds.bw;

import java.nio.ByteBuffer;

/**
 * 黑白版特殊建筑/区域坐标摆放记录 (BW Building Placement Record)
 * <p>
 * 原始混淆类: {@code f.YF0}
 */
public class BwBuildingPlacementRecord {
    public final int kt;
    public final float KI0;
    public final float Y70;

    public BwBuildingPlacementRecord(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer;
        byteBuffer4.position();
        this.kt = byteBuffer4.getInt();
        this.KI0 = (float) (byteBuffer.getShort() & 0xFFFF) / 65536.0f + (float) byteBuffer.getShort();
        byteBuffer3.getShort();
        byteBuffer3.getShort();
        this.Y70 = (float) (byteBuffer3.getShort() & 0xFFFF) / 65536.0f + (float) byteBuffer.getShort();
        byteBuffer2.position(byteBuffer2.position() + 20);
    }
}
