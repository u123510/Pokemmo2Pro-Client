package cn.pokemmo.rom.nds.dppt;

import f.nul__1;
import java.nio.ByteBuffer;

/**
 * 珍钻/白金版地图区域事件记录 (DPPT Map Zone Event Record)
 * <p>
 * 原始混淆类: {@code f.eu_0}
 */
public class DpptMapZoneEventRecord extends nul__1 {
    public DpptMapZoneEventRecord(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
    }
}
