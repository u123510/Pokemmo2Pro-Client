/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.color;

import f.*;


import com.badlogic.gdx.graphics.Color;

public class GdxPaletteIndexProviderA
extends com1__0 {
    public final /* synthetic */ A3 FB0;

    public GdxPaletteIndexProviderA(A3 a3) {
        this.FB0 = a3;
    }

    @Override
    public final Object Ot0(gp_1 gp_12, oe_0 oe_02) {
        if (oe_02.wH0 == lpt3__3.ND0) {
            return (Color)this.FB0.Ip(Color.class, oe_02.cd0());
        }

        Class<?> valueType = String.class;
        Object value = null;
        gp_12.getClass();
        oe_0 child = oe_02.Is("hex");
        if (child != null) {
            value = gp_12.b20(valueType, null, child);
        }
        String hex = (String)value;
        if (hex != null) {
            return Color.valueOf(hex);
        }

        Class<?> floatType = Float.TYPE;
        Object component = Float.valueOf(0.0f);
        child = oe_02.Is("r");
        if (child != null) {
            component = gp_12.b20(floatType, null, child);
        }
        float r = ((Float)component).floatValue();

        component = Float.valueOf(0.0f);
        child = oe_02.Is("g");
        if (child != null) {
            component = gp_12.b20(floatType, null, child);
        }
        float g = ((Float)component).floatValue();

        component = Float.valueOf(0.0f);
        child = oe_02.Is("b");
        if (child != null) {
            component = gp_12.b20(floatType, null, child);
        }
        float b = ((Float)component).floatValue();

        component = Float.valueOf(1.0f);
        child = oe_02.Is("a");
        if (child != null) {
            component = gp_12.b20(floatType, null, child);
        }
        float a = ((Float)component).floatValue();

        return new Color(r, g, b, a);
    }

}

