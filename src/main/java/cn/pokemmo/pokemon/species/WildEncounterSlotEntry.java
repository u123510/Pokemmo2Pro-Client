/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.pokemon.species;

import f.*;

import f.g7_0;
import f.gn_2;
import f.sm0_0;
import f.tu_0;
import f.wn_1;

public class WildEncounterSlotEntry {
    public final byte cT;
    public final byte zD0;
    public final int qE;
    public final byte qe0;
    public final byte Q80;
    public final short CQ;
    public final tu_0 u;
    public int kA0 = 0;
    public short uY = 0;

    public WildEncounterSlotEntry(byte by, byte by2, int n, byte by3, byte by4, short s, tu_0 tu_02) {
        this.cT = by;
        this.zD0 = by2;
        this.qE = n;
        this.qe0 = by3;
        this.Q80 = by4;
        this.CQ = s;
        this.u = tu_02;
    }

    public final String ZX() {
        byte by = this.cT;
        if (by == 6) {
            gn_2 gn_22 = wn_1.pn.vi((byte)4, (short)260);
            return sm0_0.c0(gn_22.VK0() + 190480) + " " + gn_22.gK0();
        }
        if (by == 7) {
            return g7_0.Zx(150491, new StringBuilder(), " ★★★★★");
        }
        if (by == 8) {
            return g7_0.Zx(150385, new StringBuilder(), " ★★★★★");
        }
        if (by == -2) {
            return g7_0.Zx(150485, new StringBuilder(), " ★★★★★★");
        }
        if (by == -1) {
            return sm0_0.wa0(0x1000044, sm0_0.c0(150485));
        }
        return sm0_0.c0(this.qE);
    }

    public final byte zg0() {
        short s = this.cT;
        if (s >= 0 && s <= 4) {
            s = this.uY;
            if (s == 1) {
                return 70;
            }
            if (s == 2) {
                return 75;
            }
            if (s == 3) {
                return 80;
            }
            if (s > 3) {
                return 90;
            }
        }
        return this.qe0;
    }

    public final int Ef0() {
        int n = this.kA0;
        if (n < 1) {
            return 0;
        }
        return (int)((long)n - System.currentTimeMillis() / 1000L);
    }

    public final short oc() {
        return this.uY;
    }
}

