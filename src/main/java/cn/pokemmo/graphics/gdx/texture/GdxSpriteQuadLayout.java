package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Color;

public class GdxSpriteQuadLayout extends lt_1 {
    public final int LPT1;
    public final int yC;
    public final int To0;
    public final int Za;
    public final int vX;
    public final int ED0;

    public GdxSpriteQuadLayout() {
        super(
            "attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nuniform mat4 u_projTrans;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main()\n{\n   v_color = a_color;\n   v_color.a = v_color.a * (255.0/254.0);\n   v_texCoords = a_texCoord0;\n   gl_Position =  u_projTrans * a_position;\n}\n",
            px0() + ab0_1.xE().uz()
        );
        if (!FE()) {
            throw new IllegalArgumentException("Error compiling shader: " + aX());
        }
        bind();
        this.LPT1 = rp0("glowSize");
        this.yC = rp0("glowColor");
        this.To0 = rp0("glowIntensity");
        this.Za = rp0("glowThreshold");
        this.vX = rp0("glowInvTexSize");
        this.ED0 = rp0("glowTexSize");
        Dd0(1.75F);
        Ja();
        kw(0.0F);
        bL(Color.RED.cpy());
    }

    public static String px0() {
        if (dw_2.YO == 1) {
            return "#define glowHQ\n";
        }
        return "";
    }

    public final void kw(float f) {
        lg_0.Sf0.glUniform1f(this.LPT1, f);
    }

    public final void Dd0(float f) {
        lg_0.Sf0.glUniform1f(this.To0, f);
    }

    public final void Ja() {
        lg_0.Sf0.glUniform1f(this.Za, 0.1000000015F);
    }

    public final void bL(Color color) {
        lg_0.Sf0.glUniform3f(this.yC, color.r, color.g, color.b);
    }

    public final void wg(int i, int i2) {
        lg_0.Sf0.glUniform2f(this.ED0, (float) i, (float) i2);
        lg_0.Sf0.glUniform2f(this.vX, 1.0F / (float) (i - 1), 1.0F / (float) (i2 - 1));
    }

    public final int rp0(String str) {
        return WD0(str, false);
    }
}
