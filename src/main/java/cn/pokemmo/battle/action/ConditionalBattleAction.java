package cn.pokemmo.battle.action;

import f.PF;
import f.ii_1;
import f.jd0_1;
import f.ka_0;

public class ConditionalBattleAction extends ii_1 {
    public final ka_0 Mx0;

    public ConditionalBattleAction(ka_0 ka_0, PF pf, jd0_1 jd0_1, boolean z, boolean z2) {
        super(pf, jd0_1, z, z2);
        this.Mx0 = ka_0;
    }

    @Override
    public boolean gL0() {
        return this.Mx0.Ja0((byte) 8);
    }
}
