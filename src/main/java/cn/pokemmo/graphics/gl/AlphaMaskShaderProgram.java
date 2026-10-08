package cn.pokemmo.graphics.gl;

import f.*;

public class AlphaMaskShaderProgram {
    public lt_1 mF0;
    public float nB;
    public int s00;
    public int Vc0;

    public AlphaMaskShaderProgram() {
        super();
        this.nB = 1.0F;
        lt_1 shader = new lt_1(
                "attribute vec4 a_position;\n"
                        + "attribute vec4 a_color;\n"
                        + "attribute vec2 a_texCoord0;\n"
                        + "uniform mat4 u_projTrans;\n"
                        + "varying vec4 v_color;\n"
                        + "varying vec2 v_texCoords;\n"
                        + "void main()\n"
                        + "{\n"
                        + "   v_color = a_color;\n"
                        + "   v_color.a = v_color.a * (255.0/254.0);\n"
                        + "   v_texCoords = a_texCoord0;\n"
                        + "   gl_Position =  u_projTrans * a_position;\n"
                        + "}\n",
                "#ifdef GL_ES\n"
                        + "#define LOWP lowp\n"
                        + "    precision mediump float;\n"
                        + "#else\n"
                        + "    #define LOWP\n"
                        + "#endif\n"
                        + "varying LOWP vec4 v_color;\n"
                        + "varying vec2 v_texCoords;\n"
                        + "uniform sampler2D u_texture;\n"
                        + "uniform vec4 u_color;\n"
                        + "void main()\n"
                        + "{\n"
                        + "\tvec4 texel0 = texture2D(u_texture, v_texCoords);\n"
                        + "\tgl_FragColor = v_color * vec4(mix(texel0.rgb, u_color.rgb, u_color.a), texel0.a);\n"
                        + "}\n");
        if (shader.FE()) {
            this.bb0(shader);
            return;
        }
        throw new IllegalArgumentException("Error compiling shader: " + shader.aX());
    }

    public final void bb0(lt_1 shader) {
        if (!shader.U00) {
            this.mF0 = null;
            return;
        }
        lt_1.Ln0 = false;
        lg_0.Sf0.glUseProgram(shader.lH);
        lg_0.Sf0.glUniform1i(shader.WD0("u_texture1", lt_1.Ln0), 1);
        this.mF0 = shader;
    }
}
