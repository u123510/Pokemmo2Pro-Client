package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackRn implements Runnable  {
    public final byte ce0;
    public final BU B20;
    public final HX pC0;

    public TaskCallbackRn(HX effect, byte channel, BU controller) {
        this.pC0 = effect;
        this.ce0 = channel;
        this.B20 = controller;
    }

    public final void run() {
        HX effect = this.pC0;
        lpt2__5 state = effect.d2;
        if (state == null) {
            return;
        }

        mc0_1 target = state.XH0;
        if (target != null && target.Iq != null) {
            ez_1 action = new ez_1(effect.d2, this.ce0, (byte)(effect.QE + 1));
            if (effect.rF == null) {
                effect.rF = action;
                effect.F9(effect.fU(), action);
            }
            return;
        }

        BU controller = this.B20;
        HX active = controller.Cs0;
        if (active != null) {
            active.xe0();
            controller.Cs0 = null;
        }
        tw0_0.rl.ze0(this.ce0, (byte)(effect.QE + 1));
    }
}
