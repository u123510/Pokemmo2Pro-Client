package cn.pokemmo.ui.layout.twl;

import f.*;

public class GapSpring extends is0_0 {
    public final int JT;
    public final int XW;
    public final int Cn;
    public final boolean Te;
    public final DialogLayout zI0;

    public GapSpring(DialogLayout source, int jt, int xw, int cn, boolean te) {
        super();
        this.zI0 = source;
        this.U50(0, jt);
        this.U50(0, xw);
        this.U50(0, cn);
        this.JT = jt;
        this.XW = xw;
        this.Cn = cn;
        this.Te = te;
    }

    @Override
    public final int zR(int value) {
        return this.U50(value, this.JT);
    }

    @Override
    public final int Kn(int value) {
        return this.U50(value, this.XW);
    }

    @Override
    public final int e4(int value) {
        return this.U50(value, this.Cn);
    }

    @Override
    public final void od(int first, int second, int third) {
    }

    public final int U50(int axis, int gap) {
        if (gap >= 0) {
            return gap;
        }
        L50 value;
        switch (gap) {
            case -4:
                value = this.zI0.zU;
                break;
            case -3:
                value = this.zI0.Cb;
                break;
            case -2:
                value = this.zI0.mK;
                break;
            case -1:
                value = this.zI0.vu0;
                break;
            default:
                throw new IllegalArgumentException("Invalid gap size: " + gap);
        }
        if (value == null) {
            return 0;
        }
        return axis == 0 ? value.Com9 : value.Eg0;
    }
}
