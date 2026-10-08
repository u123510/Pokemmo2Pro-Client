package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Wj
 */
public class Modern_Util_Wj implements wl0_2, ix_1 {

    public final wl0_2[] Gf0;
    public final ux0_0 Qh;

    public Modern_Util_Wj(wl0_2[] values, ux0_0 metadata) {
        this.Gf0 = values;
        this.Qh = metadata;
    }

    public final void GO(VT value, int x, int y) {
        wl0_2 first = this.Gf0[0];
        this.uf(value, x, y, first.Nx(), first.Af());
    }

    public final void uf(rb_1 value, int i2, int i3, int i4, int i5) {
        for (int i = 0; i < this.Gf0.length; i++) {
            this.Gf0[i].uf(value, i2, i3, i4, i5);
        }
    }

    public final int Af() {
        return this.Gf0[0].Af();
    }

    public final int Nx() {
        return this.Gf0[0].Nx();
    }

    public final ux0_0 MY() {
        return this.Qh;
    }

    public final wl0_2 so(gn_0 value) {
        wl0_2[] copy = new wl0_2[this.Gf0.length];
        for (int i = 0; i < this.Gf0.length; i++) {
            copy[i] = this.Gf0[i].so(value);
        }
        return new Wj(copy, this.Qh);
    }

    public final LPT6_ LT() {
        return null;
    }
}

