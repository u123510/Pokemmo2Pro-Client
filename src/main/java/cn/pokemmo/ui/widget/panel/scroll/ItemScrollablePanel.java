package cn.pokemmo.ui.widget.panel.scroll;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.text.NumberFormat;

public class ItemScrollablePanel extends BaseScrollablePanel {
    public final S70[] h10;
    public final cn_0[] DQ;

    public ItemScrollablePanel(K90 v1, mc0_1 v2, byte i3) {
        super(gu0.Az0().lPT6(v2.rX()).jc().ZD0(), gu0.Az0().lPT6(v2.rX()).jc().Y0());
        uf("previewwidget");
        this.EG = new fy_2();
        this.gI.Ll(false);
        this.Lpt3.EU(i3);

        zc0_1 v3 = new zc0_1();
        this.h10 = jq0_0.dq0(v2);
        this.DQ = jq0_0.eV(v2);
        for (int i4 = 0; i4 < this.h10.length; i4++) {
            v3.qG0(new le0_2[] { this.h10[i4], this.DQ[i4] });
        }

        StringBuilder v4 = lb0_2.Ue0(v2);
        if (v4.length() > 0) {
            String[] lines = v4.toString().trim().split("\\n");
            for (int i6 = 0; i6 < lines.length; i6++) {
                v3.qG0(new le0_2[] { new cn_0(lines[i6].trim()) });
            }
        }

        this.H3.RR(() -> vK(v2, v1));
        this.Co.SU(sm0_0.c0(65));
        this.Co.RR(this::xe0);
        SL(this.EG);

        this.EG.x40(this.EG.H10().Xq(new ya_1[] {
            this.EG.hb(new le0_2[] { v3 }),
            this.EG.lo0().qd(50),
            this.EG.hb(new le0_2[] { this.Va0, this.o80 }),
            this.EG.hb(new le0_2[] { this.GF0 }),
            this.EG.hb(new le0_2[] { this.extends$ }),
            this.EG.C7(new le0_2[] { this.H3, this.Co })
        }));

        this.EG.WQ(this.EG.lo0().Xq(new ya_1[] {
            this.EG.H10().qd(300),
            this.EG.lo0().Xq(new ya_1[] {
                this.EG.C7(new le0_2[] { v3 }),
                this.EG.H10(),
                this.EG.C7(new le0_2[] { this.Va0 }).Ze0().Kn0(this.o80),
                this.EG.C7(new le0_2[] { this.GF0 }),
                this.EG.C7(new le0_2[] { this.extends$ }),
                this.EG.hb(new le0_2[] { this.H3, this.Co })
            })
        }));

        if (tw0_0.kz0()) {
            for (S70 s70 : this.h10) {
                s70.JH().dA(2.0f);
            }
        }
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        return false;
    }

    @Override
    public final void K8() {
        this.EG.lt0();
        lt0();
        nk0(pa0_0.Ol, 0);
    }

    public final void vK(mc0_1 v1, K90 v2) {
        String msg = sm0_0.Bx(8039, new String[] {
            "1",
            sm0_0.c0(v1.Nl),
            "$" + NumberFormat.getInstance().format((long) v2.mx0)
        });
        Qy0.yI0.sr0(new lpt3__4(msg, new KL0((i1_0) (Object) this, v2), null));
    }
}
