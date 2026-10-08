package cn.pokemmo.graphics.material.attribute;

import f.*;
import java.util.*;


import com.badlogic.gdx.graphics.Texture;

public class TextureAttribute extends BaseMaterialAttribute {
    public static final long g7;
    public static final long GB0;
    public static final long NM;
    public static final long yS;
    public static final long cW;
    public static final long protected$;
    public static final long Dh0;
    public static final long zL;
    public static final /* synthetic */ int Hw = 0;
    public final B90 I3;
    public float B50;
    public float j70;
    public float m90;
    public float aU;
    public int uy;

    public static boolean const$(long j) {
        return (j & zL) != 0L;
    }

    public TextureAttribute(long j) {
        super(j);
        this.B50 = 0.0f;
        this.j70 = 0.0f;
        this.m90 = 1.0f;
        this.aU = 1.0f;
        this.uy = 0;
        if (!const$(j)) {
            throw new nf_1("Invalid type specified");
        }
        this.I3 = new B90();
    }

    public TextureAttribute(long j, B90 b90) {
        this(j);
        this.I3.h1(b90);
    }

    public TextureAttribute(long j, B90 b90, float f, float f2, float f3, float f4, int i) {
        this(j, b90);
        this.B50 = f;
        this.j70 = f2;
        this.m90 = f3;
        this.aU = f4;
        this.uy = i;
    }

    public TextureAttribute(long j, B90 b90, float f, float f2, float f3, float f4) {
        this(j, b90, f, f2, f3, f4, 0);
    }

    public TextureAttribute(long j, Texture texture) {
        this(j);
        this.I3.uj = texture;
    }

    public TextureAttribute(long j, LPT6_ lpt6_) {
        this(j);
        this.R4(lpt6_);
    }

    public TextureAttribute(TextureAttribute mz_22) {
        this(mz_22.yO, mz_22.I3, mz_22.B50, mz_22.j70, mz_22.m90, mz_22.aU, mz_22.uy);
    }

    static {
        g7 = hf_1.T20("diffuseTexture");
        GB0 = hf_1.T20("specularTexture");
        long bump = hf_1.T20("bumpTexture");
        NM = bump;
        long normal = hf_1.T20("normalTexture");
        yS = normal;
        long ambient = hf_1.T20("ambientTexture");
        cW = ambient;
        long emissive = hf_1.T20("emissiveTexture");
        protected$ = emissive;
        long reflection = hf_1.T20("reflectionTexture");
        Dh0 = reflection;
        zL = g7 | GB0 | bump | normal | ambient | emissive | reflection;
    }

    public final void R4(LPT6_ lpt6_) {
        this.I3.uj = lpt6_.OB;
        float yQ = lpt6_.yQ;
        this.B50 = yQ;
        float y60 = lpt6_.Y60;
        this.j70 = y60;
        this.m90 = lpt6_.Yo - yQ;
        this.aU = lpt6_.Ll0 - y60;
    }

    @Override
    public hf_1 pD0() {
        return new f.mz_2(this);
    }

    @Override
    public final int hashCode() {
        int i = this.YF * 7421599;
        i = (this.I3.hashCode() + i) * 991;
        i = (Float.floatToRawIntBits(this.B50) + i) * 991;
        i = (Float.floatToRawIntBits(this.j70) + i) * 991;
        i = (Float.floatToRawIntBits(this.m90) + i) * 991;
        i = (Float.floatToRawIntBits(this.aU) + i) * 991;
        return this.uy + i;
    }

    @Override
    public final int compareTo(Object v1) {
        hf_1 other = (hf_1) v1;
        long yO1 = this.yO;
        long yO2 = other.yO;
        if (yO1 != yO2) {
            return yO1 < yO2 ? -1 : 1;
        }
        TextureAttribute otherMz = (TextureAttribute) v1;
        int cmp = this.I3.kC(otherMz.I3);
        if (cmp != 0) {
            return cmp;
        }
        int uy1 = this.uy;
        int uy2 = otherMz.uy;
        if (uy1 != uy2) {
            return uy1 - uy2;
        }
        if (!LW.LH0(this.m90, otherMz.m90)) {
            return this.m90 <= otherMz.m90 ? -1 : 1;
        }
        if (!LW.LH0(this.aU, otherMz.aU)) {
            return this.aU <= otherMz.aU ? -1 : 1;
        }
        if (!LW.LH0(this.B50, otherMz.B50)) {
            return this.B50 <= otherMz.B50 ? -1 : 1;
        }
        if (!LW.LH0(this.j70, otherMz.j70)) {
            return this.j70 <= otherMz.j70 ? -1 : 1;
        }
        return 0;
    }
}
