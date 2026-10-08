package cn.pokemmo.graphics.material.attribute;

import f.*;
import java.util.*;


public class DepthTestAttribute extends BaseMaterialAttribute {
    public static final long ZL;
    public static final long aX;
    public final int BA0;
    public final float sC0;
    public final float Sg;
    public final boolean WZ;

    public static final boolean JY(long value) {
        return (value & aX) != 0L;
    }

    public DepthTestAttribute() {
        this(515);
    }

    public DepthTestAttribute(boolean value) {
        this(515, value);
    }

    public DepthTestAttribute(int value) {
        this(value, true);
    }

    public DepthTestAttribute(int value, boolean enabled) {
        this(value, 0.0f, 1.0f, enabled);
    }

    public DepthTestAttribute(int value, float first, float second) {
        this(value, first, second, true);
    }

    public DepthTestAttribute(int value, float first, float second, boolean enabled) {
        this(ZL, value, first, second, enabled);
    }

    public DepthTestAttribute(long type, int value, float first, float second, boolean enabled) {
        super(type);
        if (!JY(type)) {
            throw new nf_1("Invalid type specified");
        }
        this.BA0 = value;
        this.sC0 = first;
        this.Sg = second;
        this.WZ = enabled;
    }

    public DepthTestAttribute(DepthTestAttribute other) {
        this(other.yO, other.BA0, other.sC0, other.Sg, other.WZ);
    }

    static {
        ZL = hf_1.T20("depthStencil");
        aX = ZL;
    }

    @Override
    public hf_1 pD0() {
        return new f.ma_1(this);
    }

    @Override
    public final int hashCode() {
        int result = this.YF * 7271819 + this.BA0;
        result = (result * 971) + Float.floatToRawIntBits(this.sC0);
        result = (result * 971) + Float.floatToRawIntBits(this.Sg);
        return result * 971 + (this.WZ ? 1 : 0);
    }

    @Override
    public final int compareTo(Object value) {
        hf_1 base = (hf_1) value;
        long leftType = this.yO;
        long rightType = base.yO;
        int result;
        if (leftType != rightType) {
            result = (int) (leftType - rightType);
        } else {
            DepthTestAttribute other = (DepthTestAttribute) base;
            if (this.BA0 != other.BA0) {
                result = this.BA0 - other.BA0;
            } else if (this.WZ != other.WZ) {
                result = this.WZ ? -1 : 1;
            } else if (!LW.LH0(this.sC0, other.sC0)) {
                result = this.sC0 < other.sC0 ? -1 : 1;
            } else if (!LW.LH0(this.Sg, other.Sg)) {
                result = this.Sg < other.Sg ? -1 : 1;
            } else {
                result = 0;
            }
        }
        return result;
    }
}
