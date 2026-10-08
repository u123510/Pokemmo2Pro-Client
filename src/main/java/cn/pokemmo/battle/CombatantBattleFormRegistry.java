package cn.pokemmo.battle;

import f.EE;
import f.Ss0;
import f.q10_0;
import f.qe0_2;
import f.yb_1;

public class CombatantBattleFormRegistry {
    public byte mh0;
    public final qe0_2 rh;
    public final qe0_2 vk0;
    public yb_1[] wC0;
    public final EE[] auX;

    public CombatantBattleFormRegistry(byte value, qe0_2 source) {
        this.wC0 = new yb_1[q10_0.Pn0.length];
        this.auX = EE.Wi0();
        this.mh0 = value;
        this.rh = source;
        this.vk0 = new qe0_2(source);
    }

    public qe0_2 COM6() {
        return this.rh;
    }

    public qe0_2 Lh() {
        return this.vk0;
    }

    public short Nul(q10_0 type) {
        short value = this.rh.pr[type.iL];
        if (Ss0.Fv(type, value) > Ss0.C70 && this.Ry0(type) != yb_1.Cy0) {
            return Ss0.Fv(type, value);
        }
        return value;
    }

    public yb_1 Ry0(q10_0 type) {
        int index = type.iL;
        yb_1 cached = this.wC0[index];
        if (cached != null) {
            return cached;
        }
        cached = yb_1.f9(this.rh.iu0[index]);
        this.wC0[index] = cached;
        return cached;
    }
}
