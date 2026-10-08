/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.color;

import f.*;


import com.badlogic.gdx.graphics.Color;
import f.YA;
import f.sc_0;

public class GdxColorPalette {
    public final Color g0;
    public final Color jG0;
    public final Color bD;
    public final Color u00;

    public GdxColorPalette() {
        this.g0 = null;
        this.jG0 = null;
        this.bD = null;
        this.u00 = null;
    }

    public GdxColorPalette(sc_0 sc_02, Color color, YA yA, YA yA2, YA yA3) {
        this.g0 = color;
        this.jG0 = null;
        this.bD = null;
        this.u00 = null;
    }

    public GdxColorPalette(K30 k30) {
        K30 k302 = k30;
        k302.getClass();
        this.g0 = k302.g0 != null ? new Color(k30.g0) : null;
        this.jG0 = k30.jG0 != null ? new Color(k30.jG0) : null;
        this.bD = k30.bD != null ? new Color(k30.bD) : null;
        this.u00 = k30.u00 != null ? new Color(k30.u00) : null;
    }
}

