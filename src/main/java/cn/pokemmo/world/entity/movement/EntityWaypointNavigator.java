package cn.pokemmo.world.entity.movement;

import f.*;

public class EntityWaypointNavigator extends uu_0 {
    public static final wh_0 TH0;
    public final JA qP;

    public static String Rn0() {
        return ab0_1.i0.bC0("default.fragment.glsl").gd0(null);
    }

    public static String DK0() {
        return ab0_1.i0.bC0("default.vertex.glsl").gd0(null);
    }

    public EntityWaypointNavigator(JA jA, cn0_0 cn0_02) {
        this.qP = jA;
    }

    public static final boolean WL(long l, long l2) {
        return (l & l2) == l2;
    }

    static {
        Cq0.E1(bn0_0.class);
        TH0 = new wh_0();
    }

    @Override
    public final o9_0 D00(W00 w00) {
        JA jA = this.qP;
        wh_0 wh = TH0;
        wh.ni0 = 0L;
        wh.VH.clear();
        if (w00.AA0 != null) {
            wh.zc(w00.AA0);
        }
        if (w00.ly != null) {
            wh.zc(w00.ly);
        }
        String s = "";
        long l = wh.ni0;
        long l2 = w00.VE0.m8.COM6.JP().Js0();
        if (wh.tM(PRN_.YI0)) {
            s = "#define fogFlag\n";
        }
        if (jA.uF != null) {
            s = s.concat("#define lightMask\n");
        }
        s = QA0.W0(s, "#define borderglow\n");
        if (bn0_0.WL(l2, 1L)) {
            s = QA0.W0(s, "#define positionFlag\n");
        }
        if ((l2 & 6L) != 0L) {
            s = QA0.W0(s, "#define colorFlag\n");
        }
        if (bn0_0.WL(l2, 256L)) {
            s = QA0.W0(s, "#define binormalFlag\n");
        }
        if (bn0_0.WL(l2, 128L)) {
            s = QA0.W0(s, "#define tangentFlag\n");
        }
        if (bn0_0.WL(l2, 8L)) {
            s = QA0.W0(s, "#define normalFlag\n");
        }
        if ((bn0_0.WL(l2, 8L) || bn0_0.WL(l2, 384L)) && w00.AA0 != null) {
            s = QA0.W0(fp0_0.uD(AN.nK0(fp0_0.uD(AN.nK0(QA0.W0(QA0.W0(s, "#define lightingFlag\n"), "#define ambientCubemapFlag\n"), "#define numDirectionalLights"), jA.HA, "\n"), "#define numPointLights"), jA.F80, "\n"), "#define numSpotLights 0\n");
            if (wh.tM(lpt7__4.qo0)) {
                s = QA0.W0(s, "#define environmentCubemapFlag\n");
            }
        }
        for (kz_0 kz : w00.VE0.m8.COM6.JP().Os) {
            int n = kz.tM;
            if (n == 64) {
                s = fp0_0.uD(AN.nK0(s, "#define boneWeight"), kz.sf, "Flag\n");
            } else if (n == 16) {
                s = fp0_0.uD(AN.nK0(s, "#define texCoord"), kz.sf, "Flag\n");
            }
        }
        long l3 = sh_0.vF0;
        if ((l & l3) == l3) {
            s = QA0.W0(s, "#define blendedFlag\n");
        }
        if ((l & (l3 = mz_2.g7)) == l3) {
            s = QA0.W0(QA0.W0(s, "#define diffuseTextureFlag\n"), "#define diffuseTextureCoord texCoord0\n");
        }
        if ((l & (l3 = mz_2.GB0)) == l3) {
            s = QA0.W0(QA0.W0(s, "#define specularTextureFlag\n"), "#define specularTextureCoord texCoord0\n");
        }
        if ((l & (l3 = mz_2.yS)) == l3) {
            s = QA0.W0(QA0.W0(s, "#define normalTextureFlag\n"), "#define normalTextureCoord texCoord0\n");
        }
        if ((l & (l3 = mz_2.protected$)) == l3) {
            s = QA0.W0(QA0.W0(s, "#define emissiveTextureFlag\n"), "#define emissiveTextureCoord texCoord0\n");
        }
        if ((l & (l3 = mz_2.Dh0)) == l3) {
            s = QA0.W0(QA0.W0(s, "#define reflectionTextureFlag\n"), "#define reflectionTextureCoord texCoord0\n");
        }
        if ((l & (l3 = mz_2.cW)) == l3) {
            s = QA0.W0(QA0.W0(s, "#define ambientTextureFlag\n"), "#define ambientTextureCoord texCoord0\n");
        }
        if ((l & (l3 = PRN_.Ly)) == l3) {
            s = QA0.W0(s, "#define diffuseColorFlag\n");
        }
        if ((l & (l3 = PRN_.zz)) == l3) {
            s = QA0.W0(s, "#define specularColorFlag\n");
        }
        if ((l & (l3 = PRN_.sI)) == l3) {
            s = QA0.W0(s, "#define emissiveColorFlag\n");
        }
        if ((l & (l3 = PRN_.Ar)) == l3) {
            s = QA0.W0(s, "#define reflectionColorFlag\n");
        }
        if ((l & (l3 = Rv0.XT)) == l3) {
            s = QA0.W0(s, "#define overlayColorFlag\n");
        }
        if ((l & (l3 = mb0_2.an0)) == l3) {
            s = QA0.W0(s, "#define shininessFlag\n");
        }
        if ((l & (l3 = mb0_2.k6)) == l3) {
            s = QA0.W0(s, "#define alphaTestFlag\n");
        }
        if (w00.lpt7 != null && jA.el > 0) {
            s = fp0_0.uD(AN.nK0(s, "#define numBones "), jA.el, "\n");
        }
        return new po_0(w00, jA, s);
    }
}

