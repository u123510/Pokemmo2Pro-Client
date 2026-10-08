package cn.pokemmo.graphics.model;

import f.*;

public abstract class ModelAnimationCurveTrack extends R90 {
    public final boolean coN;

    public ModelAnimationCurveTrack() {
        super();
        this.coN = true;
    }

    public ModelAnimationCurveTrack(boolean enabled) {
        super();
        this.coN = enabled;
    }

    public void C(zk0_1 frame) {
        if (!this.coN || !this.eE) {
            return;
        }
        if (this.z70 == null) {
            this.z70 = new N1(new xe0_0(this.M, R90.gC), gn_0.WHITE);
            this.Ll(false);
            if (!this.eE) {
                this.z70.iG0(0);
            }
        }
        this.AD(false);
        frame.xx(new hj_1((yz_1) (Object) this));
        this.z70.so0 = (Runnable[]) a7_0.gE(this.z70.so0, new ni0_1((yz_1) (Object) this), Runnable.class);
    }

    public void x00() {
    }

    public void N00(zk0_1 frame) {
        if (this.z70 == null) {
            return;
        }
        this.z70.so0 = (Runnable[]) a7_0.gE(this.z70.so0, new qi0_0((yz_1) (Object) this, frame), Runnable.class);
    }

    @Override
    public boolean nd0(i70_0 event) {
        if (E00.ZU(event.zu) && event.iT() && event.finally$ == 111 && this.Lr0 != null) {
            a7_0.bH(this.Lr0.ER.Fc0);
            return true;
        }
        return super.nd0(event);
    }
}
