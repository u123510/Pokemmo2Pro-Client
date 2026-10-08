package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

import java.util.ArrayList;
import java.util.Iterator;

public class ItemQuickUseButton {
    public final ArrayList<Ou0> X2;
    public float xV;
    public float TJ0;

    public ItemQuickUseButton() {
        this.X2 = new ArrayList<>();
        this.xV = 1.0F;
        this.TJ0 = 1.0F;
    }

    public final void pg0(Ou0 value) {
        this.X2.add(value);
    }

    public final void ah(boolean enabled, boolean refresh) {
        if (this.TJ0 == (float) (enabled ? 1 : 0)) {
            return;
        }
        Iterator<Ou0> iterator = this.X2.iterator();
        while (iterator.hasNext()) {
            Ou0 value = iterator.next();
            float alpha = enabled ? 1.0F : -1.0F;
            value.PE0 = alpha;
            PG selected = value.sC0(0, false, null);
            if (selected == null && value.ep != null && value.ep.mH0 != null) {
                value.ep.mH0.DL0 = 2;
            }
            this.TJ0 = enabled ? 1.0F : 0.0F;
        }
        if (!refresh) {
            return;
        }
        this.xV = this.TJ0;
        for (Ou0 value : this.X2) {
            I2 children = value.Y3.ZD();
            while (children.hasNext()) {
                ((BM) children.next()).LPT8(new sh_0(this.xV));
            }
        }
    }
}
