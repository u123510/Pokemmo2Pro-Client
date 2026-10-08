package cn.pokemmo.graphics.gdx.model;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.util.HashMap;
import java.util.function.BooleanSupplier;
import cn.pokemmo.graphics.material.attribute.GdxTextureAttribute;

public class GdxAnimatedModelInstance extends cn.pokemmo.graphics.gdx.model.GdxModelInstance {
    public static final dl_1 Yd0;
    public final C8 Eg;
    public x70_0 ep;
    public final String yI0;
    public int lw;
    public final float oU;
    public final C8 Zp;
    public final C8 Uz0;
    public float PE0;
    public ly0_0 Mp0;
    public ly0_0 dk;
    public final es_1 Kv;
    public HashMap lj0;
    public HashMap i10;
    public HashMap Sm0;
    public P7 Gb;
    public lg_1 lA0;
    public u5_0 FL0;
    public final LPT6_ wA;
    public float QT;
    public float jF;
    public float kv;
    public u4_0 FC0;
    public boolean I0;
    public boolean lpt4;
    public boolean t20;
    public Pv0 Ya;
    public Color Nh0;
    public Color Lh;
    public PRN_ LA0;
    public PRN_ jj;
    public pw_1 C9;
    public boolean gS;
    public boolean sY;
    public BooleanSupplier qp;
    public final in_2 kI0;
    public short IV;
    public Ou0 p8;
    public int AD;
    public final int tD;
    public boolean ST;
    public iy_0 Mm0;

    public GdxAnimatedModelInstance(ut_0 resources, String name, float opacity, u4_0 controller) {
        super(resources);
        this.Eg = new C8();
        this.Zp = new C8();
        this.Uz0 = new C8();
        this.PE0 = 1.0f;
        this.Mp0 = new ly0_0();
        this.dk = new ly0_0();
        this.Kv = new es_1();
        this.QT = 0.0f;
        this.jF = 0.0f;
        this.kv = 0.0f;
        this.I0 = false;
        this.lpt4 = false;
        this.t20 = false;
        this.gS = true;
        this.sY = true;
        this.qp = Ou0::Uj0;
        this.kI0 = new in_2(4000);
        this.IV = -1;
        this.AD = -1;
        this.ST = true;
        this.Mm0 = null;
        this.yI0 = name;
        this.tD = name.hashCode();
        this.oU = opacity;
        this.FC0 = controller;
        if (this.Y3.KB > 0) {
            BM material = (BM) this.Y3.get(0);
            GdxTextureAttribute animation = (GdxTextureAttribute) material.Qy(GdxTextureAttribute.g7);
            if (animation != null) {
                this.wA = new LPT6_((Texture) animation.I3.uj);
                float x = animation.B50;
                float y = animation.j70;
                this.wA.Ur0(x, x + animation.m90, y, y + animation.aU);
            } else {
                this.wA = null;
            }
        } else {
            this.wA = null;
        }
        this.he0();
        if (opacity != 64.0f) {
            ((Xz0) this.ZE0.get(0)).Fc0.Fg0(opacity / 64.0f);
        }
        this.a8();
    }

    public GdxAnimatedModelInstance(GdxAnimatedModelInstance other) {
        super(other, new Matrix4());
        this.Eg = new C8();
        this.Zp = new C8();
        this.Uz0 = new C8();
        this.PE0 = 1.0f;
        this.Mp0 = new ly0_0();
        this.dk = new ly0_0();
        this.Kv = new es_1();
        this.QT = 0.0f;
        this.jF = 0.0f;
        this.kv = 0.0f;
        this.I0 = false;
        this.lpt4 = false;
        this.t20 = false;
        this.gS = true;
        this.sY = true;
        this.qp = Ou0::Uj0;
        this.kI0 = new in_2(4000);
        this.IV = -1;
        this.AD = -1;
        this.tD = -1;
        this.ST = true;
        this.Mm0 = null;
        this.yI0 = other.yI0;
        this.oU = other.oU;
        this.lj0 = other.lj0;
        this.Sm0 = other.Sm0;
        this.i10 = other.i10;
        this.FC0 = other.FC0;
        this.Mp0.return$(other.dk);
        this.dk.return$(other.dk);
        this.wA = other.wA;
        this.he0();
        this.Kv.clear();
        this.Kv.E3(other.Kv);
        this.eB(true);
        this.AD = other.AD;
        this.ST = other.ST;
        this.Mm0 = other.Mm0;
    }

    public static boolean Uj0() {
        return true;
    }

    static {
        Yd0 = Cq0.E1(GdxAnimatedModelInstance.class);
    }

    public final void he0() {
        if (this.hW.AF.KB <= 0) {
            return;
        }
        this.ep = new x70_0(this);
        this.ep.sF = true;
        I2 iterator = this.hW.AF.ZD();
        while (iterator.hasNext()) {
            ji0_2 value = (ji0_2) iterator.next();
            this.Kv.Ue0(value.Ys0);
        }
    }

    public final void s30(short value) {
        this.IV = value;
    }

    public final void eB(boolean value) {
        this.I0 = value;
    }

    public final void Th() {
        if (this.Mp0 == null) {
            this.Mp0 = new ly0_0();
            this.dk = new ly0_0();
        }
        this.Mp0.br();
        int count = this.ZE0.KB;
        for (int i = 0; i < count; i++) {
            ((Xz0) this.ZE0.get(i)).Xm0(this.Mp0);
        }
        this.Zp.np(this.Mp0.Xm0);
        this.Uz0.np(this.Mp0.ec0);
        this.Uz0.Am0();
        this.dk.nF(this.Mp0.jG0, this.Mp0.Xa0);
    }

    public final void xg0(C8 first, C8 second) {
        if (this.Mp0 == null) {
            this.Mp0 = new ly0_0();
            this.dk = new ly0_0();
        }
        this.Mp0.nF(first, second);
        this.Zp.np(this.Mp0.Xm0);
        this.Uz0.np(this.Mp0.ec0);
        this.Uz0.Am0();
        this.dk.nF(this.Mp0.jG0, this.Mp0.Xa0);
    }

    public final void rF0() {
        this.Mp0.jG0.np(this.dk.jG0);
        this.Mp0.Xa0.np(this.dk.Xa0);
        this.Mp0.R00(this.ho);
    }

    public final void kk(float x, float y, float z) {
        this.dk.jG0.Vy(x, y, z);
        this.dk.Xa0.na(x, y, z);
        this.rF0();
    }

    public final void Dv(
            String animationName,
            String materialName,
            float duration,
            LPT6_[] textures,
            boolean immediate) {
        if (this.ff0(materialName) == null) {
            Yd0.info("Cant find material {} for texture uv animation = {}", materialName, animationName);
            return;
        }
        if (this.lj0 == null) {
            this.lj0 = new HashMap();
        }
        if (textures == null) {
            return;
        }
        i60 animation = new i60(materialName, duration, textures);
        if (this.lj0.get(animationName) == null) {
            this.lj0.put(animationName, new P7());
            this.Kv.Ue0(animationName);
        }
        ((P7) this.lj0.get(animationName)).ed0.Ue0(animation);
        if (!immediate && !animationName.equalsIgnoreCase("machine01")
                && !animationName.equalsIgnoreCase("machine02")
                && !animationName.equalsIgnoreCase("c1_school_01")
                && !animationName.equalsIgnoreCase("pcmachine01")
                && !animationName.equalsIgnoreCase("mball01")) {
            this.fm0(animationName, true);
        }
    }

    public final void Ru0(String animationName, String materialName, float duration, XR[] values, boolean immediate) {
        if (this.yI0.contains("pl_lite") && materialName.contains("out32_han2")) {
            materialName = "out32_han2_1";
        }
        if (this.ff0(materialName) == null) {
            return;
        }
        if (this.Sm0 == null) {
            this.Sm0 = new HashMap();
        }
        _throw animation = new _throw(materialName, duration, values);
        if (this.Sm0.get(animationName) == null) {
            this.Sm0.put(animationName, new lg_1());
            this.Kv.Ue0(animationName);
        }
        ((lg_1) this.Sm0.get(animationName)).r10.Ue0(animation);
        if (immediate) {
            this.ia(animationName, true);
        }
    }

    public final void Uo0(String name, float duration) {
        x70_0 controller = this.ep;
        if (controller == null) {
            return;
        }
        PG value = controller.Fe(name, 1, 0.0f, null);
        PG current = controller.mH0;
        if (current != null && current.DL0 == 0) {
            return;
        }
        if (current != null) {
            if (controller.hb != null) {
                controller.fn0.free(controller.hb);
            }
            controller.hb = value;
            controller.XL0 = 0.0f;
            if (controller.mH0 != null && controller.mH0.DL0 < 0) {
                controller.mH0.DL0 = 1;
            }
        } else {
            controller.oa0(value, 0.0f);
        }
    }

    public final PG sC0(int index, boolean flag, gw_0 callback) {
        if (index >= this.Kv.KB) {
            return null;
        }
        return this.Ey((String) this.Kv.get(index), flag, callback);
    }

    public final PG Ey(String name, boolean immediate, gw_0 callback) {
        PG selected = null;
        if (this.ep != null) {
            int count = this.HZ.KB;
            ji0_2 target = null;
            for (int i = 0; i < count; i++) {
                ji0_2 candidate = (ji0_2) this.HZ.get(i);
                if (candidate.Ys0.equals(name)) {
                    target = candidate;
                    break;
                }
            }
            if (target != null) {
                int mode = immediate ? Integer.MAX_VALUE : 1;
                selected = this.ep.Fe(name, mode, 1.0f, callback);
                PG current = this.ep.mH0;
                if (current == null) {
                    this.ep.mH0 = selected;
                } else if (!this.ep.sF && selected != null
                        && current.Ul0 == selected.Ul0) {
                    selected.Ym = current.Ym;
                } else {
                    I2 it = current.Ul0.jl.ZD();
                    while (it.hasNext()) {
                        ((yg0_0) it.next()).Cr.Jq = false;
                    }
                    this.ep.fn0.free(this.ep.mH0);
                    this.ep.mH0 = selected;
                }
                this.ep.RU = true;
                selected = selected;
            }
        }
        this.ia(name, immediate);
        this.fm0(name, immediate);
        if (this.i10 != null) {
            u5_0 state = (u5_0) this.i10.get(name);
            if (state != null) {
                state.Wd0 = immediate;
                this.FL0 = state;
                this.kv = 0.0f;
            }
        }
        return selected;
    }

    public final void fm0(String name, boolean value) {
        if (this.lj0 == null) {
            return;
        }
        P7 animation = (P7) this.lj0.get(name);
        if (animation == null) {
            return;
        }
        animation.m20 = value;
        this.Gb = animation;
        this.QT = 0.0f;
    }

    public final void ia(String name, boolean value) {
        if (this.Sm0 == null) {
            return;
        }
        lg_1 animation = (lg_1) this.Sm0.get(name);
        if (animation == null) {
            return;
        }
        animation.as = value;
        this.lA0 = animation;
        this.jF = 0.0f;
    }

    public final void EG() {
        if (this.ep != null && this.ep.mH0 != null) {
            this.ep.mH0.lK0 = 0.0f;
        }
        this.lA0 = null;
        this.Gb = null;
        if (this.FL0 != null) {
            I2 it = this.FL0.P30.ZD();
            while (it.hasNext()) {
                uy_1 value = (uy_1) it.next();
                _instanceof colors = (_instanceof) value.B3(2147483648.0f, false);
                BM material = this.ff0(value.GM);
                if (material == null) {
                    continue;
                }
                material.LPT8(new sh_0((float) colors.si / 31.0f));
                PRN_ color = (PRN_) material.sg(PRN_.Ly);
                if (color != null && colors.ai0 != -1) {
                    color.v50.set(colors.ai0);
                }
                color = (PRN_) material.sg(PRN_.zz);
                if (color != null && colors.OD != -1) {
                    color.v50.set(colors.OD);
                }
                color = (PRN_) material.sg(PRN_.sI);
                if (color != null && colors.pK0 != -1) {
                    color.v50.set(colors.pK0);
                }
                color = (PRN_) material.sg(PRN_.gp0);
                if (color != null && colors.EU != -1) {
                    color.v50.set(colors.EU);
                }
            }
        }
        this.FL0 = null;
    }

    public final void TI(boolean value) {
        for (int i = 0; i < this.Kv.KB; i++) {
            this.sC0(i, value, null);
        }
    }

    public final u4_0 ug0() {
        return this.FC0;
    }

    public void O4() {
        if (!this.I0 && !this.lpt4) {
            this.lpt4 = true;
            this.hW.dispose();
            if (this.FC0 != null && !this.FC0.wi0) {
                this.FC0.dispose();
            }
        }
    }

    public GdxAnimatedModelInstance Ma0() {
        GdxAnimatedModelInstance copy = new GdxAnimatedModelInstance(this);
        copy.I0 = true;
        return copy;
    }

    public final void Ck(String name) {
        BM material = this.ff0(name);
        if (material == null) {
            return;
        }
        if (this.LA0 == null) {
            this.Nh0 = new Color(-1);
            this.LA0 = new PRN_(PRN_.xE, this.Nh0);
        }
        material.LPT8(this.LA0);
    }

    public final void MZ(String name) {
        BM material = this.ff0(name);
        if (material == null) {
            return;
        }
        if (this.jj == null) {
            this.Lh = new Color(-1);
            this.jj = new PRN_(PRN_.xE, this.Lh);
        }
        material.LPT8(this.jj);
    }

    public final void Gv(String... names) {
        PRN_ color = new PRN_(PRN_.xE, new Color(-1));
        for (String name : names) {
            BM material = this.ff0(name);
            if (material != null) {
                material.LPT8(color);
            }
        }
    }

    public void bo0(float value) {
        this.P30(value, null);
    }

    public void eo0(C8 value) {
    }

    public final void P30(float value, rj0_2 colorState) {
        if (this.C9 != null && this.C9.BJ0()) {
            this.C9 = null;
        }
        if (this.IV > 0 && this.kI0.ty0()) {
            yt_1 render = tw0_0.e60;
            E90 effect = render == null ? null : render.jB0;
            C8 position;
            float distance;
            if (effect != null) {
                position = effect.L8.ze0;
                this.ho.V1(this.Eg);
                distance = this.Eg.SH0(position);
            } else {
                distance = 99999.0f;
            }
            if (distance < 4.0f) {
                float factor = (4.0f - distance) / 4.0f;
                tw0_0.RE0.IE(
                        (byte) 2,
                        this.IV,
                        (short) -1,
                        false,
                        0.0f,
                        1.0f,
                        factor,
                        0);
            }
        }
        this.aW(colorState, false);
        this.v3(value, lg_0.S4.uL);
    }

    public final void aW(rj0_2 state, boolean useStateColors) {
        if ((this.t20 || this.LA0 != null || this.jj != null) && c8_0.JD0 != null) {
            Pv0 current = c8_0.JD0.Yj();
            if (this.Nh0 != null && state != null) {
                if (useStateColors) {
                    this.Nh0.set(state.oE);
                    if (this.Lh != null) {
                        this.Lh.set(state.B90);
                    }
                } else if (this.C9 == null
                        && (!state.oE.equals(this.LA0.v50)
                        || (this.jj != null && !state.B90.equals(this.jj.v50)))) {
                    this.C9 = pw_1.xC().Xf0();
                    if (!state.oE.equals(this.LA0.v50)) {
                        this.C9.y80(ao_1.DX(this.Nh0, 0, 60).Om0(
                                new float[]{state.oE.r, state.oE.g, state.oE.b, state.oE.a}));
                    }
                    if (this.jj != null && !state.B90.equals(this.jj.v50)) {
                        this.C9.y80(ao_1.DX(this.Lh, 0, 60).Om0(
                                new float[]{state.B90.r, state.B90.g, state.B90.b, state.B90.a}));
                    }
                    this.C9.mz0().Ms(tw0_0.LD0.Ov);
                }
            }
            if (this.LA0 != null) {
                this.LA0.v50.set(this.Nh0);
            }
            if (this.jj != null) {
                this.jj.v50.set(this.Lh);
            }
            if (this.Ya != current && this.t20 && this.Kv.KB > 0) {
                int index = this.Kv.KB;
                if (current == Pv0.cY) {
                    index = 0;
                } else {
                    index--;
                }
                this.sC0(index, false, null);
                this.Ya = current;
            }
        }
    }

    public boolean COm8(Tv0 view) {
        if (!this.qp.getAsBoolean()) {
            return false;
        }
        if (!this.sY) {
            this.gS = true;
            return true;
        }
        fv_2 bounds = view.cON;
        ly0_0 transform = this.Mp0;
        int index = 0;
        for (; index < bounds.Bu.length; index++) {
            kg_0 corner = bounds.Bu[index];
            C8 probe = fv_2.V10;
            probe.x = transform.jG0.x;
            probe.y = transform.jG0.y;
            probe.z = transform.jG0.z;
            lpt2__2 expected = corner.OA(probe);
            if (expected != lpt2__2.Kj) {
                continue;
            }
            probe.x = transform.jG0.x;
            probe.y = transform.jG0.y;
            probe.z = transform.Xa0.z;
            if (corner.OA(probe) != expected) {
                continue;
            }
            probe.x = transform.jG0.x;
            probe.y = transform.Xa0.y;
            probe.z = transform.jG0.z;
            if (corner.OA(probe) != expected) {
                continue;
            }
            probe.x = transform.jG0.x;
            probe.y = transform.Xa0.y;
            probe.z = transform.Xa0.z;
            if (corner.OA(probe) != expected) {
                continue;
            }
            probe.x = transform.Xa0.x;
            probe.y = transform.jG0.y;
            probe.z = transform.jG0.z;
            if (corner.OA(probe) != expected) {
                continue;
            }
            probe.x = transform.Xa0.x;
            probe.y = transform.jG0.y;
            probe.z = transform.Xa0.z;
            if (corner.OA(probe) != expected) {
                continue;
            }
            probe.x = transform.Xa0.x;
            probe.y = transform.Xa0.y;
            probe.z = transform.jG0.z;
            if (corner.OA(probe) != expected) {
                continue;
            }
            probe.x = transform.Xa0.x;
            probe.y = transform.Xa0.y;
            probe.z = transform.Xa0.z;
            if (corner.OA(probe) == expected) {
                this.gS = false;
                return false;
            }
        }
        this.gS = true;
        return true;
    }

    public final void Ni(BooleanSupplier supplier) {
        this.qp = supplier;
    }

    public void v3(float time, float delta) {
        if (!this.gS) {
            return;
        }
        if (this.ep != null) {
            this.ep.qo(delta * this.PE0);
        }
        if (this.Gb != null) {
            if (this.QT == 0.0f && this.PE0 < 100000000.0f) {
                this.QT = time;
            }
            I2 iterator = this.Gb.ed0.ZD();
            while (iterator.hasNext()) {
                i60 animation = (i60) iterator.next();
                LPT6_ texture = (LPT6_) animation.B3((time - this.QT) * this.PE0, this.Gb.m20);
                if (texture != null) {
                    ((GdxTextureAttribute) this.ff0(animation.Xj).sg(GdxTextureAttribute.g7)).R4(texture);
                }
            }
        }
        if (this.FL0 != null) {
            if (this.kv == 0.0f && this.PE0 < 100000000.0f) {
                this.kv = time;
            }
            I2 iterator = this.FL0.P30.ZD();
            while (iterator.hasNext()) {
                uy_1 animation = (uy_1) iterator.next();
                _instanceof values = (_instanceof) animation.B3((time - this.kv) * this.PE0, this.FL0.Wd0);
                BM material = this.ff0(animation.GM);
                if (material == null) {
                    continue;
                }
                sh_0 brightness = (sh_0) material.sg(sh_0.vF0);
                if (brightness != null && values.si != -1) {
                    brightness.yt = (float) values.si / 31.0f;
                }
                PRN_ color = (PRN_) material.sg(PRN_.Ly);
                if (color != null && values.ai0 != -1) {
                    color.v50.set(values.ai0);
                }
                color = (PRN_) material.sg(PRN_.zz);
                if (color != null && values.OD != -1) {
                    color.v50.set(values.OD);
                }
                color = (PRN_) material.sg(PRN_.sI);
                if (color != null && values.pK0 != -1) {
                    color.v50.set(values.pK0);
                }
                color = (PRN_) material.sg(PRN_.gp0);
                if (color != null && values.EU != -1) {
                    color.v50.set(values.EU);
                }
            }
        }
        if (this.lA0 != null) {
            if (this.jF == 0.0f && this.PE0 < 100000000.0f) {
                this.jF = time;
            }
            I2 iterator = this.lA0.r10.ZD();
            while (iterator.hasNext()) {
                _throw animation = (_throw) iterator.next();
                XR values = (XR) animation.B3((time - this.jF) * this.PE0, this.lA0.as);
                if (values == null) {
                    continue;
                }
                GdxTextureAttribute target = (GdxTextureAttribute) this.ff0(animation.Yr).sg(GdxTextureAttribute.g7);
                float value = values.I1;
                if (value != 65535.0f) {
                    target.B50 = -value;
                }
                value = values.Yz0;
                if (value != 65535.0f) {
                    target.j70 = value;
                }
                value = values.ul;
                if (value != 65535.0f) {
                    target.m90 = value;
                }
                value = values.XU;
                if (value != 65535.0f) {
                    target.aU = value;
                }
                if (target.m90 == 0.0f && target.aU == 0.0f) {
                    target.B50 = 0.0500000007f;
                    target.j70 = 0.0500000007f;
                    target.m90 = 0.1000000015f;
                    target.aU = 0.1000000015f;
                }
            }
        }
    }

    public boolean VP() {
        return !(this instanceof VC0);
    }

    public final void Yt0(byte type, int region) {
        if (type == 2) {
            this.Ck("window");
            this.Ck("c6window");
            this.Ck("mado");
            this.Ck("h_mado");
            this.Ck("h_mado_1");
            this.Ck("h_mado_lm1");
            this.Ck("h_mado_lm2");
            this.Ck("h_mado_lm3");
            return;
        }
        if (type == 3) {
            if (this.yI0.equalsIgnoreCase("gym00")) {
                this.MZ("lambert5");
            } else {
                this.Ck("h_mado");
                this.Ck("h_mado_lm1");
                this.Ck("h_mado_lm2");
                this.Ck("h_mado_lm4");
                this.Ck("light");
                this.MZ("light_a");
                this.MZ("light2");
                this.MZ("pc_door");
                this.Gv("gate_3");
                this.Gv("gym_door00");
                this.Gv("c5_door_s");
                this.Gv("c1_fun2");
            }
            if (region == 6) {
                this.Ck("c1_s01_c");
                this.Ck("c1_b03_3_lm4");
                this.Ck("c1_b01_4_lm3");
                this.Ck("c1_b01_4_lm1");
                this.Gv("c1_s03_c_lm14");
                this.Ck("h_mado_lm5");
                this.Gv("c1_s02_4");
                return;
            }
            if (region == 9) {
                if (this.yI0.equalsIgnoreCase("c1_b02c") || this.yI0.equalsIgnoreCase("c1_b02a")) {
                    this.Ck("c1_b01_4_lm3");
                } else if (this.yI0.equalsIgnoreCase("c4_s01")) {
                    this.Gv("c4_mado");
                }
                return;
            }
        }
        if (region == 11) {
            if (this.yI0.equalsIgnoreCase("c06_s01")) {
                this.Gv("lambert9");
            }
        } else if (region == 12) {
            if (this.yI0.equalsIgnoreCase("c7_s01")) {
                this.Gv("lambert7", "lambert4", "lambert8");
                this.Ck("lambert3");
            } else if (this.yI0.equalsIgnoreCase("c7_s02a") || this.yI0.equalsIgnoreCase("c7_s02b")) {
                this.Ck("lambert4");
            }
        } else if (region == 13) {
            if (this.yI0.equalsIgnoreCase("c8_s02")) {
                this.Ck("lambert4");
            }
        } else if (region == 15) {
            if (this.yI0.equalsIgnoreCase("c10_s01")) {
                this.Gv("lambert3");
            }
        } else if (region == 25) {
            if (this.yI0.equalsIgnoreCase("r210h02")) {
                this.Gv("r210h02_c");
            }
        } else if (region == 28) {
            if (this.yI0.equalsIgnoreCase("r213s01") || this.yI0.equalsIgnoreCase("l2_s02a")) {
                this.Ck("lambert4");
            }
        } else if (region == 36) {
            if (this.yI0.equalsIgnoreCase("r221s01")) {
                this.Ck("lambert11");
                this.Gv("lambert12");
            }
        } else if (region == 73) {
            if (this.yI0.equalsIgnoreCase("l2_s01")) {
                this.Ck("lambert7");
                this.Gv("lambert5");
            } else if (this.yI0.equalsIgnoreCase("l2_s02a")) {
                this.Ck("lambert4");
            }
        } else if (region == 83 && this.yI0.equalsIgnoreCase("t7_s01")) {
            this.Ck("lambert9");
            this.Gv("lambert11");
        }
        if (type == 4) {
            this.Ck("h_mado");
            this.Ck("h_mado_lm1");
            this.Ck("h_mado_lm5");
            switch (this.AD) {
                case 21:
                    this.Ck("wk_labo_c");
                    break;
                case 47:
                    this.Ck("h_mado_lm4");
                    break;
                case 102:
                case 105:
                    this.Ck("_mado");
                    this.Ck("_h_mado");
                    break;
                case 104:
                    this.Ck("_mado");
                    this.Ck("_h_mado");
                    break;
                case 109:
                    this.Ck("h_mado_lm7");
                    break;
                case 116:
                    this.Ck("tn_photo_01w");
                    break;
                case 118:
                    this.Ck("h_mado_lm8");
                    break;
                case 132:
                    this.Ck("lambert6");
                    break;
                case 134:
                    this.Ck("_mado");
                    break;
                case 315:
                case 316:
                case 317:
                    this.Ck("mado");
                    break;
                default:
                    break;
            }
        }
    }

    public final void TU(int index, boolean flag) {
        this.sC0(index, flag, null);
    }

    public final void K50() {
        this.Ey("r04_w", true, null);
    }

    public final void RD0() {
        this.sY = false;
    }
}
