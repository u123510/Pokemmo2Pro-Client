package cn.pokemmo.battle;

import f.ML0;
import f.PF;
import f.sm0_0;

public abstract class BattleDialogueActionDispatcher {
    public static void mk(PF pF, int n, ML0 mL0, String string, Runnable runnable) {
        mL0.wJ(sm0_0.wa0(n, pF.Yp()), string, runnable);
    }
}
