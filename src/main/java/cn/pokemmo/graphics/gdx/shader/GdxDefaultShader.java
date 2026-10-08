/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.shader;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Matrix4;
import f.AN;
import f.C8;
import f.CO;
import f.CP;
import f.Ew0;
import f.I2;
import f.J0;
import f.Lm0;
import f.MS;
import f.PRN_;
import f.QA0;
import f.Tv0;
import f.U5;
import f.VE;
import f.W00;
import f.Wm0;
import f.com6__2;
import f.com9__4;
import f.dm0_0;
import f.es_1;
import f.fi_2;
import f.fp0_0;
import f.fy0_0;
import f.hf_1;
import f.i00_0;
import f.id_2;
import f.kz_0;
import f.lg_0;
import f.lpt7__4;
import f.lt_1;
import f.ma_1;
import f.mb0_2;
import f.mv_0;
import f.mz_2;
import f.nf_1;
import f.pc0_2;
import f.pr_1;
import f.qi_1;
import f.qk_1;
import f.qv_0;
import f.sh_0;
import f.wh_0;
import f.xr_2;
import f.yr_1;
import f.zv_1;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GdxDefaultShader
extends f.Wm0 {
    public static String iy;
    public static String CY;
    public static final long nb0;
    public static final int Sx;
    public static final int L80;
    public static final long Rq0;
    public static final wh_0 Vw;
    public final int lpt5;
    public final int ag;
    public final int d00;
    public final int ct0;
    public final int Gv;
    public final int Xl0;
    public final int Z10;
    public final int gE0;
    public final int fN;
    public final int vb0;
    public final int nU;
    public final int xa0;
    public final int RZ;
    public final int Y60;
    public final int Vy0;
    public final int QU;
    public final int q70;
    public final int m9;
    public int Rn0;
    public int bK0;
    public int mD0;
    public int Di0;
    public int nO;
    public int xX;
    public int hg0;
    public int Jd0;
    public int interface$;
    public int S70;
    public int CZ;
    public int ar0;
    public int Av;
    public int yc0;
    public int qs0;
    public int tE0;
    public int l8;
    public final boolean zl;
    public final boolean me;
    public final qv_0[] cp;
    public final dm0_0[] LC0;
    public final Ew0[] l9;
    public W00 kN;
    public final long dI0;
    public final long Com3;
    public final int Jc0;
    public final int[] zd;
    public final mv_0 pj;
    public float eu;
    public boolean Yg0;

    public static String getDefaultVertexShader() {
        if (iy == null) {
            String string = "com/badlogic/gdx/graphics/g3d/shaders/default.vertex.glsl";
            lg_0.I70.getClass();
            iy = new VE(string, zv_1.Gi0).gd0(null);
        }
        return iy;
    }

    public static String getDefaultFragmentShader() {
        if (CY == null) {
            String string = "com/badlogic/gdx/graphics/g3d/shaders/default.fragment.glsl";
            lg_0.I70.getClass();
            CY = new VE(string, zv_1.Gi0).gd0(null);
        }
        return CY;
    }

    public GdxDefaultShader(W00 renderable) {
        this(renderable, new mv_0());
    }

    public GdxDefaultShader(W00 renderable, mv_0 config) {
        this(renderable, config, TD.tz(renderable, config));
    }

    public GdxDefaultShader(W00 renderable, mv_0 config, String prefix) {
        this(renderable, config, prefix, config.wg0 == null ? TD.getDefaultVertexShader() : config.wg0,
            config.f3 == null ? TD.getDefaultFragmentShader() : config.f3);
    }

    public GdxDefaultShader(W00 renderable, mv_0 config, String prefix, String vertexShader, String fragmentShader) {
        this(renderable, config, new lt_1(QA0.W0(prefix, vertexShader), QA0.W0(prefix, fragmentShader)));
    }

    public GdxDefaultShader(W00 renderable, mv_0 config, lt_1 shaderProgram) {
        this.ct0 = this.register(new com9__4("u_dirLights[0].color"));
        this.Gv = this.register(new com9__4("u_dirLights[0].direction"));
        this.Xl0 = this.register(new com9__4("u_dirLights[1].color"));
        this.Z10 = this.register(new com9__4("u_pointLights[0].color"));
        this.gE0 = this.register(new com9__4("u_pointLights[0].position"));
        this.fN = this.register(new com9__4("u_pointLights[0].intensity"));
        this.vb0 = this.register(new com9__4("u_pointLights[1].color"));
        this.nU = this.register(new com9__4("u_spotLights[0].color"));
        this.xa0 = this.register(new com9__4("u_spotLights[0].position"));
        this.RZ = this.register(new com9__4("u_spotLights[0].intensity"));
        this.Y60 = this.register(new com9__4("u_spotLights[0].direction"));
        this.Vy0 = this.register(new com9__4("u_spotLights[0].cutoffAngle"));
        this.QU = this.register(new com9__4("u_spotLights[0].exponent"));
        this.q70 = this.register(new com9__4("u_spotLights[1].color"));
        this.m9 = this.register(new com9__4("u_fogColor"));
        this.register(new com9__4("u_shadowMapProjViewTrans"));
        this.register(new com9__4("u_shadowTexture"));
        this.register(new com9__4("u_shadowPCFOffset"));

        wh_0 attributes = TD.xm0(renderable);
        this.pj = config;
        this.program = shaderProgram;
        this.zl = renderable.AA0 != null;
        this.me = attributes.tM(lpt7__4.qo0) || this.zl && attributes.tM(lpt7__4.qo0);
        this.kN = renderable;
        this.dI0 = attributes.N30() | Rq0;
        this.Com3 = renderable.VE0.m8.zh0().vJ0();
        this.Jc0 = renderable.VE0.m8.zh0().g();

        int directionalCount = this.zl && config.HA > 0 ? config.HA : 0;
        this.cp = new qv_0[directionalCount];
        for (int index = 0; index < this.cp.length; index++) {
            this.cp[index] = new qv_0();
        }

        int pointCount = this.zl && config.F80 > 0 ? config.F80 : 0;
        this.LC0 = new dm0_0[pointCount];
        for (int index = 0; index < this.LC0.length; index++) {
            this.LC0[index] = new dm0_0();
        }

        this.l9 = new Ew0[0];
        if (!config.yI0 && (nb0 & this.dI0) != this.dI0) {
            throw new nf_1("Some attributes not implemented yet (" + this.dI0 + ")");
        }
        if (renderable.lpt7 != null && renderable.lpt7.length > config.el) {
            throw new nf_1("too many bones: " + renderable.lpt7.length + ", max configured: " + config.el);
        }

        int boneWeights = renderable.VE0.m8.zh0().ab0();
        if (boneWeights > config.W60) {
            throw new nf_1(CO.go("too many bone weights: ", boneWeights, ", max configured: ").append(config.W60).toString());
        }
        if (renderable.lpt7 != null) {
            this.zd = new int[config.W60];
        } else {
            this.zd = null;
        }

        this.register(qk_1.Oe, com6__2.Yd);
        this.register(qk_1.prN, com6__2.Pd);
        this.register(qk_1.ms, com6__2.ss);
        this.register(qk_1.yz0, com6__2.kn);
        this.register(qk_1.YR, com6__2.Jm);
        this.register(qk_1.M30, com6__2.Nb);
        this.register(qk_1.DH, com6__2.PK);
        this.lpt5 = this.register(new com9__4("u_time"));
        this.register(qk_1.KG0, com6__2.Lm);
        this.register(qk_1.ks0, com6__2.Nv);
        this.register(qk_1.vf0, com6__2.I7);
        this.register(qk_1.Qz, com6__2.CV);
        if (renderable.lpt7 != null && config.el > 0) {
            this.register(qk_1.zl, new MS(config.el));
        }
        this.register(qk_1.X5, com6__2.B70);
        this.ag = this.register(qk_1.Mw);
        this.register(qk_1.nQ, com6__2.CoM2);
        this.register(qk_1.da, com6__2.PrN);
        this.register(qk_1.Ll0, com6__2.nn);
        this.register(qk_1.uL, com6__2.Gz0);
        this.register(qk_1.lk, com6__2.kQ);
        this.register(qk_1.fA, com6__2.bU);
        this.register(qk_1.mR, com6__2.fM0);
        this.register(qk_1.S90, com6__2.hL0);
        this.register(qk_1.o60, com6__2.iY);
        this.register(qk_1.oo0, com6__2.ew);
        this.register(qk_1.r80, com6__2.Ix0);
        this.register(qk_1.Un0, com6__2.rx0);
        this.register(qk_1.Rh, com6__2.y50);
        this.register(qk_1.EH0, com6__2.H90);
        this.register(qk_1.C50, com6__2.wk);
        this.register(qk_1.Uu, com6__2.coM1);
        this.d00 = this.register(qk_1.u2);
        if (this.zl) {
            this.register(qk_1.kJ0, new J0(config.HA, config.F80));
        }
        if (this.me) {
            this.register(qk_1.zJ, com6__2.eH);
        }
    }

    public static final boolean Rj0(long l, long l2) {
        return (l & l2) == l2;
    }

    public static final wh_0 xm0(W00 renderable) {
        wh_0 attributes = Vw;
        attributes.ni0 = 0L;
        attributes.VH.clear();
        if (renderable.AA0 != null) {
            attributes.zc(renderable.AA0);
        }
        if (renderable.ly != null) {
            attributes.zc(renderable.ly);
        }
        return attributes;
    }

    public static String tz(W00 w00, mv_0 mv_02) {
        long l;
        W00 w002 = w00;
        wh_0 wh_02 = TD.xm0(w002);
        String string = "";
        long l2 = wh_02.ni0;
        long l3 = w002.VE0.m8.COM6.JP().Js0();
        if (TD.Rj0(l3, 1L)) {
            string = "#define positionFlag\n";
        }
        if ((l3 & 6L) != 0L) {
            string = QA0.W0(string, "#define colorFlag\n");
        }
        if (TD.Rj0(l3, 256L)) {
            string = QA0.W0(string, "#define binormalFlag\n");
        }
        if (TD.Rj0(l3, 128L)) {
            string = QA0.W0(string, "#define tangentFlag\n");
        }
        if (TD.Rj0(l3, 8L)) {
            string = QA0.W0(string, "#define normalFlag\n");
        }
        if ((TD.Rj0(l3, 8L) || TD.Rj0(l3, 384L)) && w00.AA0 != null) {
            string = QA0.W0(fp0_0.uD(AN.nK0(fp0_0.uD(AN.nK0(QA0.W0(QA0.W0(string, "#define lightingFlag\n"), "#define ambientCubemapFlag\n"), "#define numDirectionalLights "), mv_02.HA, "\n"), "#define numPointLights "), mv_02.F80, "\n"), "#define numSpotLights 0\n");
            if (wh_02.tM(PRN_.YI0)) {
                string = QA0.W0(string, "#define fogFlag\n");
            }
            w00.AA0.getClass();
            if (wh_02.tM(lpt7__4.qo0)) {
                string = QA0.W0(string, "#define environmentCubemapFlag\n");
            }
        }
        int n = w00.VE0.m8.COM6.JP().Os.length;
        for (int j = 0; j < n; ++j) {
            kz_0 kz_02 = w00.VE0.m8.COM6.JP().Os[j];
            if (kz_02.tM != 16) continue;
            string = fp0_0.uD(AN.nK0(string, "#define texCoord"), kz_02.sf, "Flag\n");
        }
        if (w00.lpt7 != null) {
            for (n = 0; n < mv_02.W60; ++n) {
                string = string + "#define boneWeight" + n + "Flag\n";
            }
        }
        if ((l2 & (l = sh_0.vF0)) == l) {
            string = QA0.W0(string, "#define blendedFlag\n");
        }
        if ((l2 & (l = mz_2.g7)) == l) {
            string = QA0.W0(QA0.W0(string, "#define diffuseTextureFlag\n"), "#define diffuseTextureCoord texCoord0\n");
        }
        if ((l2 & (l = mz_2.GB0)) == l) {
            string = QA0.W0(QA0.W0(string, "#define specularTextureFlag\n"), "#define specularTextureCoord texCoord0\n");
        }
        if ((l2 & (l = mz_2.yS)) == l) {
            string = QA0.W0(QA0.W0(string, "#define normalTextureFlag\n"), "#define normalTextureCoord texCoord0\n");
        }
        if ((l2 & (l = mz_2.protected$)) == l) {
            string = QA0.W0(QA0.W0(string, "#define emissiveTextureFlag\n"), "#define emissiveTextureCoord texCoord0\n");
        }
        if ((l2 & (l = mz_2.Dh0)) == l) {
            string = QA0.W0(QA0.W0(string, "#define reflectionTextureFlag\n"), "#define reflectionTextureCoord texCoord0\n");
        }
        if ((l2 & (l = mz_2.cW)) == l) {
            string = QA0.W0(QA0.W0(string, "#define ambientTextureFlag\n"), "#define ambientTextureCoord texCoord0\n");
        }
        if ((l2 & (l = PRN_.Ly)) == l) {
            string = QA0.W0(string, "#define diffuseColorFlag\n");
        }
        if ((l2 & (l = PRN_.zz)) == l) {
            string = QA0.W0(string, "#define specularColorFlag\n");
        }
        if ((l2 & (l = PRN_.sI)) == l) {
            string = QA0.W0(string, "#define emissiveColorFlag\n");
        }
        if ((l2 & (l = PRN_.Ar)) == l) {
            string = QA0.W0(string, "#define reflectionColorFlag\n");
        }
        if ((l2 & (l = mb0_2.an0)) == l) {
            string = QA0.W0(string, "#define shininessFlag\n");
        }
        if ((l2 & (l2 = mb0_2.k6)) == l2) {
            string = QA0.W0(string, "#define alphaTestFlag\n");
        }
        if (w00.lpt7 != null && mv_02.el > 0) {
            string = fp0_0.uD(AN.nK0(string, "#define numBones "), mv_02.el, "\n");
        }
        return string;
    }

    static {
        nb0 = sh_0.vF0 | mz_2.g7 | PRN_.Ly | PRN_.zz | mb0_2.an0;
        Sx = 1029;
        L80 = 515;
        Rq0 = pr_1.av | ma_1.ZL;
        Vw = new wh_0();
    }

    @Override
    public final void init() {
        lt_1 lt_12 = this.program;
        this.program = null;
        W00 w00 = this.kN;
        this.init(lt_12, w00);
        this.kN = null;
        this.Rn0 = this.loc(this.ct0);
        this.bK0 = this.loc(this.ct0) - this.Rn0;
        this.mD0 = this.loc(this.Gv) - this.Rn0;
        this.Di0 = this.loc(this.Xl0) - this.Rn0;
        if (this.Di0 < 0) {
            this.Di0 = 0;
        }
        this.nO = this.loc(this.Z10);
        this.xX = this.loc(this.Z10) - this.nO;
        this.hg0 = this.loc(this.gE0) - this.nO;
        int n = this.has(this.fN) ? this.loc(this.fN) - this.nO : -1;
        this.Jd0 = n;
        this.interface$ = this.loc(this.vb0) - this.nO;
        if (this.interface$ < 0) {
            this.interface$ = 0;
        }
        this.S70 = this.loc(this.nU);
        this.CZ = this.loc(this.nU) - this.S70;
        this.ar0 = this.loc(this.xa0) - this.S70;
        this.Av = this.loc(this.Y60) - this.S70;
        n = this.has(this.RZ) ? this.loc(this.RZ) - this.S70 : -1;
        this.yc0 = n;
        this.qs0 = this.loc(this.Vy0) - this.S70;
        this.tE0 = this.loc(this.QU) - this.S70;
        this.l8 = this.loc(this.q70) - this.S70;
        if (this.l8 < 0) {
            this.l8 = 0;
        }
        if (this.zd != null) {
            for (n = 0; n < this.zd.length; n++) {
                this.zd[n] = lt_12.Us.Rl0(-1, yr_1.pG("a_boneWeight", n));
            }
        }
    }

    @Override
    public final boolean canRender(W00 w00) {
        Matrix4[] matrix4Array = w00.lpt7;
        if (w00.lpt7 != null) {
            if (matrix4Array.length > this.pj.el) {
                return false;
            }
            if (w00.VE0.m8.COM6.JP().ab0() > this.pj.W60) {
                return false;
            }
        }
        if (w00.VE0.m8.COM6.JP().g() != this.Jc0) {
            return false;
        }
        long l = 0L;
        wh_0 wh_02 = w00.AA0;
        if (wh_02 != null) {
            l = wh_02.ni0;
        }
        if ((wh_02 = w00.ly) != null) {
            l |= wh_02.ni0;
        }
        return this.dI0 == (l | Rq0) && this.Com3 == w00.VE0.m8.COM6.JP().vJ0() && w00.AA0 != null == this.zl;
    }

    public final boolean equals(Object object) {
        return object instanceof TD && (TD)object == this;
    }

    @Override
    public final void begin(Tv0 camera, qi_1 context) {
        super.begin(camera, context);
        for (qv_0 light : this.cp) {
            light.l0.set(0.0f, 0.0f, 0.0f, 1.0f);
            light.jf.x = 0.0f;
            light.jf.y = -1.0f;
            light.jf.z = 0.0f;
            light.jf.KM();
        }
        for (dm0_0 light : this.LC0) {
            light.l0.set(0.0f, 0.0f, 0.0f, 1.0f);
            light.EJ.x = 0.0f;
            light.EJ.y = 0.0f;
            light.EJ.z = 0.0f;
            light.ET = 0.0f;
        }
        for (Ew0 light : this.l9) {
            light.l0.set(0.0f, 0.0f, 0.0f, 1.0f);
            light.Tv.x = 0.0f;
            light.Tv.y = 0.0f;
            light.Tv.z = 0.0f;
            light.LPt5.x = 0.0f;
            light.LPt5.y = -1.0f;
            light.LPt5.z = 0.0f;
            light.LPt5.KM();
            light.gp = 0.0f;
            light.Bd = 1.0f;
            light.Ja0 = 0.0f;
        }
        this.Yg0 = false;
        if (this.has(this.lpt5)) {
            this.eu += lg_0.S4.uL;
            this.set(this.lpt5, this.eu);
        }
        if (this.zd != null) {
            for (int location : this.zd) {
                if (location >= 0) {
                    lg_0.OH0.glVertexAttrib2f(location, 0.0f, 0.0f);
                }
            }
        }
    }

    @Override
    public final void render(W00 w00, wh_0 wh_02) {
        if (!wh_02.tM(sh_0.vF0)) {
            this.context.mx0(770, 771, false);
        }
        GdxDefaultShader tD = this;
        tD.com7(wh_02);
        if (tD.zl) {
            this.tT(w00, wh_02);
        }
        super.render(w00, wh_02);
    }

    @Override
    public final void end() {
        super.end();
    }

    public void com7(wh_0 wh_02) {
        int cullFace = this.pj.kb == -1 ? Sx : this.pj.kb;
        int depthFunc = this.pj.fm0 == -1 ? L80 : this.pj.fm0;
        float depthNear = 0.0f;
        float depthFar = 1.0f;
        boolean depthMask = true;
        I2 iterator = wh_02.VH.ZD();
        while (iterator.hasNext()) {
            hf_1 attribute = (hf_1)iterator.next();
            long type = attribute.yO;
            if ((type & sh_0.vF0) == type) {
                sh_0 blending = (sh_0)attribute;
                this.context.mx0(blending.W00, blending.Rs, true);
                this.set(this.ag, blending.yt);
            } else if ((type & pr_1.av) == pr_1.av) {
                cullFace = ((pr_1)attribute).ps;
            } else if ((type & mb0_2.k6) == mb0_2.k6) {
                this.set(this.d00, ((mb0_2)attribute).LL0);
            } else if ((type & ma_1.ZL) == ma_1.ZL) {
                ma_1 depthTest = (ma_1)attribute;
                depthFunc = depthTest.BA0;
                depthNear = depthTest.sC0;
                depthFar = depthTest.Sg;
                depthMask = depthTest.WZ;
            } else if (!this.pj.yI0) {
                throw new nf_1("Unknown material attribute: " + attribute);
            }
        }
        this.context.fh0(cullFace);
        this.context.vk0(depthFunc, depthNear, depthFar);
        if (this.context.Wz != depthMask) {
            this.context.Wz = depthMask;
            lg_0.OH0.glDepthMask(depthMask);
        }
    }

    public void tT(W00 renderable, wh_0 attributes) {
        es_1 directionalLights = null;
        CP directional = (CP)attributes.sg(CP.M0);
        if (directional != null) directionalLights = directional.Ds0;
        es_1 pointLights = null;
        fi_2 point = (fi_2)attributes.sg(fi_2.Tl0);
        if (point != null) pointLights = point.jA;
        es_1 spotLights = null;
        Lm0 spot = (Lm0)attributes.sg(Lm0.uv0);
        if (spot != null) spotLights = spot.Ai0;

        if (this.Rn0 >= 0) {
            for (int index = 0; index < this.cp.length; index++) {
                qv_0 cached = this.cp[index];
                if (directionalLights == null || index >= directionalLights.KB) {
                    if (this.Yg0 && cached.l0.r == 0.0f && cached.l0.g == 0.0f && cached.l0.b == 0.0f) continue;
                    cached.l0.set(0.0f, 0.0f, 0.0f, 1.0f);
                } else {
                    qv_0 source = (qv_0)directionalLights.get(index);
                    if (this.Yg0 && cached.er0(source)) continue;
                    cached.l0.set(source.l0);
                    cached.jf.x = source.jf.x;
                    cached.jf.y = source.jf.y;
                    cached.jf.z = source.jf.z;
                    cached.jf.KM();
                }
                int location = this.Rn0 + index * this.Di0;
                lg_0.Sf0.glUniform3f(location + this.bK0, cached.l0.r, cached.l0.g, cached.l0.b);
                lg_0.Sf0.glUniform3f(location + this.mD0, cached.jf.x, cached.jf.y, cached.jf.z);
                if (this.Di0 <= 0) break;
            }
        }

        if (this.nO >= 0) {
            for (int index = 0; index < this.LC0.length; index++) {
                dm0_0 cached = this.LC0[index];
                if (pointLights == null || index >= pointLights.KB) {
                    if (this.Yg0 && cached.ET == 0.0f) continue;
                    cached.ET = 0.0f;
                } else {
                    dm0_0 source = (dm0_0)pointLights.get(index);
                    if (this.Yg0 && cached.eK(source)) continue;
                    cached.l0.set(source.l0);
                    cached.EJ.x = source.EJ.x;
                    cached.EJ.y = source.EJ.y;
                    cached.EJ.z = source.EJ.z;
                    cached.ET = source.ET;
                }
                int location = this.nO + index * this.interface$;
                lg_0.Sf0.glUniform3f(location + this.xX, cached.l0.r * cached.ET, cached.l0.g * cached.ET, cached.l0.b * cached.ET);
                lg_0.Sf0.glUniform3f(location + this.hg0, cached.EJ.x, cached.EJ.y, cached.EJ.z);
                if (this.Jd0 >= 0) lg_0.Sf0.glUniform1f(location + this.Jd0, cached.ET);
                if (this.interface$ <= 0) break;
            }
        }

        if (this.S70 >= 0) {
            for (int index = 0; index < this.l9.length; index++) {
                Ew0 cached = this.l9[index];
                if (spotLights == null || index >= spotLights.KB) {
                    if (this.Yg0 && cached.gp == 0.0f) continue;
                    cached.gp = 0.0f;
                } else {
                    Ew0 source = (Ew0)spotLights.get(index);
                    if (this.Yg0 && cached.vI(source)) continue;
                    cached.h30(source);
                }
                int location = this.S70 + index * this.l8;
                lg_0.Sf0.glUniform3f(location + this.CZ, cached.l0.r * cached.gp, cached.l0.g * cached.gp, cached.l0.b * cached.gp);
                lg_0.Sf0.glUniform3f(location + this.ar0, cached.Tv.x, cached.Tv.y, cached.Tv.z);
                lg_0.Sf0.glUniform3f(location + this.Av, cached.LPt5.x, cached.LPt5.y, cached.LPt5.z);
                lg_0.Sf0.glUniform1f(location + this.qs0, cached.Bd);
                lg_0.Sf0.glUniform1f(location + this.tE0, cached.Ja0);
                if (this.yc0 >= 0) lg_0.Sf0.glUniform1f(location + this.yc0, cached.gp);
                if (this.l8 <= 0) break;
            }
        }

        if (attributes.tM(PRN_.YI0)) this.set(this.m9, ((PRN_)attributes.sg(PRN_.YI0)).v50);
        this.Yg0 = true;
    }

    @Override
    public final void dispose() {
        GdxDefaultShader tD = this;
        tD.program.dispose();
        super.dispose();
    }
}
