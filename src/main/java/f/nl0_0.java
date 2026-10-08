package f;

import cn.pokemmo.constant.FiveByteIdRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.nl0_0
 * 核心实现已迁移至 {@link cn.pokemmo.constant.FiveByteIdRegistry}
 */
public final class nl0_0 extends FiveByteIdRegistry {
    public static final nl0_0 eu0;
    public static final nl0_0 x8;
    public static final nl0_0 rB;
    public static final nl0_0 Sg;
    public static final bm0_1 Fd;

    public nl0_0(byte i1) {
        super(i1);
    }

    static {

        nl0_0 n0 = new nl0_0((byte) 0);
        eu0 = n0;
        nl0_0 n1 = new nl0_0((byte) 1);
        nl0_0 n2 = new nl0_0((byte) 2);
        x8 = n2;
        nl0_0 n3 = new nl0_0((byte) 3);
        rB = n3;
        nl0_0 n4 = new nl0_0((byte) 99);
        Sg = n4;
        nl0_0[] arr = new nl0_0[]{n0, n1, n2, n3, n4};
        Fd = new bm0_1();
        nl0_0[] clone = (nl0_0[]) arr.clone();
        for (nl0_0 elem : clone) {
            Fd.gE0(elem.Com3, elem);
        }
    
        FiveByteIdRegistry.eu0 = eu0;
        FiveByteIdRegistry.x8 = x8;
        FiveByteIdRegistry.rB = rB;
        FiveByteIdRegistry.Sg = Sg;
        FiveByteIdRegistry.Fd = Fd;
    }
}
