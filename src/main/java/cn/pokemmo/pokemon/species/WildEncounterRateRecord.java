package cn.pokemmo.pokemon.species;

import f.*;

public class WildEncounterRateRecord {
    public final int Lpt3;
    public final E10 xJ0;
    public final byte YD;
    public final short WA;
    public final int yx0;
    public final int pO;
    public final int Lpt1;
    public final int ME;
    public final int wG;
    public final byte yg0;
    public X90 UF0;
    public DA dE0;
    public int xk0;

    public WildEncounterRateRecord(int i1, E10 v2, byte i3, short i4, int i5, int i6, int i7, int i8, int i9, byte i10) {
        super();
        this.xk0 = -1;
        this.Lpt3 = i1;
        this.xJ0 = v2;
        this.YD = i3;
        this.WA = i4;
        this.yx0 = i5;
        this.pO = i6;
        this.Lpt1 = i7;
        this.ME = i8;
        this.wG = i9;
        this.yg0 = i10;
    }

    public final E10 tf0() {
        return this.xJ0;
    }

    public final byte un() {
        return this.YD;
    }

    public final X90 Hc0() {
        if (this.YD == 1 && this.UF0 == null) {
            this.UF0 = gu0.l2.lPT6(this.WA).Iq;
        }
        return this.UF0;
    }

    public final short MB0() {
        return this.WA;
    }

    public final String wG0() {
        if (this.YD == 1 || this.YD == 5) {
            return sm0_0.c0(gu0.l2.lPT6(this.WA).Nl);
        }
        if (this.YD == 3) {
            yj_2 value = QO.NX.xW(this.WA);
            return value == null ? "--" : value.FL0();
        }
        return "--";
    }

    public final String ZE0() {
        if (this.YD == 5) {
            return gu0.l2.lPT6(this.WA).Com4((byte) -1, 28);
        }
        if (this.YD == 3) {
            yj_2 value = QO.NX.xW(this.WA);
            if (value == null) {
                return "--";
            }
            return value.oF0 ? sm0_0.c0(1451) : sm0_0.c0(value.su + 295000);
        }
        if (this.YD == 1) {
            mc0_1 value = gu0.l2.lPT6(this.WA);
            StringBuilder result = new StringBuilder();
            if (value.M80) {
                result.append(sm0_0.c0(1448));
                result.append("\n\n");
            }
            result.append(value.Com4((byte) -1, 38));
            return result.toString();
        }
        return "--";
    }

    public final int eo() {
        return this.yx0;
    }

    public final int yg() {
        return this.pO;
    }

    public final int ZZ() {
        return this.Lpt1;
    }

    public final int Op0() {
        return this.wG;
    }

    public final DA Aq0() {
        return this.dE0;
    }

    public final byte zi0() {
        return this.yg0;
    }
}
