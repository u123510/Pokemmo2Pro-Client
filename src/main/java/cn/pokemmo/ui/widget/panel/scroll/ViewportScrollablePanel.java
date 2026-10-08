package cn.pokemmo.ui.widget.panel.scroll;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class ViewportScrollablePanel extends BaseScrollablePanel {
    public ViewportScrollablePanel(HV hv) {
        super(hv.Hc0().ZD0(), hv.Hc0().Y0());
        uf("previewwidget");
        X90 x90 = hv.Hc0();
        this.EG = new fy_2();
        this.H3.RR(new kw_1((l80_0) (Object) this, hv, x90));
        this.Co.RR(this::xe0);
        SL(this.EG);
        if (this.gI.O0()) {
            this.EG.x40(this.EG.H10().Xq(new ya_1[] {
                this.EG.hb(new le0_2[] { this.gI }),
                this.EG.hb(new le0_2[] { this.Va0, this.o80 }),
                this.EG.hb(new le0_2[] { this.GF0 }),
                this.EG.hb(new le0_2[] { this.extends$ }),
                this.EG.C7(new le0_2[] { this.H3, this.Co })
            }));
            this.EG.WQ(this.EG.lo0().Xq(new ya_1[] {
                this.EG.H10().Ze0().Kn0(this.gI).Ze0(),
                this.EG.H10().qd(300).X20(this.EG.lo0().Xq(new ya_1[] {
                    this.EG.C7(new le0_2[] { this.Va0 }).Ze0().Kn0(this.o80),
                    this.EG.C7(new le0_2[] { this.GF0 }),
                    this.EG.C7(new le0_2[] { this.extends$ }),
                    this.EG.hb(new le0_2[] { this.H3, this.Co })
                }))
            }));
        } else {
            this.EG.x40(this.EG.H10().Xq(new ya_1[] {
                this.EG.hb(new le0_2[] { this.Va0, this.o80 }),
                this.EG.hb(new le0_2[] { this.GF0 }),
                this.EG.hb(new le0_2[] { this.extends$ }),
                this.EG.C7(new le0_2[] { this.H3, this.Co })
            }));
            this.EG.WQ(this.EG.lo0().Xq(new ya_1[] {
                this.EG.H10().qd(300).X20(this.EG.lo0().Xq(new ya_1[] {
                    this.EG.C7(new le0_2[] { this.Va0 }).Ze0().Kn0(this.o80),
                    this.EG.C7(new le0_2[] { this.GF0 }),
                    this.EG.C7(new le0_2[] { this.extends$ }),
                    this.EG.hb(new le0_2[] { this.H3, this.Co })
                }))
            }));
        }
    }

    public final boolean nd0(i70_0 i70_0Var) {
        return false;
    }

    public final void K8() {
        this.EG.lt0();
        lt0();
        nk0(pa0_0.Ol, 0);
    }
}
