package cn.pokemmo.graphics.model;

import java.nio.ByteBuffer;

/**
 * 关键帧骨骼动画轨道头 (Keyframe Bone Track Header)
 * <p>
 * 原始混淆类: {@code f.YN}
 */
public class KeyframeBoneTrackHeader {
    public final short Sh0;
    public final short Wi;
    public final short rH;
    public final short Xa0;
    public final short Ki;
    public final short UA;
    public final short sJ;
    public final short Com5;

    public KeyframeBoneTrackHeader(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        this.Sh0 = byteBuffer.getShort();
        this.Wi = byteBuffer.getShort();
        this.rH = byteBuffer.getShort();
        this.Xa0 = byteBuffer.getShort();
        this.Ki = byteBuffer.getShort();
        this.UA = byteBuffer.getShort();
        this.sJ = byteBuffer.getShort();
        this.Com5 = byteBuffer.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
    }
}
