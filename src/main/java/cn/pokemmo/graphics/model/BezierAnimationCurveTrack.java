package cn.pokemmo.graphics.model;

import f.*;

public abstract class BezierAnimationCurveTrack extends yz_1 {
    public boolean Ey;

    public BezierAnimationCurveTrack(boolean enabled) {
        this(enabled, true);
    }

    public BezierAnimationCurveTrack(boolean enabled, boolean superEnabled) {
        super(superEnabled);
        this.Ey = enabled;
        if (enabled) {
            Qy0.Sq().VX((cx_0) (Object) this);
        }
    }

    @Override
    public final void AD(boolean visible) {
        super.AD(visible);
        if (visible && this.Ey) {
            Qy0.yI0.VX((cx_0) (Object) this);
        } else {
            Qy0.yI0.tq.sj0((cx_0) (Object) this, true);
        }
    }

    @Override
    public void N00(zk0_1 frame) {
        Qy0.yI0.tq.sj0((cx_0) (Object) this, true);
        super.N00(frame);
    }

    public boolean Rt0() {
        return !(this instanceof sr_0);
    }

    @Override
    public void aUX(zk0_1 frame) {
        if (dw_2.lp0 && this.Ey) {
            Iu0 unused = tw0_0.hH0;
        }
        lg_0.S4.getClass();
        lg_0.S4.getClass();
        wl0_2 layout = this.Jj0;
        if (layout != null) {
            layout.uf(this.M, this.A20, this.SB0, this.Mx, this.OB);
        }
    }
}
