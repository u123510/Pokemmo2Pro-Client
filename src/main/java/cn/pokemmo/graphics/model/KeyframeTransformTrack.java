package cn.pokemmo.graphics.model;

import java.nio.ByteBuffer;

/**
 * 关键帧空间变换轨道记录 (Keyframe Transform Track)
 * <p>
 * 原始混淆类: {@code f.NG0}
 */
public class KeyframeTransformTrack {
    public final short sa0;
    public final short Sa0;
    public final short zl0;
    public final short fO;
    public final short vf0;
    public final short W7;
    public final short YH;

    public KeyframeTransformTrack(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer;
        this.sa0 = byteBuffer.getShort();
        this.Sa0 = byteBuffer.getShort();
        this.zl0 = byteBuffer.getShort();
        byteBuffer4.getShort();
        byteBuffer4.getShort();
        this.fO = byteBuffer4.getShort();
        this.vf0 = byteBuffer.getShort();
        this.W7 = byteBuffer.getShort();
        byteBuffer3.getShort();
        this.YH = byteBuffer3.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
    }
}
