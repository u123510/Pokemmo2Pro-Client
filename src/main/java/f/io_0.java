package f;

import cn.pokemmo.constant.ThreeByteCodeTable;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.io_0
 * 核心实现已迁移至 {@link cn.pokemmo.constant.ThreeByteCodeTable}
 */
public final class io_0 extends ThreeByteCodeTable {
    public static final io_0 L0;
    public static final io_0 kj0;
    public static final bm0_1 UP;

    public io_0(byte i1) {
        super(i1);
    }

    public static io_0 WB0(int i0) {
        bm0_1 map = UP;
        byte b = (byte) i0;
        if (map.dg(b)) {
            return (io_0) map.BM(b);
        }
        return null;
    }

    static {
        io_0 i0 = new io_0((byte) 0);
        L0 = i0;
        io_0 i1 = new io_0((byte) 1);
        kj0 = i1;
        io_0 i2 = new io_0((byte) 2);
        io_0[] arr = new io_0[]{i0, i1, i2};
        io_0[] clone = (io_0[]) arr.clone();
        UP = new bm0_1();
        for (io_0 elem : clone) {
            UP.gE0(elem.t8, elem);
        }
        ThreeByteCodeTable.L0 = i0;
        ThreeByteCodeTable.kj0 = i1;
        ThreeByteCodeTable.UP = UP;
    }
}
