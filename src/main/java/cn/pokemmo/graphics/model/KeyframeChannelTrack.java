package cn.pokemmo.graphics.model;

import f.t70_0;
import java.nio.ByteBuffer;

/**
 * 关键帧通道轨道记录 (Keyframe Channel Track)
 * <p>
 * 原始混淆类: {@code f.m50}
 */
public class KeyframeChannelTrack {
    public final byte JU;
    public final short cE0;
    public final short OT;
    public final short jo0;
    public final short CON;
    public final short UN;
    public final short k4;
    public final short Z5;
    public final short QJ0;

    public KeyframeChannelTrack(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer;
        ByteBuffer byteBuffer5 = byteBuffer;
        byteBuffer5.getShort();
        this.JU = t70_0.PZ((byte) byteBuffer5.getShort());
        byteBuffer4.getShort();
        byteBuffer4.getShort();
        this.cE0 = byteBuffer4.getShort();
        this.OT = byteBuffer.getShort();
        this.jo0 = byteBuffer.getShort();
        byteBuffer3.getShort();
        byteBuffer3.getShort();
        this.CON = byteBuffer3.getShort();
        this.UN = byteBuffer.getShort();
        this.k4 = byteBuffer.getShort();
        this.Z5 = byteBuffer.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        this.QJ0 = byteBuffer2.getShort();
        byteBuffer.getShort();
    }
}
