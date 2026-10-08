/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.shader;

import f.*;

/*
 * Renamed from f.Mv
 */
public class DefaultShaderConfig {
    public final String wg0;
    public final String f3;
    public int HA;
    public int F80;
    public int el;
    public final int W60;
    public final boolean yI0;
    public final int kb;
    public final int fm0;

    public DefaultShaderConfig() {
        this.wg0 = null;
        this.f3 = null;
        this.HA = 2;
        this.F80 = 5;
        this.el = 12;
        this.W60 = 4;
        this.yI0 = true;
        this.kb = -1;
        this.fm0 = -1;
    }

    public DefaultShaderConfig(String string, String string2) {
        this.HA = 2;
        this.F80 = 5;
        this.el = 12;
        this.W60 = 4;
        this.yI0 = true;
        this.kb = -1;
        this.fm0 = -1;
        this.wg0 = string;
        this.f3 = string2;
    }
}

