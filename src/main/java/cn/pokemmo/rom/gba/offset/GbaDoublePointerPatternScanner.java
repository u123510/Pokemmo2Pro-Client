package cn.pokemmo.rom.gba.offset;

import cn.pokemmo.rom.gba.util.GbaRomAddressUtil;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * GBA ROM 双层指针特征码扫描解析器
 * 
 * 职责:
 * 在 GbaPatternOffsetScanner 的基础上执行二级指针解引用。
 * 
 * 原混淆类: f.ar_1
 */
public class GbaDoublePointerPatternScanner extends GbaPatternOffsetScanner {
    public int t9 = -1;

    public GbaDoublePointerPatternScanner(String pattern, int offset) {
        super(pattern, offset, false);
    }

    @Override
    public final int uO(qa0_1 rom) {
        if (this.t9 != -1) {
            return this.t9;
        }
        ByteBuffer byteBuffer = rom.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position(super.uO(rom));
        int ptr = byteBuffer.getInt();
        if (GbaRomAddressUtil.isRomAddress(ptr)) {
            this.t9 = GbaRomAddressUtil.toPhysicalOffset(ptr);
            return this.t9;
        }
        throw new RuntimeException("Invalid Offset");
    }
}
