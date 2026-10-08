package f;

import cn.pokemmo.world.script.ScriptEngineVariableScope;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.ib0_0
 * 核心实现已迁移至 {@link cn.pokemmo.world.script.ScriptEngineVariableScope}
 */
public final class ib0_0 extends ScriptEngineVariableScope {
    public static final ib0_0 sh;
    public static final ib0_0 Ah0;
    public static final ib0_0 LpT4;
    public static final ib0_0 ms;
    public static final ib0_0 V70;
    public static final ib0_0[] rl;
    public static final bm0_1 yQ;
    public static final ib0_0[] Ie;

    public ib0_0(int type, int value) {
        super(type, value);
    }

    public static ib0_0 NV(byte value) {
        return (ib0_0) t_0.BI0(yQ.BM(value), ib0_0.class, value);
    }

    static {

        ib0_0 v0 = new ib0_0(0, 0);
        sh = v0;
        ib0_0 v1 = new ib0_0(1, 1);
        Ah0 = v1;
        ib0_0 v2 = new ib0_0(2, 2);
        LpT4 = v2;
        ib0_0 v3 = new ib0_0(3, 3);
        ms = v3;
        ib0_0 v4 = new ib0_0(4, 4);
        V70 = v4;
        Ie = new ib0_0[]{v0, v1, v2, v3, v4};
        rl = Ie.clone();
        yQ = new bm0_1();
        for (ib0_0 value : rl.clone()) {
            yQ.gE0(value.nH, value);
        }
        sh.getClass();
        Ah0.getClass();
        V70.getClass();
        LpT4.getClass();
        ms.getClass();
    
        ScriptEngineVariableScope.sh = sh;
        ScriptEngineVariableScope.Ah0 = Ah0;
        ScriptEngineVariableScope.LpT4 = LpT4;
        ScriptEngineVariableScope.ms = ms;
        ScriptEngineVariableScope.V70 = V70;
        ScriptEngineVariableScope.rl = rl;
        ScriptEngineVariableScope.yQ = yQ;
        ScriptEngineVariableScope.Ie = Ie;
    }
}
