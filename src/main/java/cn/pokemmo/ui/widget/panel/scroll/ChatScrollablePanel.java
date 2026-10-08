package cn.pokemmo.ui.widget.panel.scroll;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class ChatScrollablePanel extends BaseScrollablePanel {
    public static final cn_0[] Aw0;
    public cn_0 ph0;
    public S70[] SI0;
    public cn_0[] ri0;
    public cn_0[] xs0;

    static {
        Aw0 = new cn_0[0];
    }

    public ChatScrollablePanel(mc0_1 v1, byte i2, tu_2 v3) {
        super(v1.jc().ZD0(), v1.jc().Y0(), 0);
        this.xs0 = Aw0;
        GJ0(v1, i2, v3, true, true, "");
    }

    public ChatScrollablePanel(mc0_1 v1, byte i2, tu_2 v3, boolean i4, boolean i5, String v6) {
        super(v1.jc().ZD0(), v1.jc().Y0());
        this.xs0 = Aw0;
        GJ0(v1, i2, v3, i4, i5, v6);
    }

    public final void GJ0(mc0_1 v1, byte i2, tu_2 v3, boolean i4, boolean i5, String v6) {
        uf("tooltip-preview-widget");
        zc0_1 v7 = new zc0_1();
        this.EG = v7;
        F9(fU(), v7);
        String desc = v1.Nt0(i2, v3);
        cn_0 v8 = new cn_0((KG0) null, 0);
        v8.Sk(desc);
        this.ph0 = v8;
        if (i5) {
            v7.qG0(new le0_2[]{v8});
        }
        this.ph0.Ll(i5);
        if (!v6.isEmpty()) {
            this.ph0.Sk(this.ph0.j50.toString() + v6);
        }
        this.Lpt3.EU(i2);
        this.SI0 = jq0_0.dq0(v1);
        this.ri0 = jq0_0.eV(v1);
        for (int i = 0; i < this.SI0.length; ++i) {
            v7.qG0(new le0_2[]{this.SI0[i], this.ri0[i]});
            if (!i4) {
                this.ri0[i].uf("label-normal");
            }
        }
        if (tw0_0.Eu(9)) {
            cn_0 devLabel = new cn_0((KG0) null, 0);
            devLabel.Sk(fp0_0.uD(new StringBuilder().append(v1.Iq.SG).append(" "), v1.Iq.ax, "(DEV DEBUG)"));
            devLabel.uf("label-alt");
            v7.qG0(new le0_2[]{devLabel});
        }
        if (i4) {
            StringBuilder sb = lb0_2.Ue0(v1);
            if (sb.length() > 0) {
                String[] lines = sb.toString().trim().split("\\n");
                this.xs0 = new cn_0[lines.length];
                for (int i = 0; i < lines.length; ++i) {
                    cn_0 lineLabel = new cn_0((KG0) null, 0);
                    lineLabel.Sk(lines[i].trim());
                    this.xs0[i] = lineLabel;
                    v7.qG0(new le0_2[]{lineLabel});
                }
            }
        }
        v7.L4.p70(120);
    }

    @Override
    public final void pO(R40 v1) {
        super.pO(v1);
        this.EG.lt0();
        lt0();
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        return false;
    }

    public final void Dw0(zk0_1 v1) {
        cn_0 target;
        if (this.xs0.length > 0) {
            target = this.xs0[this.xs0.length - 1];
        } else if (this.ri0.length > 0) {
            target = this.ri0[this.ri0.length - 1];
        } else {
            target = this.ph0;
        }

        int y;
        if (target.K20 == null) {
            y = tw0_0.kz0() ? 40 : -10;
        } else {
            int diff = target.SB0 - this.SB0;
            if (target.eE) {
                y = diff + (target.OB - 10);
            } else {
                y = diff;
            }
        }

        int x = (this.Lpt3.OD0 == ew0_0.C1) ? 0 : 80;
        this.Lpt3.Si = x;
        if (tw0_0.kz0()) {
            this.Lpt3.Zx0 = y - 50;
        } else {
            this.Lpt3.Zx0 = y - 10;
        }

        if (this.Lpt3.OD0 != ew0_0.a) {
            this.Lpt3.PC0();
        } else if (tw0_0.e60 != null && tw0_0.e60.jB0 != null) {
            this.Lpt3.eQ(tw0_0.e60.jB0.Vv, this.Lpt3.Si, this.Lpt3.Zx0);
        }
    }

    @Override
    public final void K8() {
        this.EG.lt0();
        lt0();
    }
}
