package cn.pokemmo.rom.nds.bw;

import java.nio.ByteBuffer;

/**
 * 黑白版世界地图点二进制数据头 (BW World Map Point Header)
 * <p>
 * 原始混淆类: {@code f.wa_0}
 */
public class BwWorldMapPointHeader {
    public final int Hy0;
    public final short ZO;
    public final short sA;
    public final float su;

    public BwWorldMapPointHeader(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer;
        ByteBuffer byteBuffer5 = byteBuffer;
        byteBuffer5.position();
        this.Hy0 = byteBuffer5.getInt();
        this.ZO = byteBuffer.getShort();
        byteBuffer4.getShort();
        this.sA = byteBuffer4.getShort();
        byteBuffer3.getShort();
        this.su = (float) (byteBuffer3.getShort() & 0xFFFF) / 65536.0f + (float) byteBuffer.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getInt();
        byteBuffer2.getInt();
    }
}
