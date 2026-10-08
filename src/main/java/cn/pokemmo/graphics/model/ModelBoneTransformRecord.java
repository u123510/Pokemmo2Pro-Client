package cn.pokemmo.graphics.model;

import java.nio.ByteBuffer;

/**
 * 3D 模型骨骼变换记录 (Model Bone Transform Record)
 * <p>
 * 原始混淆类: {@code f.qa0_0}
 */
public class ModelBoneTransformRecord {
    public final short Jk;
    public final short SV;
    public final short o90;
    public final short V7;

    public ModelBoneTransformRecord(ByteBuffer byteBuffer) {
        this.Jk = byteBuffer.getShort();
        this.SV = byteBuffer.getShort();
        this.o90 = byteBuffer.getShort();
        this.V7 = byteBuffer.getShort();
    }

    public ModelBoneTransformRecord(short x, short y, short z, short w) {
        this.Jk = x;
        this.SV = y;
        this.o90 = z;
        this.V7 = w;
    }
}
