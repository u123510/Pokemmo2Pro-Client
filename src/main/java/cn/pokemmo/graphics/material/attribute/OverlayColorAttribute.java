package cn.pokemmo.graphics.material.attribute;

import f.*;
import java.util.*;


import com.badlogic.gdx.graphics.Color;

public class OverlayColorAttribute extends BaseMaterialAttribute {
    public static final long XT = hf_1.T20("overlayColor");
    public final Color Vr = new Color();

    public static final boolean iX(long type) {
        return (type & XT) != 0L;
    }

    public OverlayColorAttribute(long type) {
        super(type);
        if (!iX(type)) {
            throw new nf_1("Invalid type specified");
        }
    }

    public OverlayColorAttribute(long type, Color color) {
        this(type);
        if (color != null) {
            this.Vr.set(color);
        }
    }

    public OverlayColorAttribute(long type, int ignored) {
        this(type);
        this.Vr.set(1.0F, 1.0F, 1.0F, 0.0F);
    }

    public hf_1 pD0() {
        return new f.Rv0(this.yO, this.Vr);
    }

    public final int hashCode() {
        return this.Vr.toIntBits() + this.YF * 7137017;
    }

    public final int compareTo(Object other) {
        hf_1 attribute = (hf_1)other;
        if (this.yO != attribute.yO) {
            return (int)(this.yO - attribute.yO);
        }
        return ((OverlayColorAttribute)attribute).Vr.toIntBits() - this.Vr.toIntBits();
    }
}
