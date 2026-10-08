package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.FF0
 */
public class Modern_Util_Ff0 {

    public Modern_Util_Ff0() {
        super();
    }

    public float GM = 1.0f;
    public boolean jg = true;
    public float dh0;
    public float Ax0;
    public float Xg;
    public float R00;
    public float ep = 1.0f;
    public float OH = 1.0f;
    public boolean A30 = true;
    public FF0 Uu0;
    public final Hh sP = new Hh();
    public final Sz0 Nl = new Sz0();

    public final float v2() {
        if (this.A30) {
            this.t20();
        }
        return this.Xg;
    }

    public void GD0() {
        this.A30 = true;
    }

    public final void t20() {
        FF0 parent = this.Uu0;
        if (parent != null) {
            parent.t20();
            this.Xg = this.Uu0.v2() + this.dh0;

            parent = this.Uu0;
            if (parent.A30) {
                parent.t20();
            }
            this.R00 = parent.R00 + this.Ax0;
        } else {
            this.Xg = this.dh0;
            this.R00 = this.Ax0;
        }
        this.A30 = false;
    }
}

