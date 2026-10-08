package cn.pokemmo.graphics.material.attribute;

import f.*;
import java.util.*;


import com.badlogic.gdx.graphics.Color;

public class GlowAttribute extends BaseMaterialAttribute {
    public static final long UG;
    public float nF0;
    public final float hL;
    public float aD;
    public final Color CD0;

    public static final boolean CY(long value) {
        return (value & UG) != 0L;
    }

    public GlowAttribute(long value) {
        super(value);
        this.nF0 = 1.75F;
        this.hL = 0.1000000015F;
        this.aD = 0.200000003F;
        this.CD0 = new Color(1F, 1F, 1F, 1F);
        if (!CY(value)) {
            throw new nf_1("Invalid type specified");
        }
    }

    public GlowAttribute(long value, Color color, float alpha) {
        this(value);
        if (color != null) {
            this.CD0.set(color);
        }
        this.aD = alpha;
    }

    static {
        UG = hf_1.T20("glow");
    }

    @Override
    public hf_1 pD0() {
        return new f.na0_0(this.yO, this.CD0, this.aD);
    }

    @Override
    public final int hashCode() {
        int result = this.YF * 7137017;
        return this.CD0.toIntBits() + result;
    }

    @Override
    public final int compareTo(Object value) {
        hf_1 other = (hf_1) value;
        if (this.yO != other.yO) {
            return (int) (this.yO - other.yO);
        }
        return ((GlowAttribute) other).CD0.toIntBits() - this.CD0.toIntBits();
    }
}
