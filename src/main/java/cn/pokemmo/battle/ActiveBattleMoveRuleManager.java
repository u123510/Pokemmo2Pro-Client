package cn.pokemmo.battle;

import f.J4;
import f.SQ;
import f._else;
import f.bd_0;
import f.tu_0;
import java.util.HashMap;

public class ActiveBattleMoveRuleManager {
    public static ActiveBattleMoveRuleManager Om;
    public final SQ X30;
    public final HashMap go;
    public tu_0 mv;

    static {
        if (f.com9__2.Om == null) {
            try {
                Class.forName(f.com9__2.class.getName());
            } catch (Throwable ignored) {}
        }
    }

    public ActiveBattleMoveRuleManager() {
        this.X30 = new SQ();
        this.go = new HashMap();
        this.mv = tu_0.M4;
        this.T0();
    }

    public static ActiveBattleMoveRuleManager fI0() {
        return Om;
    }

    public tu_0 AL0() {
        return this.mv;
    }

    public bd_0 cOm6(_else value) {
        int index = J4.iA0(value.dw, value.Bm0, value.case$);
        return (bd_0) this.X30.get(index);
    }

    public void T0() {
        short[] first = {429, 430, 431, 432, 433};
        for (short id : first) {
            this.X30.j10(this.X30.yw0(2 | ((id & 0xFFFF) << 8)), new bd_0());
        }
        short[] second = {434, 435};
        for (short id : second) {
            this.X30.j10(this.X30.yw0(2 | ((id & 0xFFFF) << 8)), new bd_0());
        }
    }
}
