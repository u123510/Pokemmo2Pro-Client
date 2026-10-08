package cn.pokemmo.graphics.material.attribute;

import f.*;
import java.util.*;


public class CubemapAttribute extends BaseMaterialAttribute {
    public static final long qo0;
    public static final long Gg0;
    public final B90 ZD;

    public static final boolean tb0(long value) {
        return (value & Gg0) != 0L;
    }

    public CubemapAttribute(long value) {
        super(value);
        if (!tb0(value)) {
            throw new nf_1("Invalid type specified");
        }
        this.ZD = new B90();
    }

    public CubemapAttribute(long value, B90 state) {
        this(value);
        this.ZD.h1(state);
    }

    public CubemapAttribute(long value, AH0 texture) {
        this(value);
        this.ZD.uj = texture;
    }

    public CubemapAttribute(CubemapAttribute source) {
        this(source.yO, source.ZD);
    }

    static {
        qo0 = hf_1.T20("environmentCubemap");
        Gg0 = qo0;
    }

    @Override
    public hf_1 pD0() {
        return new f.lpt7__4(this);
    }

    @Override
    public final int hashCode() {
        return this.YF * 7241863 + this.ZD.hashCode();
    }

    @Override
    public final int compareTo(Object other) {
        CubemapAttribute value = (CubemapAttribute) other;
        if (this.yO != value.yO) {
            return (int) (this.yO - value.yO);
        }
        return this.ZD.kC(value.ZD);
    }
}
