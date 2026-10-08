package cn.pokemmo.ui.widget.button;

import f.*;

public class ImageButtonWidget extends jg0_0 {
    public final i90_0 eo0;
    public C2 ic0;

    public ImageButtonWidget(A3 a3) {
        this((C2) a3.NQ(C2.class));
    }

    public ImageButtonWidget(A3 a3, String string) {
        this((C2) a3.Ip(C2.class, string));
    }

    public ImageButtonWidget(C2 c2) {
        super(c2);
        i90_0 image = cJ0();
        this.eo0 = image;
        this.COm1(image);
        this.g90(c2);
        this.DC(this.uq0(), this.Tn0());
    }

    public ImageButtonWidget(YA ya) {
        this(new C2(null, null, null, ya, null, null));
    }

    public ImageButtonWidget(YA ya, YA ya2) {
        this(new C2(null, null, null, ya, ya2, null));
    }

    public ImageButtonWidget(YA ya, YA ya2, YA ya3) {
        this(new C2(null, null, null, ya, ya2, ya3));
    }

    public static i90_0 cJ0() {
        return new i90_0(null, P9.Pi0);
    }

    @Override
    public final void g90(Gp0 gp0) {
        if (!(gp0 instanceof C2)) {
            throw new IllegalArgumentException("style must be an ImageButtonStyle.");
        }
        this.ic0 = (C2) gp0;
        super.g90(gp0);
        if (this.eo0 != null) {
            this.Zr();
        }
    }

    public final void Zr() {
        i90_0 image = this.eo0;
        YA drawable = null;
        if (this.m9()) {
            if (this.Uo && this.ic0.v20 != null) {
                drawable = this.ic0.v20;
            } else if (this.ic0.u8 != null) {
                drawable = this.ic0.u8;
            }
        }
        if (drawable == null && this.sR()) {
            if (this.Uo && this.ic0.Gq != null) {
                drawable = this.ic0.Gq;
            } else if (this.ic0.l80 != null) {
                drawable = this.ic0.l80;
            }
        }
        if (drawable == null) {
            if (this.Uo) {
                if (this.ic0.DM != null) {
                    drawable = this.ic0.DM;
                } else if (this.sR() && this.ic0.l80 != null) {
                    drawable = this.ic0.l80;
                }
            }
            if (drawable == null) {
                drawable = this.ic0.HV;
            }
        }
        image.tS(drawable);
    }

    @Override
    public final void BS(ui_1 ui1, float f) {
        this.Zr();
        super.BS(ui1, f);
    }

    @Override
    public final String toString() {
        String name = yb0_0.class.getName();
        int dot = name.lastIndexOf(46);
        if (dot != -1) {
            name = name.substring(dot + 1);
        }
        String prefix = (name.indexOf(36) != -1) ? "ImageButton " : "";
        return prefix + name + ": " + this.eo0.Cx0;
    }
}
