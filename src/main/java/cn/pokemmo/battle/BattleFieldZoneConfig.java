package cn.pokemmo.battle;

import f.*;

public class BattleFieldZoneConfig {
    public static BattleFieldZoneConfig Ct0;
    public static BattleFieldZoneConfig Pb;
    public static BattleFieldZoneConfig pS;
    public static BattleFieldZoneConfig PRN;
    public static BattleFieldZoneConfig af0;
    public static BattleFieldZoneConfig at;
    public static BattleFieldZoneConfig Fz;
    public static bm0_1 kN;
    public final byte Uk;

    public BattleFieldZoneConfig(int value) {
        this.Uk = (byte) value;
    }

    static {
        if (f.XA0.Ct0 == null) {
            try {
                Class.forName(f.XA0.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
