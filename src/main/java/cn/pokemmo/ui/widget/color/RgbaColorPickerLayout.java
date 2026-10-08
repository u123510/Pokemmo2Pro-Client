package cn.pokemmo.ui.widget.color;

import f.*;

public class RgbaColorPickerLayout extends V7 {
    public RgbaColorPickerLayout(L v1) {
        super(v1);
    }

    @Override
    public final void rX() {
        this.LPT8 = false;
        x40(null);
        em();
        tk0_0 v1 = new tk0_0(new A40());
        A40 v2 = v1.gg0;
        this.yD = new TO[]{
            new TO(16, this),
            new TO(8, this),
            new TO(0, this),
            new TO(24, this)
        };
        int i3 = T1();
        ya_1 v4 = new I7(this).Ze0();
        Hm0 v5 = new Hm0(this);
        int i6 = i3 + 4;
        ya_1[] v7 = new ya_1[i6];
        for (int i8 = 0; i8 < i6; ++i8) {
            v7[i8] = new Hm0(this);
        }
        v2.FU.ys0(1.0f).Ek0 = new vl0_0(5.0f);
        v2.yu0(0).Wa0();
        this.LT = new qc_0[i3];
        for (int i = 0; i < 3; ++i) {
            this.LT[i] = new qc_0(i, this);
            cn_0 label = new cn_0((KG0) null, 0);
            label.Sk(this.PW.oj[i]);
            v2.vx0(label).Wa0();
            v2.vx0(new Ay0(this.LT[i])).rs0 = Float.valueOf(1.0f);
            if (this.Wy0) {
                j1_0 cell = v2.es(V7.K4[i]).Wa0();
                cell.Rr0.vx0(new Gh0(this.yD[i])).rs0 = Float.valueOf(1.0f);
            }
            v2.Rg();
        }
        if (this.qj0) {
            j1_0 cell = v2.es(V7.K4[3]);
            j1_0 c2 = cell.Rr0.vx0(new Gh0(this.yD[3]));
            c2.d80 = Integer.valueOf(3);
            c2.rs0 = Float.valueOf(1.0f);
            cell.Rr0.Rg();
        }
        int i2 = 0;
        if (this.Sc) {
            while (i2 + 1 < i3) {
                int next = i2 + 1;
                Yp0 yp = new Yp0(this, i2, next);
                yp.yj0 = this.PW.oj[i2] + " / " + this.PW.oj[next];
                yp.yB0();
                v4.Kn0(yp);
                v5.Kn0(yp);
                i2 += 2;
            }
        }
        while (i2 < i3) {
            KC kc = new KC(i2, this);
            kc.yj0 = this.PW.oj[i2];
            kc.yB0();
            v4.Kn0(kc);
            v5.Kn0(kc);
            i2++;
        }
        if (this.xm && this.Lpt7 == null) {
            Eg();
        }
        if (this.qc0) {
            if (this.jj0 == null) {
                this.jj0 = new N1(new t5_0(this), new gn_0(this.u20));
            }
            le0_2 colorArea = new le0_2((KG0) null, false);
            colorArea.uf("colorarea");
            colorArea.z70 = this.jj0;
            uk0_2 preview = new uk0_2();
            preview.uf("preview");
            preview.F9(preview.fU(), colorArea);
            cn_0 previewLabel = new cn_0((KG0) null, 0);
            previewLabel.uf("previewLabel");
            previewLabel.coM8(preview);
            Hm0 hRow = new Hm0(this);
            I7 iCol = new I7(this);
            hRow.Kn0(previewLabel).Kn0(preview).X20(v4);
            iCol.Ze0().Kn0(previewLabel).Kn0(preview).X20(v5);
            if (this.xm) {
                hRow.Kn0(this.Lpt7);
                iCol.Ze0().Kn0(this.Lpt7);
            }
        }
        ya_1 layoutH = new Hm0(this).Ze0().X20(v4).Kn0(v1);
        ya_1 layoutV = new I7(this).X20(v5).Kn0(v1);
        if (this.xm) {
            if (this.Lpt7 == null) {
                Eg();
            }
            if (!this.qc0) {
                layoutH.Kn0(this.Lpt7);
                layoutV.Kn0(this.Lpt7);
            }
            if (this.Lpt7 != null) {
                this.Lpt7.Gv(String.format("%08X", Integer.valueOf(this.u20)));
            }
        }
        WQ(layoutV);
        x40(layoutH.Ze0());
    }
}
