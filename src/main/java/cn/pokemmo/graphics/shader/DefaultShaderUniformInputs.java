package cn.pokemmo.graphics.shader;

import f.*;

public class DefaultShaderUniformInputs {
    public static final com9__4 Oe = new com9__4("u_projTrans");
    public static final com9__4 prN = new com9__4("u_viewTrans");
    public static final com9__4 ms = new com9__4("u_projViewTrans");
    public static final com9__4 yz0 = new com9__4("u_cameraPosition");
    public static final com9__4 YR = new com9__4("u_cameraDirection");
    public static final com9__4 M30 = new com9__4("u_cameraUp");
    public static final com9__4 DH = new com9__4("u_cameraNearFar");
    public static final com9__4 KG0 = new com9__4("u_worldTrans");
    public static final com9__4 ks0 = new com9__4("u_viewWorldTrans");
    public static final com9__4 vf0 = new com9__4("u_projViewWorldTrans");
    public static final com9__4 Qz = new com9__4("u_normalMatrix");
    public static final com9__4 zl = new com9__4("u_bones");
    public static final com9__4 X5 = new com9__4("u_shininess", mb0_2.an0);
    public static final com9__4 Mw = new com9__4("u_opacity", sh_0.vF0);
    public static final com9__4 nQ = new com9__4("u_diffuseColor", PRN_.Ly);
    public static final com9__4 da = new com9__4("u_diffuseTexture", mz_2.g7);
    public static final com9__4 Ll0 = new com9__4("u_diffuseUVTransform", mz_2.g7);
    public static final com9__4 uL = new com9__4("u_specularColor", PRN_.zz);
    public static final com9__4 lk = new com9__4("u_specularTexture", mz_2.GB0);
    public static final com9__4 fA = new com9__4("u_specularUVTransform", mz_2.GB0);
    public static final com9__4 mR = new com9__4("u_emissiveColor", PRN_.sI);
    public static final com9__4 S90 = new com9__4("u_emissiveTexture", mz_2.protected$);
    public static final com9__4 o60 = new com9__4("u_emissiveUVTransform", mz_2.protected$);
    public static final com9__4 oo0 = new com9__4("u_reflectionColor", PRN_.Ar);
    public static final com9__4 r80 = new com9__4("u_reflectionTexture", mz_2.Dh0);
    public static final com9__4 Un0 = new com9__4("u_reflectionUVTransform", mz_2.Dh0);
    public static final com9__4 Rh = new com9__4("u_normalTexture", mz_2.yS);
    public static final com9__4 EH0 = new com9__4("u_normalUVTransform", mz_2.yS);
    public static final com9__4 C50 = new com9__4("u_ambientTexture", mz_2.cW);
    public static final com9__4 Uu = new com9__4("u_ambientUVTransform", mz_2.cW);
    public static final com9__4 u2 = new com9__4("u_alphaTest");
    public static final com9__4 kJ0 = new com9__4("u_ambientCubemap");
    public static final com9__4 zJ;

    static {
        new com9__4("u_dirLights");
        new com9__4("u_pointLights");
        new com9__4("u_spotLights");
        zJ = new com9__4("u_environmentCubemap");
    }
}
