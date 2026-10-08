package cn.pokemmo.graphics.gdx.color;

import f.*;


import com.badlogic.gdx.graphics.Color;

public class GdxPaletteIndexProviderB extends com1__0 {
    public final A3 CoN;

    public GdxPaletteIndexProviderB(A3 a3) {
        this.CoN = a3;
    }

    @Override
    public final Object Ot0(gp_1 gp1, oe_0 oe0) {
        String name = (String) h4_0.Lpt6(gp1, oe0, "name", String.class, null);
        oe_0 colorNode = oe0.Is("color");
        Color color = (Color) gp1.b20(Color.class, null, colorNode);
        if (color == null) {
            throw new WC0("TintedDrawable missing color: " + oe0);
        }
        YA drawable = this.CoN.Y8(name);
        YA res;
        if (drawable instanceof si_2) {
            res = ((si_2) drawable).tp(color);
        } else if (drawable instanceof ke0_2) {
            ke0_2 copy = new ke0_2((ke0_2) drawable);
            copy.JE0 = new pb_1(copy.JE0, color);
            res = copy;
        } else if (drawable instanceof od_0) {
            od_0 od = (od_0) drawable;
            B5 sprite = od.cM0;
            B5 newSprite = (sprite instanceof tz_1) ? new tz_1((tz_1) sprite) : new B5(sprite);
            newSprite.Wx(color);
            newSprite.An(od.u1, od.wv);
            od_0 copy = new od_0(newSprite);
            copy.GA0 = od.GA0;
            copy.f60 = od.f60;
            copy.dL0 = od.dL0;
            copy.bB = od.bB;
            res = copy;
        } else {
            throw new nf_1("Unable to copy, unknown drawable type: " + drawable.getClass());
        }
        if (res instanceof br_1) {
            br_1 br1 = (br_1) res;
            if (drawable instanceof br_1) {
                br1.na = ((br_1) drawable).na + " (" + color + ")";
            } else {
                br1.na = " (" + color + ")";
            }
        }
        if (res instanceof br_1) {
            ((br_1) res).na = oe0.Z3 + " (" + name + ", " + color + ")";
        }
        return res;
    }
}
