package cn.pokemmo.rom.gba.map;

import java.nio.ByteBuffer;

/**
 * GBA 地图位置区块头记录 (GBA Map Location Header Record)
 * <p>
 * 原始混淆类: {@code f.hw_1}
 */
public class GbaMapLocationHeaderRecord {
    public GbaMapLocationHeaderRecord(byte by, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.get();
        byteBuffer2.get();
        byteBuffer2.get();
        byteBuffer2.get();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        if ((by | 1) == by) {
            ByteBuffer byteBuffer3 = byteBuffer;
            byteBuffer3.getShort();
            byteBuffer3.getShort();
            byteBuffer3.getShort();
            byteBuffer3.getShort();
        }
    }
}
