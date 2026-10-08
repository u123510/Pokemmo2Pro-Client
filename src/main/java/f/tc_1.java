package f;

import cn.pokemmo.constant.ElevenByteIdRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.tc_1
 * 核心实现已迁移至 {@link cn.pokemmo.constant.ElevenByteIdRegistry}
 */
public final class tc_1 extends ElevenByteIdRegistry {
    public static final tc_1 dX;
    public static final tc_1 xm0;
    public static final tc_1 cD0;
    public static final bm0_1 rx0;
    public static final tc_1[] Kq0;

    public tc_1(int first, int second, int third) {
        super(first, second, third);
    }

    static {

        dX = new tc_1(0, 0, 1785);
        xm0 = new tc_1(1, 1, 1786);
        tc_1 value2 = new tc_1(2, 2, 1787);
        cD0 = new tc_1(3, 3, 1788);
        tc_1 value4 = new tc_1(4, 4, 1789);
        tc_1 value5 = new tc_1(5, 5, 1785);
        tc_1 value6 = new tc_1(6, 6, 1786);
        tc_1 value7 = new tc_1(7, 7, 1788);
        tc_1 value8 = new tc_1(8, 8, 1796);
        tc_1 value9 = new tc_1(9, 9, 1797);
        tc_1 value10 = new tc_1(10, 10, 1780);
        Kq0 = new tc_1[]{dX, xm0, value2, cD0, value4, value5, value6, value7, value8, value9, value10};
        rx0 = new bm0_1();
        tc_1[] values = Kq0.clone();
        for (tc_1 value : values) {
            rx0.gE0(value.Rl0, value);
        }
    
        ElevenByteIdRegistry.dX = dX;
        ElevenByteIdRegistry.xm0 = xm0;
        ElevenByteIdRegistry.cD0 = cD0;
        ElevenByteIdRegistry.rx0 = rx0;
        ElevenByteIdRegistry.Kq0 = Kq0;
    }
}
