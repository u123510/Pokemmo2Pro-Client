/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.color;

import f.*;


import com.badlogic.gdx.graphics.Color;
import f.sc_0;

public class GdxColorHolder {
    public final Color GD;

    public GdxColorHolder() {
        this.GD = null;
    }

    public GdxColorHolder(sc_0 sc_02, Color color) {
        this.GD = color;
    }

    public GdxColorHolder(T1 t1) {
        T1 t12 = t1;
        t12.getClass();
        this.GD = t12.GD != null ? new Color(t1.GD) : null;
    }
}

