package cn.pokemmo.rom.nds.model;

import f.wm_1;
import java.nio.ByteBuffer;

/**
 * NDS ROM 二进制模型分块头部记录
 */
public class RomChunkHeaderRecord {
    public final short P40;
    public final short tH0;
    public final short Su0;
    public final short Dk0;
    public final short zj0;
    public final int z40;

    public RomChunkHeaderRecord(int n, wm_1 wm_12) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2 = byteBuffer = wm_12.AO();
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer;
        byteBuffer4.position(n - wm_12.O7);
        this.P40 = byteBuffer4.getShort();
        this.tH0 = byteBuffer.getShort();
        this.Su0 = byteBuffer.getShort();
        this.Dk0 = byteBuffer.getShort();
        byteBuffer3.getShort();
        this.zj0 = byteBuffer3.getShort();
        byteBuffer2.getInt();
        this.z40 = byteBuffer2.getInt();
        byteBuffer.getInt();
    }
}
