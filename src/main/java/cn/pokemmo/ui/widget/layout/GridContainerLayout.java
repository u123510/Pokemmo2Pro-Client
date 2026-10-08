/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

import f.Jn0;
import f.fy_2;

public class GridContainerLayout extends BaseLayoutBox {
    public final int aJ0;
    public final int g10;

    public GridContainerLayout(int n, int n2) {
        this.aJ0 = n;
        this.g10 = n2;
        this.RY(n, n2);
        this.g2(n, n2);
        this.oY(n, n2);
    }

    @Override
    public final int R1() {
        return this.aJ0;
    }

    @Override
    public final int Se() {
        return this.g10;
    }

    @Override
    public final void K8() {
        GridContainerLayout dE0 = this;
        int n = dE0.aJ0;
        dE0.RY(n, dE0.g10);
        n = dE0.aJ0;
        dE0.g2(n, dE0.g10);
        n = dE0.aJ0;
        dE0.oY(n, dE0.g10);
    }

    @Override
    public final void a80(Jn0 jn0) {
    }

    @Override
    public final void Kz0(Jn0 jn0) {
    }
}
