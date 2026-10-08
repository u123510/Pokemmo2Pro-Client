package cn.pokemmo.ui.skin;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import f.*;

/**
 * 现代化重构类 - 原始类: f.A3
 */
public class GdxSceneSkin implements fy0_0 {

    public static final Class[] Gy;
    public final nb_2 f5;
    public final D30 ni0;
    public final float Jv;
    public final nb_2 TA;

    public final void zU(Dn0 dn0) {
        try {
            this.gk0(dn0).YC(dn0, GdxSceneSkin.class);
        }
        catch (WC0 wC0) {
            throw new WC0("Error reading file: " + dn0, (Throwable)wC0);
        }
    }

    public final void PRN(D30 d30) {
        es_1 regions = d30.kE;
        int n = regions.KB;
        for (int i = 0; i < n; ++i) {
            yo_2 yo_22 = (yo_2)regions.get(i);
            String string = yo_22.oL;
            if (yo_22.lw != -1) {
                string = AN.nK0((String)string, (String)"_").append(yo_22.lw).toString();
            }
            this.oj(LPT6_.class, yo_22, string);
        }
    }

    public final Object NQ(Class clazz) {
        return this.Ip(clazz, "default");
    }

    public final LPT6_ VD0(String string) {
        LPT6_ region = (LPT6_)this.Ob0(LPT6_.class, string);
        if (region != null) {
            return region;
        }
        Texture texture = (Texture)this.Ob0(Texture.class, string);
        if (texture != null) {
            LPT6_ region2 = new LPT6_(texture);
            this.oj(LPT6_.class, region2, string);
            return region2;
        }
        throw new nf_1("No TextureRegion or Texture registered with name: ".concat(string));
    }

    public final es_1 y9(String string) {
        es_1 es_12 = null;
        int n = 1;
        LPT6_ lPT6_ = (LPT6_)this.Ob0(LPT6_.class, string + "_0");
        if (lPT6_ != null) {
            es_12 = new es_1();
            while (lPT6_ != null) {
                es_12.Ue0((Object)lPT6_);
                lPT6_ = (LPT6_)this.Ob0(LPT6_.class, string + "_" + n++);
            }
        }
        return es_12;
    }

    public final pb_1 cG0(String name) {
        pb_1 patch = (pb_1)this.Ob0(pb_1.class, name);
        if (patch != null) {
            return patch;
        }
        LPT6_ region;
        try {
            region = this.VD0(name);
        }
        catch (nf_1 ex) {
            throw new nf_1("No NinePatch, TextureRegion, or Texture registered with name: ".concat(name));
        }
        if (region instanceof yo_2) {
            yo_2 atlasRegion = (yo_2)region;
            int[] split = atlasRegion.Xq("split");
            if (split != null) {
                patch = new pb_1(region, split[0], split[1], split[2], split[3]);
                int[] pad = atlasRegion.Xq("pad");
                if (pad != null) {
                    patch.VA0 = pad[0];
                    patch.yy0 = pad[1];
                    patch.Mh0 = pad[2];
                    patch.q5 = pad[3];
                }
            }
        }
        if (patch == null) {
            patch = new pb_1(region);
        }
        if (this.Jv != 1.0f) {
            patch.Rt(this.Jv, this.Jv);
        }
        this.oj(pb_1.class, patch, name);
        return patch;
    }

    public final B5 sA(String name) {
        B5 sprite = (B5)this.Ob0(B5.class, name);
        if (sprite != null) {
            return sprite;
        }
        LPT6_ region;
        try {
            region = this.VD0(name);
        }
        catch (nf_1 ex) {
            throw new nf_1("No NinePatch, TextureRegion, or Texture registered with name: ".concat(name));
        }
        if (region instanceof yo_2) {
            yo_2 atlasRegion = (yo_2)region;
            if (atlasRegion.yI || atlasRegion.wB != atlasRegion.Xr0 || atlasRegion.P4 != atlasRegion.BF0) {
                sprite = new tz_1(atlasRegion);
            }
        }
        if (sprite == null) {
            sprite = new B5(region);
        }
        if (this.Jv != 1.0f) {
            sprite.An(sprite.l() * this.Jv, sprite.LD0() * this.Jv);
        }
        this.oj(B5.class, sprite, name);
        return sprite;
    }

    public final YA Y8(String name) {
        YA drawable = (YA)this.Ob0(YA.class, name);
        if (drawable != null) {
            return drawable;
        }
        try {
            LPT6_ region = this.VD0(name);
            if (region instanceof yo_2) {
                yo_2 atlasRegion = (yo_2)region;
                if (atlasRegion.Xq("split") != null) {
                    drawable = new ke0_2(this.cG0(name));
                } else if (atlasRegion.yI || atlasRegion.wB != atlasRegion.Xr0 || atlasRegion.P4 != atlasRegion.BF0) {
                    drawable = new od_0(this.sA(name));
                }
            }
            if (drawable == null) {
                si_2 regionDrawable = new si_2(region);
                if (this.Jv != 1.0f) {
                    this.U90(regionDrawable);
                }
                drawable = regionDrawable;
            }
        }
        catch (nf_1 ex) {
            pb_1 patch = (pb_1)this.Ob0(pb_1.class, name);
            if (patch != null) {
                drawable = new ke0_2(patch);
            } else {
                B5 sprite = (B5)this.Ob0(B5.class, name);
                if (sprite == null) {
                    throw new nf_1("No Drawable, NinePatch, TextureRegion, Texture, or Sprite registered with name: ".concat(name));
                }
                drawable = new od_0(sprite);
            }
        }
        if (drawable instanceof br_1) {
            ((br_1)drawable).na = name;
        }
        this.oj(YA.class, drawable, name);
        return drawable;
    }
    public final void dispose() {
        if (this.ni0 != null) {
            this.ni0.dispose();
        }
        be_2 values = this.f5.Ww0();
        while (values.hasNext()) {
            nb_2 namedResources = (nb_2)values.next();
            be_2 resourceValues = namedResources.Ww0();
            while (resourceValues.hasNext()) {
                Object e = resourceValues.next();
                if (e instanceof fy0_0) {
                    ((fy0_0)e).dispose();
                }
            }
        }
    }

    public final void oj(Class clazz, Object object, String string) {
        if (string != null) {
            nb_2 nb_22 = (nb_2)this.f5.Wk0((Object)clazz);
            if (nb_22 == null) {
                int n = clazz != LPT6_.class && clazz != YA.class && clazz != B5.class ? 64 : 256;
                nb_22 = new nb_2(n);
                this.f5.WK0((Object)clazz, (Object)nb_22);
            }
            nb_22.WK0((Object)string, object);
            return;
        }
        throw new IllegalArgumentException("name cannot be null.");
    }

    public final Object Ip(Class clazz, String string) {
        if (string == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        if (clazz == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (clazz == YA.class) {
            return this.Y8(string);
        }
        if (clazz == LPT6_.class) {
            return this.VD0(string);
        }
        if (clazz == pb_1.class) {
            return this.cG0(string);
        }
        if (clazz == B5.class) {
            return this.sA(string);
        }
        nb_2 byName = (nb_2)this.f5.Wk0((Object)clazz);
        if (byName != null) {
            Object object = byName.Wk0((Object)string);
            if (object != null) {
                return object;
            }
        }
        throw new nf_1("No " + clazz.getName() + " registered with name: " + string);
    }

    public final Object Ob0(Class clazz, String string) {
        if (string != null) {
            nb_2 byName = (nb_2)this.f5.Wk0((Object)clazz);
            if (byName == null) {
                return null;
            }
            return byName.Wk0((Object)string);
        }
        throw new IllegalArgumentException("name cannot be null.");
    }

    public final void U90(si_2 si_22) {
        si_2 si_23 = si_22;
        float f = this.Jv;
        si_23.GA0 *= f;
        si_23.f60 *= f;
        si_23.bB *= f;
        si_23.dL0 *= f;
        si_23.wv *= f;
        si_23.u1 *= f;
    }

    public final je0_0 gk0(Dn0 object) {
        je0_0 je0_03 = new je0_0((A3) this);
        je0_03.wh0 = null;
        je0_03.Yv = false;
        je0_03.OW.WK0((Object)GdxSceneSkin.class, (Object)new bd_1((A3) this, (A3) this));
        je0_03.OW.WK0((Object)sc_0.class, (Object)new Z00(object, (A3) this));
        je0_03.OW.WK0((Object)Color.class, (Object)new Fi0((A3) this));
        je0_03.OW.WK0((Object)E50.class, (Object)new gx0_0((A3) this));
        a60_0 aliases = this.TA.lb0();
        while (aliases.hasNext()) {
            xn_1 xn_12 = (xn_1)aliases.next();
            String name = (String)xn_12.I20;
            Class clazz = (Class)xn_12.kM;
            je0_03.py0.WK0((Object)name, (Object)clazz);
            je0_03.F5.WK0((Object)clazz, (Object)name);
        }
        return je0_03;
    }

    public GdxSceneSkin() {
        this.f5 = new nb_2();
        this.Jv = 1.0f;
        this.TA = new nb_2(24);
        for (int i = 0; i < Gy.length; ++i) {
            Class clazz = Gy[i];
            this.TA.WK0((Object)clazz.getSimpleName(), (Object)clazz);
        }
        this.ni0 = null;
    }

    public GdxSceneSkin(Dn0 dn0) {
        this.f5 = new nb_2();
        this.Jv = 1.0f;
        this.TA = new nb_2(24);
        for (int i = 0; i < Gy.length; ++i) {
            Class clazz = Gy[i];
            this.TA.WK0((Object)clazz.getSimpleName(), (Object)clazz);
        }
        D30 atlas = null;
        Dn0 dn02 = dn0.xt(dn0.R20() + ".atlas");
        if (dn02.os0()) {
            atlas = new D30(dn02);
            this.PRN(atlas);
        }
        this.ni0 = atlas;
        this.zU(dn0);
    }

    public GdxSceneSkin(Dn0 dn0, D30 d30) {
        this.f5 = new nb_2();
        this.Jv = 1.0f;
        this.TA = new nb_2(24);
        for (int i = 0; i < Gy.length; ++i) {
            Class clazz = Gy[i];
            this.TA.WK0((Object)clazz.getSimpleName(), (Object)clazz);
        }
        this.ni0 = d30;
        this.PRN(d30);
        this.zU(dn0);
    }

    public GdxSceneSkin(D30 d30) {
        this.f5 = new nb_2();
        this.Jv = 1.0f;
        this.TA = new nb_2(24);
        for (int i = 0; i < Gy.length; ++i) {
            Class clazz = Gy[i];
            this.TA.WK0((Object)clazz.getSimpleName(), (Object)clazz);
        }
        this.ni0 = d30;
        this.PRN(d30);
    }
    static {
        Class[] classArray = new Class[24];
        Class[] classArray2 = classArray;
        classArray[0] = sc_0.class;
        classArray2[1] = Color.class;
        classArray2[2] = E50.class;
        classArray2[3] = ke0_2.class;
        classArray2[4] = od_0.class;
        classArray2[5] = si_2.class;
        classArray2[6] = XG.class;
        classArray2[7] = Gp0.class;
        classArray2[8] = ql0_1.class;
        classArray2[9] = C2.class;
        classArray2[10] = h3_0.class;
        classArray2[11] = T1.class;
        classArray2[12] = de0_2.class;
        classArray2[13] = WH.class;
        classArray2[14] = mb0_0.class;
        classArray2[15] = CG0.class;
        classArray2[16] = sd_1.class;
        classArray2[17] = tb_0.class;
        classArray2[18] = rf_0.class;
        classArray2[19] = K30.class;
        classArray2[20] = LD0.class;
        classArray2[21] = he_2.class;
        classArray2[22] = Un0.class;
        classArray2[23] = my_1.class;
        Gy = classArray2;
    }
}
