package cn.pokemmo.graphics.material.attribute;

import f.*;
import java.util.*;


public class TextureFormatAttribute extends BaseMaterialAttribute {
    public static final long Nr;
    public static final long DK0;
    public final int Ch0;

    public static Boolean Ae0(long value) {
        return Boolean.valueOf((value & Nr) != 0L || (value & DK0) != 0L);
    }

    public TextureFormatAttribute(long value) {
        this(value, 0);
    }

    public TextureFormatAttribute(long value, int index) {
        super(value);
        if (!Ae0(value).booleanValue()) {
            throw new nf_1("Invalid type specified");
        }
        this.Ch0 = index;
    }

    public TextureFormatAttribute(TextureFormatAttribute source) {
        this(source.yO, source.Ch0);
    }

    static {
        Nr = hf_1.T20("texFormat");
        DK0 = hf_1.T20("GX_TEXFMT_A5I3");
    }

    @Override
    public hf_1 pD0() {
        return new f.xd_2(this);
    }

    @Override
    public final int hashCode() {
        return this.YF * 37445 + (this.Ch0 ^ (this.Ch0 >>> 32));
    }

    @Override
    public final int compareTo(Object value) {
        return 1;
    }
}
