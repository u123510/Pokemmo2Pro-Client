package cn.pokemmo.graphics.camera;

import f.C8;
import f.hc_2;
import f.ut_0;

public class FixedPitchCamera extends hc_2 {
    public FixedPitchCamera(ut_0 ut_0) {
        super(ut_0, 64.0f);
        this.ho.tO(new C8(0.0f, 1.0f, 0.0f), -90.0f);
    }

    @Override
    public void eo0(C8 c8) {
        super.eo0(c8);
    }
}
