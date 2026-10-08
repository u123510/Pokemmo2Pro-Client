package cn.pokemmo.graphics.render;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Matrix4;
import f.*;

/**
 * 现代化重构类 - 原始类: f.Qf
 */
public class ImmediateMeshRenderer implements fy0_0 {

    public final ap0_0 mc0;
    public final Matrix4 lpT9;
    public final es_1 BU;
    public final lt_1 qw;
    public ET Zy0;
    public final es_1 JG;
    public final Nn0 gI0;
    
    @Override
    public final void dispose() {
        this.mc0.dispose();
        final lt_1 qw;
        if ((qw = this.qw) != null) {
            qw.dispose();
        }
    }
    
    public ImmediateMeshRenderer() {
        this(1000, false);
    }
    
    public ImmediateMeshRenderer(final int n, final boolean b) {
        this(n, j20(), b);
    }
    
    public ImmediateMeshRenderer(int n, final lt_1 qw, final boolean b) {
        new Matrix4();
        this.lpT9 = new Matrix4();
        this.BU = new es_1();
        new Matrix4();
        this.JG = new es_1(8);
        this.gI0 = new Nn0(8);
        new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.qw = qw;
        if (b && n > 8191) {
            throw new IllegalArgumentException(yr_1.pG("Can't have more than 8191 sprites per batch: ", n));
        }
        final boolean b2 = true;
        int n2;
        if (b) {
            n2 = 4;
        }
        else {
            n2 = 6;
        }
        final int n3 = n * n2;
        int n4;
        if (b) {
            n4 = n * 6;
        }
        else {
            n4 = 0;
        }
        final kz_0[] array2;
        final kz_0[] array = array2 = new kz_0[3];
        array[0] = new kz_0(1, 2, "a_position");
        array[1] = new kz_0(4, 4, "a_color");
        array[2] = new kz_0(16, 2, "a_texCoord0");
        final ap0_0 mc0 = new ap0_0(b2, n3, n4, array2);
        this.mc0 = mc0;
        mc0.xl0();
        if (b) {
            final short[] array3 = new short[n *= 6];
            short n5 = 0;
            short n6;
            for (int i = 0; i < n; i += 6, n5 = (short)(n6 + 4)) {
                n6 = n5;
                final short[] array4 = array3;
                final int n7 = i;
                final short[] array5 = array3;
                final short n8 = n5;
                final short[] array6 = array3;
                final int n9 = i;
                final short[] array7 = array3;
                final short n10 = n5;
                final short[] array8 = array3;
                final short n11 = n5;
                array3[i] = n5;
                array8[i + 1] = (short)(n11 + 1);
                array6[n9 + 3] = (array7[i + 2] = (short)(n10 + 2));
                array5[i + 4] = (short)(n8 + 3);
                array4[n7 + 5] = n5;
            }
            this.mc0.Mr(array3);
        }
        this.lpT9.BI((float)lg_0.S4.Kr0(), (float)lg_0.S4.sD0());
    }
    
    public static lt_1 j20() {
        final lt_1 lt_1;
        if ((lt_1 = new lt_1("attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nuniform mat4 u_projectionViewMatrix;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main()\n{\n   v_color = a_color;\n   v_color.a = v_color.a * (255.0/254.0);\n   v_texCoords = a_texCoord0;\n   gl_Position =  u_projectionViewMatrix * a_position;\n}\n", "#ifdef GL_ES\nprecision mediump float;\n#endif\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\nuniform sampler2D u_texture;\nvoid main()\n{\n  gl_FragColor = v_color * texture2D(u_texture, v_texCoords);\n}")).U00) {
            return lt_1;
        }
        throw new IllegalArgumentException("Error compiling shader: " + lt_1.aX());
    }
}

