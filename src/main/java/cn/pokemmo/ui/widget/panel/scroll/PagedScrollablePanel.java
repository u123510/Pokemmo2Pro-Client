package cn.pokemmo.ui.widget.panel.scroll;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class PagedScrollablePanel extends BaseScrollablePanel {
    public static final  int p60 = 0;
    public vr0_0 KO;

    public PagedScrollablePanel(HV hv) {
        super(null, (short) 0);
        this.H3.SU(sm0_0.c0(56));
        this.H3.RR(new ao0_0((zg0_2) (Object) this, hv));
        ch(gu0.Az0().lPT6(hv.MB0()));
    }

    public PagedScrollablePanel(K5 k5) {
        super(null, (short) 0);
        this.H3.SU(sm0_0.c0(8501));
        this.H3.RR(() -> aj0(k5));
        ch(k5.LW());
    }

    @Override
    public final void C(zk0_1 zk0_1) {
        lpt6__0.v90(this);
    }

    @Override
    public final void K8() {
        this.EG.lt0();
        lt0();
        nk0(pa0_0.Ol, 0);
    }

    public final void ch(mc0_1 mc0_1) {
        uf("previewwidget");
        this.EG = new fy_2();
        this.Co.RR(this::uf);
        cn_0 cn_0 = new cn_0(null, 0);
        cn_0.Sk(sm0_0.c0(8500));
        this.KO = new vr0_0(this.Lpt3, this.Ut0);
        F9(fU(), this.EG);
        this.gI.Ll(true);

        yb_1[] mh = yb_1.Mh;
        int length = mh.length;
        for (int i = 0; i < length; i++) {
            yb_1 yb_1 = mh[i];
            byte at0 = yb_1.at0;
            if (at0 < mc0_1.hh || at0 > mc0_1.Aw) {
                this.Ut0[at0].pw0(false);
                xe_1 xe_1 = this.Ut0[yb_1.at0];
                gn_0 gn_0 = new gn_0(
                    (byte) yb_1.Is0.Cc(),
                    (byte) yb_1.Is0.TB0(),
                    (byte) yb_1.Is0.tr(),
                    (byte) 60
                );
                xe_1.z70 = new N1(new t5_0(xe_1), gn_0);
            }
        }

        this.EG.x40(
            XN.sA(this.EG, this.EG).Xq(new ya_1[] {
                this.EG.hb(new le0_2[] { this.gI }),
                this.EG.hb(new le0_2[] { cn_0, this.KO }),
                this.EG.hb(new le0_2[] { this.Va0, this.o80 }),
                this.EG.hb(new le0_2[] { this.extends$ }),
                this.EG.C7(new le0_2[] { this.H3, this.Co })
            })
        );

        this.EG.WQ(
            D5.fE0(this.EG, this.EG).Xq(new ya_1[] {
                new I7(this.EG).Ze0().Kn0(this.gI).Ze0(),
                new I7(this.EG).qd(300).X20(
                    D5.fE0(this.EG, this.EG).Xq(new ya_1[] {
                        this.EG.C7(new le0_2[] { cn_0 }).qd(10).Kn0(this.KO),
                        this.EG.C7(new le0_2[] { this.Va0 }).Ze0().Kn0(this.o80),
                        this.EG.C7(new le0_2[] { this.extends$ }),
                        this.EG.hb(new le0_2[] { this.H3, this.Co })
                    })
                )
            })
        );
    }

    public final void uf() {
        this.K20.u3(this);
    }

    public final void aj0(K5 k5) {
        if (this.KO.wE0 < 1) {
            tw0_0.rl.qK(sm0_0.c0(8504));
            return;
        }
        Qy0.yI0.sr0(new lpt3__4(sm0_0.c0(8502), () -> ap(k5), this));
    }

    public final void ap(K5 k5) {
        this.K20.u3(this);
        hl0_0 hl0_0 = k5.nn;
        short wQ = hl0_0.wQ;
        CH0 br = hl0_0.Br;
        CH0 xb0 = this.KO.XB0;
        short s = 1;
        Mm lpt3 = this.Lpt3;
        byte b = lpt3.QA0[lpt3.zJ.iL];
        tw0_0.rl.sn0(wQ, br, xb0, s, b);
    }
}
