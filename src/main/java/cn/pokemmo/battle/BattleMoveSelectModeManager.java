package cn.pokemmo.battle;

import f.Zu0;
import f._switch;
import f.id0_1;
import f.kf_1;

public class BattleMoveSelectModeManager extends id0_1 {
    public void Ic() {
        int mode = this.Si0;
        if (mode == 3) {
            for (int i = 0; i < this.mv; i++) {
                this.uP[i] = new _switch(i);
            }
        } else if (mode == 1) {
            int i = 0;
            for (; i < this.uR.zg0; i++) {
                this.uP[i] = new kf_1(i);
            }
            for (; i < this.mv; i++) {
                this.uP[i] = new Zu0(i);
            }
        } else {
            for (int i = 0; i < this.mv; i++) {
                this.uP[i] = new kf_1(i);
            }
        }
    }

    public void TE() {
        for (int i = 0; i < this.mv; i++) {
            ((_switch) this.uP[i]).switch$(this.p4, this.z30);
        }
    }
}
