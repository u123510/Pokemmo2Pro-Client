package cn.pokemmo.world.entity;

import f.C8;
import f.Ou0;

public class WorldEntityPlacementVector {
    public final Ou0 MW;
    public final int lJ;
    public float YK;
    public float jh;
    public final int Sd0;

    public WorldEntityPlacementVector(Ou0 v1, int i2, int i3, int i4, int i5, int i6) {
        this.MW = v1;
        this.lJ = -i5;
        this.jh = (float) (-i5);
        this.YK = (float) (-i5);
        this.Sd0 = i6;
        float f_x = ((float) i2) * 0.25f + 0.125f;
        float f_y = ((float) i4) * 0.25f;
        float f_z = ((float) i3) * 0.25f + 0.125f;
        v1.ho.el0(f_x, f_y, f_z);
        if (i6 == 3 || i6 == 2) {
            v1.ho.tO(C8.X, this.jh);
        } else {
            v1.ho.tO(C8.Y, this.jh);
        }
    }
}
