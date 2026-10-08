package f;

import cn.pokemmo.battle.BattleFieldZoneConfig;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.XA0
 * 核心实现已迁移至 {@link cn.pokemmo.battle.BattleFieldZoneConfig}
 */
public final class XA0 extends BattleFieldZoneConfig {
    public static final XA0 Ct0;
    public static final XA0 Pb;
    public static final XA0 pS;
    public static final XA0 PRN;
    public static final XA0 af0;
    public static final XA0 at;
    public static final XA0 Fz;
    public static final bm0_1 kN;

    public XA0(int value) {
        super(value);
    }

    static {

        XA0 v0 = new XA0(0);
        Ct0 = v0;
        XA0 v1 = new XA0(1);
        Pb = v1;
        XA0 v2 = new XA0(2);
        pS = v2;
        XA0 v3 = new XA0(3);
        XA0 v4 = new XA0(4);
        PRN = v4;
        XA0 v5 = new XA0(6);
        XA0 v6 = new XA0(7);
        XA0 v7 = new XA0(9);
        XA0 v8 = new XA0(10);
        XA0 v9 = new XA0(11);
        af0 = v9;
        XA0 v10 = new XA0(12);
        XA0 v11 = new XA0(13);
        at = v11;
        XA0 v12 = new XA0(14);
        Fz = v12;
        XA0 v13 = new XA0(15);
        d70_0.Do.getClass();
        kN = new bm0_1();
        XA0[] values = {v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13};
        for (XA0 value : values) {
            kN.gE0(value.Uk, value);
        }
    
        BattleFieldZoneConfig.Ct0 = Ct0;
        BattleFieldZoneConfig.Pb = Pb;
        BattleFieldZoneConfig.pS = pS;
        BattleFieldZoneConfig.PRN = PRN;
        BattleFieldZoneConfig.af0 = af0;
        BattleFieldZoneConfig.at = at;
        BattleFieldZoneConfig.Fz = Fz;
        BattleFieldZoneConfig.kN = kN;
    }
}
