package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackCatch implements Runnable  {
    public final vk0_1 B10;
    public final boolean g10;
    public final VU YP;
    public final qj_2[] Ss0;
    public final int tB0;
    public final BU vG;
    public final ng_2 mF0;

    public TaskCallbackCatch(ng_2 owner, vk0_1 battle, boolean enabled, VU target,
                  qj_2[] widgets, int index, BU hud) {
        this.mF0 = owner;
        this.B10 = battle;
        this.g10 = enabled;
        this.YP = target;
        this.Ss0 = widgets;
        this.tB0 = index;
        this.vG = hud;
    }

    @Override
    public final void run() {
        short state = this.B10.hC0;
        boolean enabled = this.g10;
        tx_1.Sy0.getClass();
        if ((state == 505 || state == 1030) && enabled) {
            qj_2 widget = this.Ss0[this.tB0];
            int x = widget.A20 + widget.Mx;
            int y = widget.SB0;
            Qy0.xi(this.mF0, this.YP, state, x, y,
                    () -> this.gy0(this.vG, this.YP));
        } else {
            tw0_0.rl.p4(this.YP.pu, state, CH0.j1, CH0.j1);
            if (tw0_0.kz0()) {
                this.vG.PRn(this.YP.pu);
                this.mF0.wz();
            }
        }
    }

    public final void gy0(BU hud, VU target) {
        if (tw0_0.kz0()) {
            hud.PRn(target.pu);
            this.mF0.wz();
        }
    }
}
