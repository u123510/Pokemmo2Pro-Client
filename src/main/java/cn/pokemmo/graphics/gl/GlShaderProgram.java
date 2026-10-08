package cn.pokemmo.graphics.gl;

import com.badlogic.gdx.utils.BufferUtils;
import f.*;
import f.org.json.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/**
 * 现代化重构类 - 原始类: f.lt_1
 */
public class GlShaderProgram implements fy0_0 {

    public static boolean Ln0 = true;
    public static final nb_2 th0;
    public String fo;
    public boolean U00;
    public final Xy0 iB;
    public final Xy0 Vn;
    public final Xy0 Zt0;
    public String[] A70;
    public final Xy0 Us;
    public final Xy0 Ur;
    public final Xy0 jE0;
    public String[] Aw0;
    public int lH;
    public int dg;
    public int cC;
    public final IntBuffer V;
    public final IntBuffer BF0;

    static {
        th0 = new nb_2();
        BufferUtils.yD0(1);
    }

    public GlShaderProgram(String v1, String v2) {
        this.fo = "";
        this.iB = new Xy0();
        this.Vn = new Xy0();
        this.Zt0 = new Xy0();
        this.Us = new Xy0();
        this.Ur = new Xy0();
        this.jE0 = new Xy0();
        this.V = BufferUtils.yD0(1);
        this.BF0 = BufferUtils.yD0(1);
        if (v1 == null) {
            throw new IllegalArgumentException("vertex shader must not be null");
        }
        if (v2 == null) {
            throw new IllegalArgumentException("fragment shader must not be null");
        }
        BufferUtils.S5();
        FV(v1, v2);
        if (FE()) {
            qO();
            Vw0();
            GlShaderProgram.lpt1(lg_0.k, this);
        }
    }

    public GlShaderProgram(Dn0 v1, Dn0 v2) {
        this(v1.uz(), v2.uz());
    }

    public static void lpt1(du_2 v0, GlShaderProgram v1) {
        nb_2 map = th0;
        es_1 es = (es_1) map.Wk0(v0);
        if (es == null) {
            es = new es_1();
        }
        es.Ue0(v1);
        map.WK0(v0, es);
    }

    public final void FV(String v1, String v2) {
        this.dg = Sg0(35633, v1);
        int i1 = Sg0(35632, v2);
        this.cC = i1;
        if (this.dg == -1 || i1 == -1) {
            this.U00 = false;
            return;
        }
        int program = lg_0.Sf0.glCreateProgram();
        if (program == 0) {
            program = -1;
        }
        if (program != -1) {
            sY gl = lg_0.Sf0;
            gl.glAttachShader(program, this.dg);
            gl.glAttachShader(program, this.cC);
            gl.glLinkProgram(program);
            IntBuffer intBuffer = ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder()).asIntBuffer();
            gl.glGetProgramiv(program, 35714, intBuffer);
            if (intBuffer.get(0) == 0) {
                this.fo = lg_0.Sf0.glGetProgramInfoLog(program);
                program = -1;
            }
        }
        this.lH = program;
        if (program == -1) {
            this.U00 = false;
        } else {
            this.U00 = true;
        }
    }

    public final int Sg0(int i1, String v2) {
        sY gl = lg_0.Sf0;
        IntBuffer intBuffer = BufferUtils.yD0(1);
        int shader = gl.glCreateShader(i1);
        if (shader == 0) {
            return -1;
        }
        gl.glShaderSource(shader, v2);
        gl.glCompileShader(shader);
        gl.glGetShaderiv(shader, 35713, intBuffer);
        if (intBuffer.get(0) == 0) {
            String infoLog = gl.glGetShaderInfoLog(shader);
            StringBuilder sb = new StringBuilder().append(this.fo);
            String prefix = i1 == 35633 ? "Vertex shader\n" : "Fragment shader:\n";
            this.fo = sb.append(prefix).toString();
            this.fo = VG.Mq(new StringBuilder(), this.fo, infoLog);
            return -1;
        }
        return shader;
    }

    public final void WI() {
    }

    public final void Vw0() {
        this.V.clear();
        lg_0.Sf0.glGetProgramiv(this.lH, 35718, this.V);
        int numUniforms = this.V.get(0);
        this.A70 = new String[numUniforms];
        for (int i = 0; i < numUniforms; i++) {
            this.V.clear();
            this.V.put(0, 1);
            this.BF0.clear();
            String name = lg_0.Sf0.glGetActiveUniform(this.lH, i, this.V, this.BF0);
            int location = lg_0.Sf0.glGetUniformLocation(this.lH, name);
            this.iB.hC0(location, name);
            this.Vn.hC0(this.BF0.get(0), name);
            this.Zt0.hC0(this.V.get(0), name);
            this.A70[i] = name;
        }
    }

    public final void qO() {
        this.V.clear();
        lg_0.Sf0.glGetProgramiv(this.lH, 35721, this.V);
        int numAttributes = this.V.get(0);
        this.Aw0 = new String[numAttributes];
        for (int i = 0; i < numAttributes; i++) {
            this.V.clear();
            this.V.put(0, 1);
            this.BF0.clear();
            String name = lg_0.Sf0.glGetActiveAttrib(this.lH, i, this.V, this.BF0);
            int location = lg_0.Sf0.glGetAttribLocation(this.lH, name);
            this.Us.hC0(location, name);
            this.Ur.hC0(this.BF0.get(0), name);
            this.jE0.hC0(this.V.get(0), name);
            this.Aw0[i] = name;
        }
    }

    public final String aX() {
        if (this.U00) {
            String log = lg_0.Sf0.glGetProgramInfoLog(this.lH);
            this.fo = log;
            return log;
        }
        return this.fo;
    }

    public final boolean FE() {
        return this.U00;
    }

    public final int WD0(String v1, boolean i2) {
        int location = this.iB.Rl0(-2, v1);
        if (location == -2) {
            location = lg_0.Sf0.glGetUniformLocation(this.lH, v1);
            if (location == -1 && i2) {
                if (this.U00) {
                    throw new IllegalArgumentException(xq_1.pz0("No uniform with name '", v1, "' in shader"));
                }
                throw new IllegalStateException("An attempted fetch uniform from uncompiled shader \n" + aX());
            }
            this.iB.hC0(location, v1);
        }
        return location;
    }

    public final void bind() {
        lg_0.Sf0.glUseProgram(this.lH);
    }

    @Override
    public final void dispose() {
        sY gl = lg_0.Sf0;
        gl.glUseProgram(0);
        gl.glDeleteShader(this.dg);
        gl.glDeleteShader(this.cC);
        gl.glDeleteProgram(this.lH);
        if (th0.Wk0(lg_0.k) != null) {
            ((es_1) th0.Wk0(lg_0.k)).sj0(this, true);
        }
    }

    public final void kC(String v1) {
        sY gl = lg_0.Sf0;
        int location = this.Us.Rl0(-2, v1);
        if (location == -2) {
            location = gl.glGetAttribLocation(this.lH, v1);
            this.Us.hC0(location, v1);
        }
        if (location != -1) {
            gl.glDisableVertexAttribArray(location);
        }
    }
}
