package cn.pokemmo.graphics.model;

import f.*;

public class ModelBoneTransformNode extends com1__0 {
    public final Dn0 U7;
    public final A3 C0;

    public ModelBoneTransformNode(Dn0 dn0, A3 a3) {
        this.U7 = dn0;
        this.C0 = a3;
    }

    @Override
    public final Object Ot0(gp_1 gp_1Var, oe_0 oe_0Var) {
        String str = ".png";
        String str2 = (String) h4_0.Lpt6(gp_1Var, oe_0Var, "file", String.class, null);
        Class<Float> cls = Float.TYPE;
        Float valueOf = Float.valueOf(-1.0f);
        oe_0 Is = oe_0Var.Is("scaledSize");
        if (Is != null) {
            valueOf = (Float) gp_1Var.b20(cls, null, Is);
        }
        float floatValue = valueOf.floatValue();
        Boolean bool = Boolean.FALSE;
        oe_0 Is2 = oe_0Var.Is("flip");
        if (Is2 != null) {
            bool = (Boolean) gp_1Var.b20(Boolean.class, null, Is2);
        }
        Boolean bool2 = Boolean.FALSE;
        oe_0 Is3 = oe_0Var.Is("markupEnabled");
        if (Is3 != null) {
            bool2 = (Boolean) gp_1Var.b20(Boolean.class, null, Is3);
        }
        Boolean bool3 = Boolean.TRUE;
        oe_0 Is4 = oe_0Var.Is("useIntegerPositions");
        if (Is4 != null) {
            bool3 = (Boolean) gp_1Var.b20(Boolean.class, null, Is4);
        }
        Dn0 wp = this.U7.Br().wp(str2);
        if (!wp.os0()) {
            lg_0.I70.getClass();
            wp = new VE(str2, zv_1.tt0);
        }
        if (!wp.os0()) {
            throw new WC0("Font file not found: " + wp);
        }
        String R20 = wp.R20();
        try {
            es_1 y9 = this.C0.y9(R20);
            sc_0 sc_0Var;
            if (y9 != null) {
                sc_0Var = new sc_0(new mh0_0(wp, bool.booleanValue()), y9, true);
            } else {
                LPT6_ lpt6_ = (LPT6_) this.C0.Ob0(LPT6_.class, R20);
                if (lpt6_ != null) {
                    sc_0Var = new sc_0(wp, lpt6_, bool.booleanValue());
                } else {
                    Dn0 wp2 = wp.Br().wp(R20.concat(str));
                    if (wp2.os0()) {
                        sc_0Var = new sc_0(wp, wp2, bool.booleanValue());
                    } else {
                        sc_0Var = new sc_0(wp, bool.booleanValue());
                    }
                }
            }
            sc_0Var.U5.oj = bool2.booleanValue();
            boolean booleanValue = bool3.booleanValue();
            sc_0Var.lg0 = booleanValue;
            sc_0Var.Rh.Ln0 = booleanValue;
            if (floatValue != -1.0f) {
                sc_0Var.U5.dK0(floatValue / sc_0Var.U5.g4);
            }
            return sc_0Var;
        } catch (RuntimeException e) {
            throw new WC0("Error loading bitmap font: " + wp, e);
        }
    }
}
