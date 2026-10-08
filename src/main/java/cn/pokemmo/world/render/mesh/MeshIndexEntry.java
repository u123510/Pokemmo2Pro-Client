package cn.pokemmo.world.render.mesh;

import java.nio.ByteBuffer;

/**
 * 网格索引条目记录 (Mesh Index Entry)
 * <p>
 * 原始混淆类: {@code f.sk_1}
 */
public class MeshIndexEntry {
    public final short oe0;
    public final short Md;

    public MeshIndexEntry(ByteBuffer byteBuffer) {
        this.oe0 = byteBuffer.getShort();
        byteBuffer.getShort();
        this.Md = byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
    }

    public MeshIndexEntry(short id, short meshIndex) {
        this.oe0 = id;
        this.Md = meshIndex;
    }

    public short getId() {
        return this.oe0;
    }

    public short getMeshIndex() {
        return this.Md;
    }
}
