package cn.pokemmo.constant;

import f.*;

public class BattleTurnPhaseRegistry {
    public static BattleTurnPhaseRegistry J30;
    public static BattleTurnPhaseRegistry hq;
    public static BattleTurnPhaseRegistry Rz0;
    public static BattleTurnPhaseRegistry zm;
    public static BattleTurnPhaseRegistry w30;
    public static BattleTurnPhaseRegistry[] da;
    public static BattleTurnPhaseRegistry[] dI;
    public final byte AH;
    public final int ys;

    public BattleTurnPhaseRegistry(int i1, int i2) {
        this.ys = i1;
        this.AH = (byte) i2;
    }

    static {
        if (f.ry_0.J30 == null) {
            try {
                Class.forName(f.ry_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }

    public final int Com6() {
        if (this.ys == 0) {
            return 1050;
        }
        return 2800;
    }

    public final boolean mo0() {
        return this != hq;
    }

    public final int wr() {
        return this.ys;
    }
}
