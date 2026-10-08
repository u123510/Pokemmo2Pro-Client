package cn.pokemmo.rom.nds.narc;

import java.nio.ByteBuffer;

/**
 * NARC 归档头部校验器
 * 原混淆类: f.Rz0
 */
public class NarcHeader {
    public final int magic;
    public final int fileSize;
    public final short headerSize;
    public final short chunkCount;

    // 兼容混淆字段别名
    public final int coM6;
    public final int kh0;
    public final short H20;
    public final short rv0;

    public NarcHeader(ByteBuffer buffer) {
        this.magic = buffer.getInt();
        this.coM6 = this.magic;
        buffer.getShort(); // byte order
        buffer.getShort(); // version
        this.fileSize = buffer.getInt();
        this.kh0 = this.fileSize;
        this.headerSize = buffer.getShort();
        this.H20 = this.headerSize;
        this.chunkCount = buffer.getShort();
        this.rv0 = this.chunkCount;
    }

    public void validate(int expectedMagic) {
        if (this.magic != expectedMagic) {
            throw new RuntimeException("Header magic mismatch = " + this.magic + " vs expected " + expectedMagic);
        }
    }

    public final void Kn(int expectedMagic) {
        validate(expectedMagic);
    }
}
