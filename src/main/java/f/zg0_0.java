package f;

import cn.pokemmo.battle.BattleEnvironment;
import java.util.stream.Stream;

/**
 * 战场环境兼容垫片
 * 核心业务已重构迁移至 cn.pokemmo.battle.BattleEnvironment
 */
public final class zg0_0 extends BattleEnvironment {
    public static final zg0_0 ns;
    public static final zg0_0 ot;
    public static final zg0_0 ef0;
    public static final zg0_0 Bc0;
    public static final zg0_0 oi;
    public static final zg0_0 ku0;
    public static final bm0_1 pQ;

    public zg0_0(byte value, boolean enabled) {
        super(value, enabled);
    }

    public static void ji0(zg0_0 value) {
        pQ.gE0(value.yd, value);
    }

    static {
        zg0_0 v0 = new zg0_0((byte) -2, false);
        ns = v0;
        zg0_0 v1 = new zg0_0((byte) -1, false);
        zg0_0 v2 = new zg0_0((byte) 0, false);
        ot = v2;
        zg0_0 v3 = new zg0_0((byte) 1, false);
        zg0_0 v4 = new zg0_0((byte) 2, false);
        zg0_0 v5 = new zg0_0((byte) 3, false);
        zg0_0 v6 = new zg0_0((byte) 4, false);
        zg0_0 v7 = new zg0_0((byte) 5, false);
        zg0_0 v8 = new zg0_0((byte) 6, false);
        zg0_0 v9 = new zg0_0((byte) 7, true);
        ef0 = v9;
        zg0_0 v10 = new zg0_0((byte) 8, false);
        Bc0 = v10;
        zg0_0 v11 = new zg0_0((byte) 9, true);
        oi = v11;
        zg0_0 v12 = new zg0_0((byte) 10, false);
        zg0_0 v13 = new zg0_0((byte) 11, false);
        zg0_0 v14 = new zg0_0((byte) 12, false);
        zg0_0 v15 = new zg0_0((byte) 13, false);
        ku0 = v15;
        zg0_0[] values = new zg0_0[]{v0, v1, v2, v3, v4, v5, v6, v7,
                v8, v9, v10, v11, v12, v13, v14, v15}.clone();
        pQ = new bm0_1();
        Stream.of(values).forEach(zg0_0::ji0);
    }
}
