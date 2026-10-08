/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  f.COm8_
 *  f.Fx0
 *  f.Ux0
 *  f.W0
 *  f.X90
 *  f.ca_1
 *  f.er_0
 *  f.md_2
 *  f.nh0_0
 *  f.xe_1
 */
package cn.pokemmo.ui.widget.tree;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.tree.BaseTreeModel;

import f.COm8_;
import f.Fx0;
import f.Ux0;
import f.X90;
import f.ca_1;
import f.er_0;
import f.md_2;
import f.nh0_0;
import f.xe_1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AuctionCategoryTreeModel extends BaseTreeModel {
    public Ux0 VI0;
    public int Tf0;
    public final ca_1 iQ;
    public Collection cr;

    public AuctionCategoryTreeModel(COm8_ cOm8_) {
        this.VI0 = Ux0.lr0;
        this.Tf0 = 1;
        ca_1 ca_12 = new ca_1(cOm8_);
        this.iQ = ca_12;
        this.private$((nh0_0)ca_12);
        md_2 md_22 = new md_2();
        this.Vo0(xe_1.class, (Fx0)md_22);
        this.uf("/wardrobe-purchase-table");
        this.p5(true);
        this.Dp0();
        this.Bb(0);
        this.sb();
    }

    public final void kz(int n) {
        super.kz(n);
        if (Ux0.s2.length <= n) {
            return;
        }
        Ux0 ux0 = Ux0.s2[n];
        if (this.VI0 == ux0) {
            int n2 = (this.Tf0 == 1) ? 2 : 1;
            if (n2 == 0) {
                throw new NullPointerException("order");
            }
            if (this.Tf0 != n2) {
                this.Tf0 = n2;
                this.sb();
                this.lA();
            }
            return;
        }
        if (ux0 == null) {
            throw new NullPointerException("column");
        }
        this.VI0 = ux0;
        this.sb();
        this.lA();
    }

    public final void lA() {
        ArrayList<X90> x90Array = new ArrayList<X90>();
        Collection collection = this.cr;
        if (collection != null) {
            for (Object object : collection) {
                X90 x90 = (X90)object;
                if (x90 != null) {
                    x90Array.add(x90);
                }
            }
        }
        Collections.sort(x90Array, this.VI0.cOm7);
        if (this.Tf0 == 2) {
            Collections.reverse(x90Array);
        }
        ca_1 ca_12 = this.iQ;
        X90[] x90Array2 = x90Array.toArray(new X90[0]);
        X90[] x90Array3 = ca_12.Ts0;
        if (ca_12.Ts0.length > 0) {
            int n = 0;
            ca_12.fg0(n, x90Array3.length);
        }
        ca_12.Ts0 = x90Array2;
        int n = 0;
        ca_12.od0(n, x90Array2.length);
    }

    public final void sb() {
        AuctionCategoryTreeModel au0 = this;
        int n = au0.VI0.Sj0;
        au0.LPT6(n, au0.Tf0);
    }
}
