package cn.pokemmo.rom.nds.narc;

import cn.pokemmo.rom.nds.base.AbstractNdsRom;
import f.Ae;
import f.GA;
import f.np_1;
import f.un0_0;
import f.vh_1;
import java.nio.ByteBuffer;
import java.util.Iterator;

/**
 * NARC (Nitro ARChive) 归档解析器
 * 提供子文件计数、按索引切片提取以及迭代器支持。
 * 原混淆类: f.FJ
 */
public class NarcArchive extends vh_1 {
    public final AbstractNdsRom rom;
    public final ByteBuffer buffer;
    public final NarcAllocTable allocTable;
    public final int gmifDataOffset;

    // 兼容混淆字段别名
    public final AbstractNdsRom LPT9;
    public final ByteBuffer hq;
    public final NarcAllocTable AC;
    public final int BZ;

    public NarcArchive(Ae source) {
        this.xX = "";
        this.qS = 0;

        this.rom = source.zv0();
        this.LPT9 = this.rom;

        ByteBuffer buf = this.rom.Mr0();
        this.buffer = buf;
        this.hq = buf;
        buf.position(source.bM0);

        new NarcHeader(buf).validate(1129464142);
        this.allocTable = new NarcAllocTable(buf);
        this.AC = this.allocTable;

        buf.getInt(); // BTNF magic / size
        int dataLength = buf.getInt();
        this.gmifDataOffset = buf.position() + dataLength;
        this.BZ = this.gmifDataOffset;
    }

    @Override
    public int size() {
        return this.allocTable.entryCount;
    }

    @Override
    public Ae EG(int index) {
        return getFile(index);
    }

    @Override
    public Iterator iterator() {
        return new Iterator<Ae>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < allocTable.entryCount;
            }
            @Override
            public Ae next() {
                return getFile(index++);
            }
        };
    }

    public Ae getFile(int index) {
        if (index < 0 || index >= this.allocTable.entryCount) {
            return new Ae(this.rom, Integer.toString(index), 0, 0, (short) index);
        }
        int relativeOffset = index * 8;
        int dataOffset = this.buffer.getInt(this.allocTable.chunkOffset + 12 + relativeOffset);
        int dataEnd = GA.m1(this.allocTable.chunkOffset, 16, relativeOffset, this.buffer);
        int start = dataOffset + this.gmifDataOffset;
        int length = dataEnd - dataOffset;

        String name = index < 400 ? un0_0.DB0[index] : Integer.toString(index);
        Ae result = new Ae(this.rom, name, start, length, (short) index);
        result.kd = "";
        return result;
    }

    public final Ae GJ(int index) {
        return getFile(index);
    }
}
