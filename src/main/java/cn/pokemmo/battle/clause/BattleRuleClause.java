package cn.pokemmo.battle.clause;

import f.*;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Objects;

public class BattleRuleClause {
    public static final lq0[] CoM4;
    public static final lq0[] ul;
    public static final qy_1 z70;
    public static final short[] q00;
    public final GV xz0;
    public final byte rE;

    public BattleRuleClause(GV gv, byte b) {
        if (!gv.P80() && b != 0) {
            throw new IllegalArgumentException("Only dynamic clauses take value parameters");
        }
        this.xz0 = gv;
        this.rE = b;
    }

    public static lq0[] pRn(GV... gvArr) {
        if (gvArr == null || gvArr.length < 1) {
            return CoM4;
        }
        int length = gvArr.length;
        lq0[] lq0Arr = new lq0[length];
        for (int i = 0; i < length; i++) {
            GV gv = gvArr[i];
            if (gv.jC0) {
                throw new IllegalArgumentException("Dynamic clauses need value parameters");
            }
            lq0Arr[i] = p8(gv);
        }
        return lq0Arr;
    }

    public static lq0 p8(GV gv) {
        if (!gv.jC0) {
            return JS(gv, (byte) 0);
        }
        throw new IllegalArgumentException("Dynamic clauses need value parameters");
    }

    public static lq0 JS(GV gv, byte b) {
        int hash = Objects.hash(gv, Byte.valueOf(gv.jC0 ? b : (byte) 0));
        return (lq0) z70.lc0.get(hash);
    }

    static {
        CoM4 = new lq0[0];
        q00 = new short[]{5213, 5255};
        SQ sq = new SQ();
        for (GV gv : GV.TH0) {
            if (gv.jC0) {
                byte min = 1;
                byte max;
                if (!gv.jC0) {
                    max = -1;
                } else if (gv == GV.rk0 || gv == GV.Uc0) {
                    max = 6;
                } else {
                    max = 100;
                }
                for (byte b = min; b <= max; b = (byte) (b + 1)) {
                    int hash = sq.yw0(Objects.hash(gv, Byte.valueOf(b)));
                    sq.j10(hash, new lq0(gv, b));
                }
            } else {
                int hash = sq.yw0(Objects.hash(gv, Byte.valueOf((byte) 0)));
                sq.j10(hash, new lq0(gv, (byte) 0));
            }
        }
        z70 = new qy_1(sq);
        ul = pRn(GV.gj0);
        EnumMap enumMap = new EnumMap(av_1.class);
        for (av_1 av_1Var : av_1.Vk0) {
            enumMap.put(av_1Var, pRn(av_1Var.oE));
        }
        Collections.unmodifiableMap(enumMap);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.xz0, Byte.valueOf(this.rE));
    }

    @Override
    public final String toString() {
        return fp0_0.uD(new StringBuilder("[").append(this.xz0).append(", "), this.rE, "]");
    }

    public final String R3() {
        if (sm0_0.cU.l90(this.xz0.pN)) {
            return sm0_0.wa0(this.xz0.pN, String.valueOf((int) this.rE));
        }
        return this.xz0.toString();
    }

    public final String B3() {
        if (sm0_0.cU.l90(this.xz0.Om)) {
            return sm0_0.wa0(this.xz0.Om, String.valueOf((int) this.rE));
        }
        return "";
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof lq0) {
            lq0 lq0Var = (lq0) obj;
            return lq0Var.xz0 == this.xz0 && lq0Var.rE == this.rE;
        }
        return false;
    }
}
