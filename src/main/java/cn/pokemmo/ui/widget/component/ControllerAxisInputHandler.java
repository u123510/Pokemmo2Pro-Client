package cn.pokemmo.ui.widget.component;

import f.OW;
import f.ZB0;
import f.cw_0;
import f.lg_0;
import f.o3_0;
import f.zd0_1;

public class ControllerAxisInputHandler extends ZB0 {
    public final cw_0 rL0;

    public ControllerAxisInputHandler(cw_0 owner) {
        this.rL0 = owner;
    }

    @Override
    public boolean PL0(o3_0 ignored, int value) {
        OW operation = new OW(this.rL0.ts);
        this.rL0.Kn0 = operation;
        operation.jK0(value);
        lg_0.k.lPT5(this::cOm3);
        return false;
    }

    @Override
    public boolean H2(o3_0 ignored, int value, float delta) {
        if (Math.abs(delta) > 0.5F) {
            OW operation = new OW(this.rL0.ts);
            this.rL0.Kn0 = operation;
            operation.Ik0 = zd0_1.vp0;
            operation.By = value;
            operation.HG0 = delta > 0.0F;
            lg_0.k.lPT5(this::qq0);
        }
        return false;
    }

    public void qq0() {
        this.rL0.coM1(this.rL0.Kn0);
    }

    public void cOm3() {
        this.rL0.coM1(this.rL0.Kn0);
    }
}
