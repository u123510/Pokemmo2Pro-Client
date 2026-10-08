package cn.pokemmo.graphics.model;

import java.nio.ByteBuffer;

/**
 * 关键帧网格采样数据记录 (Keyframe Mesh Sample)
 * <p>
 * 原始混淆类: {@code f.ax_1}
 */
public class KeyframeMeshSample {
    public final int Dj0;
    public final short LA;
    public final short z6;
    public final short LPT2;
    public final short J6;

    public KeyframeMeshSample(ByteBuffer byteBuffer) {
        this.Dj0 = byteBuffer.getInt();
        this.LA = byteBuffer.getShort();
        this.z6 = byteBuffer.getShort();
        this.LPT2 = byteBuffer.getShort();
        this.J6 = byteBuffer.getShort();
    }

    public KeyframeMeshSample(int frame, short x, short y, short z, short flag) {
        this.Dj0 = frame;
        this.LA = x;
        this.z6 = y;
        this.LPT2 = z;
        this.J6 = flag;
    }
}
