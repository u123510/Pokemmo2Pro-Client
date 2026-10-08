package cn.pokemmo.world.script;

import f.*;

public class ScriptEngineVariableScope {
    public static ScriptEngineVariableScope sh;
    public static ScriptEngineVariableScope Ah0;
    public static ScriptEngineVariableScope LpT4;
    public static ScriptEngineVariableScope ms;
    public static ScriptEngineVariableScope V70;
    public static ScriptEngineVariableScope[] rl;
    public static bm0_1 yQ;
    public static ScriptEngineVariableScope[] Ie;
    public final byte nH;
    public final int ku0;

    public ScriptEngineVariableScope(int type, int value) {
        this.ku0 = value;
        this.nH = (byte) type;
    }

    public static ib0_0 NV(byte value) {
        return (ib0_0) t_0.BI0(yQ.BM(value), ib0_0.class, value);
    }

    static {
        if (f.ib0_0.sh == null) {
            try {
                Class.forName(f.ib0_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }

    public final byte Uh() {
        return this.nH;
    }

    @Override
    public final String toString() {
        int key = this.nH + 310261;
        if (sm0_0.cU.l90(key)) {
            return sm0_0.c0(key);
        }
        return "";
    }

    public final int sh() {
        return this.nH + 310418;
    }
}
