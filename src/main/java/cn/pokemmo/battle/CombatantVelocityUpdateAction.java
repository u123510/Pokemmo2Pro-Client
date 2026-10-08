package cn.pokemmo.battle;

import f.D2;
import f.LB0;
import f.MU;
import f.vr_1;

public class CombatantVelocityUpdateAction implements LB0 {
    public final MU pi;
    public final int Tc0;
    public final int FD;
    public final int c30;
    public final float zi0;

    public CombatantVelocityUpdateAction(MU v1, int i2, int i3, int i4, float f5) {
        this.pi = v1;
        this.Tc0 = i2;
        this.FD = i3;
        this.c30 = i4;
        this.zi0 = f5;
    }

    @Override
    public void LPT3(int i1, D2 v2) {
        vr_1 v1 = this.pi.Vs;
        int i2 = this.Tc0;
        float f0 = (float) this.FD;
        float f3 = (float) this.c30;
        float f4 = this.zi0;
        if (i2 == 0) {
            v1.Y70.x = f0;
            v1.Y70.y = f3;
        } else if (i2 == 1) {
            v1.sy0.x = f0 / 60.0f;
            v1.sy0.y = f3 / 60.0f;
        } else if (i2 == 4) {
            v1.sy0.x = f0 / 4.0f;
            v1.sy0.y = f3 / 4.0f;
        }
        v1.ze = f4 * 1000.0f;
    }
}
