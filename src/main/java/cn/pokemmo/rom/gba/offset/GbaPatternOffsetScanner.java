package cn.pokemmo.rom.gba.offset;

import cn.pokemmo.rom.gba.util.GbaRomAddressUtil;
import f.Cq0;
import f.dl_1;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * GBA ROM 十六进制特征码模式扫描解析器 (带指针解引用)
 * 
 * 职责:
 * 通过 16 进制特征字节序列（支持 "XX" 通配符模糊匹配），在整个 ROM 二进制流中快速查找目标模式，
 * 并读取指定相对位置上的 32 位 ARM 虚拟指针，解引用得到最终的数据表物理偏移。
 * 
 * 原混淆类: f.bw_0
 */
public class GbaPatternOffsetScanner extends GbaRomOffsetResolver {
    public static final dl_1 Gi0 = Cq0.E1(GbaPatternOffsetScanner.class);
    public final byte[] Pw;
    public final boolean[] ex0;
    public final boolean Tv;
    public final int S40;
    public final int DC0;
    public int mG = -1;

    public GbaPatternOffsetScanner(String pattern, int offset, boolean before) {
        this(before, pattern, offset, 0);
    }

    public GbaPatternOffsetScanner(boolean before, String pattern, int offset, int occurrences) {
        int length = pattern.length() / 2;
        this.ex0 = new boolean[length];
        this.Pw = new byte[length];
        for (int index = 0; index < length; index++) {
            String part = pattern.substring(index * 2, (index + 1) * 2);
            if (part.equals("XX")) {
                this.ex0[index] = true;
            } else {
                this.Pw[index] = (byte) Integer.parseInt(part, 16);
            }
        }
        this.Tv = before;
        this.S40 = offset;
        this.DC0 = occurrences;
    }

    @Override
    public int uO(qa0_1 archive) {
        if (this.mG != -1) {
            return this.mG;
        }
        ByteBuffer data = archive.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        byte[] bytes;
        if (data.hasArray()) {
            bytes = data.array();
        } else {
            bytes = new byte[data.limit()];
            data.get(bytes);
            Gi0.error("Slow search", new RuntimeException());
        }
        int match = -1;
        for (int occurrence = 0; occurrence <= this.DC0; occurrence++) {
            match++;
            int patternIndex = 0;
            while (match < bytes.length) {
                if (patternIndex > 0 && !this.ex0[patternIndex] && this.Pw[patternIndex] != bytes[match]) {
                    patternIndex = 0;
                }
                if (this.ex0[patternIndex] || this.Pw[patternIndex] == bytes[match]) {
                    patternIndex++;
                }
                if (patternIndex == this.Pw.length) {
                    match = match - this.Pw.length + 1;
                    break;
                }
                match++;
            }
            if (match < 0) {
                throw new RuntimeException("Invalid Offset");
            }
        }
        int position = this.Tv ? match - this.S40 - 4 : match + this.Pw.length + this.S40;
        int value = data.position(position).getInt();
        if (!GbaRomAddressUtil.isRomAddress(value)) {
            throw new RuntimeException("Invalid Offset");
        }
        this.mG = GbaRomAddressUtil.toPhysicalOffset(value);
        return this.mG;
    }
}
