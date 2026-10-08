package cn.pokemmo.ui.widget.slot;

import f.*;

import java.util.Collections;

public class ItemSlotInteractionHandler implements By {
    public final /* synthetic */ boolean gk;
    public final /* synthetic */ BU y80;
    public final /* synthetic */ wg0_0 iu;

    public ItemSlotInteractionHandler(wg0_0 wg0_0Var, boolean z, BU bU) {
        this.iu = wg0_0Var;
        this.gk = z;
        this.y80 = bU;
    }

    @Override
    public final void py0(sg_2 sg_2Var, i70_0 i70_0Var) {
        if (this.gk) {
            QT qt = this.y80.OJ;
            if (qt != null) {
                qt.vu0(sg_2Var.y0(), Collections.emptyList());
                return;
            }
        }
        jb0_0 jb0_0Var = sg_2Var.y0();
        this.iu.getClass();
        if (!jb0_0Var.tp0.AU() && jb0_0Var.JA) {
            this.iu.e5 = jb0_0Var;
            jb0_0Var.uA(true);
            this.iu.aG0(i70_0Var);
        }
    }

    @Override
    public final void X70(sg_2 sg_2Var, i70_0 i70_0Var) {
        if (this.gk) {
            QT qt = this.y80.OJ;
            if (qt != null) {
                qt.fx0(i70_0Var.f8, i70_0Var.AN);
                return;
            }
        }
        sg_2Var.y0();
        this.iu.aG0(i70_0Var);
    }

    @Override
    public final void Et0(sg_2 sg_2Var, i70_0 i70_0Var) {
        if (this.gk) {
            QT qt = this.y80.OJ;
            if (qt != null) {
                qt.mf0(i70_0Var.f8, i70_0Var.AN);
                return;
            }
        }
        sg_2Var.y0();
        jb0_0 jb0_0Var = this.iu.e5;
        if (jb0_0Var != null && jb0_0Var.JA) {
            this.iu.aG0(i70_0Var);
            sg_2 sg_2_2 = this.iu.coM5;
            if (sg_2_2 != null && sg_2_2 != this.iu.e5) {
                sg_2_2.G9(this.iu.e5);
            } else {
                le0_2 le0_2Var = Qy0.yI0;
                int i3 = i70_0Var.f8;
                int i4 = i70_0Var.AN;
                le0_2 dh0 = le0_2Var.dh0(i3, i4);
                if (dh0 != null) {
                    le0_2Var = dh0.BQ(i3, i4);
                }
                boolean z = false;
                if (le0_2Var != null) {
                    XH xh = this.iu.AA0.BK;
                    if (xh != null && xh.b5 == le0_2Var.K20) {
                        xh.H6(this.iu.e5.ol0());
                        z = true;
                    }
                }
                if (!z && le0_2Var != null) {
                    nq_1 nq_1Var = wg0_0.N6(le0_2Var);
                    if (nq_1Var != null) {
                        nq_1Var.Ig0(this.iu.e5.ol0());
                        this.iu.kB(null);
                        if (this.iu.e5 != null) {
                            this.iu.e5.uA(false);
                        }
                        this.iu.e5 = null;
                        return;
                    }
                }
                if (!z) {
                    int i1 = i70_0Var.f8;
                    int i2 = i70_0Var.AN;
                    le0_2 dh0_2 = this.iu.dh0(i1, i2);
                    le0_2 le0_2Target;
                    if (dh0_2 != null) {
                        le0_2Target = dh0_2.BQ(i1, i2);
                    } else {
                        le0_2Target = this.iu;
                    }
                    if (le0_2Target instanceof wg0_0) {
                        jb0_0 e5 = this.iu.e5;
                        if (e5 != null && e5.ol0() != null) {
                            tw0_0.rl.fk0.uQ(new _for((byte) 1, e5.ol0().pu.Sa));
                        }
                    }
                }
            }
        }
        this.iu.kB(null);
        if (this.iu.e5 != null) {
            this.iu.e5.uA(false);
        }
        this.iu.e5 = null;
    }
}
