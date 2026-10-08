package cn.pokemmo.battle;

import f.IG0;
import f.Iq0;
import f.bm0_1;
import f.bx_0;
import f.qd_0;

public class BattleEntityCountFilter {
    public IG0 za;
    public final Iq0 qq;

    public BattleEntityCountFilter() {
        this.za = new bm0_1();
        this.qq = new Iq0();
    }

    public int eC0(qd_0 v1) {
        int i0 = 0;
        for (Object obj : this.za.To()) {
            bx_0 b = (bx_0) obj;
            if (b.W30 == v1) {
                i0++;
            }
        }
        return i0;
    }
}
