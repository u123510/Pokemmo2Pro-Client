package cn.pokemmo.battle.field;

import f.*;
import java.util.ArrayList;

public class BattleHazardEffectState {
    public final ay_0 xE0;
    public int rs0;
    public int D10;
    public int J;
    public int Nm0;
    public short kj0;
    public short EQ;
    public short ce;
    public short oF;
    public String eC0;
    public boolean lo;
    public boolean US;

    public BattleHazardEffectState(ay_0 v1) {
        super();
        this.xE0 = v1;
    }

    public void UL(int i1, int i2) {
    }

    public void Fk0(int i1, int i2, ArrayList v3) {
    }

    public void dr(Hq0 v1) {
    }

    public void final$() {
    }

    public jw_0 RL(int i1, int i2) {
        return (jw_0) (Object) this;
    }

    public boolean dd(jw_0 v1) {
        boolean res = false;
        if (this == v1 || (v1 != null && this.xE0 == v1.xE0)) {
            res = true;
        }
        this.lo = res;
        return res;
    }

    public final int dt() {
        return this.D10 + this.Nm0 + this.oF;
    }
}
