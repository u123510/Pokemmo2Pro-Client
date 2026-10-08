package cn.pokemmo.item;

import f.E00;
import f.Qq0;
import f.i70_0;
import f.qh_1;
import f.sc_1;

public class SpecialItemSlotPredicate extends Qq0 {
    public final qh_1 EL;

    public SpecialItemSlotPredicate(qh_1 qh_1, sc_1 sc_1) {
        super(sc_1);
        this.EL = qh_1;
    }

    @Override
    public boolean nd0(i70_0 i70_0) {
        if (E00.C10(i70_0.zu)) {
            return this.EL.nd0(i70_0);
        }
        return super.nd0(i70_0);
    }
}
