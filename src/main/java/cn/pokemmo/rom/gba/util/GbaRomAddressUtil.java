package cn.pokemmo.rom.gba.util;

/**
 * GBA ROM 内存虚拟地址与物理文件偏移转换工具
 * 
 * 职责:
 * GBA 卡带只读内存在 ARM7 架构下映射于 0x08000000 起始的物理空间。
 * 本工具负责校验指针合法性，并完成 0x08xxxxxx 虚拟地址与 ROM 内部实际字节偏移的映射转换。
 * 
 * 原混淆类: f.G90
 */
public abstract class GbaRomAddressUtil {
    public static final int GBA_ROM_BASE_ADDRESS = 0x08000000;
    public static final int GBA_ROM_ADDRESS_MASK = 0xFF000000;

    /**
     * 将 GBA 内存虚拟地址转换为物理文件偏移
     */
    public static int toPhysicalOffset(int virtualAddress) {
        if ((virtualAddress & GBA_ROM_ADDRESS_MASK) == GBA_ROM_BASE_ADDRESS) {
            return virtualAddress & 0xF7FFFFFF;
        }
        return 0;
    }

    /**
     * 判断给定地址是否落在 GBA ROM 只读内存映射区
     */
    public static boolean isRomAddress(int virtualAddress) {
        return (virtualAddress & GBA_ROM_ADDRESS_MASK) == GBA_ROM_BASE_ADDRESS;
    }

    // 混淆方法别名兼容
    public static int GF0(int n) {
        return toPhysicalOffset(n);
    }

    public static boolean Uh0(int n) {
        return isRomAddress(n);
    }
}
