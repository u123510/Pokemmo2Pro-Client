package f;

import cn.pokemmo.constant.SevenByteOrientationRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.dn_1
 * 核心实现已迁移至 {@link cn.pokemmo.constant.SevenByteOrientationRegistry}
 */
public final class dn_1 extends SevenByteOrientationRegistry {
    public static final dn_1 sn;
    public static final dn_1 AR;
    public static final dn_1 vI;
    public static final dn_1 o2;
    public static final bm0_1 JR;
    public static final dn_1[] hs0;

    public dn_1(int i1, int i2) {
        super(i1, i2);
    }

    static {

        dn_1 d0 = new dn_1(0, 0);
        dn_1 d1 = new dn_1(1, 1);
        sn = d1;
        dn_1 d2 = new dn_1(2, 2);
        AR = d2;
        dn_1 d3 = new dn_1(3, 3);
        vI = d3;
        dn_1 d4 = new dn_1(4, 4);
        o2 = d4;
        dn_1 d5 = new dn_1(5, 5);
        dn_1 d6 = new dn_1(6, 6);
        hs0 = new dn_1[]{d0, d1, d2, d3, d4, d5, d6};
        JR = new bm0_1();
        dn_1[] clone = (dn_1[]) hs0.clone();
        for (dn_1 elem : clone) {
            JR.gE0(elem.NC, elem);
        }
        SevenByteOrientationRegistry.sn = sn;
        SevenByteOrientationRegistry.AR = AR;
        SevenByteOrientationRegistry.vI = vI;
        SevenByteOrientationRegistry.o2 = o2;
        SevenByteOrientationRegistry.JR = JR;
        SevenByteOrientationRegistry.hs0 = hs0;
    }
}
