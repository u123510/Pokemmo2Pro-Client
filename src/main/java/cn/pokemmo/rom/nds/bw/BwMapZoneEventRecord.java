package cn.pokemmo.rom.nds.bw;

import f.nul__1;
import java.nio.ByteBuffer;

/**
 * 黑白版地图区域事件记录 (BW Map Zone Event Record)
 * <p>
 * 原始混淆类: {@code f.aa0_0}
 */
public class BwMapZoneEventRecord extends nul__1 {
    public BwMapZoneEventRecord(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        ByteBuffer byteBuffer3 = byteBuffer;
        byteBuffer3.getShort();
        byteBuffer3.getShort();
        byteBuffer3.getShort();
        byteBuffer3.getShort();
        byteBuffer3.getShort();
        byteBuffer3.getShort();
    }
}
