package cn.pokemmo.battle.action;

import f.PF;
import f.ds_1;
import f.tw0_0;

public class PokemonBattleMoveCallbackB extends ds_1 {
    public final PF Vu0;

    public PokemonBattleMoveCallbackB(PF pf, PF pf2) {
        super(pf);
        this.Vu0 = pf2;
    }

    @Override
    public void R10() {
        super.R10();
        if (tw0_0.PK0 != null) {
            tw0_0.PK0.Jm(this.Vu0);
        }
    }
}
