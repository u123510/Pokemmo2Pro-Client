/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

import f.Fx0;
import f.Jn0;
import f.Nj;
import f.dz_2;
import f.le0_2;

public class ColorPickerControlWidget extends BaseControl
implements Fx0 {
    public ColorPickerControlWidget() {
        ColorPickerControlWidget ox0 = this;
        ox0.m90();
        ox0.m00();
    }

    @Override
    public final String Ck() {
        return "stringcellrenderer";
    }

    @Override
    public final void Ib(Jn0 jn0) {
        super.Ib(jn0);
    }

    @Override
    public void In(Object object) {
        this.B(String.valueOf(object));
    }

    @Override
    public int y8() {
        return 1;
    }

    @Override
    public final void Ej0() {
    }

    @Override
    public final le0_2 m90(int n, int n2, int n3, int n4, boolean bl) {
        ColorPickerControlWidget ox0 = this;
        this.E40(n, n2);
        ox0.oY(n3, n4);
        ox0.M.j70(Nj.de, bl);
        return ox0;
    }
}

