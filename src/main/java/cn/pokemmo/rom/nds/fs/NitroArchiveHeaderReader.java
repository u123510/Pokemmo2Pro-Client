package cn.pokemmo.rom.nds.fs;

import java.nio.ByteBuffer;

/**
 * NDS Nitro/NARC 归档头解析工具 (Nitro Archive Header Reader)
 * <p>
 * 原始混淆类: {@code f.pf_0}
 */
public abstract class NitroArchiveHeaderReader {

    /**
     * 从指定偏移处读取 Nitro/NARC 归档头，返回 4 字节魔数 (如 "NARC" 0x4E415243 = 1129464142)
     *
     * @param byteBuffer 数据缓冲区
     * @param offset     头信息起始偏移
     * @return 归档魔数
     */
    public static int LPt2(ByteBuffer byteBuffer, int offset) {
        return readMagic(byteBuffer, offset);
    }

    public static int readMagic(ByteBuffer byteBuffer, int offset) {
        byteBuffer.position(offset);
        int magic = byteBuffer.getInt();
        byteBuffer.getShort(); // byteOrder (0xFFFE / 0xFEFF)
        byteBuffer.getShort(); // version
        byteBuffer.getInt();   // fileSize
        byteBuffer.getShort(); // headerSize
        byteBuffer.getShort(); // sectionCount
        return magic;
    }
}
