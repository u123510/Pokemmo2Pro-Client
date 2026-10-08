package f;

import cn.pokemmo.constant.BattleTurnPhaseRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.ry_0
 * 核心实现已迁移至 {@link cn.pokemmo.constant.BattleTurnPhaseRegistry}
 */
public final class ry_0 extends BattleTurnPhaseRegistry {
    public static final ry_0 J30;
    public static final ry_0 hq;
    public static final ry_0 Rz0;
    public static final ry_0 zm;
    public static final ry_0 w30;
    public static final ry_0[] da;
    public static final ry_0[] dI;

    public ry_0(int i1, int i2) {
        super(i1, i2);
    }

    static {

        J30 = new ry_0(0, 0);
        hq = new ry_0(1, 1);
        Rz0 = new ry_0(2, 2);
        zm = new ry_0(3, 3);
        w30 = new ry_0(4, 4);
        ry_0[] arr = new ry_0[]{J30, hq, Rz0, zm, w30};
        dI = arr;
        da = (ry_0[]) arr.clone();
    
        BattleTurnPhaseRegistry.J30 = J30;
        BattleTurnPhaseRegistry.hq = hq;
        BattleTurnPhaseRegistry.Rz0 = Rz0;
        BattleTurnPhaseRegistry.zm = zm;
        BattleTurnPhaseRegistry.w30 = w30;
        BattleTurnPhaseRegistry.da = da;
        BattleTurnPhaseRegistry.dI = dI;
    }
}
