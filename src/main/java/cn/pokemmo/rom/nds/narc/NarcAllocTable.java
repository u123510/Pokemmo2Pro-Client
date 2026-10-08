package cn.pokemmo.rom.nds.narc;

import java.nio.ByteBuffer;

/**
 * NARC BTAF 子文件分配表解析器
 * 原混淆类: f.lo_2
 */
public class NarcAllocTable {
    public final int chunkOffset;
    public final int entryCount;

    // 兼容混淆字段别名
    public final int lz;
    public final int F10;

    public NarcAllocTable(ByteBuffer buffer) {
        this.chunkOffset = buffer.position();
        this.lz = this.chunkOffset;
        buffer.getInt(); // BTAF magic
        buffer.getInt(); // chunk size
        this.entryCount = buffer.getInt();
        this.F10 = this.entryCount;

        int currentPos = buffer.position();
        buffer.position(this.entryCount * 8 + currentPos);
    }
}
