package cn.pokemmo.pokemon.contest;

import f.*;

import java.util.HashMap;

public abstract class PokemonContestScoreCalculator {
    public static final HashMap S6 = new HashMap();

    public static int tz0(k80_0 k80_02, CE cE, short s, rz_0 rz_02) {
        int n = cE.X3();
        if (cE.Yb0 == s) {
            n += 5;
        }
        if (cE.yb == rz_02) {
            n += 5;
        }
        int result = Math.min(5, cE.wj - 15) + n;
        if (cE.I()) {
            return result + 10;
        }
        if (cE.aR()) {
            return result + 7;
        }
        d30_0 table = (d30_0) S6.get(k80_02);
        Q50 q = table.Rz0(cE.Yb0);
        if (q == Q50.tt) {
            return result + 7;
        }
        if (q == Q50.hY) {
            return result + 4;
        }
        if (q == Q50.EA) {
            return result + 2;
        }
        return result;
    }

    static {
        d30_0 d = new d30_0(k80_0.At);
        S6.put(d.Xx0, d);
        tc_1 initialized = tc_1.dX;
        d.sA0(new Vw0((short) 588, Q50.ZF0));
        d.sA0(new Vw0((short) 46, Q50.ZF0));
        d.sA0(new Vw0((short) 48, Q50.ZF0));
        d.sA0(new Vw0((short) 283, Q50.ZF0));
        d.sA0(new Vw0((short) 540, Q50.ZF0));
        d.sA0(new Vw0((short) 165, Q50.ZF0));
        d.sA0(new Vw0((short) 10, Q50.ZF0));
        d.sA0(new Vw0((short) 13, Q50.ZF0));
        d.sA0(new Vw0((short) 11, Q50.EA));
        d.sA0(new Vw0((short) 14, Q50.EA));
        d.sA0(new Vw0((short) 193, Q50.EA));
        d.sA0(new Vw0((short) 313, Q50.EA));
        d.sA0(new Vw0((short) 314, Q50.EA));
        d.sA0(new Vw0((short) 415, Q50.EA));
        d.sA0(new Vw0((short) 290, Q50.EA));
        d.sA0(new Vw0((short) 12, Q50.hY));
        d.sA0(new Vw0((short) 15, Q50.hY));
        d.sA0(new Vw0((short) 127, Q50.tt));
        d.sA0(new Vw0((short) 588, Q50.ZF0));
        d.sA0(new Vw0((short) 46, Q50.ZF0));
        d.sA0(new Vw0((short) 48, Q50.ZF0));
        d.sA0(new Vw0((short) 283, Q50.ZF0));
        d.sA0(new Vw0((short) 543, Q50.ZF0));
        d.sA0(new Vw0((short) 401, Q50.ZF0));
        d.sA0(new Vw0((short) 265, Q50.ZF0));
        d.sA0(new Vw0((short) 402, Q50.EA));
        d.sA0(new Vw0((short) 266, Q50.EA));
        d.sA0(new Vw0((short) 268, Q50.EA));
        d.sA0(new Vw0((short) 313, Q50.EA));
        d.sA0(new Vw0((short) 314, Q50.EA));
        d.sA0(new Vw0((short) 415, Q50.EA));
        d.sA0(new Vw0((short) 290, Q50.EA));
        d.sA0(new Vw0((short) 267, Q50.hY));
        d.sA0(new Vw0((short) 269, Q50.hY));
        d.sA0(new Vw0((short) 214, Q50.tt));
        d.sA0(new Vw0((short) 123, Q50.tt));

        HashMap extra = new HashMap();
        d30_0 extraTable = new d30_0(k80_0.At);
        extra.put(extraTable.Xx0, extraTable);
        extraTable.sA0(new Vw0((short) 123, Q50.ZF0));
        extraTable.sA0(new Vw0((short) 127, Q50.ZF0));
        extraTable.sA0(new Vw0((short) 12, Q50.ZF0));
        extraTable.sA0(new Vw0((short) 15, Q50.ZF0));
        extraTable.sA0(new Vw0((short) 267, Q50.ZF0));
        extraTable.sA0(new Vw0((short) 269, Q50.ZF0));
        extraTable.sA0(new Vw0((short) 313, Q50.ZF0));
        extraTable.sA0(new Vw0((short) 314, Q50.ZF0));
        extraTable.sA0(new Vw0((short) 402, Q50.ZF0));
        extraTable.sA0(new Vw0((short) 214, Q50.ZF0));
    }
}
