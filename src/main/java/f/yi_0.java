package f;

import cn.pokemmo.constant.FiveByteStateCodeRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.yi_0
 * 核心实现已迁移至 {@link cn.pokemmo.constant.FiveByteStateCodeRegistry}
 */
public final class yi_0 extends FiveByteStateCodeRegistry {
    public static final yi_0 uI;
    public static final yi_0 L5;
    public static final yi_0 f1;
    public static final yi_0 eO;
    public static final yi_0 jc;
    public static final bm0_1 Yt0;
    public static final yi_0[] pI0;

    public yi_0(byte i1, int i2) {
        super(i1, i2);
    }

    static {

        yi_0 y0 = new yi_0((byte) 0, 0);
        uI = y0;
        yi_0 y1 = new yi_0((byte) 1, 1);
        L5 = y1;
        yi_0 y2 = new yi_0((byte) 2, 2);
        f1 = y2;
        yi_0 y3 = new yi_0((byte) 3, 3);
        eO = y3;
        yi_0 y4 = new yi_0((byte) 4, 4);
        jc = y4;
        pI0 = new yi_0[]{y0, y1, y2, y3, y4};
        Yt0 = new bm0_1();
        yi_0[] clone = (yi_0[]) pI0.clone();
        for (yi_0 elem : clone) {
            Yt0.gE0(elem.ql0, elem);
        }
    
        FiveByteStateCodeRegistry.uI = uI;
        FiveByteStateCodeRegistry.L5 = L5;
        FiveByteStateCodeRegistry.f1 = f1;
        FiveByteStateCodeRegistry.eO = eO;
        FiveByteStateCodeRegistry.jc = jc;
        FiveByteStateCodeRegistry.Yt0 = Yt0;
        FiveByteStateCodeRegistry.pI0 = pI0;
    }
}
