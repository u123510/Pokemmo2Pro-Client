package cn.pokemmo.pokemon.encounter;

import f.*;

public class WildPokemonEncounterData {
    public static final cy_0 fz = new cy_0();
    public final byte ye0;
    public final byte v;
    public final short P50;
    public final boolean LPt3;
    public final boolean Z40;
    public final byte Vq;
    public final boolean coM5;
    public final boolean Dz0;
    public byte bL;
    public final byte oH0;
    public final byte Hf;
    public final int ev0;
    public int oM;
    public final int re0;
    public final short nC0;
    public final short NX;
    public final byte u3;

    public WildPokemonEncounterData(byte b, byte b2, short s, boolean z, boolean z2, byte b3, boolean z3, boolean z4, byte b4, byte b5, byte b6) {
        this.ev0 = 0;
        this.oM = 0;
        this.re0 = 0;
        this.nC0 = 0;
        this.NX = 0;
        this.u3 = 0;

        if (s < 1 || s > 649) {
            throw new RuntimeException("Invalid " + "WildPokemonEncounterData");
        }
        if (b5 < 0 || b5 > 6) {
            throw new RuntimeException("Invalid " + "WildPokemonEncounterData");
        }
        if (b6 < 0 || b6 > 31) {
            throw new RuntimeException("Invalid " + "WildPokemonEncounterData");
        }

        this.ye0 = b;
        this.v = b2;
        this.P50 = s;
        this.LPt3 = z;
        this.Z40 = z2;
        this.Vq = b3;
        this.coM5 = z3;
        this.Dz0 = z4;
        this.bL = b4;
        this.oH0 = b5;
        this.Hf = b6;
        this.ke0();
    }

    public WildPokemonEncounterData(byte b, byte b2, int i, int i2, int i3, short s, short s2, byte b3) {
        this.P50 = 0;
        this.LPt3 = false;
        this.Z40 = false;
        this.Vq = 0;
        this.coM5 = false;
        this.Dz0 = false;
        this.bL = 0;
        this.oH0 = 0;
        this.Hf = 0;

        this.ye0 = b;
        this.v = b2;
        this.ev0 = i;
        this.oM = i2;
        this.re0 = i3;

        if (i3 > 0 && s2 < 1) {
            throw new RuntimeException("Invalid " + "WildPokemonEncounterData");
        }

        this.nC0 = s;
        this.NX = s2;
        this.u3 = b3;
        this.ke0();
    }

    public final boolean prn() {
        byte b = 0;
        if (this.ev0 > 0) {
            b = 1;
        }
        if (this.oM > 0) {
            b = (byte) (b + 1);
        }
        if (this.re0 > 0) {
            b = (byte) (b + 1);
        }
        if (this.nC0 > 0) {
            b = (byte) (b + 1);
        }
        return b > 1;
    }

    public final short Lr0() {
        return this.P50;
    }

    public final boolean pF0() {
        return this.LPt3;
    }

    public final boolean uM() {
        return this.Z40;
    }

    public final byte k40() {
        return this.Vq;
    }

    public final boolean Lp0() {
        return this.coM5;
    }

    public final boolean my() {
        return this.Dz0;
    }

    public final byte rC0() {
        return this.bL;
    }

    public final byte jD0() {
        return this.oH0;
    }

    public final int BK() {
        return this.ev0;
    }

    public final int lPt2() {
        return this.oM;
    }

    public final int Vh() {
        return this.re0;
    }

    public final short xa0() {
        return this.nC0;
    }

    public final short s6() {
        return this.NX;
    }

    public final void ke0() {
        short s = this.P50;
        if (s == 132 || s == 201 || s == 235) {
            this.bL = 0;
        }
        if (this.oM > 29999) {
            this.oM = 29999;
        }
    }
}
