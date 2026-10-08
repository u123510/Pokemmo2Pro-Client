package cn.pokemmo.rom.gba.offset;

import cn.pokemmo.rom.gba.util.GbaRomAddressUtil;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * GBA ROM 静态指针间接寻址解析器
 * 
 * 职责:
 * 定位指定偏移处存储的 32 位 ARM 指针，读取并转换成实际的物理文件偏移。
 * 
 * 原混淆类: f.yv0
 */
public class GbaPointerOffsetResolver extends GbaRomOffsetResolver {
    public final int TV;
    public int zo0 = -1;

    public GbaPointerOffsetResolver(int pointerLocation) {
        this.TV = pointerLocation;
    }

    @Override
    public final int uO(qa0_1 rom) {
        if (this.zo0 != -1) {
            return this.zo0;
        }
        ByteBuffer byteBuffer = rom.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position(this.TV);
        int ptr = byteBuffer.getInt();
        if (GbaRomAddressUtil.isRomAddress(ptr)) {
            this.zo0 = GbaRomAddressUtil.toPhysicalOffset(ptr);
            return this.zo0;
        }
        throw new RuntimeException("Invalid Offset");
    }
}
