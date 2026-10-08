/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.core;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.pokeemu.client.gF;
import f.GS;
import f.T7;
import f.Z3;
import f.wl0_0;
import f.zv_1;
import java.util.Arrays;

public class GdxDisplayConfigurationBase {
    public int Pg = -1;
    public int ag = -1;
    public int s10 = 640;
    public int bU = 480;
    public int PG0 = -1;
    public int Gk0 = -1;
    public int Ak = -1;
    public int Gt = -1;
    public boolean tw0 = true;
    public boolean aX = true;
    public boolean h70 = false;
    public T7 Po0;
    public boolean I30 = true;
    public zv_1 CoM8;
    public String[] Ow;
    public wl0_0 b1;
    public Z3 UL;
    public String oH0;
    public Color hg = Color.BLACK;
    public boolean hR = true;
    public boolean qH0 = true;

    public final void d1(GdxDisplayConfigurationBase k70) {
        this.Pg = k70.Pg;
        this.ag = k70.ag;
        this.s10 = k70.s10;
        this.bU = k70.bU;
        this.PG0 = k70.PG0;
        this.Gk0 = k70.Gk0;
        this.Ak = k70.Ak;
        this.Gt = k70.Gt;
        this.tw0 = k70.tw0;
        this.aX = k70.aX;
        this.h70 = k70.h70;
        this.Po0 = k70.Po0;
        this.I30 = k70.I30;
        this.CoM8 = k70.CoM8;
        String[] stringArray = k70.Ow;
        if (k70.Ow != null) {
            this.Ow = Arrays.copyOf(stringArray, stringArray.length);
        }
        this.b1 = k70.b1;
        this.UL = k70.UL;
        this.oH0 = k70.oH0;
        this.hg = k70.hg;
        this.hR = k70.hR;
        this.qH0 = k70.qH0;
    }

    public final void Ct0(int n, int n2) {
        GdxDisplayConfigurationBase k70 = this;
        k70.s10 = n;
        k70.bU = n2;
    }

    public final void Ia0(boolean bl) {
        this.aX = bl;
    }

    public final void XS(boolean bl) {
        this.h70 = bl;
    }

    public final void IL() {
        this.I30 = true;
    }

    public final void qV(int n, int n2) {
        GdxDisplayConfigurationBase k70 = this;
        k70.Pg = n;
        k70.ag = n2;
    }

    public final void Xm(zv_1 zv_12, String ... stringArray) {
        GdxDisplayConfigurationBase k70 = this;
        k70.CoM8 = zv_12;
        k70.Ow = stringArray;
    }

    public final void sU(gF gF2) {
        this.b1 = gF2;
    }

    public final void LD(GS gS) {
        this.UL = (Z3)gS;
    }

    public final void O9() {
        this.oH0 = "PokeMMO";
    }

    public final void AU(boolean bl) {
        this.qH0 = bl;
    }
}

