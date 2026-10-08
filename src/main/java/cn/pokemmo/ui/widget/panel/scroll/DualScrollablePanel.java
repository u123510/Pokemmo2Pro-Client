package cn.pokemmo.ui.widget.panel.scroll;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class DualScrollablePanel extends BaseScrollablePanel {
    public DualScrollablePanel(lpt2__5 lpt2, byte b, byte b2) {
        super(lpt2.gk().jc().ZD0(), lpt2.gk().jc().Y0());
        uf("previewwidget");
        this.H3.RR(new pr_0((ez_1) (Object) this, b, b2));
        ki0(lpt2);
    }

    public DualScrollablePanel(lpt2__5 lpt2) {
        super(lpt2.gk().jc().ZD0(), lpt2.gk().jc().Y0());
        this.H3.RR(new Qx0((ez_1) (Object) this, lpt2));
        ki0(lpt2);
    }

    @Override
    public final void K8() {
        this.EG.lt0();
        lt0();
        N80(pa0_0.Ol);
    }

    public final void ki0(lpt2__5 lpt2) {
        uf("previewwidget");
        this.EG = new fy_2();
        this.Co.RR(new c90_0((ez_1) (Object) this));
        F9(fU(), this.EG);

        this.EG.x40(XN.sA(this.EG, this.EG).Xq(new ya_1[]{
                this.EG.hb(new le0_2[]{this.gI}),
                this.EG.hb(new le0_2[]{this.Va0, this.o80}),
                this.EG.hb(new le0_2[]{this.GF0}),
                this.EG.hb(new le0_2[]{this.extends$}),
                this.EG.C7(new le0_2[]{this.H3, this.Co})
        }));

        this.EG.WQ(D5.fE0(this.EG, this.EG).Xq(new ya_1[]{
                new I7(this.EG).Ze0().Kn0(this.gI).Ze0(),
                new I7(this.EG).qd(300).X20(D5.fE0(this.EG, this.EG).Xq(new ya_1[]{
                        this.EG.C7(new le0_2[]{this.Va0}).Ze0().Kn0(this.o80),
                        this.EG.C7(new le0_2[]{this.GF0}),
                        this.EG.C7(new le0_2[]{this.extends$}),
                        this.EG.hb(new le0_2[]{this.H3, this.Co})
                }))
        }));

        if (lpt2.sp == cr_0.u90 && lpt2.oF0() > tw0_0.rl.k0.il) {
            this.H3.pw0(false);
        } else if (lpt2.sp == cr_0.l3 && lpt2.oF0() > tw0_0.rl.k0.HI) {
            this.H3.pw0(false);
        } else if (lpt2.sp == cr_0.Lk0 && lpt2.oF0() > tw0_0.rl.k0.Lpt5) {
            this.H3.pw0(false);
        }
    }
}
