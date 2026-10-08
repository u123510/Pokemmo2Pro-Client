package cn.pokemmo.ui.text;

import f.*;

public class CachedTextLayoutSpan extends xt0_0 {
    public final w50_0 iD;
    public final String c60;
    public final int xb0;
    public final int Yt;
    public ft0_0 uD;
    public boolean dh0;

    public CachedTextLayoutSpan(ay_0 v1, w50_0 v2, String v3, int i4, int i5, boolean i6) {
        super(v1);
        Y30 v1_font = v2.bW;
        this.iD = v2;
        this.c60 = v3;
        this.xb0 = i4;
        this.Yt = i5;
        if (i6) {
            if (this.uD == null) {
                this.uD = ((zb0_2) v1_font).getFont().dq();
            } else {
                this.uD.xT();
            }
            lpt3__5 v2_box = ((zb0_2) v1_font).cacheText(this.uD, v3, i4, i5);
            this.Ug0 = (int) v2_box.PRN;
            this.L70 = (int) v2_box.gv0;
        } else {
            this.L70 = ((zb0_2) v1_font).getLineHeight();
        }
        if (this.uD == null) {
            this.Ug0 = ((zb0_2) v1_font).computeTextWidth(v3, i4, i5);
        }
    }

    @Override
    public final void BG0(fw0_0 v1) {
        w50_0 v2 = this.iD;
        gn_0 color = this.qH ? v2.jL0 : v2.Fz0;
        if (color != null) {
            qq_0 qq = (qq_0) v1.lr0;
            qq.g50 = qq.g50.j60(color.HH(), color.W1(), color.eD0(), color.bh());
            this.iv0(v1);
            ((qq_0) v1.lr0).kY();
        } else {
            this.iv0(v1);
        }
    }

    @Override
    public final void xf() {
        if (!this.dh0) {
            if (this.uD != null) {
                this.uD.xT();
                this.uD = null;
            }
        }
    }

    public final void iv0(fw0_0 v1) {
        KG0 color = this.qH ? v1.im : v1.eD;
        ft0_0 cache = this.uD;
        if (cache != null) {
            zb0_2 font = (zb0_2) this.iD.bW;
            int x = this.bW + v1.OE;
            int y = (this.PS + v1.Zg) - font.getBaseLine();
            font.drawFromCache(cache, color, x, y);
        } else {
            zb0_2 font = (zb0_2) this.iD.bW;
            int x = this.bW + v1.OE;
            int y = (this.PS + v1.Zg) - font.getBaseLine();
            font.drawText(color, x, y, this.c60, this.xb0, this.Yt);
        }
    }
}
