package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

public class InteractiveTextLabel extends BaseLabel implements Runnable {
    public int rm0;
    public int Uf;
    public int Th0;
    public final ja0_0 Gs0;
    public final Nj u60;

    public InteractiveTextLabel(Nj owner) {
        this.u60 = owner;
        this.Gs0 = new ja0_0((f.W20)(Object)this);
        this.RR(this);
    }

    public final String Ck() {
        return "columnheader";
    }

    public final int m0() {
        if (this.Uf > 0) return this.Uf;
        Uu column = this.u60.Dq0(this.rm0);
        return Math.max(column != null ? column.vJ0 : this.u60.XK, super.m0());
    }

    public final int R1() {
        Uu column = this.u60.Dq0(this.rm0);
        return Math.max(column != null ? column.COM1 : 0, super.m0());
    }

    public final int S2() {
        Uu column = this.u60.Dq0(this.rm0);
        return column != null ? column.Fv0 : Short.MAX_VALUE;
    }

    public final void lt0() {
    }

    public final boolean nd0(i70_0 input) {
        if (input.Li()) {
            this.u60.j0 = Integer.MIN_VALUE;
            this.u60.c00 = -1;
            this.u60.CC = -1;
        }
        return super.nd0(input);
    }

    public final void FW(zk0_1 context) {
        qq_0 clip = (qq_0)context.AK;
        clip.al(this.A20, this.SB0, this.Mx, this.OB);
        try {
            this.QD(this.M);
        } finally {
            clip.Lpt9();
        }
    }

    @Override
    public final void run() {
        this.u60.kz(this.rm0);
    }
}
