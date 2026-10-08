package cn.pokemmo.ui.layout.twl;

import f.*;

public class WidgetSpring extends is0_0 {
    public final le0_2 p40;
    public pa0_0 mU;
    public int ur;
    public int Lz;
    public int Y50;
    public int sM;
    public int Y;
    public int yF;
    public int WH0;
    public int N1;
    public int Fn;
    public int xk;
    public int D70;

    public WidgetSpring(le0_2 widget) {
        this.p40 = widget;
        this.mU = pa0_0.Vp0;
    }

    @Override
    public final int zR(int axis) {
        if (axis == 0) {
            return this.Y;
        }
        if (axis == 1) {
            return this.yF;
        }
        throw new IllegalArgumentException("axis");
    }

    @Override
    public final int Kn(int axis) {
        if (axis == 0) {
            return this.Fn;
        }
        if (axis == 1) {
            return this.xk;
        }
        throw new IllegalArgumentException("axis");
    }

    @Override
    public final int e4(int axis) {
        if (axis == 0) {
            return this.WH0;
        }
        if (axis == 1) {
            return this.N1;
        }
        throw new IllegalArgumentException("axis");
    }

    @Override
    public final void od(int axis, int first, int second) {
        this.D70 |= 1 << axis;
        if (axis == 0) {
            this.ur = first;
            this.Y50 = second;
        } else if (axis == 1) {
            this.Lz = first;
            this.sM = second;
        } else {
            throw new IllegalArgumentException("axis");
        }
    }

    public final void aH() {
        if (this.D70 != 3) {
            StringBuilder message = new StringBuilder("Widget ")
                    .append(this.p40)
                    .append(" with theme ")
                    .append(this.p40.vV())
                    .append(" is not part of the following groups:");
            if ((this.D70 & 1) == 0) {
                message.append(" horizontal");
            }
            if ((this.D70 & 2) == 0) {
                message.append(" vertical");
            }
            throw new IllegalStateException(message.toString());
        }

        if (this.mU != pa0_0.Vp0) {
            int width = Math.min(this.Y50, this.Fn);
            int height = Math.min(this.sM, this.xk);
            this.p40.sy(this.ur + this.mU.uD0(this.Y50, width),
                    this.Lz + this.mU.Kr0(this.sM, height));
            this.p40.oY(width, height);
        } else {
            this.p40.sy(this.ur, this.Lz);
            this.p40.oY(this.Y50, this.sM);
        }
    }

    @Override
    public final boolean D4() {
        return this.p40.eE;
    }
}
