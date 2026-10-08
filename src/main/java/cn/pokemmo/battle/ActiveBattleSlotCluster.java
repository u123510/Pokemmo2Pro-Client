package cn.pokemmo.battle;

import f.CH0;
import f.sm0_0;

public class ActiveBattleSlotCluster {
    public final byte wo;
    public final String i30;
    public final CH0[] NG0;

    public ActiveBattleSlotCluster(byte i1, String v2, CH0... v3) {
        this.wo = i1;
        this.i30 = v2;
        this.NG0 = v3;
        if (v3.length != 6) {
            throw new IllegalArgumentException("");
        }
    }

    public static byte bm0(byte i0) {
        return (byte) (i0 * 3 + 6);
    }

    public byte Q6() {
        return this.wo;
    }

    public boolean Xr0() {
        for (CH0 v : this.NG0) {
            if (v.uI0()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        if (!this.i30.isEmpty()) {
            return this.i30;
        }
        return sm0_0.wa0(2360, Byte.toString((byte) (this.wo + 1)));
    }
}
