package cn.pokemmo.graphics.material.attribute;

import f.*;
import java.util.*;


public class BlendingAttribute extends BaseMaterialAttribute {
    public static final long vF0;
    public static final int vn = 0;
    public final boolean yg;
    public final int W00;
    public final int Rs;
    public float yt;

    public BlendingAttribute() {
        this((BlendingAttribute)null);
    }

    public BlendingAttribute(boolean enabled, int source, int destination, float alpha) {
        super(vF0);
        this.yg = enabled;
        this.W00 = source;
        this.Rs = destination;
        this.yt = alpha;
    }

    public BlendingAttribute(int source, int destination, float alpha) {
        this(true, source, destination, alpha);
    }

    public BlendingAttribute(int source, int destination) {
        this(source, destination, 1.0f);
    }

    public BlendingAttribute(boolean enabled, float alpha) {
        this(enabled, 770, 771, alpha);
    }

    public BlendingAttribute(float alpha) {
        this(true, alpha);
    }

    public BlendingAttribute(BlendingAttribute other) {
        this(other == null || other.yg, other == null ? 770 : other.W00,
                other == null ? 771 : other.Rs, other == null ? 1.0f : other.yt);
    }

    static {
        vF0 = hf_1.T20("blended");
    }

    @Override
    public final int hashCode() {
        int result = (this.YF * 7092083 + (this.yg ? 1 : 0)) * 947 + this.W00;
        result = (result * 947 + this.Rs) * 947;
        return Float.floatToRawIntBits(this.yt) + result;
    }

    @Override
    public hf_1 pD0() {
        return new f.sh_0(this);
    }

    @Override
    public final int compareTo(Object object) {
        BlendingAttribute other = (BlendingAttribute)object;
        long left = this.yO;
        long right = other.yO;
        if (left != right) {
            return (int)(left - right);
        }
        if (this.yg != other.yg) {
            return this.yg ? 1 : -1;
        }
        if (this.W00 != other.W00) {
            return this.W00 - other.W00;
        }
        if (this.Rs != other.Rs) {
            return this.Rs - other.Rs;
        }
        if (LW.LH0(this.yt, other.yt)) {
            return 0;
        }
        return this.yt < other.yt ? -1 : 1;
    }
}
