package cn.pokemmo.ui.widget.component;

import f.GF0;
import f.M5;
import f.com2__3;
import f.sm0_0;

public class NumericCounterLabelComponent extends com2__3 implements GF0 {
    public int Gq;

    public NumericCounterLabelComponent(M5 m5, int i) {
        super(m5);
        lH(i);
    }

    public void Tj() {
        this.s90.SU(sm0_0.c0(this.Gq));
    }

    public void lH(int i) {
        if (i != this.Gq) {
            this.Gq = i;
            Tj();
        }
    }
}
