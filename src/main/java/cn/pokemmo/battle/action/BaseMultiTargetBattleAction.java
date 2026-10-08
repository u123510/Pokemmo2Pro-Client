package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public abstract class BaseMultiTargetBattleAction extends Nt implements eb0_0 {
    public final byte rA;
    public final CH0[] Rj0;
    public final short[] Ja;

    public BaseMultiTargetBattleAction(byte i1, CH0[] v2, short[] v3) {
        super();
        this.rA = i1;
        this.Rj0 = v2;
        this.Ja = v3;
        if (v2.length != v3.length) {
            throw new IllegalArgumentException();
        }
    }

    public final short Nr(CH0 v1) {
        for (int i = 0; i < this.Rj0.length; i++) {
            if (v1.equals(this.Rj0[i])) {
                return this.Ja[i];
            }
        }
        return -1;
    }

    public final boolean lG0(CH0 v1) {
        for (int i = 0; i < this.Rj0.length; i++) {
            if (v1 == null) {
                if (this.Rj0[i] == null) {
                    return true;
                }
            } else if (v1.equals(this.Rj0[i])) {
                return true;
            }
        }
        return false;
    }

    public final boolean Hm() {
        return false;
    }
}
