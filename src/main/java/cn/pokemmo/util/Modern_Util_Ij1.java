package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.ij_1
 */
public class Modern_Util_Ij1
implements wx_1 {

    public int Tq0;
    public Sz0 U3;
    public Hh X;
    public final LPT6_ oE0;
    public float LPt9;
    public float f70;

    public Modern_Util_Ij1(LPT6_ lPT6_) {
        this.oE0 = lPT6_;
    }

    public Modern_Util_Ij1(ij_1 ij_12) {
        if (ij_12.U3 != null) {
            this.oZ().GB(ij_12.U3);
        }
        this.X = ij_12.X;
        this.oE0 = ij_12.oE0;
        this.Tq0 = ij_12.Tq0;
    }

    @Override
    public final int tL0() {
        return this.Tq0;
    }

    @Override
    public final Sz0 oZ() {
        if (this.U3 == null) {
            this.U3 = new Sz0();
        }
        return this.U3;
    }

    @Override
    public final Hh pA() {
        if (this.X == null) {
            this.X = new Hh();
        }
        return this.X;
    }

    @Override
    public final LPT6_ LT() {
        return this.oE0;
    }

    @Override
    public final float OS() {
        return this.LPt9;
    }

    @Override
    public final float Yl0() {
        return this.f70;
    }
}

